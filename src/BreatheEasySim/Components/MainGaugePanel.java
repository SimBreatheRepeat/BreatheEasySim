/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package BreatheEasySim.Components;

/**
 *
 * @author kyleh
 */
public class MainGaugePanel extends javax.swing.JPanel {

    /**
     * Creates new form MainGaugePanel
     */
    public MainGaugePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gauge1 = new BreatheEasySim.Components.Gauge();
        gauge2 = new BreatheEasySim.Components.Gauge();
        gauge3 = new BreatheEasySim.Components.Gauge();
        gauge4 = new BreatheEasySim.Components.Gauge();
        gauge5 = new BreatheEasySim.Components.Gauge();
        gauge6 = new BreatheEasySim.Components.Gauge();
        gauge7 = new BreatheEasySim.Components.Gauge();

        setMinimumSize(new java.awt.Dimension(1600, 141));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1600, 141));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gauge1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gauge1MouseClicked(evt);
            }
        });
        add(gauge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 0, 180, 141));

        gauge2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gauge2MouseClicked(evt);
            }
        });
        add(gauge2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 180, 141));

        gauge3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gauge3MouseClicked(evt);
            }
        });
        add(gauge3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 180, 141));

        gauge4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gauge4MouseClicked(evt);
            }
        });
        add(gauge4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 180, 141));

        gauge5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gauge5MouseClicked(evt);
            }
        });
        add(gauge5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 180, 141));

        gauge6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gauge6MouseClicked(evt);
            }
        });
        add(gauge6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1840, 0, 180, 141));

        gauge7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gauge7MouseClicked(evt);
            }
        });
        add(gauge7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1690, 0, 180, 141));
    }// </editor-fold>//GEN-END:initComponents

    private BreatheEasySim.Components.Gauge selectedGauge;
    
    private void anyGaugeMouseClicked(java.awt.event.MouseEvent evt) {
        // Get the source of the click event (the gauge that was clicked)
        Object source = evt.getSource();

        // Check if the source is a BreatheEasySim.Components.Gauge object
        if (source instanceof BreatheEasySim.Components.Gauge) {
          selectedGauge = (BreatheEasySim.Components.Gauge) source;
        }
    }
    
    
    private void gauge2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gauge2MouseClicked
        anyGaugeMouseClicked(evt);
        System.out.println(selectedGauge);
    }//GEN-LAST:event_gauge2MouseClicked

    private void gauge1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gauge1MouseClicked
        anyGaugeMouseClicked(evt);
        System.out.println(selectedGauge);
    }//GEN-LAST:event_gauge1MouseClicked

    private void gauge3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gauge3MouseClicked
        anyGaugeMouseClicked(evt);
        System.out.println(selectedGauge);
    }//GEN-LAST:event_gauge3MouseClicked

    private void gauge4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gauge4MouseClicked
        anyGaugeMouseClicked(evt);
        System.out.println(selectedGauge);
    }//GEN-LAST:event_gauge4MouseClicked

    private void gauge5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gauge5MouseClicked
        anyGaugeMouseClicked(evt);
        System.out.println(selectedGauge);
    }//GEN-LAST:event_gauge5MouseClicked

    private void gauge6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gauge6MouseClicked
        anyGaugeMouseClicked(evt);
        System.out.println(selectedGauge);
    }//GEN-LAST:event_gauge6MouseClicked

    private void gauge7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gauge7MouseClicked
        anyGaugeMouseClicked(evt);
        System.out.println(selectedGauge);
    }//GEN-LAST:event_gauge7MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private BreatheEasySim.Components.Gauge gauge1;
    private BreatheEasySim.Components.Gauge gauge2;
    private BreatheEasySim.Components.Gauge gauge3;
    private BreatheEasySim.Components.Gauge gauge4;
    private BreatheEasySim.Components.Gauge gauge5;
    private BreatheEasySim.Components.Gauge gauge6;
    private BreatheEasySim.Components.Gauge gauge7;
    // End of variables declaration//GEN-END:variables
}