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
	private int indexInPattern;
	private int maxNumOfInstances;
	private int currentNumOfInstances = 0;
	
	private String type;
	private List<SiteTemplate> siteTemplates;
	
	AgentTemplate(Initial init, ValidAgentPattern ap, int indexInPattern) {
		this.ap = ap;
		this.init = init;
		this.indexInPattern = indexInPattern;
		siteTemplates = new LinkedList<SiteTemplate>();
		createTemplate();
	}
	
	private void createTemplate() {
		maxNumOfInstances = (int)PatternUtils.valueOfNumericAssignment(init.getCount());
		type = ap.getAgent().getName();
		
		List<Site> sites = new LinkedList<Site>();
		ap.getAgent().getSites().getSites().forEach(x -> sites.add(x));
		
		HashSet<SitePattern> sps = new HashSet<SitePattern>(ap.getSitePatterns().getSitePatterns());
		
		for(Site site : sites) {
			String currentSite = site.getName();
			SitePattern foundSp = null;
			for(SitePattern sp : sps) {
				if(currentSite.equals(sp.getSite().getName())) {
					siteTemplates.add(new SiteTemplate(this, sp));
					foundSp = sp;
					break;
				}
			}
			if(foundSp == null) {
				siteTemplates.add(new SiteTemplate(this, site));
			}else {
				sps.remove(foundSp);
			}
		}
	}
	
	public SimAgent createInstance(ReactionContainerFactory factory, List<SimLinkState> simLinkStates) {
		SimAgent newAgent = factory.createSimAgent();
		currentNumOfInstances++;
		// missing name
		newAgent.setType(type);
		newAgent.setName(generateAgentInstanceName(currentNumOfInstances, type, init.getName(), "", indexInPattern));
		
		for(SiteTemplate st : siteTemplates) {
			newAgent.getSimSites().add(st.createInstance(factory, simLinkStates, newAgent));
		}
		
		return newAgent;
	}
	
	public static String generateAgentInstanceName(int numOfInstance, String type, String varName, String site, int idxInPattern) {
		return "AgentInstance:"+numOfInstance+"/ofType:"+type+"/fromVar:"+varName+"/withIdx:"+idxInPattern+"/atSite:"+site;
	}
	
	public String getType() {
		return type;
	}
	
	public int getIndexInPattern() {
		return indexInPattern;
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
