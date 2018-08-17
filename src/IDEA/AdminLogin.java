
package IDEA;

import hospitalmanagement.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminLogin extends javax.swing.JFrame {
public String[] getdata =new String[1];
 Connection con=null;
    public AdminLogin() {
        initComponents();
        
    }
    public  void getPost(String User){

jk.setText(User);

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem14 = new javax.swing.JMenuItem();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jk = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmw = new javax.swing.JMenuItem();
        jmr = new javax.swing.JMenuItem();
        jun = new javax.swing.JMenuItem();
        ju = new javax.swing.JMenu();
        jur = new javax.swing.JMenuItem();
        juc = new javax.swing.JMenuItem();
        jul = new javax.swing.JMenuItem();
        jd = new javax.swing.JMenu();
        jdp = new javax.swing.JMenuItem();
        jp = new javax.swing.JMenu();
        jpr = new javax.swing.JMenuItem();
        jps = new javax.swing.JMenuItem();
        jpa = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jpd = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jpb = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jh = new javax.swing.JMenu();
        jha = new javax.swing.JMenuItem();
        jhc = new javax.swing.JMenuItem();

        jMenuItem14.setText("jMenuItem14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setText("Welcome");

        jm.setText("Home");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jm.add(jMenuItem1);

        jmw.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK));
        jmw.setText("Ward");
        jmw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmwActionPerformed(evt);
            }
        });
        jm.add(jmw);

        jmr.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jmr.setText("Room");
        jmr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmrActionPerformed(evt);
            }
        });
        jm.add(jmr);

        jun.setText("Nurse/WardBoy");
        jun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                junActionPerformed(evt);
            }
        });
        jm.add(jun);

        jMenuBar1.add(jm);

        ju.setText("Users");
        ju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juActionPerformed(evt);
            }
        });

        jur.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jur.setText("Registration");
        jur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jurActionPerformed(evt);
            }
        });
        ju.add(jur);

        juc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        juc.setText("Change Password");
        juc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jucActionPerformed(evt);
            }
        });
        ju.add(juc);

        jul.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK));
        jul.setText("Login details");
        jul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                julActionPerformed(evt);
            }
        });
        ju.add(jul);

        jd.setText("Doctor");

        jdp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        jdp.setText("Profile");
        jdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdpActionPerformed(evt);
            }
        });
        jd.add(jdp);

        ju.add(jd);

        jMenuBar1.add(ju);

        jp.setText("Patient");

        jpr.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jpr.setText("Registration");
        jpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprActionPerformed(evt);
            }
        });
        jp.add(jpr);

        jps.setText("Services");
        jps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpsActionPerformed(evt);
            }
        });
        jp.add(jps);

        jpa.setText("Admit");

        jMenuItem9.setText("Ward");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jpa.add(jMenuItem9);

        jMenuItem11.setText("Room");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jpa.add(jMenuItem11);

        jp.add(jpa);

        jpd.setText("Discharge");

        jMenuItem13.setText("Ward");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jpd.add(jMenuItem13);

        jMenuItem12.setText("Room");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jpd.add(jMenuItem12);

        jp.add(jpd);

        jpb.setText("Billing");

        jMenuItem15.setText("CGS");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jpb.add(jMenuItem15);

        jMenuItem16.setText("Non-CGS");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jpb.add(jMenuItem16);

        jp.add(jpb);

        jMenuBar1.add(jp);

        jh.setText("Help");

        jha.setText("About");
        jha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jhaActionPerformed(evt);
            }
        });
        jh.add(jha);

        jhc.setText("Contact");
        jhc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jhcActionPerformed(evt);
            }
        });
        jh.add(jhc);

        jMenuBar1.add(jh);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmwActionPerformed
        // TODO add your handling code here:
        Departments.main(null);
    }//GEN-LAST:event_jmwActionPerformed

    private void jmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmrActionPerformed
        // TODO add your handling code here:
      

    }//GEN-LAST:event_jmrActionPerformed

    private void jucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jucActionPerformed
        // TODO add your handling code here:
        UserChangePassword.main(null);

    }//GEN-LAST:event_jucActionPerformed

    private void jdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdpActionPerformed
        // TODO add your handling code here
        DoctorProfile.main(null);

    }//GEN-LAST:event_jdpActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        PatientInformation.main(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        FeverDoctor.main(null);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprActionPerformed
        PatientRegistration.main(null);

    }//GEN-LAST:event_jprActionPerformed

    private void jhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jhaActionPerformed
        // TODO add your handling code here:
        HelpAboutUs.main(null);
    }//GEN-LAST:event_jhaActionPerformed

    private void jhcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jhcActionPerformed
        // TODO add your handling code here:
        HelpContactUs.main(null);
    }//GEN-LAST:event_jhcActionPerformed

    private void jpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpsActionPerformed
        // TODO add your handling code here:
        PatientService.main(null);
    }//GEN-LAST:event_jpsActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void juActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juActionPerformed

    private void julActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_julActionPerformed
        // TODO add your handling code here:
        UserLoginDetails.main(null);
    }//GEN-LAST:event_julActionPerformed

    private void junActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_junActionPerformed
        // TODO add your handling code here
        OurMission.main(null);
    }//GEN-LAST:event_junActionPerformed

    private void jurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jurActionPerformed
        // TODO add your handling code here:
        UserInfo.main(null);

    }//GEN-LAST:event_jurActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Home1 s1=new Home1();

        s1.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JMenu jd;
    private javax.swing.JMenuItem jdp;
    private javax.swing.JMenu jh;
    private javax.swing.JMenuItem jha;
    private javax.swing.JMenuItem jhc;
    private javax.swing.JLabel jk;
    private javax.swing.JMenu jm;
    private javax.swing.JMenuItem jmr;
    private javax.swing.JMenuItem jmw;
    private javax.swing.JMenu jp;
    private javax.swing.JMenu jpa;
    private javax.swing.JMenu jpb;
    private javax.swing.JMenu jpd;
    private javax.swing.JMenuItem jpr;
    private javax.swing.JMenuItem jps;
    private javax.swing.JMenu ju;
    private javax.swing.JMenuItem juc;
    private javax.swing.JMenuItem jul;
    private javax.swing.JMenuItem jun;
    private javax.swing.JMenuItem jur;
    // End of variables declaration//GEN-END:variables
}
