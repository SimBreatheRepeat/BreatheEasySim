/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package BreatheEasySim.Popups;


/**
 *
 * @author paigeharris
 */
public class ScreenSelect extends javax.swing.JPanel {

    public ScreenSelect() {
        initComponents();
        /*utilities.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.out.println("Utilities Button Pressed!");
                utilities.getParent().setVisible(false);
                
            }
        });*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        standby = new BreatheEasySim.Components.GenericImageLabel();
        jLabel2 = new javax.swing.JLabel();
        utilities = new BreatheEasySim.Components.GenericImageLabel();
        jLabel3 = new javax.swing.JLabel();
        main = new BreatheEasySim.Components.GenericImageLabel();
        jLabel4 = new javax.swing.JLabel();
        loop = new BreatheEasySim.Components.GenericImageLabel();
        jLabel5 = new javax.swing.JLabel();
        monitor = new BreatheEasySim.Components.GenericImageLabel();
        jLabel6 = new javax.swing.JLabel();
        trends = new BreatheEasySim.Components.GenericImageLabel();
        jLabel7 = new javax.swing.JLabel();
        maneuver = new BreatheEasySim.Components.GenericImageLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(169, 170, 204));
        setForeground(new java.awt.Color(162, 164, 191));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SCREEN SELECT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        standby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("STANDBY");
        standby.add(jLabel2);
        jLabel2.setBounds(5, -2, 100, 70);

        add(standby, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 135, 109, 67));

        utilities.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("UTILITY");
        utilities.add(jLabel3);
        jLabel3.setBounds(5, -2, 100, 70);

        add(utilities, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 109, 67));

        main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MAIN");
        main.add(jLabel4);
        jLabel4.setBounds(5, -2, 100, 70);

        add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 109, 67));

        loop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LOOP");
        loop.add(jLabel5);
        jLabel5.setBounds(5, -2, 100, 70);

        add(loop, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 109, 67));

        monitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MONITOR");
        monitor.add(jLabel6);
        jLabel6.setBounds(5, -2, 100, 70);

        add(monitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 109, 67));

        trends.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TRENDS");
        trends.add(jLabel7);
        jLabel7.setBounds(5, -2, 100, 70);

        add(trends, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, 109, 67));

        maneuver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MANEUVER");
        maneuver.add(jLabel9);
        jLabel9.setBounds(5, -2, 100, 70);

        add(maneuver, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 135, 109, 67));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private BreatheEasySim.Components.GenericImageLabel loop;
    public BreatheEasySim.Components.GenericImageLabel main;
    private BreatheEasySim.Components.GenericImageLabel maneuver;
    private BreatheEasySim.Components.GenericImageLabel monitor;
    private BreatheEasySim.Components.GenericImageLabel standby;
    private BreatheEasySim.Components.GenericImageLabel trends;
    public BreatheEasySim.Components.GenericImageLabel utilities;
    // End of variables declaration//GEN-END:variables
}
