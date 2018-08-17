
package hospitalmanagement;

import IDEA.Home1;

public class Welcome extends javax.swing.JFrame {
public String[] getdata =new String[1];

    public Welcome() {
        initComponents();
         this.setVisible(true);
    }
    
           
    public  void getPost(String User){
        
jk.setText(User);

   
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jk = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        ju = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        juc = new javax.swing.JMenuItem();
        jul = new javax.swing.JMenuItem();
        jd = new javax.swing.JMenu();
        jdp = new javax.swing.JMenuItem();
        jp = new javax.swing.JMenu();
        jpr = new javax.swing.JMenuItem();
        jps = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jh = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jhc = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome User");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Welcome ");
        jLabel3.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/11.jpg"))); // NOI18N

        jk.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jm.setText("Home");

        jMenuItem1.setText("Overview/About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jm.add(jMenuItem1);

        jMenuItem4.setText("Our Vision");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jm.add(jMenuItem4);

        jMenuItem5.setText("Department");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jm.add(jMenuItem5);

        jMenuBar1.add(jm);

        ju.setText("Users");
        ju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Edit Profile");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        ju.add(jMenuItem2);

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

        jMenuBar1.add(ju);

        jd.setText("Doctor");

        jdp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        jdp.setText("Doctors info/Profile");
        jdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdpActionPerformed(evt);
            }
        });
        jd.add(jdp);

        jMenuBar1.add(jd);

        jp.setText("Patient");

        jpr.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jpr.setText("Registration");
        jpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprActionPerformed(evt);
            }
        });
        jp.add(jpr);

        jps.setText("Patient information");
        jps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpsActionPerformed(evt);
            }
        });
        jp.add(jps);

        jMenuItem3.setText("Discharge cum biiling");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jp.add(jMenuItem3);

        jMenuBar1.add(jp);

        jh.setText("Help");

        jMenuItem6.setText("AboutUs");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jh.add(jMenuItem6);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jucActionPerformed
        // TODO add your handling code here:
         this.setVisible(true);
        UserChangePassword.main(null);

    }//GEN-LAST:event_jucActionPerformed

    private void jdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdpActionPerformed
        // TODO add your handling code here
         this.setVisible(true);
        DoctorProfile.main(null);

    }//GEN-LAST:event_jdpActionPerformed

    private void jprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprActionPerformed
          this.setVisible(true);
          PatientRegistration.main(null);

    }//GEN-LAST:event_jprActionPerformed

    private void jhcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jhcActionPerformed
        // TODO add your handling code here:
          this.setVisible(true);
        HelpContactUs.main(null);
    }//GEN-LAST:event_jhcActionPerformed

    private void jpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpsActionPerformed
        // TODO add your handling code here:
          this.setVisible(true);
        PatientInformation.main(null);
    }//GEN-LAST:event_jpsActionPerformed

    private void juActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juActionPerformed

    private void julActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_julActionPerformed
        // TODO add your handling code here:
          this.setVisible(true);
        UserLoginDetails.main(null);
    }//GEN-LAST:event_julActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         this.setVisible(true);
        Home1 s1=new Home1();

        s1.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:// 
      UserInfo s=new UserInfo();
            s.getPost1(jk.getText());
            s.setVisible(true);
            //this.setVisible(false);
       // new UserInfo( jk.getText());
      //this.setVisible(true);
       // UserInfo.main(null);
        // this.setVisible(true);
                
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       Departments.main(null);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
      OurMission.main(null);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       DischargeBill.main(null);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    HelpAboutUs.main(null);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jd;
    private javax.swing.JMenuItem jdp;
    private javax.swing.JMenu jh;
    private javax.swing.JMenuItem jhc;
    private javax.swing.JLabel jk;
    private javax.swing.JMenu jm;
    private javax.swing.JMenu jp;
    private javax.swing.JMenuItem jpr;
    private javax.swing.JMenuItem jps;
    private javax.swing.JMenu ju;
    private javax.swing.JMenuItem juc;
    private javax.swing.JMenuItem jul;
    // End of variables declaration//GEN-END:variables
}
