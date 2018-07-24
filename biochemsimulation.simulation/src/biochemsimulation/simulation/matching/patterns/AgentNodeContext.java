package biochemsimulation.simulation.matching.patterns;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;

public class AgentNodeContext {
	private String agentVariableName;
	public final static EClassifier SIM_AGENT_TYPE = ReactionContainerPackage.Literals.SIM_AGENT;
	
	public final static EDataType TYPE_ATTRIBUTE_TYPE = ReactionContainerPackage.Literals.SIM_AGENT.getEAttributes().get(1).getEAttributeType();
	
	public final static EAttribute TYPE_ATTRIBUTE = ReactionContainerPackage.Literals.SIM_AGENT.getEAttributes().get(1);
	private String uniqueTypeAttributeName;
	
	private String agentType;
	
	public AgentNodeContext(String agentVariableName, String agentType) {
		this.agentVariableName = agentVariableName;
		this.agentType = agentType;
		uniqueTypeAttributeName = agentVariableName+"_"+TYPE_ATTRIBUTE.getName();
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
	
}
