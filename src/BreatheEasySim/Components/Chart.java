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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.data.xy.XYDataset;

public class Chart extends JPanel {
    public XYSeries seriesA;
    public XYSeries seriesB;
    public boolean switchSeries = false;
    
    public double elapsedSeconds; // Counter for elapsed seconds
    public double amplitude = 20.0;
    public Timer timer;

    public double getAmplitude() {
        return amplitude;
    }

    public double getFrequency() {
        return frequency;
    }

    public double getPhaseShift() {
        return phaseShift;
    }

    public void setAmplitude(double amplitude) {
        this.amplitude = amplitude;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
    private double frequency = 2.5; // Hz
    private double phaseShift = 0;

    public void setPhaseShift(double phaseShift) {
        this.phaseShift = phaseShift;
    }
    
    public Chart() {
        super();
        seriesA = new XYSeries("Data A");
        seriesB = new XYSeries("Data B");
        
        // Pre-populate the series with NaN values
        for (double i = 0.0; i <= 1200; i++) {
            double temp = Math.round(i * 0.02 * 100) / 100.0;
            seriesA.add(temp, Double.NaN);
//            seriesB.add(temp, Double.NaN);
        }
        
        elapsedSeconds = 0.0; // Initialize elapsed seconds
        final XYDataset dataset = createDataset();

        // Create the chart
        final JFreeChart chart = createChart(dataset);

        // Customize the plot
        XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(new Color(0, 0, 0, 0)); // Set transparent background
        plot.setDomainGridlinesVisible(false); // Hide X-axis grid lines
        plot.setRangeGridlinesVisible(false); // Hide Y-axis grid lines

        // Customize the line renderer (optional)
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.BLUE); // Set line color (blue in this case)
        renderer.setSeriesPaint(1, Color.BLUE); // Set line color (blue in this case)
        renderer.setSeriesShapesVisible(0, false);
        renderer.setSeriesShapesVisible(1, false);
        plot.setRenderer(renderer);
        
        NumberAxis xAxis = (NumberAxis) plot.getDomainAxis();
        xAxis.setTickUnit(new NumberTickUnit(1)); // Show ticks at integer intervals
        xAxis.setRange(0, 12); // Set the range from 1 to 12
        
        NumberAxis yAxis = (NumberAxis) plot.getRangeAxis();
        yAxis.setTickUnit(new NumberTickUnit(40)); // Show ticks at integer intervals
        yAxis.setRange(-80, 80); // Set the range from 1 to 12

        // Create a chart panel and add it to this JPanel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(1367, 200)); // Set preferred size
        chartPanel.setOpaque(false);
        chartPanel.setMouseZoomable(false, false);
        add(chartPanel);
        
        // Set up a timer to add new data points every second
        timer = new Timer(14, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addDataPoint();
            }
        });
    }
    
    private XYDataset createDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(seriesA);
        dataset.addSeries(seriesB);
        return dataset;
    }
    
    private JFreeChart createChart(final XYDataset dataset) {
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
        
        return chart;
    }
    
    private void addDataPoint() {
        double val = Math.round(elapsedSeconds * 100%1200) / 100.0;
        if(0.0 == val)
        {
            switchSeries = !switchSeries;
            System.out.println("Switched");
        }
        double yValue = amplitude * Math.sin(frequency * elapsedSeconds + phaseShift);

        if(switchSeries) {
            seriesA.remove(0);
            seriesB.addOrUpdate(val, yValue); // Use modulo operator to reset x to 0 when it exceeds 12
        }
        else {
            seriesB.remove(0);
            seriesA.addOrUpdate(val, yValue); // Use modulo operator to reset x to 0 when it exceeds 12
        }
//        series.remove(index + 1);
        
        elapsedSeconds+=.02; // Increment elapsed seconds
        
        // Fix precision issue
        elapsedSeconds = Math.round(elapsedSeconds * 100) / 100.0;
        
        try {
            Thread.sleep(3);
            
            
            // Adjust the range of the x-axis to show only the last 12 seconds
//        plot.getDomainAxis().setRange(new Range(Math.max(0, elapsedSeconds - 12), elapsedSeconds));
        } catch (InterruptedException ex) {
            Logger.getLogger(Chart.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void startTimer()
    {
        timer.start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Purple Line Chart Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Chart());
        frame.pack();
        frame.setVisible(true);
    }
}
