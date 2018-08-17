
package hospitalmanagement;

public class HelpAboutUs extends javax.swing.JFrame {

    public HelpAboutUs() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AboutUs");
        setBounds(new java.awt.Rectangle(500, 100, 500, 600));
        setMinimumSize(new java.awt.Dimension(335, 300));
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel1.setText("Hospital Management System");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 30, 254, 26);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Developed By :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 190, 94, 17);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Priya");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 220, 50, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/Screenshot (50).png"))); // NOI18N
        jLabel4.setText(" ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 330, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpAboutUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
