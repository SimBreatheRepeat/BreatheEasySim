/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BreatheEasySim;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Kyle
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    
    public MainMenu() {
        /*GraphicsEnvironment graphics =
        GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = graphics.getDefaultScreenDevice();
        device.setFullScreenWindow(this);*/
        
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(new Color(40,40,178));
        
        startup1.patientAccept.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.out.println("resumeCurrent clicked!");
                
                if(startup1.resume == 1 || startup1.patient == 1){
                    if(startup1.patientAccept.getParent().isVisible()){
                        startup1.patientAccept.getParent().setVisible(false);
                    } else{
                        startup1.patientAccept.getParent().setVisible(true);
                    }
                    mainScreenPanel3.main1.setVisible(true);
                    mainSidePanel1.setVisible(true);
                    mainBottomPanel1.setVisible(true);
                    mainGaugePanel1.setEnabled(true);
                    mainScreenPanel3.main1.chartP1.startTimer();
                    mainScreenPanel3.main1.chartP2.startTimer();
                    mainScreenPanel3.main1.chartP3.startTimer();
                }
            }
        });
        
        mainLabel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent m){
                if(!startup1.patientAccept.getParent().isVisible())
                {
                    if(screenSelect1.isVisible()){
                        screenSelect1.setVisible(false);
                        mainScreenPanel3.main1.chartP1.timer.start();
                        mainScreenPanel3.main1.chartP2.timer.start();
                    }
                    else{
                        screenSelect1.setVisible(true);
                        mainScreenPanel3.main1.chartP1.timer.stop();
                        mainScreenPanel3.main1.chartP2.timer.stop();
                    } 
                    System.out.println("Main Label Clicked!");
                }
            }
        });
        screenSelect1.utilities.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.out.println("Utilities Button Pressed!");
                screenSelect1.utilities.getParent().setVisible(false);
                mainScreenPanel3.utilities.setVisible(true);
                mainSidePanel1.utilitiesSide1.setVisible(true);
                mainScreenPanel3.main1.setVisible(false);
                mainSidePanel1.mainSide1.setVisible(false);
                mainLabel.setText("UTILITY");
                mainScreenPanel3.main1.chartP1.timer.start();
                mainScreenPanel3.main1.chartP2.timer.start();
                
            }
        });
        screenSelect1.main.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.out.println("Main Button Pressed!");
                screenSelect1.main.getParent().setVisible(false);
                mainScreenPanel3.main1.setVisible(true);
                mainSidePanel1.mainSide1.setVisible(true);
                mainScreenPanel3.utilities.setVisible(false);
                mainSidePanel1.utilitiesSide1.setVisible(false);
                mainLabel.setText("MAIN");  
                mainScreenPanel3.main1.chartP1.timer.start();
                mainScreenPanel3.main1.chartP2.timer.start();
            }
        });
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        startup1 = new BreatheEasySim.Popups.Startup();
        screenSelect1 = new BreatheEasySim.Popups.ScreenSelect();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mainSidePanel1 = new BreatheEasySim.Components.MainSidePanel();
        mainBottomPanel1 = new BreatheEasySim.Components.MainBottomPanel();
        mainScreenPanel3 = new BreatheEasySim.Components.MainScreenPanel();
        mainGaugePanel1 = new BreatheEasySim.Components.MainGaugePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(45, 50, 79));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainLabel.setBackground(new java.awt.Color(0, 0, 0));
        mainLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(255, 255, 255));
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("MAIN");
        mainLabel.setOpaque(true);
        getContentPane().add(mainLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 110, 44));

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" VOLUME A/C");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 44));
        getContentPane().add(startup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 220, 380, 280));
        getContentPane().add(screenSelect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 390, 300));
        screenSelect1.setVisible(false);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CIRCUIT DISCONECT");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 44));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 790, -1));
        getContentPane().add(mainSidePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));
        mainSidePanel1.setVisible(false);

        getContentPane().add(mainBottomPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 840, 480, 59));
        mainBottomPanel1.setVisible(false);

        mainScreenPanel3.setBackground(new java.awt.Color(40, 40, 178));
        getContentPane().add(mainScreenPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 1410, 663));
        mainScreenPanel3.main1.setVisible(false);

        getContentPane().add(mainGaugePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 710, -1, 130));
        mainGaugePanel1.setEnabled(false);

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.printf("%f, %f", screenSize.getWidth(), screenSize.getHeight());
        System.out.println(System.getProperty("user.dir"));
        
        ProcessBuilder processBuilder = new ProcessBuilder("python", "middleware.py");
        Process proc = processBuilder.start();

        BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));

        // Read the output from the command
        String s = null;
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
            
            if(s.equals("Home")) {
                System.out.println("Executing Home");
                screenSelect1.main.getParent().setVisible(false);
                mainScreenPanel3.main1.setVisible(true);
                mainSidePanel1.mainSide1.setVisible(true);
                mainScreenPanel3.utilities.setVisible(false);
                mainSidePanel1.utilitiesSide1.setVisible(false);
                mainLabel.setText("MAIN");
            }
            if(s.equals("Screens")) {
                System.out.println("Executing Screens");
                if(screenSelect1.isVisible()){
                    screenSelect1.setVisible(false);
                }
                else{
                    screenSelect1.setVisible(true);
                } 
            }
            if(s.equals("Mode")) {
                System.out.println("Executing Mode");
            }
            if(s.equals("Alarm On/Off")) {
                System.out.println("Executing Alarm On/Off");
            }
            if(s.equals("Freeze")) {
                System.out.println("Executing Freeze");
            }
            if(s.equals("Pump On/Off")) {
                System.out.println("Executing Pump On/Off");
            }
            if(s.equals("Accept")) {
                System.out.println("Executing Accept");
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public BreatheEasySim.Components.MainBottomPanel mainBottomPanel1;
    private BreatheEasySim.Components.MainGaugePanel mainGaugePanel1;
    private static javax.swing.JLabel mainLabel;
    public static BreatheEasySim.Components.MainScreenPanel mainScreenPanel3;
    public static BreatheEasySim.Components.MainSidePanel mainSidePanel1;
    private static BreatheEasySim.Popups.ScreenSelect screenSelect1;
    private BreatheEasySim.Popups.Startup startup1;
    // End of variables declaration//GEN-END:variables
}
