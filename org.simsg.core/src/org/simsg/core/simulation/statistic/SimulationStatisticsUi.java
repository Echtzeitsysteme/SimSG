package org.simsg.core.simulation.statistic;

import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.simsg.core.simulation.Observable;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.XYSeries;

import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

public class SimulationStatisticsUi extends ApplicationFrame {

	private static final long serialVersionUID = 1L;
	XYDataset dataset;

	public SimulationStatisticsUi(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	
	public void initDataSet(Map<String, Observable> observables) {
		XYSeriesCollection seriesCollection = new XYSeriesCollection();
		dataset = seriesCollection;
		
		observables.forEach((name, obs) -> {
			XYSeries series = new XYSeries(name);
			obs.getMeasurements().forEach((time, value) -> {
				series.add(time, value);
			});
			seriesCollection.addSeries(series);
		});
		
	}
	
	public void displayDataSet() {
		JFreeChart xylineChart = ChartFactory.createXYLineChart(
		         super.getName() ,
		         "Time [s]" ,
		         "Population" ,
		         dataset ,
		         PlotOrientation.VERTICAL ,
		         true , true , false);
		
		ChartFrame frame = new ChartFrame(super.getName(), xylineChart);
		
		setContentPane(frame.getContentPane());
		
		frame.setPreferredSize( new java.awt.Dimension( 800 , 600 ) );
		this.setPreferredSize(frame.getPreferredSize());
		
		this.repaint();
		frame.repaint();
		
		this.setSize(frame.getPreferredSize());
		RefineryUtilities.centerFrameOnScreen( this );          
		this.setVisible( true ); 
	}

}
