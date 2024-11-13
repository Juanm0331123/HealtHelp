package Clases;

import Vistas.HH_PerfilMédico;
import Vistas.HhOpiniones;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyShadowAnimated;

public class SqlOpiniones {

    static conectarBD conexion = new conectarBD();
    static Connection conn = conexion.getConexion();
    static PreparedStatement ps;
    public static ResultSet resultado;

    //método para guardar registro
    public static int opiniones(String ID, String Nombre, String correoMedico) {
        int rsu = 0;

        String sql = "INSERT INTO opiniones (ID_paciente, nombre, opinion, correo) VALUES (?,?,?,?)";

        try {

            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ps.setString(2, Nombre);
            ps.setString(3, HhOpiniones.TxAgregaComentarioOpiniones.getText());
            ps.setString(4, correoMedico);
            rsu = ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e);
        }
        return rsu;
    }

    public static void listarOpiniones(String correoMedico) {

        //BuscarProductos.tbProductos.setDefaultRenderer(Object.class, new ImagenTabla());
        DefaultTableModel modelo = (DefaultTableModel) HhOpiniones.TbOpiniones.getModel();
        Image img = null;

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";

        sql = "SELECT * FROM opiniones WHERE (correo LIKE'" + correoMedico + "%') "
                + "ORDER BY correo";

        Object datos[] = new Object[3];

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Image i = null;
            while (rs.next()) {

                datos[0] = rs.getString("nombre");
                datos[1] = rs.getString("opinion");

                HhOpiniones.TbOpiniones.setRowHeight(25);
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

    public static void opinionesPacientesMedico() {

        //BuscarProductos.tbProductos.setDefaultRenderer(Object.class, new ImagenTabla());
        DefaultTableModel modelo = (DefaultTableModel) HH_PerfilMédico.TbOpinionesMédico.getModel();
        Image img = null;

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";

        sql = "SELECT nombre, opinion FROM opiniones";

        Object datos[] = new Object[3];

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Image i = null;
            while (rs.next()) {

                datos[0] = rs.getString("nombre");
                datos[1] = rs.getString("opinion");

                HH_PerfilMédico.TbOpinionesMédico.setRowHeight(25);
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

}
