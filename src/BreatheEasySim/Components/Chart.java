package BreatheEasySim.Components;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;

public class Chart extends JPanel {
    public Chart() {
        // Create a dataset (you can replace this with your own data)
        XYSeries series = new XYSeries("Sample Data");
        series.add(1, 10);
        series.add(2, 20);
        series.add(3, 15);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        // Create the chart
        JFreeChart chart = ChartFactory.createXYLineChart(
                null, // Chart title
                null, // X-axis label
                null, // Y-axis label
                dataset, // Dataset
                PlotOrientation.VERTICAL,
                false, // Include legend
                false, // Include tooltips
                false // Include URLs
        );

        // Customize the plot
        XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(new Color(0, 0, 0, 0)); // Set transparent background
        plot.setDomainGridlinesVisible(false); // Hide X-axis grid lines
        plot.setRangeGridlinesVisible(false); // Hide Y-axis grid lines

        // Customize the line renderer (optional)
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.BLUE); // Set line color (blue in this case)
        renderer.setSeriesShapesVisible(0, false);
        plot.setRenderer(renderer);
        
        NumberAxis xAxis = (NumberAxis) plot.getDomainAxis();
        xAxis.setTickUnit(new NumberTickUnit(1)); // Show ticks at integer intervals
        xAxis.setRange(0, 12); // Set the range from 1 to 12
        
        NumberAxis yAxis = (NumberAxis) plot.getRangeAxis();
        yAxis.setTickUnit(new NumberTickUnit(40)); // Show ticks at integer intervals
        yAxis.setRange(-80, 80); // Set the range from 1 to 12

        // Create a chart panel and add it to this JPanel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(900, 200)); // Set preferred size
        chartPanel.setOpaque(false);
        add(chartPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Purple Line Chart Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Chart());
        frame.pack();
        frame.setVisible(true);
    }
}
