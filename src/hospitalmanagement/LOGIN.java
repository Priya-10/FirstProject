
package hospitalmanagement;

import IDEA.Home1;
import IDEA.WelcomeHome;
import javax.swing.JLabel;
public class LOGIN extends javax.swing.JFrame {
    public LOGIN() {
        initComponents();
     
    }

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jtacc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtp = new javax.swing.JPasswordField();
        show = new javax.swing.JCheckBox();
        jtfor = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jtlimit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setMinimumSize(new java.awt.Dimension(484, 261));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Login  or ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 30, 58, 25);

        jtacc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtacc.setText("Create Account");
        jtacc.setToolTipText(" new user  ,click here.");
        jtacc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtaccMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jtaccMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtaccMouseExited(evt);
            }
        });
        getContentPane().add(jtacc);
        jtacc.setBounds(285, 30, 95, 25);

        jLabel1.setText("USERNAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 70, 84, 26);

        jtu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtuMouseClicked(evt);
            }
        });
        jtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtuActionPerformed(evt);
            }
        });
        getContentPane().add(jtu);
        jtu.setBounds(250, 70, 196, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/login.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 60, 121, 128);

        jLabel2.setText("PASSWORD");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 110, 70, 20);

        jtp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtpMouseClicked(evt);
            }
        });
        jtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtpActionPerformed(evt);
            }
        });
        getContentPane().add(jtp);
        jtp.setBounds(250, 110, 197, 20);

        show.setText("Show");
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        getContentPane().add(show);
        show.setBounds(250, 140, 60, 23);

        jtfor.setText("Forget Password?");
        jtfor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtforMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jtforMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtforMouseExited(evt);
            }
        });
        getContentPane().add(jtfor);
        jtfor.setBounds(360, 180, 170, 60);

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setText("Login");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 140, 65, 23);

        jtlimit.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtlimit.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jtlimit);
        jtlimit.setBounds(140, 210, 271, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/Backround1.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 490, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtuActionPerformed

    private void jtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtpActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jtaccMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtaccMouseEntered
        // TODO add your handling code here:
        jtacc.setForeground(new java.awt.Color(0,0, 255));
    }//GEN-LAST:event_jtaccMouseEntered

    private void jtaccMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtaccMouseExited
        // TODO add your handling code here:
        
                jtacc.setForeground(new java.awt.Color(0,0, 0));

    }//GEN-LAST:event_jtaccMouseExited

    private void jtaccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtaccMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        NewRegistration.main(null);
    }//GEN-LAST:event_jtaccMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user=jtu.getText().trim();
        String pass=jtp.getText();
              
        if(DBConnection.login(user,pass)){
           
           new UserChangePassword(user);//.setVisible(false);
          

            Welcome s=new Welcome();
            s.getPost(user);
            s.setVisible(true);
            this.setVisible(false);
           
        }
        else
        {   
            jtlimit.setText("* Username or password is invalid ");
            jtu.setText("");
            jtp.setText("");
        }
        jtlimit.setVisible(true);
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtuMouseClicked
        // TODO add your handling code here:
        jtlimit.setText("");
        jtlimit.setVisible(true);
    }//GEN-LAST:event_jtuMouseClicked

    private void jtforMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtforMouseEntered
        // TODO add your handling code here:
           jtfor.setForeground(new java.awt.Color(0,0, 255));
    }//GEN-LAST:event_jtforMouseEntered

    private void jtforMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtforMouseExited
        // TODO add your handling code here:
         jtfor.setForeground(new java.awt.Color(0,0, 0));
    }//GEN-LAST:event_jtforMouseExited

    private void jtforMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtforMouseClicked
        // TODO add your handling code here:
        ForgetPassword.main(null);
    }//GEN-LAST:event_jtforMouseClicked

    private void jtpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtpMouseClicked
        // TODO add your handling code here:
          jtlimit.setText("");
        jtlimit.setVisible(true);
    }//GEN-LAST:event_jtpMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        // TODO add your handling code here:
      //  show.isSelected();
       
    }//GEN-LAST:event_showMouseClicked

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
         if(show.isSelected()){
            jtp.setEchoChar((char)0);
        }
        else
         {
              jtp.setEchoChar('*');
         }
       
    }//GEN-LAST:event_showActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jtacc;
    private javax.swing.JLabel jtfor;
    private javax.swing.JLabel jtlimit;
    private javax.swing.JPasswordField jtp;
    private javax.swing.JTextField jtu;
    private javax.swing.JCheckBox show;
    // End of variables declaration//GEN-END:variables
}
