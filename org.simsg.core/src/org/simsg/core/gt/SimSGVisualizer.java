package org.simsg.core.gt;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.gt.StateModel.RuleState;
import org.emoflon.ibex.gt.StateModel.State;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import org.emoflon.ibex.gt.state.ModelStateManager;
import org.emoflon.ibex.gt.ui.GraphVisualizer;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContext;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPatternSet;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRule;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRuleSet;
import org.simsg.core.simulation.statistic.Observable;

public class SimSGVisualizer extends GraphVisualizer {

	
	private Map<String, Double> sRR;
	private Map<Integer, Map<String, Double>> dRR;
	private Map<Integer, Map<String, Observable>> observables;
	
	public SimSGVisualizer(Resource resource, ModelStateManager stateManager,
			GraphTransformationInterpreter graphTransformationInterpreter, IBeXRuleSet iBeXRuleSet,
			IBeXPatternSet iBeXPatternSet, String modelName) {
		super(resource, stateManager, graphTransformationInterpreter, iBeXRuleSet, iBeXPatternSet, modelName);
		
		
	}

	public void addRuleRatesToState(Map<String, Double> sRR, Map<Integer, Map<String, Double>> dynamicRuleRatesState) {
		this.sRR = sRR;	
		this.dRR = dynamicRuleRatesState;
		printRuleRates();
	}
	
	public void addObservablesToState(Map<Integer, Map<String, Observable>> observables) {
		this.observables = observables;
	}
	
	@Override
	protected void printRuleRates() {
		info.setText("");
		for(IBeXRule rule : this.ruleSet) {
			info.setText(info.getText() + rule.getName() + " " + sRR.get(rule.getName()) + " --> " + dRR.get(localStateManager.modelStates.getStates().indexOf(localStateManager.getCurrentState())).get(rule.getName()) + "\n");
		}
	}
	
	public void runVis() {
		this.runApp();
	}

}
