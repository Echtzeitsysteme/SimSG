package biochemsimulation.simulation.persistence;

public class PersistenceManagerFactory {
	
	public static PersistenceManager create(PersistenceManagerEnum type) {
		PersistenceManager pm = null;
		
		switch(type) {
		case SimplePersistence: {
			pm = new SimplePersistenceManager();
			break;
		}
		case NeoEMFPersistence: {
			pm = new NeoEMFPersistenceManager();
			break;
		}
		}
		
		return pm;
	}
}
