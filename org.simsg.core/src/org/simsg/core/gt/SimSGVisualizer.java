package org.simsg.core.gt;

import java.awt.Frame;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Group;
import org.emoflon.ibex.gt.StateModel.RuleState;
import org.emoflon.ibex.gt.StateModel.State;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import org.emoflon.ibex.gt.state.ModelStateManager;
import org.emoflon.ibex.gt.ui.GraphVisualizer;
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
import org.simsg.core.simulation.statistic.Observable;

public class SimSGVisualizer extends GraphVisualizer {

	// Simulation statistics
	private Map<String, Double> sRR;
	private Map<Integer, Map<String, Double>> dRR;
	private Map<String, Observable> observables;
	
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
	public SimSGVisualizer(Resource resource, ModelStateManager stateManager,
			GraphTransformationInterpreter graphTransformationInterpreter, IBeXRuleSet iBeXRuleSet,
			IBeXPatternSet iBeXPatternSet, String modelName) {
			super(resource, stateManager, graphTransformationInterpreter, iBeXRuleSet, iBeXPatternSet, modelName);
	}

	/**
	 * Initialize dynamic and static rules rates and prints them on gui
	 * @param sRR	static rule rates
	 * @param dynamicRuleRatesState	dynamic rule rates
	 */
	public void initializeRuleRates(Map<String, Double> sRR, Map<Integer, Map<String, Double>> dynamicRuleRatesState) {
		this.sRR = sRR;	
		this.dRR = dynamicRuleRatesState;
		printRuleRates();
	}
	
	/**
	 * Initialize observables and their values
	 * @param map	observables
	 */
	public void initializeObservables(Map<String, Observable> map) {
		this.observables = map;
	}
	
	/**
	 * Prints rule rates on gui
	 */
	@Override
	protected void printRuleRates() {
		if(sRR != null && dRR != null) {
			info.setText("");
			for(IBeXRule rule : this.ruleSet) {
				info.setText(info.getText() + rule.getName() + " " + sRR.get(rule.getName()) + " --> " + dRR.get(localStateManager.modelStates.getStates().indexOf(localStateManager.getCurrentState())).get(rule.getName()) + "\n");
			}
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
		int state = localStateManager.modelStates.getStates().indexOf(localStateManager.getCurrentState());
		if(state == 0) {
			observables.forEach((name, obs) -> {
				XYSeries series = new XYSeries(name);
				series.add(0,0);
				seriesCollection.addSeries(series);
			});
		} else {
			observables.forEach((name, obs) -> {
				XYSeries series = new XYSeries(name);
				Double key = obs.getMeasurements().firstKey();
				for(int s=0;s<=state;s++) {
					series.add(key, obs.getMeasurements().get(key));
					key = obs.getMeasurements().higherKey(key);
				}
				seriesCollection.addSeries(series);
			});
		}
	}
	
	
//	/**
//	 * Initializes data set with zeros
//	 */
//	public void initDataSet() {
//		XYSeriesCollection seriesCollection = new XYSeriesCollection();
//		dataset = seriesCollection;
//	
//		if(timeOnXAxis) {
//			observables.forEach((name, obs) -> {
//				XYSeries series = new XYSeries(name);
//				obs.getMeasurements().forEach((time, value) -> {
//					series.add(time, value);
//				});
//				seriesCollection.addSeries(series);
//			});
//		} else {
//			observables.forEach((name, obs) -> {
//				XYSeries series = new XYSeries(name);
//				int i = 0;
//				for(Entry<Double, Integer> entry : obs.getMeasurements().entrySet()) {
//					series.add(i, entry.getValue());
//					i++;
//				}
//				seriesCollection.addSeries(series);
//			});
//		}
//		
//		
//	}
	
	
	/**
	 * Displays the plot
	 */
	@Override
	public void displayData() {
		if(this.observables != null) {
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
