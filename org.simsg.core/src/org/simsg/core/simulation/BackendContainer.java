package org.simsg.core.simulation;

import org.simsg.core.gt.GraphTransformationEngine;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.pm.engine.PatternMatchingEngine;
import org.simsg.core.pmc.PatternMatchingController;

public class BackendContainer {
	public PersistenceManager persistence;
	public PatternMatchingController pmc;
	public PatternMatchingEngine pmEngine;
	public GraphTransformationEngine gtEngine;
}
