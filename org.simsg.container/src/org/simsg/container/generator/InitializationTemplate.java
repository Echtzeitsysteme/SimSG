package org.simsg.container.generator;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EcorePackage;
import org.simsg.container.Agent;
import org.simsg.container.State;
import org.simsg.container.util.AgentClassFactory;
import org.simsg.container.util.StateClassFactory;
import org.simsg.simsgl.simSGL.Attribute;
import org.simsg.simsgl.simSGL.AttributeOperandGeneric;
import org.simsg.simsgl.simSGL.BoundLink;
import org.simsg.simsgl.simSGL.Constraint;
import org.simsg.simsgl.simSGL.FloatAttribute;
import org.simsg.simsgl.simSGL.IntegerAttribute;
import org.simsg.simsgl.simSGL.LinkState;
import org.simsg.simsgl.simSGL.MultiLink;
import org.simsg.simsgl.simSGL.MultiLinkSitePattern;
import org.simsg.simsgl.simSGL.NumericAssignment;
import org.simsg.simsgl.simSGL.OperationLeft;
import org.simsg.simsgl.simSGL.Pattern;
import org.simsg.simsgl.simSGL.SingleSitePattern;
import org.simsg.simsgl.simSGL.Site;
import org.simsg.simsgl.simSGL.SitePattern;
import org.simsg.simsgl.simSGL.ValidAgentPattern;
import org.simsg.simsgl.utils.PatternUtils;

public class InitializationTemplate {

	private Pattern pattern;
	private Map<org.simsg.simsgl.simSGL.Agent, ValidAgentPattern> agentPatterns;
	private AgentClassFactory agentFactory;
	private StateClassFactory stateFactory;
	private Map<String, State> stateInstances;
	private Map<ValidAgentPattern, AgentTemplate> agentTemplates;
	
	public InitializationTemplate(Pattern pattern, AgentClassFactory agentFactory, 
			StateClassFactory stateFactory, Map<String, State> stateInstances) {
		
		this.pattern = pattern;
		this.agentFactory = agentFactory;
		this.stateFactory = stateFactory;
		this.stateInstances = stateInstances;
		
		mapAgentsToValidPatterns();
		createAgentTemplates();
		findAttributeValues();
		findStates();
		findReferences();
	}
	
	private void mapAgentsToValidPatterns() {
		agentPatterns = new HashMap<org.simsg.simsgl.simSGL.Agent, ValidAgentPattern>();
		PatternUtils.getValidAgentPatterns(pattern.getAgentPatterns()).forEach(vap -> {
			agentPatterns.put(vap.getAgent(), vap);
		});
	}
	
	private void createAgentTemplates() {
		agentTemplates = new HashMap<ValidAgentPattern, AgentTemplate>();
		for(ValidAgentPattern vap : agentPatterns.values()) {
			agentTemplates.put(vap, new AgentTemplate(vap.getAgent(), agentFactory, stateFactory, stateInstances));
		}
	}
	
	private void findAttributeValues() {
		if(pattern.getConstraints() == null) return;
		for(Constraint c : pattern.getConstraints()) {
			if(c.getOperandL() instanceof AttributeOperandGeneric) {
				AttributeOperandGeneric operandL = (AttributeOperandGeneric)c.getOperandL();
				ValidAgentPattern vap = agentPatterns.get(operandL.getAgent());
				Attribute atr = operandL.getAttribute();
				OperationLeft operandR = (OperationLeft)c.getOperandR();
				String content = PatternUtils.contentOfNumericAssignment((NumericAssignment) operandR);
				agentTemplates.get(vap).defineAttribute(atr, stringToValue(atr, content));
			}
		}
	}
	
	private Object stringToValue(Attribute atr, String content) {
		Object value = null;
		if(atr.getType() instanceof FloatAttribute) {
			value = Double.parseDouble(content);
		}else if(atr.getType() instanceof IntegerAttribute) {
			value = Integer.parseInt(content);
		}
		return value;
	}
	
	private void findStates() {
		for(ValidAgentPattern vap : agentPatterns.values()) {
			Map<Site, org.simsg.simsgl.simSGL.State> siteStates = new HashMap<>();
			for(Site site : vap.getAgent().getSites().getSites()) {
				if(site.getStates().getState().size() > 0) {
					siteStates.put(site, site.getStates().getState().get(0));
				}
			}
			for(SitePattern sp : vap.getSitePatterns().getSitePatterns()) {
				if(sp == null) continue;
				if(sp.getState() == null) continue;
				Site site = null;
				if(sp instanceof SingleSitePattern) site = ((SingleSitePattern) sp).getSite();
				if(sp instanceof MultiLinkSitePattern) site = ((MultiLinkSitePattern) sp).getSite();
				siteStates.replace(site, sp.getState().getState());
			}
			siteStates.forEach((site, state) -> {
				agentTemplates.get(vap).defineSiteState(site, state);
			});
			
			Map<org.simsg.simsgl.simSGL.Agent, org.simsg.simsgl.simSGL.State> agentStates = new HashMap<>();
			org.simsg.simsgl.simSGL.Agent agent = vap.getAgent();
			if(agent.getStates().getState().size() > 0) {
				 agentStates.put(agent, agent.getStates().getState().get(0));
			}
			// TODO...
		}
	}
	
	private void findReferences() {
		for(ValidAgentPattern vap : agentPatterns.values()) {
			
			for(SitePattern sp : vap.getSitePatterns().getSitePatterns()) {
				if(sp == null) continue;
				
				if(sp instanceof SingleSitePattern) {
					SingleSitePattern ssp = (SingleSitePattern) sp;
					findReferenceSingeSite(vap, ssp);
				}else {
					MultiLinkSitePattern msp = (MultiLinkSitePattern) sp;
					findReferenceMultiSite(vap, msp);
				}
	
			}
		}
	}
	
	private void findReferenceSingeSite(ValidAgentPattern vap, SingleSitePattern ssp) {
		LinkState ls1 = ssp.getLinkState().getLinkState();
		if(ls1 == null) return;
		if(!(ls1 instanceof BoundLink)) return;
		
		for(ValidAgentPattern vap2 : agentPatterns.values()) {
			if(vap == vap2) continue;
			
			for(SitePattern sp2 : vap2.getSitePatterns().getSitePatterns()) {
				if(sp2 == null) continue;
				
				if((sp2 instanceof SingleSitePattern)) {
					SingleSitePattern ssp2 = (SingleSitePattern) sp2;
					LinkState ls2 = ssp2.getLinkState().getLinkState();
					if(!boundLinksEqual(ls1, ls2)) continue;
					agentTemplates.get(vap).addReference(ssp.getSite(), agentTemplates.get(vap2));
					return;
				}else {
					MultiLinkSitePattern msp2 = (MultiLinkSitePattern) sp2;
					if(msp2.getLinkState().getLinkState() instanceof MultiLink) {
						MultiLink mls = (MultiLink)msp2.getLinkState().getLinkState();
						for(LinkState ls3 : mls.getStates()) {
							if(!boundLinksEqual(ls1, ls3)) continue;
							agentTemplates.get(vap).addReference(ssp.getSite(), agentTemplates.get(vap2));
							return;
						}
					}else {
						LinkState ls2 = msp2.getLinkState().getLinkState();
						if(!boundLinksEqual(ls1, ls2)) continue;
						agentTemplates.get(vap).addReference(ssp.getSite(), agentTemplates.get(vap2));
						return;
					}
					
				}

			}
		}
	}
	
	
	
	private void findReferenceMultiSite(ValidAgentPattern vap, MultiLinkSitePattern msp) {
		LinkState ls = msp.getLinkState().getLinkState();
		if(ls == null) return;
		if(!(ls instanceof MultiLink || ls instanceof BoundLink)) return;
		
		List<LinkState> states = new LinkedList<LinkState>();
		if(ls instanceof MultiLink) {
			MultiLink mls1 = (MultiLink) ls;
			states.addAll(mls1.getStates());
		}else {
			BoundLink bls1 = (BoundLink) ls;
			states.add(bls1);
		}
		
		for(LinkState ls1 : states) {
			for(ValidAgentPattern vap2 : agentPatterns.values()) {
				if(vap == vap2) continue;
				
				for(SitePattern sp2 : vap2.getSitePatterns().getSitePatterns()) {
					if(sp2 == null) continue;
					
					if((sp2 instanceof SingleSitePattern)) {
						SingleSitePattern ssp2 = (SingleSitePattern) sp2;
						LinkState ls2 = ssp2.getLinkState().getLinkState();
						if(!boundLinksEqual(ls1, ls2)) continue;
						agentTemplates.get(vap).addReference(msp.getSite(), agentTemplates.get(vap2));
						break;
					}else {
						MultiLinkSitePattern msp2 = (MultiLinkSitePattern) sp2;
						if(msp2.getLinkState().getLinkState() instanceof MultiLink) {
							MultiLink mls = (MultiLink)msp2.getLinkState().getLinkState();
							for(LinkState ls3 : mls.getStates()) {
								if(!boundLinksEqual(ls1, ls3)) continue;
								agentTemplates.get(vap).addReference(msp.getSite(), agentTemplates.get(vap2));
								break;
							}
						}else {
							LinkState ls2 = msp2.getLinkState().getLinkState();
							if(!boundLinksEqual(ls1, ls2)) continue;
							agentTemplates.get(vap).addReference(msp.getSite(), agentTemplates.get(vap2));
							break;
						}
					}

				}
			}
		}
		
		
		
	}
	
	private boolean boundLinksEqual(LinkState ls1, LinkState ls2) {
		if(ls1 == null) return false;
		if(ls2 == null) return false;
		if(!(ls1 instanceof BoundLink)) return false;
		if(!(ls2 instanceof BoundLink)) return false;
		BoundLink bl1 = (BoundLink)ls1;
		BoundLink bl2 = (BoundLink)ls2;
		int idx1 = Integer.valueOf(bl1.getState());
		int idx2 = Integer.valueOf(bl2.getState());
		return idx1 == idx2;
		
	}
	
	public Collection<Agent> createInstances(int amount) {
		Collection<Agent> instances = new LinkedList<Agent>();
		Map<AgentTemplate, Agent> tempInstances = new HashMap<AgentTemplate, Agent>();
		for(AgentTemplate template : agentTemplates.values()) {
			tempInstances.put(template, null);
		}
		for(;amount>0;amount--) {
			
			for(AgentTemplate template : agentTemplates.values()) {
				Agent agent = agentFactory.getEObjectFactory().createObject(template.getAgentClassName());
				template.setAttributes(agent);
				template.setStates(agent);
				tempInstances.replace(template, agent);
			}
			
			for(AgentTemplate template : agentTemplates.values()) {
				template.setReferences(tempInstances.get(template), tempInstances);
			}
			
			instances.addAll(tempInstances.values());
			
		}
		
		return instances;
	}
	
	
}
