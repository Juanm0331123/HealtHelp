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
public class SqlRecuperarContraseña {
    
    static conectarBD conexion = new conectarBD();
    static Connection conn = conexion.getConexion();
    static PreparedStatement ps;
    public static ResultSet resultado;
    
    public static String buscarUsuarioRegistrado(String Identificacion, String Correo) {
        String busqueda_Usuario = null;
        try {
            String sentencia_buscar_usuario = ("SELECT documento_identidad, correo FROM paciente WHERE documento_identidad = '" + Identificacion + "' && correo ='" + Correo + "'");
            ps = conn.prepareStatement(sentencia_buscar_usuario);
            resultado = ps.executeQuery();

            if (resultado.next()) {
                busqueda_Usuario = "Usuario encontrado";

            } else {
                busqueda_Usuario = "Usuario no encontrado";
            }

        } catch (Exception e) {
            System.err.println(e);
        }
        return busqueda_Usuario;

    }
      
      public static String buscarContraseñaUsuario(String Documento) {

        String busqueda_contra = null;

        try {
            String sentencia_buscar = ("SELECT contrasenia FROM paciente WHERE documento_identidad = '" + Documento + "'");
            ps = conn.prepareStatement(sentencia_buscar);
            resultado = ps.executeQuery();
            if (resultado.next()) {
                String contraseña = resultado.getString("contrasenia");
                busqueda_contra = (contraseña);
                //JOptionPane.showMessageDialog(null, busqueda_contra);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return busqueda_contra;
    }
    
    

}
