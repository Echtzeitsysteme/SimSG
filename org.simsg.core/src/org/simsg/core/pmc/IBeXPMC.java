package org.simsg.core.pmc;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.simsg.core.pm.match.IMatch;

import SimulationDefinition.SimDefinition;

public class IBeXPMC extends PatternMatchingController {
	
	public IBeXPMC() {
		super();
	}

	@Override
	public void setAdditionalParameters(Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void feedEngine() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void collectMatches(String patternName) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void collectAllMatches() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public int getMatchCount(String patternName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int getRandomMatchIdx(String patternName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IMatch getRandomMatch(String patternName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMatch getMatchAt(String patternName, int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<IMatch> getMatches(String patternName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Collection<IMatch>> getAllMatches() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loadModels(SimDefinition simulationDefinition, Resource simulationModel) throws Exception {
		this.simulationDefinition = simulationDefinition;
		this.simulationModel = simulationModel;
		feedEngine();
	}

}
