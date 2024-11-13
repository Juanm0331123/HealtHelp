/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import static Clases.SqlRegistroPaciente.conn;
import static Clases.SqlRegistroPaciente.ps;
import Vistas.HhAgendarCita;
import java.sql.SQLException;
import java.text.SimpleDateFormat;


public class SqlAgendarCita {
    
    //método para guardar registro
    public static int agendarCita(String ID, String Nombre) {
        int rsu = 0;

        String sql = "INSERT INTO agendar_cita (profesional_salud_ID, nombre, disponibilidad, hora, genero, especialidad, situacion, ID_paciente) VALUES (?,?,?,?,?,?,?,?)";

        try {
            //la clase Date y SimpleDateFormat nos permiten manejar la fecha de ingreso
            java.util.Date fechaDisponibilidad = HhAgendarCita.RsCalendarDisponibilidad.getDatoFecha();
            SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");

            ps = conn.prepareStatement(sql);
            ps.setString(1, HhAgendarCita.TxProfesionalSaludAgendarCita.getText());
            ps.setString(2, Nombre);
            ps.setString(3, formatofecha.format(fechaDisponibilidad));
            ps.setString(4, HhAgendarCita.TxHoraProbar.getText());
            ps.setString(5, HhAgendarCita.genero);
            ps.setString(6, HhAgendarCita.especialidad);
            ps.setString(7, HhAgendarCita.TxaDescripcionProblemaAgendarCita.getText());
            ps.setString(8, ID);
            rsu = ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e);
        }
        return rsu;
    }

}
