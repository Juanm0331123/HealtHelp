/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Vistas.HH_EditarPerfilMedico;
import Vistas.HH_PerfilMédico;
import Vistas.HH_SoyMédico;
import Vistas.HH_TablaCitasMedico;
import Vistas.HhOpiniones;
import Vistas.IniciarSesionMedico_HH;
import Vistas.RegistroHH_Medico;
import java.awt.Image;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyShadowAnimated;

/**
 *
 * @author Juan Mguel
 */
public class SqlRegistroMedico {

    //datos de conexión
    static conectarBD conexion = new conectarBD();
    static Connection conn = conexion.getConexion();
    static PreparedStatement ps;
    public static ResultSet resultado;

    //método para guardar un productos
    public static int guardar() {
        int rsu = 0;

        String sql = "INSERT INTO doctor (tipo_documento, documento_identidad, fecha_nacimiento, eps_donde_trabaja, celular, especialidad, nombre, apellido, correo, contrasenia, imagen_perfil) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        try {
            //la clase Date y SimpleDateFormat nos permiten manejar la fecha de ingreso
            java.util.Date fechaRegistro = RegistroHH_Medico.Rs.getDatoFecha();
            SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");

            ps = conn.prepareStatement(sql);
            ps.setString(1, RegistroHH_Medico.tipo_documento);
            ps.setString(2, RegistroHH_Medico.TxNumeroDocumentoRegistro.getText());
            ps.setString(3, formatofecha.format(fechaRegistro));
            ps.setString(4, RegistroHH_Medico.TxEpsDondeTrabaja.getText());
            ps.setString(5, RegistroHH_Medico.TxCelularRegistro.getText());
            ps.setString(6, RegistroHH_Medico.TxEspecialidad.getText());
            ps.setString(7, RegistroHH_Medico.TxNombreRegistro.getText());
            ps.setString(8, RegistroHH_Medico.TxApellidoRegistro.getText());
            ps.setString(9, RegistroHH_Medico.TxCorreoElectronicoRegistro.getText());
            ps.setString(10, String.valueOf(RegistroHH_Medico.TxContraseñaRegistro.getPassword()));
            ps.setBlob(11, RegistroHH_Medico.imagen);
            rsu = ps.executeUpdate();

        } catch (Exception e) {
            System.err.println(e);
        }
        return rsu;
    }

    public static String buscarUsuarioRegistrado(String Identificacion, String Contrasenia) {
        String busqueda_Usuario = null;
        try {
            String sentencia_buscar_usuario = ("SELECT documento_identidad, contrasenia FROM doctor WHERE documento_identidad = '" + Identificacion + "' && contrasenia ='" + Contrasenia + "'");
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

    public static String buscarNombreUsuario(String Contrasenia) {

        String busqueda_nombre = null;
        try {
            String sentencia_buscar = ("SELECT nombre, apellido FROM doctor WHERE contrasenia = '" + Contrasenia + "'");
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

    public static void listarNombreMedico(String ID) {
        try {

            String sql = "SELECT * FROM doctor WHERE documento_identidad=?";

            conn = conexion.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            Image img = null;
            while (rs.next()) {

                HH_PerfilMédico.LbNombreDoctorInterfaz.setText("Dr. " + rs.getString("nombre"));
                HH_PerfilMédico.LbNombreMedico.setText("Dr. " + rs.getString("nombre") + " " + rs.getString("apellido"));
                HH_PerfilMédico.LbProfesionMedico.setText("Especialista en " + rs.getString("especialidad"));
                //código para recupera la imagen desde la BD
                Blob blob = rs.getBlob("imagen_perfil");
                img = javax.imageio.ImageIO.read(blob.getBinaryStream());
                ImageIcon image = new ImageIcon(img);
                image = new ImageIcon(image.getImage().getScaledInstance(HH_PerfilMédico.LbImagenDoctor.getWidth(), HH_PerfilMédico.LbImagenDoctor.getHeight(), Image.SCALE_DEFAULT));
                HH_PerfilMédico.LbImagenDoctor.setIcon(image);
                img = javax.imageio.ImageIO.read(blob.getBinaryStream());
                ImageIcon image2 = new ImageIcon(img);
                image2 = new ImageIcon(image.getImage().getScaledInstance(HH_PerfilMédico.LbImagenDoctor2.getWidth(), HH_PerfilMédico.LbImagenDoctor2.getHeight(), Image.SCALE_DEFAULT));
                HH_PerfilMédico.LbImagenDoctor2.setIcon(image2);

            }

        } catch (SQLException ex) {
            Logger.getLogger(SqlRegistroMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SqlRegistroMedico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void listarNombreMedicoEditarPerfil(String ID) {
        try {

            String sql = "SELECT * FROM doctor WHERE documento_identidad=?";

            conn = conexion.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            Image img = null;
            while (rs.next()) {

                //código para poner el nombre del usuario que inicio sesión en la aplicación
                HH_EditarPerfilMedico.LbNombreDoctorInterfaz.setText("Dr. " + rs.getString("nombre"));
                //código para recupera la imagen desde la BD
                Blob blob = rs.getBlob("imagen_perfil");
                img = javax.imageio.ImageIO.read(blob.getBinaryStream());
                ImageIcon image = new ImageIcon(img);
                image = new ImageIcon(image.getImage().getScaledInstance(HH_EditarPerfilMedico.LbImagenDoctor.getWidth(), HH_EditarPerfilMedico.LbImagenDoctor.getHeight(), Image.SCALE_DEFAULT));
                HH_EditarPerfilMedico.LbImagenDoctor.setIcon(image);

            }

        } catch (SQLException ex) {
            Logger.getLogger(SqlRegistroMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SqlRegistroMedico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void listarNombreMedicoTablaCitas(String ID) {
        try {

            String sql = "SELECT * FROM doctor WHERE documento_identidad=?";

            conn = conexion.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            Image img = null;
            while (rs.next()) {

                //código para poner el nombre del usuario que inicio sesión en la aplicación
                HH_TablaCitasMedico.LbNombreDoctorInterfaz.setText("Dr. " + rs.getString("nombre"));
                //código para recupera la imagen desde la BD
                Blob blob = rs.getBlob("imagen_perfil");
                img = javax.imageio.ImageIO.read(blob.getBinaryStream());
                ImageIcon image = new ImageIcon(img);
                image = new ImageIcon(image.getImage().getScaledInstance(HH_TablaCitasMedico.LbImagenDoctor.getWidth(), HH_TablaCitasMedico.LbImagenDoctor.getHeight(), Image.SCALE_DEFAULT));
                HH_TablaCitasMedico.LbImagenDoctor.setIcon(image);

            }

        } catch (SQLException ex) {
            Logger.getLogger(SqlRegistroMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SqlRegistroMedico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void listarMedicos() {
//Consulta.TablaProducto.setDefaultRenderer(Object.class, new ImagenTabla());
        DefaultTableModel modelo = (DefaultTableModel) HH_SoyMédico.TbListarMedicos.getModel();
        Image img = null;
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";

        sql = "SELECT * FROM doctor ORDER BY especialidad";

        Object datos[] = new Object[4];
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Image i = null;
            while (rs.next()) {

                datos[0] = rs.getString("nombre");
                datos[1] = rs.getString("apellido");
                datos[2] = rs.getString("especialidad");
                datos[3] = rs.getString("correo");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            new rojerusan.RSNotifyShadowAnimated("!Mensaje¡",
                    "!Upp...posee problemas\n!",
                    3,
                    RSNotifyShadowAnimated.PositionNotify.BottomRight,
                    RSNotifyShadowAnimated.AnimationNotify.RightLeft,
                    RSNotifyShadowAnimated.TypeNotify.ERROR).setVisible(true);
            System.err.print(ex);
        }
    }
    
    public static void listarDatosMedico(String CorreoMedicoSeleccionado) {
        try {

            String sql = "SELECT * FROM doctor WHERE correo=?";

            conn = conexion.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, CorreoMedicoSeleccionado);
            ResultSet rs = ps.executeQuery();
            Image img = null;
            while (rs.next()) {

                //código para poner el nombre del usuario que inicio sesión en la aplicación
                HhOpiniones.LbNombreDoctorPerfil.setText("Dr. " + rs.getString("nombre")+" "+rs.getString("apellido"));
                HhOpiniones.LbEspecialidadDoctor.setText("Especialista en " +""+rs.getString("especialidad"));
                //código para recupera la imagen desde la BD
                Blob blob = rs.getBlob("imagen_perfil");
                img = javax.imageio.ImageIO.read(blob.getBinaryStream());
                ImageIcon image = new ImageIcon(img);
                image = new ImageIcon(image.getImage().getScaledInstance(HhOpiniones.LbImagenDoctorPerfil.getWidth(), HhOpiniones.LbImagenDoctorPerfil.getHeight(), Image.SCALE_DEFAULT));
                HhOpiniones.LbImagenDoctorPerfil.setIcon(image);

            }

        } catch (SQLException ex) {
            Logger.getLogger(SqlRegistroMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SqlRegistroMedico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
