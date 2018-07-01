package biochemsimulation.simulation.pmc;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.viatra.query.runtime.api.IPatternMatch;

import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;
import biochemsimulation.reactionrules.reactionRules.FreeLink;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;
import biochemsimulation.reactionrules.reactionRules.VoidAgentPattern;

class TransformationTemplate {
	
	private Pattern precondition;
	private Pattern postcondition;
	
	private List<Integer> agentRemovals;
	private List<LinkTransformationTemplate> linkRemovals;
	
	TransformationTemplate(Pattern precondition, Pattern postcondition) {
		this.precondition = precondition;
		this.postcondition = postcondition;
	}
	
	void findAgentRemovalCandidates() {
		agentRemovals = new LinkedList<Integer>();
		for(int i = 0; i<postcondition.getAgentPatterns().size(); i++) {
			// if the target pattern defines a void instead of an agent pattern -> delete agent
			if(postcondition.getAgentPatterns().get(i) instanceof VoidAgentPattern) {
				agentRemovals.add(i);
			}
		}
	}
	
	void findLinkRemovalCandidates() {
		linkRemovals = new LinkedList<LinkTransformationTemplate>();
		
		for(int i = 0; i<postcondition.getAgentPatterns().size(); i++) {
			LinkTransformationTemplate linkRemoveTemplate = new LinkTransformationTemplate(i);
			if(postcondition.getAgentPatterns().get(i) instanceof ValidAgentPattern && 
					precondition.getAgentPatterns().get(i) instanceof ValidAgentPattern) {
				ValidAgentPattern ap = (ValidAgentPattern)postcondition.getAgentPatterns().get(i);
				for(int j = 0; j<ap.getSitePatterns().getSitePatterns().size(); j++) {
					SitePattern sp = ap.getSitePatterns().getSitePatterns().get(j);
					// if the site has a link -> check if it needs deletion
					if(sp.getLinkState().getLinkState() instanceof FreeLink) {
						linkRemoveTemplate.addLinkRemovalCandidate(j);
					}
				}
			}
			if(!linkRemoveTemplate.isEmpty()) {
				linkRemovals.add(linkRemoveTemplate);
			}
		}
	}
	
	void applyAgentRemovalCandidates(IPatternMatch match) {
		agentRemovals.forEach( agentIdx -> {
			SimAgent agent = (SimAgent) match.get(match.parameterNames().get(agentIdx));
			// delete all links to agent
			agent.getSimSites().forEach(link-> {
				SimLinkState sLinkState = link.getSimLinkState();
				if(sLinkState != null) {
					org.eclipse.emf.ecore.util.EcoreUtil.delete(sLinkState);
				}
			});
			// delete agent
			org.eclipse.emf.ecore.util.EcoreUtil.delete(agent);
		});
	}
	
	void applyLinkRemovalTemplates(IPatternMatch match) {
		linkRemovals.forEach(template -> {
			template.applyRemovalCandidates(match);
		});
	}
}