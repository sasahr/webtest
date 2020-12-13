/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cash_register;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sasa
 */
public class CashFrame extends javax.swing.JFrame {

     private double kolicina;
     private String znak;
     private String[] sifra;
     private String poruka;
     private String idracuni;
    
     
    public CashFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField = new javax.swing.JTextField();
        jButon1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonPUTA = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonTACKA = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonTOTAL = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonpregledracuna = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cash Register");
        setAlwaysOnTop(true);
        setResizable(false);

        jButon1.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jButon1.setText("1");
        jButon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButon1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonPUTA.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jButtonPUTA.setText("*");
        jButtonPUTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPUTAActionPerformed(evt);
            }
        });

        jButton0.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonTACKA.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jButtonTACKA.setText(".");
        jButtonTACKA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTACKAActionPerformed(evt);
            }
        });

        jButtonC.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jButtonC.setText("C");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonTOTAL.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jButtonTOTAL.setText("TOTAL");
        jButtonTOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTOTALActionPerformed(evt);
            }
        });

        jLabel1.setText("kolicina x sifra");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButtonpregledracuna.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jButtonpregledracuna.setText("PREGLED RACUNA");
        jButtonpregledracuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpregledracunaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonPUTA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButon1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonTACKA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                            .addComponent(jButtonpregledracuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonTOTAL, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jButtonC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonpregledracuna, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonTACKA, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPUTA, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButon1ActionPerformed
                String s  = jTextField.getText();
                jTextField.setText(s+"1");
    }//GEN-LAST:event_jButon1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String s  = jTextField.getText();
                jTextField.setText(s+"2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String s  = jTextField.getText();
                jTextField.setText(s+"3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String s  = jTextField.getText();
                jTextField.setText(s+"4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       String s  = jTextField.getText();
                jTextField.setText(s+"5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String s  = jTextField.getText();
                jTextField.setText(s+"6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      String s  = jTextField.getText();
             jTextField.setText(s+"7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String s  = jTextField.getText();
              jTextField.setText(s+"8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       String s  = jTextField.getText();
              jTextField.setText(s+"9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
       String s  = jTextField.getText();
              jTextField.setText(s+"0");
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonPUTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPUTAActionPerformed
       String p = jTextField.getText();
        znak ="*";
        kolicina=Double.parseDouble(p); 
        jTextField.setText(p+"*");  
    }//GEN-LAST:event_jButtonPUTAActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
       jTextField.setText("");
       jTextArea1.setText("");
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonTACKAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTACKAActionPerformed
         String s  = jTextField.getText();
      jTextField.setText(s+"."); 
    }//GEN-LAST:event_jButtonTACKAActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
       idracuni = jTextField.getText();
       StringBuilder bazaracuni = new StringBuilder();
        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cashdb", "root", "");){
        Statement st = conn.createStatement();
        st.execute("select * from racuni where idprodaja = '"+idracuni+"'");
        ResultSet resultSet = st.getResultSet();
            while (resultSet.next()){
               bazaracuni.append(resultSet.getString("kolicina"));
               }
            String bazaracunikolicina = String.valueOf(bazaracuni);
            double racunikolicina= Double.parseDouble(bazaracunikolicina);
            st.execute("update cash_db set kolicina = kolicina + '"+racunikolicina+"'");
           st.execute("delete from racuni where idprodaja = '"+idracuni+"'");
           st.close();
            jTextField.setText("");
            jTextArea1.setText("USPESNO PBRISAN UNOS");
      } catch (SQLException ex) {
      System.out.println("Error in database connection: \n" + ex.getMessage());
    } 
        
    }//GEN-LAST:event_jButtonDeleteActionPerformed
    
    private void jButtonTOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTOTALActionPerformed
        String niz = jTextField.getText();
        sifra = niz.split("[*]");
        StringBuilder baza = new StringBuilder();
         try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cashdb", "root", "");){
            Statement st = conn.createStatement();
            st.execute("select * from cash_db where sifra = '"+sifra[1]+"'");
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()){
               baza.append(resultSet.getString("sifra"));
               baza.append(":");
               baza.append(resultSet.getString("naziv"));
               baza.append(":");
               baza.append(resultSet.getString("cena"));
               }
               st.close();
}           catch (SQLException ex) {
            Logger.getLogger(CashFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
           String bazaniz = String.valueOf(baza);
           String[] operand = bazaniz.split(":");
           if (sifra[1].equals(operand[0])){
            double bazacena = Double.parseDouble(operand[2]);
           double ukupno = kolicina * bazacena;
            poruka =(""+operand[0]+" : "+operand[1]+" : "+operand[2]+" x "+String.valueOf(kolicina)+" : "+ String.valueOf(ukupno)+"");
             try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cashdb", "root", "");){
            Statement st = conn.createStatement();
               st.execute("insert into racuni (sifra,naziv,cena,kolicina,vrednost)values('"+operand[0]+"','"+operand[1]+"','"+operand[2]+"','"+kolicina+"','"+ukupno+"')" );
              jTextField.setText("");
              jTextArea1.setText( "                        SEVERNI POL DOO\n "
                      + "                                LAPONIJA \n                       "
                      + "         MB:200200\n"
                      + "                            PIB:101101101\n"+ poruka);
               st.execute("update cash_db set kolicina = kolicina -('"+kolicina+"') where sifra = '"+sifra[1]+"'"); 
                 System.out.println("sifra je"+sifra[1]);
                 System.out.println("kolicina je"+kolicina);
                  System.out.println("cena je je"+bazacena);
                 System.out.println("vrednost je"+ukupno);
               st.close();
}           catch (SQLException ex) {
             Logger.getLogger(CashFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
           } else {
                jTextArea1.setText("POGRESNA SIFRA");
           }
    }//GEN-LAST:event_jButtonTOTALActionPerformed

    private void jButtonpregledracunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpregledracunaActionPerformed
          StringBuilder baza = new StringBuilder();
         try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cashdb", "root", "");){
            Statement st = conn.createStatement();
            st.execute("select * from racuni");
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()){
               baza.append(resultSet.getString("idprodaja"));
               baza.append(":");
               baza.append(resultSet.getString("sifra"));
               baza.append(":");
               baza.append(resultSet.getString("naziv"));
               baza.append(":");
               baza.append(resultSet.getString("kolicina"));
               baza.append(" x ");
               baza.append(resultSet.getString("cena"));
               baza.append(":");
               baza.append(resultSet.getString("vrednost"));
               baza.append("\n");
               }
               st.close();
               jTextArea1.setText(baza.toString());
}           catch (SQLException ex) {
             Logger.getLogger(CashFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButtonpregledracunaActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new CashFrame().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButon1;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonPUTA;
    private javax.swing.JButton jButtonTACKA;
    private javax.swing.JButton jButtonTOTAL;
    private javax.swing.JButton jButtonpregledracuna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
