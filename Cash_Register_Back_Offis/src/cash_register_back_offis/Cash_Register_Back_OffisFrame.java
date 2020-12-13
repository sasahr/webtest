
package cash_register_back_offis;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Action;


public class Cash_Register_Back_OffisFrame extends javax.swing.JFrame {

     String naziv;
     double cena;
     int kolicina;
     int sifra;
    
  
    public Cash_Register_Back_OffisFrame() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton32 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jTextFieldLAGER = new javax.swing.JTextField();
        jButtontab = new javax.swing.JButton();
        JTNaziv = new javax.swing.JTextField();
        jLabelNaziv = new javax.swing.JLabel();
        jTCena = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelsifra = new javax.swing.JLabel();
        jTSifra = new javax.swing.JTextField();
        jButtonA = new javax.swing.JButton();
        jButtonB = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonD = new javax.swing.JButton();
        jButtonE = new javax.swing.JButton();
        jButtonF = new javax.swing.JButton();
        jButtonG = new javax.swing.JButton();
        jButtonH = new javax.swing.JButton();
        jButtonI = new javax.swing.JButton();
        jButtonJ = new javax.swing.JButton();
        jButtonK = new javax.swing.JButton();
        jButtonL = new javax.swing.JButton();
        jButtonM = new javax.swing.JButton();
        jButtonN = new javax.swing.JButton();
        jButtonO = new javax.swing.JButton();
        jButtonP = new javax.swing.JButton();
        jButtonQ = new javax.swing.JButton();
        jButtonR = new javax.swing.JButton();
        jButtonS = new javax.swing.JButton();
        jButtonT = new javax.swing.JButton();
        jButtonU = new javax.swing.JButton();
        jButtonV = new javax.swing.JButton();
        jButtonW = new javax.swing.JButton();
        jButtonX = new javax.swing.JButton();
        jButtonY = new javax.swing.JButton();
        jButtonZ = new javax.swing.JButton();
        jButtonZAREZ = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonOBRISIUNOS = new javax.swing.JButton();
        jButtonOCICTI = new javax.swing.JButton();
        jButtonUNESI = new javax.swing.JButton();
        jLabelIzbrisi = new javax.swing.JLabel();
        jTIzbrisi = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonLAGER = new javax.swing.JButton();
        jButtonPREGLEDRACUNA = new javax.swing.JButton();
        jLabelKOMADA = new javax.swing.JLabel();
        jTextFieldKolicina = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaLAGER = new javax.swing.JTextArea();
        jButtonspace = new javax.swing.JButton();

        jButton32.setText("jButton32");

        jButton31.setText("jButton31");

        jButton30.setText("jButton30");

        jButton28.setText("jButton28");

        jButtontab.setText("tab");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cash_Register_Back_Offis");

        JTNaziv.setName("sasa"); // NOI18N

        jLabelNaziv.setText("NAZIV");

        jLabel1.setText("CENA");

        jLabelsifra.setText("SIFRA");

        jButtonA.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonA.setText("A");
        jButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAActionPerformed(evt);
            }
        });

        jButtonB.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonB.setText("B");
        jButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBActionPerformed(evt);
            }
        });

        jButtonC.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonC.setText("C");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButtonD.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonD.setText("D");
        jButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDActionPerformed(evt);
            }
        });

        jButtonE.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonE.setText("E");
        jButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEActionPerformed(evt);
            }
        });

        jButtonF.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonF.setText("F");
        jButtonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFActionPerformed(evt);
            }
        });

        jButtonG.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonG.setText("G");
        jButtonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGActionPerformed(evt);
            }
        });

        jButtonH.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonH.setText("H");
        jButtonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHActionPerformed(evt);
            }
        });

        jButtonI.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonI.setText("I");
        jButtonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIActionPerformed(evt);
            }
        });

        jButtonJ.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonJ.setText("J");
        jButtonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJActionPerformed(evt);
            }
        });

        jButtonK.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonK.setText("K");
        jButtonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKActionPerformed(evt);
            }
        });

        jButtonL.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonL.setText("L");
        jButtonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLActionPerformed(evt);
            }
        });

        jButtonM.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonM.setText("M");
        jButtonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMActionPerformed(evt);
            }
        });

        jButtonN.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonN.setText("N");
        jButtonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNActionPerformed(evt);
            }
        });

        jButtonO.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonO.setText("O");
        jButtonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOActionPerformed(evt);
            }
        });

        jButtonP.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonP.setText("P");
        jButtonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPActionPerformed(evt);
            }
        });

        jButtonQ.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonQ.setText("Q");
        jButtonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQActionPerformed(evt);
            }
        });

        jButtonR.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonR.setText("R");
        jButtonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRActionPerformed(evt);
            }
        });

        jButtonS.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonS.setText("S");
        jButtonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSActionPerformed(evt);
            }
        });

        jButtonT.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonT.setText("T");
        jButtonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTActionPerformed(evt);
            }
        });

        jButtonU.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonU.setText("U");
        jButtonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUActionPerformed(evt);
            }
        });

        jButtonV.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonV.setText("V");
        jButtonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVActionPerformed(evt);
            }
        });

        jButtonW.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonW.setText("W");
        jButtonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWActionPerformed(evt);
            }
        });

        jButtonX.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonX.setText("X");
        jButtonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXActionPerformed(evt);
            }
        });

        jButtonY.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonY.setText("Y");
        jButtonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYActionPerformed(evt);
            }
        });

        jButtonZ.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonZ.setText("Z");
        jButtonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZActionPerformed(evt);
            }
        });

        jButtonZAREZ.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jButtonZAREZ.setText(",");
        jButtonZAREZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZAREZActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonOBRISIUNOS.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonOBRISIUNOS.setText("OBRISI \n UNOS"); // NOI18N
        jButtonOBRISIUNOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOBRISIUNOSActionPerformed(evt);
            }
        });

        jButtonOCICTI.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonOCICTI.setText("C");
        jButtonOCICTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOCICTIActionPerformed(evt);
            }
        });

        jButtonUNESI.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonUNESI.setText("UNESI");
        jButtonUNESI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUNESIActionPerformed(evt);
            }
        });

        jLabelIzbrisi.setText("OBRISI UNOS     UKUCAJ SIFRU");

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton0.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonLAGER.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonLAGER.setText("LAGER");
        jButtonLAGER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLAGERActionPerformed(evt);
            }
        });

        jButtonPREGLEDRACUNA.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonPREGLEDRACUNA.setText("PREGLED RACUNA");
        jButtonPREGLEDRACUNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPREGLEDRACUNAActionPerformed(evt);
            }
        });

        jLabelKOMADA.setText("KOMADA");

        jTextAreaLAGER.setColumns(20);
        jTextAreaLAGER.setRows(5);
        jScrollPane1.setViewportView(jTextAreaLAGER);

        jButtonspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonspaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTCena, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelsifra, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTSifra, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabelKOMADA, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jLabelIzbrisi))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTIzbrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonU, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addComponent(jButtonF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButtonB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonQ, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                                        .addComponent(jButtonW, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButtonM, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                                .addComponent(jButtonH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(23, 23, 23)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButtonR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButtonV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButtonD, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButtonN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                            .addComponent(jButtonI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jButtonX, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jButtonspace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonZAREZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonO, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addComponent(jButtonE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                .addComponent(jButton0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonOBRISIUNOS, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                .addComponent(jButtonOCICTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonUNESI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonLAGER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonPREGLEDRACUNA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelNaziv)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelsifra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelKOMADA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTCena, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTSifra, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTIzbrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabelIzbrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonE, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButtonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonPREGLEDRACUNA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonOBRISIUNOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonUNESI, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(jButtonT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButtonP, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonR, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonS, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonU, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonW, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButtonY, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButtonV, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButtonX, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButtonOCICTI, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonZAREZ, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                    .addComponent(jButtonZ, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                    .addComponent(jButtonspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonB, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonA, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonG, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonH, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonI, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(345, 345, 345))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonF, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonK, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonL, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonM, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonN, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonO, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButtonLAGER, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 306, Short.MAX_VALUE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMActionPerformed
       String s  = JTNaziv.getText();
                JTNaziv.setText(s+"M");   
       
       
    }//GEN-LAST:event_jButtonMActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jButton1.setAction( new KeyboardAction("1"));
     //  jButton1.setAction( new KeyboardAction(""));
      //  String s  = jTCena.getText();
              //  jTCena.setText(s+"1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setAction( new KeyboardAction("2"));
       // String s  = jTCena.getText();
               // jTCena.setText(s+"2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         jButton3.setAction( new KeyboardAction("3"));
       // String s  = jTCena.getText();
               // jTCena.setText(s+"3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         jButton4.setAction( new KeyboardAction("4"));
        //String s  = jTCena.getText();
                //jTCena.setText(s+"4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setAction( new KeyboardAction("5"));
        //String s  = jTCena.getText();
               // jTCena.setText(s+"5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setAction( new KeyboardAction("6"));
        //String s  = jTCena.getText();
                //jTCena.setText(s+"6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setAction( new KeyboardAction("7"));
        //String s  = jTCena.getText();
              //  jTCena.setText(s+"7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         jButton8.setAction( new KeyboardAction("8"));
       // String s  = jTCena.getText();
                //jTCena.setText(s+"8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setAction( new KeyboardAction("9"));
       // String s  = jTCena.getText();
               // jTCena.setText(s+"9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
      jButton0.setAction( new KeyboardAction("0"));
       // String s  = jTCena.getText();
                //jTCena.setText(s+"0");
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAActionPerformed
         String s  = JTNaziv.getText();
                JTNaziv.setText(s+"A");
    }//GEN-LAST:event_jButtonAActionPerformed

    private void jButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBActionPerformed
        String s  = JTNaziv.getText();
                JTNaziv.setText(s+"B");
    }//GEN-LAST:event_jButtonBActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
       String s  = JTNaziv.getText();
                JTNaziv.setText(s+"C");
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDActionPerformed
       String s  = JTNaziv.getText();
                JTNaziv.setText(s+"D");
    }//GEN-LAST:event_jButtonDActionPerformed

    private void jButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEActionPerformed
        String s  = JTNaziv.getText();
                JTNaziv.setText(s+"E");
    }//GEN-LAST:event_jButtonEActionPerformed

    private void jButtonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFActionPerformed
        String s  = JTNaziv.getText();
                JTNaziv.setText(s+"F");
    }//GEN-LAST:event_jButtonFActionPerformed

    private void jButtonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGActionPerformed
       String s  = JTNaziv.getText();
                JTNaziv.setText(s+"G");
    }//GEN-LAST:event_jButtonGActionPerformed

    private void jButtonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHActionPerformed
       String s  = JTNaziv.getText();
                JTNaziv.setText(s+"H");
    }//GEN-LAST:event_jButtonHActionPerformed

    private void jButtonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIActionPerformed
        String s  = JTNaziv.getText();
                JTNaziv.setText(s+"I");
    }//GEN-LAST:event_jButtonIActionPerformed

    private void jButtonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJActionPerformed
       String s  = JTNaziv.getText();
                JTNaziv.setText(s+"J");
    }//GEN-LAST:event_jButtonJActionPerformed

    private void jButtonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKActionPerformed
        String s  = JTNaziv.getText();
                JTNaziv.setText(s+"K");
    }//GEN-LAST:event_jButtonKActionPerformed

    private void jButtonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLActionPerformed
       String s  = JTNaziv.getText();
                JTNaziv.setText(s+"L");
    }//GEN-LAST:event_jButtonLActionPerformed

    private void jButtonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNActionPerformed
       String s  = JTNaziv.getText();
                JTNaziv.setText(s+"N");
    }//GEN-LAST:event_jButtonNActionPerformed

    private void jButtonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOActionPerformed
       String s  = JTNaziv.getText();
                JTNaziv.setText(s+"O");
    }//GEN-LAST:event_jButtonOActionPerformed

    private void jButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPActionPerformed
       String s  = JTNaziv.getText();
                JTNaziv.setText(s+"P");
    }//GEN-LAST:event_jButtonPActionPerformed

    private void jButtonQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQActionPerformed
       String s  = JTNaziv.getText();
                JTNaziv.setText(s+"Q");
    }//GEN-LAST:event_jButtonQActionPerformed

    private void jButtonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRActionPerformed
       String s  = JTNaziv.getText();
                JTNaziv.setText(s+"R");
    }//GEN-LAST:event_jButtonRActionPerformed

    private void jButtonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSActionPerformed
       String s  = JTNaziv.getText();
                JTNaziv.setText(s+"S");
    }//GEN-LAST:event_jButtonSActionPerformed

    private void jButtonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTActionPerformed
       String s  = JTNaziv.getText();
                JTNaziv.setText(s+"T");
    }//GEN-LAST:event_jButtonTActionPerformed

    private void jButtonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUActionPerformed
        String s  = JTNaziv.getText();
                JTNaziv.setText(s+"U");
    }//GEN-LAST:event_jButtonUActionPerformed

    private void jButtonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVActionPerformed
       String s  = JTNaziv.getText();
                JTNaziv.setText(s+"V");
    }//GEN-LAST:event_jButtonVActionPerformed

    private void jButtonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWActionPerformed
      String s  = JTNaziv.getText();
                JTNaziv.setText(s+"W");
    }//GEN-LAST:event_jButtonWActionPerformed

    private void jButtonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXActionPerformed
       String s  = JTNaziv.getText();
                JTNaziv.setText(s+"X");
    }//GEN-LAST:event_jButtonXActionPerformed

    private void jButtonYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYActionPerformed
        String s  = JTNaziv.getText();
                JTNaziv.setText(s+"Y");
    }//GEN-LAST:event_jButtonYActionPerformed

    private void jButtonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZActionPerformed
       String s  = JTNaziv.getText();
                JTNaziv.setText(s+"Z");
    }//GEN-LAST:event_jButtonZActionPerformed

    private void jButtonOCICTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOCICTIActionPerformed
        JTNaziv.setText("");
        jTCena.setText("");
        jTSifra.setText("");
        jTIzbrisi.setText("");
        jTextFieldKolicina.setText("");
        jTextAreaLAGER.setText("");
    }//GEN-LAST:event_jButtonOCICTIActionPerformed

    private void jButtonLAGERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLAGERActionPerformed
      
         StringBuilder lager = new StringBuilder();
         try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cashdb", "root", "");){
           Statement st = conn.createStatement();
            st.execute("select * from cash_db");
            ResultSet rs = st.getResultSet();
            while(rs.next()){
            lager.append(rs.getString("idcash")); 
            lager.append(" : ");
            lager.append(rs.getString("sifra"));
            lager.append(" : ");
            lager.append(rs.getString("naziv")); 
            lager.append(" : ");
            lager.append(rs.getString("cena"));
            lager.append(" : ");
            lager.append(rs.getString("kolicina"));
            lager.append("\n");
               jTextAreaLAGER.setText(lager.toString());
            }
             st.close();
      } catch (SQLException ex) {
      System.out.println("Error in database connection: \n" + ex.getMessage());
      }  
    }//GEN-LAST:event_jButtonLAGERActionPerformed

    private void jButtonUNESIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUNESIActionPerformed
        
        naziv = JTNaziv.getText();
        cena = Double.parseDouble(jTCena.getText());
        kolicina = Integer.parseInt(jTextFieldKolicina.getText());
        sifra = Integer.parseInt(jTSifra.getText()); 
        
        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cashdb", "root", "");){
        Statement st = conn.createStatement();
        st.execute("insert into cash_db (sifra, naziv, cena, kolicina) values ('"+sifra+"','"+naziv+"','"+cena+"','"+kolicina+"')");
            st.close();
             
        JTNaziv.setText("");
        jTCena.setText("");
        jTSifra.setText("");
        jTextFieldKolicina.setText("");
      } catch (SQLException ex) {
      System.out.println("Error in database connection: \n" + ex.getMessage());
}
    }//GEN-LAST:event_jButtonUNESIActionPerformed

    private void jButtonOBRISIUNOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOBRISIUNOSActionPerformed
      
        sifra =Integer.parseInt(jTIzbrisi.getText());
        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cashdb", "root", "");){
        Statement st = conn.createStatement();
         st.execute("delete from cash_db where sifra = ('"+sifra+"')");
         st.close();
        jTIzbrisi.setText("");
          jTextAreaLAGER.setText("");
      } catch (SQLException ex) {
      System.out.println("Error in database connection: \n" + ex.getMessage());
    }//GEN-LAST:event_jButtonOBRISIUNOSActionPerformed
    }
    private void jButtonPREGLEDRACUNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPREGLEDRACUNAActionPerformed
        
           StringBuilder racuni = new StringBuilder();
           try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cashdb", "root", "");){
           Statement st = conn.createStatement();
            st.execute("select * from racuni");
            ResultSet rs = st.getResultSet();
            while(rs.next()){
            racuni.append(rs.getString("idprodaja")); 
            racuni.append(" : ");
            racuni.append(rs.getString("sifra"));
            racuni.append(" : ");
            racuni.append(rs.getString("naziv")); 
            racuni.append(" : ");
            racuni.append(rs.getString("cena"));
            racuni.append(" : ");
            racuni.append(rs.getString("kolicina"));
            racuni.append(" : ");
            racuni.append(rs.getString("vrednost"));
            racuni.append("\n");
               jTextAreaLAGER.setText(racuni.toString());
            }
            st.close();
      } catch (SQLException ex) {
      System.out.println("Error in database connection: \n" + ex.getMessage());
      }
    

    
    }//GEN-LAST:event_jButtonPREGLEDRACUNAActionPerformed

    private void jButtonspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonspaceActionPerformed
       String s  = JTNaziv.getText();
                JTNaziv.setText(s+" ");
    }//GEN-LAST:event_jButtonspaceActionPerformed

    private void jButtonZAREZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZAREZActionPerformed
        jButtonZAREZ.setAction( new KeyboardAction(","));
    }//GEN-LAST:event_jButtonZAREZActionPerformed
    
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Cash_Register_Back_OffisFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cash_Register_Back_OffisFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cash_Register_Back_OffisFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cash_Register_Back_OffisFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cash_Register_Back_OffisFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTNaziv;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonA;
    private javax.swing.JButton jButtonB;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonD;
    private javax.swing.JButton jButtonE;
    private javax.swing.JButton jButtonF;
    private javax.swing.JButton jButtonG;
    private javax.swing.JButton jButtonH;
    private javax.swing.JButton jButtonI;
    private javax.swing.JButton jButtonJ;
    private javax.swing.JButton jButtonK;
    private javax.swing.JButton jButtonL;
    private javax.swing.JButton jButtonLAGER;
    private javax.swing.JButton jButtonM;
    private javax.swing.JButton jButtonN;
    private javax.swing.JButton jButtonO;
    private javax.swing.JButton jButtonOBRISIUNOS;
    private javax.swing.JButton jButtonOCICTI;
    private javax.swing.JButton jButtonP;
    private javax.swing.JButton jButtonPREGLEDRACUNA;
    private javax.swing.JButton jButtonQ;
    private javax.swing.JButton jButtonR;
    private javax.swing.JButton jButtonS;
    private javax.swing.JButton jButtonT;
    private javax.swing.JButton jButtonU;
    private javax.swing.JButton jButtonUNESI;
    private javax.swing.JButton jButtonV;
    private javax.swing.JButton jButtonW;
    private javax.swing.JButton jButtonX;
    private javax.swing.JButton jButtonY;
    private javax.swing.JButton jButtonZ;
    private javax.swing.JButton jButtonZAREZ;
    private javax.swing.JButton jButtonspace;
    private javax.swing.JButton jButtontab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIzbrisi;
    private javax.swing.JLabel jLabelKOMADA;
    private javax.swing.JLabel jLabelNaziv;
    private javax.swing.JLabel jLabelsifra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCena;
    private javax.swing.JTextField jTIzbrisi;
    private javax.swing.JTextField jTSifra;
    private javax.swing.JTextArea jTextAreaLAGER;
    private javax.swing.JTextField jTextFieldKolicina;
    private javax.swing.JTextField jTextFieldLAGER;
    // End of variables declaration//GEN-END:variables
}
