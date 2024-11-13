/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class SqlRecuperarContraseñaMedico {
    
    static conectarBD conexion = new conectarBD();
    static Connection conn = conexion.getConexion();
    static PreparedStatement ps;
    public static ResultSet resultado;
    
    public static String buscarMedicoRegistrado(String Identificacion, String Correo) {
        String busqueda_Medico = null;
        try {
            String sentencia_buscar_medico = ("SELECT documento_identidad, correo FROM doctor WHERE documento_identidad = '" + Identificacion + "' && correo ='" + Correo + "'");
            ps = conn.prepareStatement(sentencia_buscar_medico);
            resultado = ps.executeQuery();

            if (resultado.next()) {
                busqueda_Medico = "Usuario encontrado";

            } else {
                busqueda_Medico = "Usuario no encontrado";
            }

        } catch (Exception e) {
            System.err.println(e);
        }
        return busqueda_Medico;

    }
      
      public static String buscarContraseñaMedico(String Documento) {

        String busqueda_Contra_Medico = null;

        try {
            String sentencia_buscar = ("SELECT contrasenia FROM doctor WHERE documento_identidad = '" + Documento + "'");
            ps = conn.prepareStatement(sentencia_buscar);
            resultado = ps.executeQuery();
            if (resultado.next()) {
                String contraseña = resultado.getString("contrasenia");
                busqueda_Contra_Medico = (contraseña);
                //JOptionPane.showMessageDialog(null, busqueda_Contra_Medico);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return busqueda_Contra_Medico;
    }
    
    


}
