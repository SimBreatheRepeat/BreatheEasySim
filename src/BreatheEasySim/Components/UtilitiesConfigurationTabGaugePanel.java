/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package BreatheEasySim.Components;

/**
 *
 * @author kyleh
 */
public class UtilitiesConfigurationTabGaugePanel extends javax.swing.JPanel {

    /**
     * Creates new form MainGaugePanel
     */
    public UtilitiesConfigurationTabGaugePanel() {
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

        gauge2 = new BreatheEasySim.Components.Gauge();
        gauge4 = new BreatheEasySim.Components.Gauge();

        setMinimumSize(new java.awt.Dimension(476, 133));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1600, 141));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(gauge2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 180, 141));
        gauge2.jLabel4.setText("Sesitivity");

        gauge4.setName(""); // NOI18N
        add(gauge4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 180, 141));
        gauge4.jLabel4.setText("<html><body style='text-align: center'>%<br>Increment</html>");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private BreatheEasySim.Components.Gauge gauge2;
    private BreatheEasySim.Components.Gauge gauge4;
    // End of variables declaration//GEN-END:variables
}
