package org.simsg.core.simulation.statistic;

import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.XYSeries;

import java.util.List;
import java.util.Map.Entry;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

public class ModelGraphPropertiesUi extends ApplicationFrame {

	private static final long serialVersionUID = 1L;
	XYDataset dataset;

	public ModelGraphPropertiesUi(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	
	public void initDataSet(List<Entry<Double, Integer>> data) {
		XYSeriesCollection seriesCollection = new XYSeriesCollection();
		dataset = seriesCollection;
		
		XYSeries series = new XYSeries("Number of disjunct Model Graphs");
		data.forEach(entry -> {
			series.add(entry.getKey(), entry.getValue());
		});
		seriesCollection.addSeries(series);
	}
	
	public void displayDataSet() {
		JFreeChart xylineChart = ChartFactory.createXYLineChart(
		         super.getName() ,
		         "Time [s]" ,
		         "Num of disjunct Model Graphs" ,
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
