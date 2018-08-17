
package IDEA;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
public class NewClass extends javax.swing.JFrame {
JLabel pic;
int x=0;
Timer tm;
String[] list={
    "D:\\Images\\map.jpg","C:\\Users\\USER\\Desktop\\Shalu photo-page-001.jpg"};
    public NewClass() {

        super("Java Slideshow");
        pic=new JLabel();
 pic.setBounds(40,30,100,300);       
        setImageSize(1);
        tm =new Timer(1000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
setImageSize(x);
x+=1;
if(x>=list.length)
    x=0;
           //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
           
      
        
        });
         add(pic);
            tm.start();
            setLayout(null);
            setSize(800,800);
            getContentPane().setBackground(Color.RED);
                    setLocationRelativeTo(null);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setVisible(true);
    }
public void setImageSize(int i){
    ImageIcon icon =new ImageIcon(list[i]);
    Image img =icon.getImage();
    Image newimg =img.getScaledInstance(pic.getWidth(),pic.getHeight(),Image.SCALE_SMOOTH);
    
    ImageIcon imag1=new ImageIcon(newimg);
            pic.setIcon(imag1);
}
    public static void main(String args[]) {
    new NewClass();}}