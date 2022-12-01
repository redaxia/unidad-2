/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capmod;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Richard Rendón
 */
public class CONEXION {
    
    
    public static java.sql.Connection getConnection(){
        
        java.sql.Connection conexion =null;
      
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conexion = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurante", "root", "Kds58448*");
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            
        }catch(ClassNotFoundException | SQLException | HeadlessException ex){
            
            
            // JOptionPane.showMessageDialog(null, "error de conexion" +ex);
            
        }return conexion;
        
    }
}


