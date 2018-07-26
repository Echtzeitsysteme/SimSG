package biochemsimulation.simulation;

public class SimulationTerminationConditionFactory {
	
	public static SimulationTerminationCondition create(SimulationTerminationConditionEnum type) {
		SimulationTerminationCondition condition = null;
		
		switch(type) {
		case SimpleCondition : {
			condition = new SimpleTerminationCondition();
			break;
		}
		}
		
		return condition;
	}
}
