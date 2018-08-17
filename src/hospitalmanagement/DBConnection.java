
package hospitalmanagement;
import java.io.FileInputStream;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class DBConnection {
 static Map<String,String> pz=new HashMap<String,String>();// Map is abstract 
 static{
 pz.put("A", "?j");
  pz.put("B", ">>");
 pz.put("C", "~5");
 pz.put("D", "[;");
 pz.put("E", "\\");
 pz.put("F", ".,,");
 pz.put("G", ";");
 pz.put("F", "}}");
 pz.put("G", "-_");
 pz.put("H", "0)");
 pz.put("I", "9(");
 pz.put("J", "8*");
 pz.put("K", "&7");
 pz.put("L", "6^");
 pz.put("M", "%5");
 pz.put("N", "$4");
 pz.put("O", "#2");
 pz.put("P", "@3");
 pz.put("Q", "2!");
 pz.put("R", "1Z");
 pz.put("S", "0X");
 pz.put("T", "9C");
 pz.put("U", "8V");
 pz.put("V", "7B");
 pz.put("W", "6N");
 pz.put("X", "5M");
 pz.put("Y", "4L");
 pz.put("Z", "3K");
 pz.put("a", "2J");
 pz.put("b", "1H");
 pz.put("c", "0G");
 pz.put("d", "9F");
 pz.put("e", "8D");
 pz.put("f", "7S");
 pz.put("g", "6A");
 pz.put("h", "5P");
 pz.put("i", "4O");
 pz.put("k", "3I");
 pz.put("l", "2U");
 pz.put("m", "1Y");
 pz.put("n", "0T");
 pz.put("o", "9E");
 pz.put("p", "8R");
 pz.put("q", "7W");
 pz.put("r", "6Q");
 pz.put("s", "5m");
 pz.put("t", "4n");
 pz.put("u", "3b");
 pz.put("v", "1v");
 pz.put("w", "2c");
 pz.put("x", "1x");
 pz.put("y", "0z");
 pz.put("z", "9l");
 pz.put("0", "8k");
 pz.put("1", "7j");
 pz.put("2", "6h");
 pz.put("3", "5g");
 pz.put("4", "4f");
 pz.put("5", "3d");
 pz.put("6", "2s");
 pz.put("7", "1a");
 pz.put("8", "0p");
 pz.put("9", "9o");
 pz.put("@", "8i");
 pz.put("$", "7u");
  pz.put("!", "6y");
 pz.put("%", "5t");
 pz.put("^", "4r");
 pz.put("&", "3e");
 pz.put("*", "2w");
 pz.put("(", "1q");

 }

    public static void main(String gh[]) {
        // logic keep it in try block for any exception comes

    }//main ends   

    public static Connection getConnection() {
        try {
            // load the class OracleDriver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // create connection
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String username = "priya";
            String password = "priya";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println(con);
            return con;
        } catch (Exception e) {
            System.out.println(e);
              JOptionPane.showMessageDialog(null,e);
            return null;
        }

    }

    
//user enter original password in login page but encrypted password store in database sothat no theft will hack
    public static boolean login(String user,String pass) {
     String origpass=pass;
     String dpwd="";
     char ch[] =origpass.toCharArray();
     for(char c:ch){
        if(pz.containsKey(""+c)) { String value=pz.get(""+c);
         dpwd+=value;
     }
        else
            dpwd+="~";
     }

    if(dpwd.equals(retrieveDataFromDatabase(user))){
        return true;
    }
    else return false;
        }//method ends
     // insert original password into database
      public static String retrieveDataFromDatabase(String user) {
        try {
            String pa=null;
            Connection con = getConnection();
            PreparedStatement ps;
            ps = con.prepareStatement("select pass  from newuser  where username=?");
            ps.setString(1, user);
           
           ResultSet rs = (ps.executeQuery());
             while(rs.next())
             {
                pa=rs.getString("pass");  
             }
     return pa;
           // if(pa.equals(pass)){
            //    return true;
          //  }
         // else
               // return false;
        } catch (Exception e) {
            System.out.print(e);
              JOptionPane.showMessageDialog(null,e);
            return null;
        }}//method ends*/
     
      public static int NewReg(String name,String username,String password,String Contact,String Dob,String id,String filename) {
        try {
            Connection con=getConnection();
            //PreparedStatement ps=con.prepareStatement("insert into Usersi values(?,?,?,?,?,?,?,?) ");
PreparedStatement ps=con.prepareStatement("insert into newuser values(?,?,?,?,?,?,?,?) ");

            ps.setString(1, id);
       FileInputStream fin=new FileInputStream(filename);
       ps.setBinaryStream(2,fin,fin.available());
         ps.setString(3,filename);
           ps.setString(4,name);
             ps.setString(5,username);
           ps.setString(7,Contact);
           ps.setString(8,Dob);
         
          
           
            
           String origpass=password;
     String dpwd="";
     char ch[] =origpass.toCharArray();
     for(char c:ch){
        if(pz.containsKey(""+c)) { String value=pz.get(""+c);
         dpwd+=value;
     }
        else
            dpwd+=":";
     }

            ps.setString(6,dpwd);
          
       
        
             
            return (ps.executeUpdate());
        }catch(java.sql.SQLException e){
             JOptionPane.showMessageDialog(null,e);
               //JOptionPane.showMessageDialog(null,e);
            return 0;
        }
     catch(Exception e){
         System.out.println(e);
           JOptionPane.showMessageDialog(null,e);
         return -1;
         
     }
      }//method ends
     public static int InsertDoctorData(String id,String name,String fathername,String Address,String Contactno,String Email_id,String Qualification,String Specialization,String Gender,String BloodGroup,String Dateofjoining) {
     try {
            Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement("insert into doctorprofile values(?,?,?,?,?,?,?,?,?,?,?) ");
            ps.setString( 1,id);
            ps.setString(2,name);
          ps.setString( 3,fathername);
       ps.setString(4,Address);
          ps.setString(5,Contactno);
            
            ps.setString(9,Gender);       
            ps.setString (6,Email_id);
           ps.setString(7,Qualification);
              ps.setString(8,Specialization);
           ps.setString(10, BloodGroup);
              ps.setString(11,Dateofjoining );
           
                       return (ps.executeUpdate());

        }catch(java.sql.SQLException e){
             System.out.println(e);
              JOptionPane.showMessageDialog(null,e);
            return 0;
        }
     catch(Exception e){
         System.out.println(e);
           JOptionPane.showMessageDialog(null,e);
         return -1;
         
     }
         
     }// method ens
     
      
      
      
    
}//class ends
