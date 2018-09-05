package biochemsimulation.simulation.matching.patterns;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;

public class AgentNodeContext {
	
	private String patternName;
	
	private String agentVariableName;
	public final static EClassifier SIM_AGENT_TYPE = ReactionContainerPackage.Literals.SIM_AGENT;
	
	public final static EDataType TYPE_ATTRIBUTE_TYPE = ReactionContainerPackage.Literals.SIM_AGENT.getEAttributes().get(0).getEAttributeType();
	
	public final static EAttribute TYPE_ATTRIBUTE = ReactionContainerPackage.Literals.SIM_AGENT.getEAttributes().get(0);
	private String uniqueTypeAttributeName;
	
	private String agentType;
	
	private boolean local;
	
	public AgentNodeContext(String patternName, String agentVariableName, String agentType) {
		this.patternName = patternName;
		this.agentVariableName = agentVariableName;
		this.agentType = agentType;
		uniqueTypeAttributeName = agentVariableName+"_"+TYPE_ATTRIBUTE.getName();
		local = false;
	}
	
	public static String getSimAgentTypeName() {
		return SIM_AGENT_TYPE.getName();
	}
	
	public static String getTypeAttributeTypeName() {
		return TYPE_ATTRIBUTE_TYPE.getName();
	}
	
	public static String getTypeAttributeName() {
		return TYPE_ATTRIBUTE.getName();
	}

	public String getAgentVariableName() {
		return agentVariableName;
	}
	
	public String getUniqueTypeAttributeName() {
		return uniqueTypeAttributeName;
	}

	public String getAgentType() {
		return agentType;
	}
	
	public void setLocal() {
		local = true;
	}
	
	public boolean isLocal() {
		return local;
	}
	
	public String getPatternName() {
		return patternName;
	}
	
}
