package org.simsg.core.simulation.statistic;

import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.XYSeries;

import java.util.Map;
import java.util.Map.Entry;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

public class ObservablesUi extends ApplicationFrame {

	private boolean timeOnXAxis = true;
	private static final long serialVersionUID = 1L;
	private XYDataset dataset;
	
	public ObservablesUi(String title) {
		super(title);
		setName(title);
		// TODO Auto-generated constructor stub
	}
	
	public void setDisplayTimeOnXAxis(boolean timeOnXAxis) {
		this.timeOnXAxis = timeOnXAxis;
	}
	
	public void initDataSet(Map<String, Observable> observables) {
		XYSeriesCollection seriesCollection = new XYSeriesCollection();
		dataset = seriesCollection;
		
		if(timeOnXAxis) {
			observables.forEach((name, obs) -> {
				XYSeries series = new XYSeries(name);
				obs.getMeasurements().forEach((time, value) -> {
					series.add(time, value);
				});
				seriesCollection.addSeries(series);
			});
		} else {
			observables.forEach((name, obs) -> {
				XYSeries series = new XYSeries(name);
				int i = 0;
				for(Entry<Double, Integer> entry : obs.getMeasurements().entrySet()) {
					series.add(i, entry.getValue());
					i++;
				}
				seriesCollection.addSeries(series);
			});
		}
		
		
	}
	
	public void displayDataSet() {
		JFreeChart xylineChart = ChartFactory.createXYLineChart(
		         super.getName() ,
		         (timeOnXAxis)?"Time [s]":"#Steps" ,
		         "Population" ,
		         dataset ,
		         PlotOrientation.VERTICAL ,
		         true , true , false);
		
		xylineChart.setTitle(super.getName());
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
