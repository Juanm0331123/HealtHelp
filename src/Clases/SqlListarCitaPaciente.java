package Clases;

import Vistas.HH_TablaCitasPaciente;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyShadowAnimated;

public class SqlListarCitaPaciente {

    static conectarBD conexion = new conectarBD();
    static Connection conn = conexion.getConexion();
    static PreparedStatement ps;
    public static ResultSet resultado;

    public static void listarCitasPaciente(String ID) {

        //BuscarProductos.tbProductos.setDefaultRenderer(Object.class, new ImagenTabla());
        DefaultTableModel modelo = (DefaultTableModel) HH_TablaCitasPaciente.TablaCitasAgendadas.getModel();
        Image img = null;

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";

        sql = "SELECT paciente.nombre, paciente.apellido, agendar_cita.disponibilidad, agendar_cita.hora, agendar_cita.especialidad, agendar_cita.situacion FROM paciente, agendar_cita WHERE agendar_cita.ID_paciente = paciente.documento_identidad AND agendar_cita.ID_paciente='" + ID + "'" + "ORDER BY disponibilidad";

        Object datos[] = new Object[6];

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Image i = null;
            while (rs.next()) {

                datos[0] = rs.getString("nombre");
                datos[1] = rs.getString("apellido");
                datos[3] = rs.getString("hora");
                datos[4] = rs.getString("especialidad");
                datos[5] = rs.getString("situacion");

                HH_TablaCitasPaciente.TablaCitasAgendadas.setRowHeight(25);
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
