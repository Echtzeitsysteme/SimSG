package biochemsimulation.simulation.matching.democles;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;

import biochemsimulation.reactioncontainer.ReactionContainerPackage;

class AgentNodeContext {
	private String agentVariableName;
	public final static EClassifier SIM_AGENT_TYPE = ReactionContainerPackage.Literals.SIM_AGENT;
	
	public final static EDataType TYPE_ATTRIBUTE_TYPE = ReactionContainerPackage.Literals.SIM_AGENT.getEAttributes().get(1).getEAttributeType();
	
	public final static EAttribute TYPE_ATTRIBUTE = ReactionContainerPackage.Literals.SIM_AGENT.getEAttributes().get(1);
	private String uniqueTypeAttributeName;
	
	private String agentType;
	
	AgentNodeContext(String agentVariableName, String agentType) {
		this.agentVariableName = agentVariableName;
		this.agentType = agentType;
		uniqueTypeAttributeName = agentVariableName+"_"+TYPE_ATTRIBUTE.getName();
	}
	
	static String getSimAgentTypeName() {
		return SIM_AGENT_TYPE.getName();
	}
	
	static String getTypeAttributeTypeName() {
		return TYPE_ATTRIBUTE_TYPE.getName();
	}
	
	static String getTypeAttributeName() {
		return TYPE_ATTRIBUTE.getName();
	}

	String getAgentVariableName() {
		return agentVariableName;
	}
	
	String getUniqueTypeAttributeName() {
		return uniqueTypeAttributeName;
	}

	String getAgentType() {
		return agentType;
	}
	
}
