/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package BreatheEasySim.Screens;

/**
 *
 * @author Perky
 */
public class Utilities extends javax.swing.JPanel {

    /**
     * Creates new form Utilities
     */
    public Utilities() {
        initComponents();
        
        
        ilvModeOnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            int ilvModeButton = 0;
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (ilvModeButton == 0) {
                    System.out.println("ILV Mode Off!");
                    ilvModeOnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button OnClick.png")));
                    ilvModeOnButton.repaint();
                    onLabel.setText("Off");
                    ilvModeButton = 1;
                }
                else {
                    System.out.println("ILV Mode On!");
                    ilvModeOnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png")));
                    ilvModeOnButton.repaint();
                    onLabel.setText("On");
                    ilvModeButton = 0;
                }
            }
        });
        
        o2AlarmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            int o2Button = 0;
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (o2Button == 0) {
                    System.out.println("O2 Alarm Disabled!");
                    o2AlarmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button OnClick.png")));
                    o2AlarmButton.repaint();
                    enabledLabel.setText("Disabled");
                    o2Button = 1;
                }
                else {
                    System.out.println("O2 Alarm Enabled!");
                    o2AlarmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png")));
                    o2AlarmButton.repaint();
                    enabledLabel.setText("Enabled");
                    o2Button = 0;
                }
            }
        });
        
        BigButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                    System.out.println("BigButton Clicked!");
            }
        });
        
        analogInputButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                    System.out.println("analogInputButton1 Clicked!");
            }
        });
        
        analogInputButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                    System.out.println("analogInputButton2 Clicked!");
            }
        });
         analogOutputButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                    System.out.println("analogOutputButton Clicked!");
            }
        });
         
        flowControlButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                    System.out.println("flowControlButton Clicked!");
            }
        });
        decreaseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                    System.out.println("decreaseButton Clicked!");
            }
        });
        
        hotWireFlowButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                    System.out.println("hotWireFlowButton Clicked!");
            }
        });
        
        increaseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                    System.out.println("increaseButton Clicked!");
            }
        });
        
        ilvModeMasterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                    System.out.println("ilvModeMasterButton Clicked!");
            }
        });
        
        ilvModeSlaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                    System.out.println("ilvModeSlaveButton Clicked!");
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        alarmLoudnessLabel = new javax.swing.JLabel();
        ilvModeLabel = new javax.swing.JLabel();
        languageLabel = new javax.swing.JLabel();
        lowVTELabel = new javax.swing.JLabel();
        flowCorrectionLabel = new javax.swing.JLabel();
        o2AlarmLabel = new javax.swing.JLabel();
        increaseFiO2Label = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        increaseButton = new BreatheEasySim.Components.GenericImageLabel();
        increaseLabel = new javax.swing.JLabel();
        decreaseButton = new BreatheEasySim.Components.GenericImageLabel();
        decreaseLabel = new javax.swing.JLabel();
        flowControlButton = new BreatheEasySim.Components.GenericImageLabel();
        btpsLabel = new javax.swing.JLabel();
        o2AlarmButton = new BreatheEasySim.Components.GenericImageLabel();
        enabledLabel = new javax.swing.JLabel();
        ilvModeSlaveButton = new BreatheEasySim.Components.GenericImageLabel();
        slaveLabel = new javax.swing.JLabel();
        ilvModeMasterButton = new BreatheEasySim.Components.GenericImageLabel();
        masterLabel = new javax.swing.JLabel();
        ilvModeOnButton = new BreatheEasySim.Components.GenericImageLabel();
        onLabel = new javax.swing.JLabel();
        BigButton = new BreatheEasySim.Components.GenericImageLabel();
        bigButtonUnitsLabel = new javax.swing.JLabel();
        bigNumberLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        analogInputLabel = new javax.swing.JLabel();
        rsOutputLabel = new javax.swing.JLabel();
        analogOutputLabel = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        analogInputButton1 = new BreatheEasySim.Components.GenericImageLabel();
        analogInputLabel1 = new javax.swing.JLabel();
        analogInputButton2 = new BreatheEasySim.Components.GenericImageLabel();
        analogInputLabel2 = new javax.swing.JLabel();
        analogOutputButton = new BreatheEasySim.Components.GenericImageLabel();
        analogOutputButtonLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        hotWireFlowButton = new BreatheEasySim.Components.GenericImageLabel();
        hotWireLabel = new javax.swing.JLabel();
        hotWireFlowControlLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(162, 164, 191));
        setOpaque(false);

        jTabbedPane1.setBackground(new java.awt.Color(169, 170, 204));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(169, 170, 204));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        alarmLoudnessLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        alarmLoudnessLabel.setForeground(new java.awt.Color(255, 255, 255));
        alarmLoudnessLabel.setText("Alarm Loudness:");

        ilvModeLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ilvModeLabel.setForeground(new java.awt.Color(255, 255, 255));
        ilvModeLabel.setText("ILV Mode:");

        languageLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        languageLabel.setForeground(new java.awt.Color(255, 255, 255));
        languageLabel.setText("Language:");

        lowVTELabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lowVTELabel.setForeground(new java.awt.Color(255, 255, 255));
        lowVTELabel.setText("Low Vte Alarm:");

        flowCorrectionLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        flowCorrectionLabel.setForeground(new java.awt.Color(255, 255, 255));
        flowCorrectionLabel.setText("Flow Correction:");

        o2AlarmLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        o2AlarmLabel.setForeground(new java.awt.Color(255, 255, 255));
        o2AlarmLabel.setText("O2 Alarm:");

        increaseFiO2Label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        increaseFiO2Label.setForeground(new java.awt.Color(255, 255, 255));
        increaseFiO2Label.setText("Increase FiO2:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        increaseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png"))); // NOI18N

        increaseLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        increaseLabel.setForeground(new java.awt.Color(255, 255, 255));
        increaseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        increaseLabel.setText("Increase");
        increaseLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        increaseButton.add(increaseLabel);
        increaseLabel.setBounds(0, 0, 100, 60);

        decreaseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png"))); // NOI18N

        decreaseLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        decreaseLabel.setForeground(new java.awt.Color(255, 255, 255));
        decreaseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        decreaseLabel.setText("Decrease");
        decreaseLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        decreaseButton.add(decreaseLabel);
        decreaseLabel.setBounds(0, 0, 100, 60);

        flowControlButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png"))); // NOI18N

        btpsLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btpsLabel.setForeground(new java.awt.Color(255, 255, 255));
        btpsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btpsLabel.setText("BTPS");
        btpsLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        flowControlButton.add(btpsLabel);
        btpsLabel.setBounds(0, 0, 100, 60);

        o2AlarmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png"))); // NOI18N

        enabledLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        enabledLabel.setForeground(new java.awt.Color(255, 255, 255));
        enabledLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enabledLabel.setText("Enabled");
        enabledLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        o2AlarmButton.add(enabledLabel);
        enabledLabel.setBounds(0, 0, 100, 60);

        ilvModeSlaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png"))); // NOI18N

        slaveLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        slaveLabel.setForeground(new java.awt.Color(255, 255, 255));
        slaveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slaveLabel.setText("Slave");
        slaveLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ilvModeSlaveButton.add(slaveLabel);
        slaveLabel.setBounds(0, 0, 100, 60);

        ilvModeMasterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png"))); // NOI18N

        masterLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        masterLabel.setForeground(new java.awt.Color(255, 255, 255));
        masterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        masterLabel.setText("Master");
        masterLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ilvModeMasterButton.add(masterLabel);
        masterLabel.setBounds(0, 0, 100, 60);

        ilvModeOnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png"))); // NOI18N

        onLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        onLabel.setForeground(new java.awt.Color(255, 255, 255));
        onLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        onLabel.setText("On");
        onLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ilvModeOnButton.add(onLabel);
        onLabel.setBounds(0, 0, 100, 60);

        BigButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Big Button.png"))); // NOI18N

        bigButtonUnitsLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bigButtonUnitsLabel.setForeground(new java.awt.Color(255, 255, 255));
        bigButtonUnitsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bigButtonUnitsLabel.setText("<html><body style='text-align: center'>mmHg<br>Pbare</html>");
        bigButtonUnitsLabel.setAutoscrolls(true);
        bigButtonUnitsLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BigButton.add(bigButtonUnitsLabel);
        bigButtonUnitsLabel.setBounds(0, 60, 140, 30);

        bigNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        bigNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        bigNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bigNumberLabel.setText("745");
        bigNumberLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BigButton.add(bigNumberLabel);
        bigNumberLabel.setBounds(0, 0, 140, 50);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lowVTELabel)
                        .addGap(92, 92, 92)
                        .addComponent(increaseFiO2Label)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(ilvModeOnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ilvModeMasterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ilvModeSlaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(increaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(decreaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(o2AlarmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(flowControlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36))
                                    .addComponent(BigButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ilvModeLabel)
                                    .addComponent(alarmLoudnessLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(languageLabel)
                                        .addGap(182, 182, 182))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(o2AlarmLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(flowCorrectionLabel)))))
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alarmLoudnessLabel)
                    .addComponent(flowCorrectionLabel)
                    .addComponent(o2AlarmLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(decreaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flowControlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(increaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o2AlarmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ilvModeLabel)
                    .addComponent(languageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ilvModeMasterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ilvModeSlaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ilvModeOnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowVTELabel)
                    .addComponent(increaseFiO2Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(BigButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Configuration", jPanel1);

        jPanel2.setBackground(new java.awt.Color(169, 170, 204));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        analogInputLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        analogInputLabel.setForeground(new java.awt.Color(255, 255, 255));
        analogInputLabel.setText("Analog Input Scale:");

        rsOutputLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rsOutputLabel.setForeground(new java.awt.Color(255, 255, 255));
        rsOutputLabel.setText("RS-232 Output:");

        analogOutputLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        analogOutputLabel.setForeground(new java.awt.Color(255, 255, 255));
        analogOutputLabel.setText("Analog Output Type:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Off" }));
        jComboBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        analogInputButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png"))); // NOI18N

        analogInputLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        analogInputLabel1.setForeground(new java.awt.Color(255, 255, 255));
        analogInputLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        analogInputLabel1.setText("<html><body style='text-align: center'>0 - 1<br>vdc</html>");
        analogInputLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        analogInputButton1.add(analogInputLabel1);
        analogInputLabel1.setBounds(0, 0, 100, 60);

        analogInputButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png"))); // NOI18N

        analogInputLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        analogInputLabel2.setForeground(new java.awt.Color(255, 255, 255));
        analogInputLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        analogInputLabel2.setText("<html><body style='text-align: center'>0 - 5<br>vdc</html>");
        analogInputLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        analogInputButton2.add(analogInputLabel2);
        analogInputLabel2.setBounds(0, 0, 100, 60);

        analogOutputButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png"))); // NOI18N

        analogOutputButtonLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        analogOutputButtonLabel.setForeground(new java.awt.Color(255, 255, 255));
        analogOutputButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        analogOutputButtonLabel.setText("<html><body style='text-align: center'>Wye<br>Flow</html>");
        analogOutputButtonLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        analogOutputButton.add(analogOutputButtonLabel);
        analogOutputButtonLabel.setBounds(0, 0, 100, 60);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(analogInputButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(analogInputButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(analogOutputButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(analogInputLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rsOutputLabel)
                                .addGap(182, 182, 182))
                            .addComponent(analogOutputLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(analogInputLabel)
                    .addComponent(analogOutputLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(analogInputButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(analogOutputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(analogInputButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(rsOutputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Input/Output", jPanel2);

        jPanel3.setBackground(new java.awt.Color(169, 170, 204));
        jPanel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        dateLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setText("Date:");

        timeLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setText("Time:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateLabel)
                .addGap(305, 305, 305)
                .addComponent(timeLabel)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(timeLabel))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Date/Time", jPanel3);

        jPanel4.setBackground(new java.awt.Color(169, 170, 204));
        jPanel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        hotWireFlowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BreatheEasySim/Images/Button.png"))); // NOI18N

        hotWireLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hotWireLabel.setForeground(new java.awt.Color(255, 255, 255));
        hotWireLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hotWireLabel.setText("<html><body style='text-align: center'>Zero<br>Sensor</html>");
        hotWireLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        hotWireFlowButton.add(hotWireLabel);
        hotWireLabel.setBounds(-3, 0, 110, 60);

        hotWireFlowControlLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        hotWireFlowControlLabel.setForeground(new java.awt.Color(255, 255, 255));
        hotWireFlowControlLabel.setText("HOT WIRE FLOW SENSOR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(hotWireFlowControlLabel)
                        .addGap(241, 241, 241))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(hotWireFlowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(hotWireFlowControlLabel)
                .addGap(28, 28, 28)
                .addComponent(hotWireFlowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Monitoring", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Configuration");
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private BreatheEasySim.Components.GenericImageLabel BigButton;
    private javax.swing.JLabel alarmLoudnessLabel;
    private BreatheEasySim.Components.GenericImageLabel analogInputButton1;
    private BreatheEasySim.Components.GenericImageLabel analogInputButton2;
    private javax.swing.JLabel analogInputLabel;
    private javax.swing.JLabel analogInputLabel1;
    private javax.swing.JLabel analogInputLabel2;
    private BreatheEasySim.Components.GenericImageLabel analogOutputButton;
    private javax.swing.JLabel analogOutputButtonLabel;
    private javax.swing.JLabel analogOutputLabel;
    private javax.swing.JLabel bigButtonUnitsLabel;
    private javax.swing.JLabel bigNumberLabel;
    private javax.swing.JLabel btpsLabel;
    private javax.swing.JLabel dateLabel;
    private BreatheEasySim.Components.GenericImageLabel decreaseButton;
    private javax.swing.JLabel decreaseLabel;
    private javax.swing.JLabel enabledLabel;
    private BreatheEasySim.Components.GenericImageLabel flowControlButton;
    private javax.swing.JLabel flowCorrectionLabel;
    private BreatheEasySim.Components.GenericImageLabel hotWireFlowButton;
    private javax.swing.JLabel hotWireFlowControlLabel;
    private javax.swing.JLabel hotWireLabel;
    private javax.swing.JLabel ilvModeLabel;
    private BreatheEasySim.Components.GenericImageLabel ilvModeMasterButton;
    private BreatheEasySim.Components.GenericImageLabel ilvModeOnButton;
    private BreatheEasySim.Components.GenericImageLabel ilvModeSlaveButton;
    private BreatheEasySim.Components.GenericImageLabel increaseButton;
    private javax.swing.JLabel increaseFiO2Label;
    private javax.swing.JLabel increaseLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel languageLabel;
    private javax.swing.JLabel lowVTELabel;
    private javax.swing.JLabel masterLabel;
    private BreatheEasySim.Components.GenericImageLabel o2AlarmButton;
    private javax.swing.JLabel o2AlarmLabel;
    private javax.swing.JLabel onLabel;
    private javax.swing.JLabel rsOutputLabel;
    private javax.swing.JLabel slaveLabel;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
