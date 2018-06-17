package biochemsimulation.simulation.pmc;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.ReactionContainerFactory;
import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimBound;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;
import biochemsimulation.reactioncontainer.SimSiteState;
import biochemsimulation.reactioncontainer.impl.ReactionContainerFactoryImpl;
import biochemsimulation.reactionrules.reactionRules.AssignFromPattern;
import biochemsimulation.reactionrules.reactionRules.AssignFromVariable;
import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.FreeLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.NumericFromLiteral;
import biochemsimulation.reactionrules.reactionRules.NumericFromVariable;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.PatternAssignment;
import biochemsimulation.reactionrules.reactionRules.ReactionRuleModel;
import biochemsimulation.reactionrules.reactionRules.Rule;
import biochemsimulation.reactionrules.reactionRules.RuleBody;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;
import biochemsimulation.reactionrules.reactionRules.VoidAgentPattern;
import biochemsimulation.reactionrules.utils.PatternUtils;
import biochemsimulation.viatrapatterns.generator.PatternTemplate;
import biochemsimulation.viatrapatterns.generator.SupportPatterns;

public abstract class ReactionRuleTransformer {
	
	protected ReactionRuleModel ruleModel;
	protected ReactionContainer reactionContainer;
	protected PatternModel patterns;
	
	protected Map<String, Rule> ruleMap;
	protected Map<String, Pattern> patternMap;
	protected Map<String, Pattern> targetPatternMap;
	
	protected Map<String, Collection<? extends IPatternMatch>> matches;
	//protected Map<String, Collection<? extends IPatternMatch>> candidates;
	
	protected Map<String, Double> staticReactionRates;
	//protected Map<String, Double> dynamicReactionRates;
	
	private ReactionContainerFactory factory;
	
	public ReactionRuleTransformer() {
		ruleMap = new HashMap<String, Rule>();
		patternMap = new HashMap<String, Pattern>();
		targetPatternMap = new HashMap<String, Pattern>();
		
		matches = new HashMap<String, Collection<? extends IPatternMatch>>();
		//candidates = new HashMap<String, Collection<? extends IPatternMatch>>();
		
		staticReactionRates = new HashMap<String, Double>();
		//dynamicReactionRates = new HashMap<String, Double>();
		
		factory = ReactionContainerFactoryImpl.init();
	}
	
	protected void initRuleMap() {
		ruleModel.getReactionProperties().forEach(x->{
			if(x instanceof Rule) {
				Rule r =  (Rule) x;
				ruleMap.put(r.getName(), r);
			}
		});
	}
	
	protected void initPatternMaps() {
		ruleMap.forEach((name, r) -> {
			RuleBody rb = r.getRule();
			patternMap.put(name+PatternTemplate.PATTERN_NAME_SUFFIX_LHS, PatternUtils.patternFromPatternAssignment(rb.getLhs()));
			targetPatternMap.put(name+PatternTemplate.PATTERN_NAME_SUFFIX_LHS, PatternUtils.patternFromPatternAssignment(rb.getRhs()));
			matches.put(name+PatternTemplate.PATTERN_NAME_SUFFIX_LHS, null);
			if(rb.getOperator().equals(PatternTemplate.RULE_OPERATOR_BI)) {
				targetPatternMap.put(name+PatternTemplate.PATTERN_NAME_SUFFIX_RHS, PatternUtils.patternFromPatternAssignment(rb.getLhs()));
				patternMap.put(name+PatternTemplate.PATTERN_NAME_SUFFIX_RHS, PatternUtils.patternFromPatternAssignment(rb.getRhs()));
				matches.put(name+PatternTemplate.PATTERN_NAME_SUFFIX_RHS, null);
			}
			
		});
	}
	
	protected void retrieveStaticReactionRates() {
		ruleMap.forEach((name, r) -> {
			List<Double> reactionRate = new LinkedList<Double>();
			r.getRule().getVariables().getVariables().forEach(y->{
				if(y instanceof NumericFromLiteral) {
					reactionRate.add(Double.valueOf(((NumericFromLiteral) y).getValue().getValue()));
				}else {
					reactionRate.add(Double.valueOf(((NumericFromVariable) y).getValueVar().getValue().getValue()));
				}
			});
			staticReactionRates.put(name+PatternTemplate.PATTERN_NAME_SUFFIX_LHS, reactionRate.get(0));
			if(r.getRule().getOperator().equals(PatternTemplate.RULE_OPERATOR_BI)) {
				staticReactionRates.put(name+PatternTemplate.PATTERN_NAME_SUFFIX_RHS, reactionRate.get(1));
			}
		});
		//dynamicReactionRates.putAll(staticReactionRates);
	}
	/*
	protected void updateDynamicReactionRates() {
		dynamicReactionRates.keySet().forEach(x -> {
			int numOfMatches = getMatches(x).size();
			double y = numOfMatches * staticReactionRates.get(x);
			dynamicReactionRates.replace(x, y);
		});
	}
	
	protected void collectReactionCandidates() {
		matches.forEach( (x, y) -> {
			if(!x.contains(SupportPatterns.SUPPORT_PREFIX)) {
				List<IPatternMatch> mc = new LinkedList<>();
				mc.addAll(y);
				Collections.shuffle(mc);
				int index = (int) dynamicReactionRates.get(x).doubleValue();
				index = (index == 0)?1:index;
				index = (index >= mc.size())?mc.size():index;
				mc = mc.subList(0, index);
				candidates.put(x, mc);
			}
		});
	}
	*/
	protected void applyRuleToMatch(IPatternMatch match) {
		String patternName = match.patternName().replaceAll("^(.)*\\.", "");
		Pattern src = patternMap.get(patternName);
		Pattern trg = targetPatternMap.get(patternName);
		removeAgents(match, trg);
		/*
		removeLinks(match, src, trg);
		changeSiteStates(match, src, trg);
		addGreenAgents(match, src, trg);
		changeLinks(match, src, trg);
		*/
	}
	
	protected void removeAgents(IPatternMatch match, Pattern trg) {
		for(int i = 0; i<trg.getAgentPatterns().size(); i++) {
			// if the target pattern defines a void instead of an agent pattern -> delete agent
			if(trg.getAgentPatterns().get(i) instanceof VoidAgentPattern) {
				SimAgent agnt = (SimAgent) match.get(match.parameterNames().get(i));
				// delete all links to agent
				agnt.getSimSites().forEach(x-> {
					SimLinkState sls = x.getSimLinkState();
					if(sls != null) {
						org.eclipse.emf.ecore.util.EcoreUtil.delete(sls);
					}
				});
				// delete agent
				org.eclipse.emf.ecore.util.EcoreUtil.delete(agnt);
			}
		}
	}
	
	protected void removeLinks(IPatternMatch match, Pattern src, Pattern trg) {
		for(int i = 0; i<trg.getAgentPatterns().size(); i++) {
			if(trg.getAgentPatterns().get(i) instanceof ValidAgentPattern && 
					src.getAgentPatterns().get(i) instanceof ValidAgentPattern) {
				ValidAgentPattern ap = (ValidAgentPattern)trg.getAgentPatterns().get(i);
				SimAgent agnt = (SimAgent) match.get(match.parameterNames().get(i));
				for(int j = 0; j<agnt.getSimSites().size(); j++) {
					SimSite ss = agnt.getSimSites().get(j);
					SitePattern sp = ap.getSitePatterns().getSitePatterns().get(j);
					// if the site has a link -> check if it needs deletion
					if(ss.getSimLinkState() != null) {
						// if the pattern defines a free link -> delete SimBound object
						if(sp.getLinkState().getLinkState() instanceof FreeLink) {
							org.eclipse.emf.ecore.util.EcoreUtil.delete(ss.getSimLinkState());
						}
					}
				}
			}
		}
	}
	
	protected void changeSiteStates(IPatternMatch match, Pattern src, Pattern trg) {
		for(int i = 0; i<trg.getAgentPatterns().size(); i++) {
			if(trg.getAgentPatterns().get(i) instanceof ValidAgentPattern && 
					src.getAgentPatterns().get(i) instanceof ValidAgentPattern) {
				ValidAgentPattern ap = (ValidAgentPattern)trg.getAgentPatterns().get(i);
				SimAgent agnt = (SimAgent) match.get(match.parameterNames().get(i));
				for(int j = 0; j<agnt.getSimSites().size(); j++) {
					SimSite ss = agnt.getSimSites().get(j);
					SitePattern sp = ap.getSitePatterns().getSitePatterns().get(j);
					// if the site has a site state -> check if change is required
					if(ss.getSimSiteState() != null) {
						// if the pattern defines a site state -> so something
						if(sp.getState() != null) {
							String spStateName = sp.getState().getState().getName();
							// change site state according to the pattern
							if(!ss.getSimSiteState().getType().equals(spStateName)) {
								SimSiteState sss = factory.createSimSiteState();
								sss.setType(spStateName);
								org.eclipse.emf.ecore.util.EcoreUtil.delete(ss.getSimSiteState());
								ss.setSimSiteState(sss);
							}
						}
					}
				}
			}
		}
	}
	
	protected void addGreenAgents(IPatternMatch match, Pattern src, Pattern trg) {
		int agntID = 0;
		for(int i = 0; i<src.getAgentPatterns().size(); i++) {
			// if the source pattern defines a void instead of an agent pattern -> create new agent according to target pattern
			if(src.getAgentPatterns().get(i) instanceof VoidAgentPattern) {
				ValidAgentPattern ap = (ValidAgentPattern)trg.getAgentPatterns().get(i);
				// create new agent and add it to the model
				SimAgent agnt = factory.createSimAgent();
				reactionContainer.getSimAgent().add(agnt);
				// create some unique name and assign type
				agnt.setName(ap.getAgent().getName()+"_viaTransfrom:"+match.hashCode()+"//"+agntID);
				agntID++;
				agnt.setType(ap.getAgent().getName());
				// create required sites
				ap.getSitePatterns().getSitePatterns().forEach(x-> {
					SimSite ss = factory.createSimSite();
					ss.setType(x.getSite().getName());
					// create state if the pattern defines a state
					if(x.getState() != null) {
						SimSiteState sss = factory.createSimSiteState();
						sss.setType(x.getState().getState().getName());
						ss.setSimSiteState(sss);
					} 
					// otherwise create the default site state, if there is any
					else if(x.getSite().getStates().getState() != null && x.getState() == null) {
						SimSiteState sss = factory.createSimSiteState();
						sss.setType(x.getSite().getStates().getState().get(0).getName());
						ss.setSimSiteState(sss);
					}
					// create a link if the pattern defines an indexed link
					// -> the correct linking is performed by another method
					if(x.getLinkState().getLinkState() instanceof BoundLink) {
						SimBound bl = factory.createSimBound();
						reactionContainer.getSimLinkStates().add(bl);
						ss.setSimLinkState(bl);
						bl.setSimSite1(ss);
					}
				});
			}
		}
	}
	
	protected void changeLinks(IPatternMatch match, Pattern src, Pattern trg) {
		for(int i = 0; i<trg.getAgentPatterns().size(); i++) {
			if(trg.getAgentPatterns().get(i) instanceof ValidAgentPattern) {
				ValidAgentPattern ap = (ValidAgentPattern)trg.getAgentPatterns().get(i);
				SimAgent agnt = (SimAgent) match.get(match.parameterNames().get(i));
				for(int j = 0; j<agnt.getSimSites().size(); j++) {
					SimSite ss = agnt.getSimSites().get(j);
					SitePattern sp = ap.getSitePatterns().getSitePatterns().get(j);
					// if the site pattern defines an indexed link -> perfom check if changes are required
					LinkState ls = sp.getLinkState().getLinkState();
					if(ls instanceof BoundLink) {
						int idx = Integer.valueOf(((BoundLink) ls).getState());
						// find the corresponding agent pattern according to link index
						for(int k = 0; k<trg.getAgentPatterns().size(); k++) {
							if(k==i || trg.getAgentPatterns().get(i) instanceof VoidAgentPattern)
								continue;
							ValidAgentPattern ap2 = (ValidAgentPattern)trg.getAgentPatterns().get(k);
							// do shit...
						}
					}
				}
			}
		}
	}
	/*
	protected Collection<? extends IPatternMatch> getMatches(String patternName) {
		return matches.getOrDefault(patternName, new LinkedList<IPatternMatch>());
	}
	*/
}	
