package Clases;

import Vistas.HH_SoyMédico;
import Vistas.HH_TablaCitasMedico;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyShadowAnimated;

public class SqlListarCitaMedico {

    static conectarBD conexion = new conectarBD();
    static Connection conn = conexion.getConexion();
    static PreparedStatement ps;
    public static ResultSet resultado;

    public static void listarCitasMedico(String ID) {

        //BuscarProductos.tbProductos.setDefaultRenderer(Object.class, new ImagenTabla());
        DefaultTableModel modelo = (DefaultTableModel) HH_TablaCitasMedico.TablaCitasAgendadas.getModel();
        Image img = null;

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";

        sql = "SELECT * FROM agendar_cita WHERE (profesional_salud_ID LIKE'" + ID + "%') "
                + "ORDER BY profesional_salud_ID";

        Object datos[] = new Object[6];

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Image i = null;
            while (rs.next()) {

                datos[0] = rs.getString("nombre");
                datos[1] = rs.getString("hora");
                datos[3] = rs.getString("especialidad");
                datos[4] = rs.getString("situacion");

                HH_TablaCitasMedico.TablaCitasAgendadas.setRowHeight(25);
                datos[2] = rs.getString("disponibilidad");
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
