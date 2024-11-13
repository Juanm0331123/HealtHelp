package Clases;

import Vistas.HH_Cambios;
import Vistas.HH_EditarPerfilMedico;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class SqlActualizarDatosPaciente {

    static conectarBD conexion = new conectarBD();
    static Connection conn = conexion.getConexion();
    static PreparedStatement ps;
    public static ResultSet resultado;

    public static int editarPerfilPaciente(String ID) {
        int rsu = 0;
        String sql = "UPDATE paciente SET "
                + "nombre=?, "
                + "apellido=?, "
                + "telefono=?, "
                + "celular=?, "
                + "contrasenia=?, "
                + "imagen_perfil=? "
                + "WHERE documento_identidad='" + ID + "'";
        try {

            ps = conn.prepareStatement(sql);
            ps.setString(1, HH_Cambios.TxNombreActualizar.getText());
            ps.setString(2, HH_Cambios.TxApellidoActualizar.getText());
            ps.setString(3, HH_Cambios.TxNumTelefonoActualizar.getText());
            ps.setString(4, HH_Cambios.TxNumCelularActualizar.getText());
            ps.setString(5, HH_Cambios.TxContraseniaActualizar.getText());
            ps.setBlob(6, HH_Cambios.imagen);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }

        return rsu;
    }

    public static int editarPerfilMedico(String ID) {
        int rsu = 0;
        //UPDATE `paciente` SET `nombre` = 'Atún', `precio` = '3600' WHERE `productos`.`codigo` = '333';
        String sql = "UPDATE doctor SET "
                + "nombre=?, "
                + "apellido=?, "
                + "eps_donde_trabaja=?, "
                + "celular=?, "
                + "contrasenia=?, "
                + "imagen_perfil=? "
                + "WHERE documento_identidad='" + ID + "'";
        try {

            ps = conn.prepareStatement(sql);
            ps.setString(1, HH_EditarPerfilMedico.TxNombre.getText());
            ps.setString(2, HH_EditarPerfilMedico.TxApellido.getText());
            ps.setString(3, HH_EditarPerfilMedico.TxEpsDondeTrabaja.getText());
            ps.setString(4, HH_EditarPerfilMedico.TxNumeroCelular.getText());
            ps.setString(5, HH_EditarPerfilMedico.TxContraseña.getText());
            ps.setBlob(6, HH_EditarPerfilMedico.imagen);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }

        return rsu;
    }

    public static void buscarDatos(String ID) {
        try {

            String sql = "SELECT * FROM paciente WHERE documento_identidad=?";

            conn = conexion.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            Image img = null;
            while (rs.next()) {

                HH_Cambios.TxNombreActualizar.setText(rs.getString("nombre"));
                HH_Cambios.TxApellidoActualizar.setText(rs.getString("apellido"));
                HH_Cambios.TxNumTelefonoActualizar.setText(rs.getString("telefono"));
                HH_Cambios.TxNumCelularActualizar.setText(rs.getString("celular"));
                HH_Cambios.TxContraseniaActualizar.setText(rs.getString("contrasenia"));
                //código para recupera la imagen desde la BD
                Blob blob = rs.getBlob("imagen_perfil");
                img = javax.imageio.ImageIO.read(blob.getBinaryStream());
                ImageIcon image = new ImageIcon(img);
                image = new ImageIcon(image.getImage().getScaledInstance(HH_Cambios.LbImagenCargar.getWidth(), HH_Cambios.LbImagenCargar.getHeight(), Image.SCALE_DEFAULT));
                HH_Cambios.LbImagenCargar.setIcon(image);

            }

        } catch (SQLException ex) {
            Logger.getLogger(SqlActualizarDatosPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SqlActualizarDatosPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Metodo eliminar
    public static int eliminar(String ID) {
        int rsu = 0;
        String sql = ("DELETE FROM paciente WHERE documento_identidad = '" + ID + "'");

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        System.out.println(sql);
        return rsu;
    }

}
