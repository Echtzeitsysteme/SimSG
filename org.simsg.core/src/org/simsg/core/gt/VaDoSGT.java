package org.simsg.core.gt;

import java.awt.Frame;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.emoflon.ibex.gt.StateModel.AllMatches;
import org.emoflon.ibex.gt.StateModel.RuleState;
import org.emoflon.ibex.gt.StateModel.State;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import org.emoflon.ibex.gt.state.ModelStateManager;
import org.emoflon.ibex.gt.ui.VaDoGT;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContext;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPatternSet;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRule;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXRuleSet;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.module.ReconstructionSimulation;
import org.simsg.core.simulation.statistic.Observable;
import org.simsg.core.simulation.statistic.Observables;
import org.simsg.core.utils.Measurement;

public class VaDoSGT extends VaDoGT {

	// Simulation statistics
	private Map<String, Double> sRR;
	private Map<State, Map<String, Double>> dRR;
	private TreeMap<Double, Map<String, Double>> observ;
	
	// Plot data
	private XYDataset dataset;
	public boolean timeOnXAxis;
	private JFreeChart xylineChart;
	
	/**
	 * Constructor
	 * @param resource	resource set
	 * @param stateManager state manager
	 * @param graphTransformationInterpreter GT-interpreter
	 * @param iBeXRuleSet	rules
	 * @param iBeXPatternSet patterns
	 * @param modelName	model name
	 */
	public VaDoSGT(Resource resource, ModelStateManager stateManager,
			GraphTransformationInterpreter graphTransformationInterpreter, IBeXRuleSet iBeXRuleSet,
			IBeXPatternSet iBeXPatternSet, String modelName) {
			super(resource, stateManager, graphTransformationInterpreter, iBeXRuleSet, iBeXPatternSet, modelName);
	}

	public void initializeStaticRuleRates(Map<String, Double> ruleProbabilities) {
		sRR = ruleProbabilities;
	}	

	public void initializeDynamicRuleRates() {
//		double ruleActivity = matchCOunt*staticRate
//		double systemActivity = sum of all rule Activitys
		dRR = new HashMap<State, Map<String, Double>>();
		HashMap<String, Double> rates = new HashMap<String, Double>();
		for(IBeXRule rule : this.ruleSet) {
			rates.put(rule.getName(), 0.0);
		}
		dRR.put(localStateManager.getModelStates().getInitialState(), rates);
		for(State state : localStateManager.getModelStates().getStates()) {
			rates = new HashMap<String, Double>();
//			double systemActivity = 0;
			HashMap<String, Double> ruleActivity = new HashMap<String, Double>();
			
			RuleState rState = (RuleState) state;
			for(IBeXRule rule : this.ruleSet) {
				for(AllMatches allMatches : rState.getAllMatches()) {
					if(allMatches.getPatternName().equals(rule.getName())) {
						ruleActivity.put(rule.getName(), allMatches.getAllMatchesForPattern().size() * sRR.get(rule.getName()));
						break;
					}
				}
			}
//			for(String rule : ruleActivity.keySet()) {
//				systemActivity += ruleActivity.get(rule);
//				
//			}
			for(String rule : ruleActivity.keySet()) {
				rates.put(rule, ruleActivity.get(rule));
			}
			
			dRR.put(state, rates);
			
		}

		printRuleRates();
	}
	
	public void reconstructObservables(Set<String> set) {
		this.timeOnXAxis = false;
		observ = new TreeMap<Double, Map<String, Double>>();

		for(State state : localStateManager.getModelStates().getStates()) {
			RuleState rState = (RuleState) state;
			Map<String, Double> patternValue = new HashMap<String, Double>();
			for(AllMatches matches : rState.getAllMatches()) {
				if(set.contains(matches.getPatternName())) {
					patternValue.put(matches.getPatternName(), (double) matches.getAllMatchesForPattern().size());
					
				}
			}
		
			observ.put((double) (localStateManager.getModelStates().getStates().indexOf(state)), patternValue);
		}
		Map<String, Double> patternValue = new HashMap<String, Double>();
		for(String pattern : set) {
			patternValue.put(pattern, 0.0);
		}
		observ.put((double) localStateManager.getModelStates().getStates().size(), patternValue);
	}
	
	/**
	 * Initialize observables and their values
	 * @param map	observables
	 */
	public void initializeObservables(Observables obs, boolean timeOnXAxis) {
		this.timeOnXAxis = timeOnXAxis;
		observ = new TreeMap<Double, Map<String, Double>>();
		
		
		Map<String, Observable> localObs = obs.getObservables();


		for(String randomPattern : localObs.keySet()) {
			for(double step : localObs.get(randomPattern).getMeasurements().keySet()) {
				Map<String, Double> patternValue = new HashMap<String, Double>();
				for(String pattern : localObs.keySet()) {
					patternValue.put(pattern, (double) localObs.get(pattern).getMeasurements().get(step));
				}
				observ.put(step, patternValue);
			}
			break;
		}
	}
	
	/**
	 * Prints rule rates on gui
	 */
	@Override
	protected void printRuleRates() {
		info.setText("");
		DecimalFormat df = new DecimalFormat("#.##");
		if(sRR != null && dRR != null) {
			for(String rule : sRR.keySet()) {
				double dynamic;
				if(localStateManager.getCurrentState().getChildren().isEmpty()) {
					dynamic = 0.0;
				} else {
					dynamic = dRR.get(localStateManager.getCurrentState().getChildren().get(0)).get(rule);
				}
				
				
				info.setText(info.getText() 
						+ rule 
						+ " " 
						+ sRR.get(rule).doubleValue()
						+ " --> " 
						+ df.format(dynamic)
						+ "\n");
			}
		} else {
			info.setText("No data available!");
		}
	}
	
	/**
	 * Displays SimSG visualizer
	 */
	public void runVis() {
		this.runApp();
	}
	
	/**
	 * Prepares data set for plotting e.g. adds data for respective amount of states to the data set
	 */
	private void prepDataSet() {
		XYSeriesCollection seriesCollection = new XYSeriesCollection();
		dataset = seriesCollection;
		int currentState = 1;
		if(!localStateManager.getCurrentState().isInitial()) {
			currentState = localStateManager.getModelStates().getStates().indexOf(localStateManager.getCurrentState())+1;
		}
		for(String pattern : observ.get(0.0).keySet()) {
			XYSeries series = new XYSeries(pattern);
			double key = 0.0;
			for(double s=0.0;s<=currentState;s++) {
				series.add(key, observ.get(key).get(pattern));
				if(key != observ.lastKey())
					key = observ.higherKey(key);
			}
			seriesCollection.addSeries(series);
		}
	}	

	
	
	/**
	 * Displays the plot
	 */
	@Override
	public void displayData() {
		if(this.observ != null) {
			prepDataSet();
			Group plotGroup = new Group(folder, SWT.NO_BACKGROUND | SWT.EMBEDDED);
	        tab2.setControl(plotGroup);
			Frame plotFrame = SWT_AWT.new_Frame(plotGroup);
			
			xylineChart = ChartFactory.createXYLineChart(
					 "Observables" ,
			         (timeOnXAxis)?"Time [s]":"#Steps" ,
			         "Population" ,
			         dataset ,
			         PlotOrientation.VERTICAL ,
			         true , true , false);
		
			ChartPanel jfreeChartPanel = new ChartPanel(xylineChart);
			plotFrame.add(jfreeChartPanel);
			plotFrame.setVisible(true);
		} else {
			Label noDataLabel = new Label(folder, SWT.NONE);
			noDataLabel.setText("No plot data available!");
			tab2.setControl(noDataLabel);
		}
	}

	/**
	 * Updates the plot
	 */
	@Override
	public void updatePlot() {		
		prepDataSet();
		if(xylineChart != null) {
			xylineChart.getXYPlot().setDataset(dataset);
		}
	}
	
}
