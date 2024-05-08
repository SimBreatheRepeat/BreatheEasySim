/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BreatheEasySim.Components;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;
import javax.swing.JLabel;

/**
 *
 * @author kyleh
 */
public class GenericGauge extends JComponent {
    public int getGaugeSize() {
        return gaugeSize;
    }

    public void setGaugeSize(int gaugeSize) {
        this.gaugeSize = gaugeSize;
        repaint();
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
        repaint();
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
        repaint();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value < 0) {
            value = 0;
        }
        this.value = value;
        repaint();
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
        repaint();
    }

    private int gaugeSize = 8;
    private Color color1 = new Color(51, 71, 216);
    private Color color2 = new Color(237, 63, 63);
    private int value;
    private int maximum = 100;

    public GenericGauge() {
        setFont(new JLabel().getFont().deriveFont(0, 20));
        setPreferredSize(new Dimension(90, 80));
        setForeground(new Color(60, 60, 60));
    }

    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        float spaceBot = 0.15f; //  space bot 15%
        float width = getWidth();
        float height = getHeight();
        height += (height * spaceBot);
        float size = Math.min(width, height) - (gaugeSize + 5);   //  5 is margin
        float centerSize = 20;
        float x = (width - size) / 2;
        float y = (height - size) / 2;
        float centerX = width / 2;
        float centerY = height / 2;
        float angleStart = -35;
        g2.setColor(new Color(86, 103, 197));
//        g2.fill(new Ellipse2D.Float(centerX - centerSize / 2, centerY - centerSize / 2, centerSize, centerSize));
        g2.setStroke(new BasicStroke(gaugeSize, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
        Shape s = new Arc2D.Double(x, y, size, size, angleStart, 250, Arc2D.OPEN);
        g2.draw(s);
        float angle = getAngleOfValues();
//        if (angle > 0) {
//            s = new Arc2D.Double(x, y, size, size, angleStart + 250 - angle, angle, Arc2D.OPEN);
//            GradientPaint gra = new GradientPaint(0, 0, color1, width, 0, color2);
//            g2.setPaint(gra);
//            g2.draw(s);
//        }
        g2.setStroke(new BasicStroke(1f));
        //  Create line
        float len = 20;
        float space = 250 / len;
        float start = angleStart + 7;
        float angleSize = (size / 2f) - gaugeSize;
        g2.setColor(new Color(200, 0, 0));
//        for (int i = 1; i <= len; i++) {
//            Loca p = getLocation(start, angleSize);
//            g2.fill(new Ellipse2D.Float(centerX + p.x - 2, centerY - p.y - 2, 4, 4));
//            start += space;
//        }
        //  Create pointer
        float ang = angleStart + 250 - angle;
        g2.setColor(Color.WHITE);
        Path2D p = new Path2D.Double();
        Loca end = getLocation(ang, angleSize);
        g2.fill(new Ellipse2D.Float(centerX + end.x - 2, centerY - end.y - 2, 6, 6));
        
        drawText(g2, centerX - 5, centerY - 5, angleSize);
        super.paint(grphcs);
    }

    private void drawText(Graphics2D g2, float x, float y, float size) {
        g2.setColor(getForeground());
        float v = getValueFixed();
        String text = String.valueOf((int) v);
        System.out.println(v);
        FontMetrics ft = g2.getFontMetrics();
        g2.setFont(new Font("Segoe UI", Font.BOLD, 50));
        g2.setColor(Color.WHITE);
        Rectangle2D r2 = ft.getStringBounds(text, g2);
        g2.drawString(text, (float) (x - r2.getWidth() / 2f), (float) (y + size - r2.getHeight()));
    }

    private float getAngleOfValues() {
        float max = maximum;
        float v = getValueFixed();
        float n = v / max * 100f;
        float angle = n * 250f / 100f;
        return angle;
    }

    private int getValueFixed() {
        return value > maximum ? maximum : value;
    }

    private Loca getLocation(float angle, float size) {
        double x = Math.cos(Math.toRadians(angle)) * size;
        double y = Math.sin(Math.toRadians(angle)) * size;
        return new Loca((float) x, (float) y);
    }

    private class Loca {

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public Loca(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public Loca() {
        }

        private float x;
        private float y;
    }
}
