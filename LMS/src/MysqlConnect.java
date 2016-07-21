import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;



public class MysqlConnect {
    Connection conn=null;
    public static Connection ConnectDB()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://localhost:3306/xii";
            Connection conn=DriverManager.getConnection(db_url,"root","sql");
            JOptionPane.showMessageDialog(null,"CONNECTION ESTABLISHED");
            return conn;
            
        }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    }
}
