/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml_task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aya yamin
 */
class MySqlConnect {
    Connection conn=null;
    
    public static  Connection ConnectDB(){
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/uml_task","root","");
            // Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:10080/phpmyadmin/uml_task","root","");
            JOptionPane.showMessageDialog(null, "Connected to Database");
           //   http://localhost:10080/phpmyadmin/sql.php?server=1&db=uml_task&table=login&pos=0
             return conn;
           
         }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
    
}
