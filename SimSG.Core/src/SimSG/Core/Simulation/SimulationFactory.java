package SimSG.Core.Simulation;

public class SimulationFactory {
	public static Simulation create(SimulationType type) {
		Simulation sim = null;
		
		switch(type) {
		case SimpleSimulation : {
			sim = new SimpleSimulation();
			break;
		}
		
		case StochasticSimulation : {
			sim = new StochasticSimulation();
			break;
		}
		}
		
		return sim;
	}
}
