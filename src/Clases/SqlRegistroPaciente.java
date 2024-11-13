/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Vistas.HH_Cambios;
import Vistas.HhAgendarCita;
import Vistas.Iniciar_Sesion_HH;
import Vistas.RegistroHP;
import Vistas.HH_SoyMédico;
import Vistas.HH_TablaCitasPaciente;
import Vistas.HhOpiniones;
import java.awt.Image;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Juan Mguel
 */
public class SqlRegistroPaciente {

    //datos de conexión
    static conectarBD conexion = new conectarBD();
    static Connection conn = conexion.getConexion();
    static PreparedStatement ps;
    public static ResultSet resultado;

    //método para guardar registro
    public static int guardar() {
        int rsu = 0;

        String sql = "INSERT INTO paciente (tipo_documento, documento_identidad, fecha_nacimiento, eps, telefono, celular, nombre, apellido, correo, contrasenia, imagen_perfil) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        try {
            //la clase Date y SimpleDateFormat nos permiten manejar la fecha de ingreso
            java.util.Date fechaRegistro = RegistroHP.RSCalendarFechaNacimientoRegistro.getDatoFecha();
            SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");

            ps = conn.prepareStatement(sql);
            ps.setString(1, RegistroHP.tipoDocumento);
            ps.setString(2, RegistroHP.TxNumeroDocumentoRegistro.getText());
            ps.setString(3, formatofecha.format(fechaRegistro));
            ps.setString(4, RegistroHP.eps);
            ps.setString(5, RegistroHP.TxNumeroTelefonoRegistro.getText());
            ps.setString(6, RegistroHP.TxCelularRegistro.getText());
            ps.setString(7, RegistroHP.TxNombreRegistro.getText());
            ps.setString(8, RegistroHP.TxApellidoRegistro.getText());
            ps.setString(9, RegistroHP.TxCorreoElectronicoRegistro.getText());
            ps.setString(10, String.valueOf(RegistroHP.TxContraseñaRegistro.getPassword()));
            ps.setBlob(11, RegistroHP.imagen);
            rsu = ps.executeUpdate();

        } catch (Exception e) {
            System.err.println(e);
        }
        return rsu;
    }

    //Método para buscar usuario en la BS
    public static String buscarUsuarioRegistrado(String Identificacion, String Contrasenia) {
        String busqueda_Usuario = null;
        try {
            String sentencia_buscar_usuario = ("SELECT documento_identidad, contrasenia FROM paciente WHERE documento_identidad = '" + Identificacion + "' && contrasenia ='" + Contrasenia + "'");
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

    //Método para buscar nombre del usuario encontrado en el método anterior
    public static String buscarNombreUsuario(String Contrasenia) {

        String busqueda_nombre = null;
        try {
            String sentencia_buscar = ("SELECT nombre, apellido FROM paciente WHERE contrasenia = '" + Contrasenia + "'");
            ps = conn.prepareStatement(sentencia_buscar);
            resultado = ps.executeQuery();
            if (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                busqueda_nombre = (nombre + " " + apellido);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return busqueda_nombre;
    }

    public static void ListarNombrePaciente(String ID) {
        try {

            String sql = "SELECT * FROM paciente WHERE documento_identidad=?";

            conn = conexion.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            Image img = null;
            while (rs.next()) {

                //código para poner el nombre del usuario que inicio sesión en la aplicación
                HhAgendarCita.LbNombrePacienteInterfaz.setText(("Sr. ") + rs.getString("nombre"));
                //código para recupera la imagen desde la BD
                Blob blob = rs.getBlob("imagen_perfil");
                img = javax.imageio.ImageIO.read(blob.getBinaryStream());
                ImageIcon image = new ImageIcon(img);
                image = new ImageIcon(image.getImage().getScaledInstance(HhAgendarCita.LbImagenUsuario.getWidth(), HhAgendarCita.LbImagenUsuario.getHeight(), Image.SCALE_DEFAULT));
                HhAgendarCita.LbImagenUsuario.setIcon(image);

            }

        } catch (SQLException ex) {
            Logger.getLogger(SqlRegistroPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SqlRegistroPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void ListarNombrePacienteSoyMedico(String ID) {
        try {

            String sql = "SELECT * FROM paciente WHERE documento_identidad=?";

            conn = conexion.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            Image img = null;
            while (rs.next()) {

                //código para poner el nombre del usuario que inicio sesión en la aplicación
                HH_SoyMédico.LbNombrePacienteInterfaz.setText(("Sr. ") + rs.getString("nombre"));
                //código para recupera la imagen desde la BD
                Blob blob = rs.getBlob("imagen_perfil");
                img = javax.imageio.ImageIO.read(blob.getBinaryStream());
                ImageIcon image = new ImageIcon(img);
                image = new ImageIcon(image.getImage().getScaledInstance(HH_SoyMédico.LbImagenUsuario.getWidth(), HH_SoyMédico.LbImagenUsuario.getHeight(), Image.SCALE_DEFAULT));
                HH_SoyMédico.LbImagenUsuario.setIcon(image);

            }

        } catch (SQLException ex) {
            Logger.getLogger(SqlRegistroPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SqlRegistroPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void ListarNombrePacienteEditarPerfil(String ID) {
        try {

            String sql = "SELECT * FROM paciente WHERE documento_identidad=?";

            conn = conexion.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            Image img = null;
            while (rs.next()) {

                //código para poner el nombre del usuario que inicio sesión en la aplicación
                HH_Cambios.LbNombrePacienteInterfaz.setText(("Sr. ") + rs.getString("nombre"));
                //código para recupera la imagen desde la BD
                Blob blob = rs.getBlob("imagen_perfil");
                img = javax.imageio.ImageIO.read(blob.getBinaryStream());
                ImageIcon image = new ImageIcon(img);
                image = new ImageIcon(image.getImage().getScaledInstance(HH_Cambios.LbImagenUsuario.getWidth(), HH_Cambios.LbImagenUsuario.getHeight(), Image.SCALE_DEFAULT));
                HH_Cambios.LbImagenUsuario.setIcon(image);

            }

        } catch (SQLException ex) {
            Logger.getLogger(SqlRegistroPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SqlRegistroPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void ListarNombrePacienteTablaCitas(String ID) {
        try {

            String sql = "SELECT * FROM paciente WHERE documento_identidad=?";

            conn = conexion.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            Image img = null;
            while (rs.next()) {

                //código para poner el nombre del usuario que inicio sesión en la aplicación
                HH_TablaCitasPaciente.LbNombrePacienteInterfaz.setText(("Sr. ") + rs.getString("nombre"));
                //código para recupera la imagen desde la BD
                Blob blob = rs.getBlob("imagen_perfil");
                img = javax.imageio.ImageIO.read(blob.getBinaryStream());
                ImageIcon image = new ImageIcon(img);
                image = new ImageIcon(image.getImage().getScaledInstance(HH_TablaCitasPaciente.LbImagenUsuario.getWidth(), HH_TablaCitasPaciente.LbImagenUsuario.getHeight(), Image.SCALE_DEFAULT));
                HH_TablaCitasPaciente.LbImagenUsuario.setIcon(image);

            }

        } catch (SQLException ex) {
            Logger.getLogger(SqlRegistroPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SqlRegistroPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void ListarNombrePacienteOpiniones(String ID) {
        try {

            String sql = "SELECT * FROM paciente WHERE documento_identidad=?";

            conn = conexion.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            Image img = null;
            while (rs.next()) {

                //código para poner el nombre del usuario que inicio sesión en la aplicación
                HhOpiniones.LbNombrePacienteInterfaz3.setText(("Sr. ") + rs.getString("nombre"));
                //código para recupera la imagen desde la BD
                Blob blob = rs.getBlob("imagen_perfil");
                img = javax.imageio.ImageIO.read(blob.getBinaryStream());
                ImageIcon image = new ImageIcon(img);
                image = new ImageIcon(image.getImage().getScaledInstance(HhOpiniones.LbImagenUsuario.getWidth(), HhOpiniones.LbImagenUsuario.getHeight(), Image.SCALE_DEFAULT));
                HhOpiniones.LbImagenUsuario.setIcon(image);

            }

        } catch (SQLException ex) {
            Logger.getLogger(SqlRegistroPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SqlRegistroPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
