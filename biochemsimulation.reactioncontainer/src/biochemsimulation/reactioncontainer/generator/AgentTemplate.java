package biochemsimulation.reactioncontainer.generator;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import biochemsimulation.reactioncontainer.ReactionContainerFactory;
import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactionrules.reactionRules.Initial;
import biochemsimulation.reactionrules.reactionRules.Pattern;
import biochemsimulation.reactionrules.reactionRules.Site;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;
import biochemsimulation.reactionrules.utils.PatternUtils;

public class AgentTemplate {
	private Initial init;
	private ValidAgentPattern ap;
	private int maxNumOfInstances;
	private int currentNumOfInstances = 0;
	
	private String type;
	private List<SiteTemplate> siteTemplates;
	
	AgentTemplate(Initial init, ValidAgentPattern ap) {
		this.ap = ap;
		this.init = init;
		siteTemplates = new LinkedList<SiteTemplate>();
		createTemplate();
	}
	
	private void createTemplate() {
		maxNumOfInstances = (int)PatternUtils.valueOfNumericAssignment(init.getCount());
		type = ap.getAgent().getName();
		
		HashSet<Site> sites = new HashSet<Site>();
		ap.getAgent().getSites().getSites().forEach(x -> sites.add(x));
		
		for(SitePattern sp : ap.getSitePatterns().getSitePatterns()) {
			siteTemplates.add(new SiteTemplate(this, sp));
			sites.remove(sp.getSite());
		}
		
		for(Site s : sites) {
			siteTemplates.add(new SiteTemplate(this, s));
		}
	}
	
	public SimAgent createInstance(ReactionContainerFactory factory, List<SimLinkState> simLinkStates) {
		SimAgent newAgent = factory.createSimAgent();
		currentNumOfInstances++;
		// missing name
		newAgent.setType(type);
		newAgent.setName(generateAgentInstanceName(currentNumOfInstances, type, init.getName(), ""));
		
		for(SiteTemplate st : siteTemplates) {
			newAgent.getSimSites().add(st.createInstance(factory, simLinkStates, newAgent));
		}
		
		return newAgent;
	}
	
	public static String generateAgentInstanceName(int numOfInstance, String type, String varName, String site) {
		return "AgentInstance:"+numOfInstance+"/ofType:"+type+"/fromVar:"+varName+"/atSite:"+site;
	}
	
	public String getType() {
		return type;
	}
	
	public String getVariableName() {
		return init.getName();
	}
	
	public Pattern getPattern() {
		return PatternUtils.patternFromPatternAssignment(init.getInitialPattern());
	}

	public int getCount() {
		return maxNumOfInstances;
	}
	
	public int getCurrentCount() {
		return currentNumOfInstances;
	}
	
}
