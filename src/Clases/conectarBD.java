/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyShadowAnimated;

/**
 *
 * @author Juan Mguel
 */
public class conectarBD {
    
    private final String base = "healt_help";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection conn = null;
    
    public Connection getConexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(url, user, password);
            //mensaje de conexión
            new rojerusan.RSNotifyShadowAnimated("!Hecho¡",
                                    "!Conexión éxitosa!", 
                                    3, 
                                    RSNotifyShadowAnimated.PositionNotify.TopRight, 
                                    RSNotifyShadowAnimated.AnimationNotify.UpBottom, 
                                    RSNotifyShadowAnimated.TypeNotify.SUCCESS).setVisible(true);
            // JOptionPane.showMessageDialog(null, "Conexión éxitosa");
         } 
        catch (ClassNotFoundException | SQLException e) {
             new rojerusan.RSNotifyShadowAnimated("!Mensaje¡",
                                    "!Problemas en la conexión!", 
                                    3, 
                                    RSNotifyShadowAnimated.PositionNotify.BottomRight, 
                                    RSNotifyShadowAnimated.AnimationNotify.RightLeft, 
                                    RSNotifyShadowAnimated.TypeNotify.ERROR).setVisible(true);
           // JOptionPane.showMessageDialog(null, "Problemas en la conexión" + e);
        }
      return conn;  
    }
    
}
