/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BreatheEasySim;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.SeriesException;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;


public class Oscilloscope extends JFrame {
    private TimeSeries series;
    private Second current;
    private double value;
    private long startTime = System.currentTimeMillis();
    private final double amplitude = 2.0;
    private final double frequency = 5.0; // Hz
    private double phaseShift = 0;

    public Oscilloscope(final String title) {
        super(title);
        series = new TimeSeries("Random Data");
        current = new Second();
        value = 100.0;
        final XYDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 370));
        chartPanel.setMouseZoomable(true, false);
        setContentPane(chartPanel);
        
        // Set up a timer to add new data points every second
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addDataPoint();
            }
        });
        timer.start();
    }

    private XYDataset createDataset() {
        return new TimeSeriesCollection(series);
    }

    private JFreeChart createChart(final XYDataset dataset) {
        return ChartFactory.createTimeSeriesChart(
                "Simulated Oscilloscope",
                "Time (Seconds)",
                "Value",
                dataset,
                false,
                false,
                false
        );
    }

    private void addDataPoint() {
        long currentTime = System.currentTimeMillis();
        double elapsedTime = (currentTime - startTime) / 1000.0; // seconds
        double yValue = amplitude * Math.sin(2 * Math.PI * frequency * elapsedTime + phaseShift);
        series.getSeries(0).addOrUpdate(new Millisecond(currentTime), yValue);
    }
    
    public static void main(final String[] args) {
        final String title = "Simulated Oscilloscope";
        final Oscilloscope demo = new Oscilloscope(title);
        demo.pack();
        demo.setVisible(true);
    }
}
