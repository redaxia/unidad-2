/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capmod;

import java.awt.HeadlessException;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Richard Rendón
 */
public class CapMod {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      Connection conexion = CONEXION.getConnection();
      PreparedStatement ps;
      ResultSet rs; 
      
  
        try {
            
            ps=conexion.prepareStatement("select * from empleados");
            rs = ps.executeQuery();
            
            
            if(rs.next()){
            
                System.out.println("\nidentificacion:  " + rs.getString("identificacion"));
                System.out.println("\nNombre:  " + rs.getString("nombres"));
                System.out.println("\nApellido:  " + rs.getString("apellidos"));
            }
            
            
        } catch (Exception e) {
            
            System.err.println("error de captura ");
        }
              
              
            
        
        
         //PreparedStatement ps= conexion.prepareStatement("select * from empleados");

        
    }
    
}
