package org.simsg.core.persistence;

public class PersistenceManagerFactory {
	
	public static PersistenceManager create(PersistenceManagerEnum type) {
		PersistenceManager pm = null;
		
		switch(type) {
		case SimplePersistence: {
			pm = new SimplePersistenceManager();
			break;
		}
		}
		
		return pm;
	}
}
