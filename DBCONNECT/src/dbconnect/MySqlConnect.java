/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnect;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author fabge
 */
public class MySqlConnect {
 Connection conn = null;  
public static Connection ConnectDB() throws ClassNotFoundException{

    try{		                    
       Class.forName("com.mysql.jdbc.Driver");                 
    	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/edashboard","teamballo","password");
    	JOptionPane.showMessageDialog(null,"Connected to database");
       return conn;
        }
    	catch(SQLException e)
    	{
    	JOptionPane.showMessageDialog(null,e);
    	 return null;
         }
   
    }
}




    

