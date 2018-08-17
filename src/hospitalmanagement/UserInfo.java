
package hospitalmanagement;

import static hospitalmanagement.DBConnection.getConnection;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class UserInfo extends javax.swing.JFrame {
String username;
public String[] getdata =new String[1];

Connection con=null;
    public UserInfo() {
        initComponents();
      
        
    }
  public  void getPost1(String User){
        
jname3.setText(User);
this.username=jname3.getText();
   System.out.println(username);
   init();
}
 /*public UserInfo(String user) {
initComponents();
this.username=user;
init();
    }*/
 public void  init(){
           Connection con=DBConnection.getConnection();
        try {
                       
            PreparedStatement ps;
            ps = con.prepareStatement("select photo,name,id,username,dob,contact from newuser  where username=? ");
            ps.setString(1,username);            
            ResultSet rs = (ps.executeQuery());
          
            if(rs.next())
               
            {
            jname3.setText(rs.getString("name"));
                jid3.setText(rs.getString("id"));
              juser3.setText(rs.getString("username"));
                jdob3.setText(rs.getString("dob"));
                
                jcontact3.setText(rs.getString("contact"));
                 Blob b=rs.getBlob("photo");//2 means 2nd column data  
byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
  Image img = Toolkit.getDefaultToolkit().createImage(barr).getScaledInstance(jtimage3.getWidth(), jtimage3.getHeight(),Image.SCALE_DEFAULT);
            jtimage3.setIcon(new ImageIcon(img));
            }
            
        } catch (SQLException ex) {
JOptionPane.showMessageDialog(null, ex.getMessage()+"  nreee");        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jdob3 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jname3 = new javax.swing.JTextField();
        jcontact3 = new javax.swing.JTextField();
        juser3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jid3 = new javax.swing.JTextField();
        jtimage3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Profile- user");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(153, 0, 153));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(490, 445));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("Name");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setText("Userid");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setText("Date Of Birth");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setText("Contact");

        jdob3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdob3jdobActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel23.setText("ID");

        jname3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jname3jnameActionPerformed(evt);
            }
        });

        jcontact3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcontact3jcontactActionPerformed(evt);
            }
        });

        juser3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juser3juserActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel24.setText("Profile");

        jid3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jid3jidKeyReleased(evt);
            }
        });

        jtimage3.setBackground(new java.awt.Color(204, 204, 255));
        jtimage3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton7.setText("Change");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7jButton1ActionPerformed(evt);
            }
        });

        jButton8.setText("Remove");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtimage3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jname3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(jid3)
                            .addComponent(juser3)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcontact3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdob3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtimage3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jid3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jname3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(juser3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jdob3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcontact3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel7);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 484, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jdob3jdobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdob3jdobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdob3jdobActionPerformed

    private void jname3jnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jname3jnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jname3jnameActionPerformed

    private void jcontact3jcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcontact3jcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcontact3jcontactActionPerformed

    private void juser3juserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juser3juserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juser3juserActionPerformed

    private void jid3jidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jid3jidKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jid3jidKeyReleased

    private void jButton7jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7jButton1ActionPerformed
        JFileChooser c =new JFileChooser();
        c.showOpenDialog(null);
        File f=c.getSelectedFile();
        String filename1=f.getAbsolutePath();
        ImageIcon image =new ImageIcon(filename1);
        Image img=image.getImage();
        Image newImg=img.getScaledInstance(jtimage3.getWidth(),jtimage3.getHeight(),Image.SCALE_SMOOTH);

        ImageIcon icon =new ImageIcon(newImg);

        //  ImageIcon icon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(800, 44, Image.SCALE_DEFAULT));
        jtimage3.setIcon(icon);
        try {
            Connection con=DBConnection.getConnection();

            //PreparedStatement ps=con.prepareStatement("insert into Usersi values(?,?,?,?,?,?,?,?) ");
            PreparedStatement ps=con.prepareStatement("update newuser set photo=?,filename=? where username=? ");
            FileInputStream fin=new FileInputStream(filename1);
            ps.setBinaryStream(1,fin,fin.available());
            ps.setString(2,filename1);
            ps.setString(3,username);

            int r= ps.executeUpdate();
            if(r==1){
                JOptionPane.showMessageDialog(null,"Changed");
            }
            else
            JOptionPane.showMessageDialog(null," No Change ");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);         }
    }//GEN-LAST:event_jButton7jButton1ActionPerformed

    private void jButton8jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8jButton2ActionPerformed
        String Filename="C:\\Users\\USER\\Desktop\\userid.png";
        try {
            Connection con=DBConnection.getConnection();

            //PreparedStatement ps=con.prepareStatement("insert into Usersi values(?,?,?,?,?,?,?,?) ");
            PreparedStatement ps=con.prepareStatement("update newuser set photo=?,filename=? where username=? ");
            FileInputStream fin=new FileInputStream(Filename);
            ps.setBinaryStream(1,fin,fin.available());
            ps.setString(2,Filename);
            ps.setString(3,username);
            int r= ps.executeUpdate();
            if(r==1){
                ImageIcon image =new ImageIcon(Filename);
                Image img=image.getImage();
                Image newImg=img.getScaledInstance(jtimage3.getWidth(),jtimage3.getHeight(),Image.SCALE_SMOOTH);

                ImageIcon icon =new ImageIcon(newImg);

                //  ImageIcon icon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(800, 44, Image.SCALE_DEFAULT));
                jtimage3.setIcon(icon);
                JOptionPane.showMessageDialog(null,"Changed");
            }
            else
            JOptionPane.showMessageDialog(null," No Change ");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);         }
    }//GEN-LAST:event_jButton8jButton2ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jcontact3;
    private javax.swing.JTextField jdob3;
    private javax.swing.JTextField jid3;
    private javax.swing.JTextField jname3;
    private javax.swing.JLabel jtimage3;
    private javax.swing.JTextField juser3;
    // End of variables declaration//GEN-END:variables
}
