package SimSG.Core.Simulation;

public class SimulationTerminationConditionFactory {
	
	public static SimulationTerminationCondition create(SimulationTerminationConditionEnum type) {
		SimulationTerminationCondition condition = null;
		
		switch(type) {
		case SimpleCondition : {
			condition = new SimpleTerminationCondition();
			break;
		}
		case ComplexCondition : {
			condition = new ComplexTerminationCondition();
			break;
		}
		}
		
		return condition;
	}
}
