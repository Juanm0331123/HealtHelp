/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.SqlListarCitaPaciente;
import Clases.SqlRegistroPaciente;
import Clases.temporal;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class HH_TablaCitasPaciente extends javax.swing.JFrame {

    /**
     * Creates new form HH_TablaCitasPaciente
     */
    public HH_TablaCitasPaciente() {
        initComponents();
        temporal tm = new temporal();
        SqlListarCitaPaciente.listarCitasPaciente(tm.getID());
        SqlRegistroPaciente.ListarNombrePacienteTablaCitas(tm.getID());
        
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAgendarCita = new org.edisoncor.gui.panel.Panel();
        jSeparator1 = new javax.swing.JSeparator();
        LbLogoAppHealtHelp = new javax.swing.JLabel();
        LbSloganHealtHelp = new javax.swing.JLabel();
        LbTituloHealtHelp = new javax.swing.JLabel();
        LbNombrePacienteInterfaz = new javax.swing.JLabel();
        LbImagenUsuario = new javax.swing.JLabel();
        BnVolverOpiniones = new javax.swing.JButton();
        LbSubtituloAgendarCita = new RSMaterialComponent.RSLabelTextIcon();
        LbCitasAgendadas = new javax.swing.JLabel();
        LbEditarPerfil = new javax.swing.JLabel();
        LbCerrarSesión = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCitasAgendadas = new RSMaterialComponent.RSTableMetroCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        PanelAgendarCita.setColorPrimario(new java.awt.Color(0, 102, 153));
        PanelAgendarCita.setColorSecundario(new java.awt.Color(0, 153, 102));
        PanelAgendarCita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelAgendarCita.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 189, -1, -1));

        LbLogoAppHealtHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/principal.jpg"))); // NOI18N
        LbLogoAppHealtHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbLogoAppHealtHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbLogoAppHealtHelpMouseClicked(evt);
            }
        });
        PanelAgendarCita.add(LbLogoAppHealtHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        LbSloganHealtHelp.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        LbSloganHealtHelp.setForeground(new java.awt.Color(255, 255, 255));
        LbSloganHealtHelp.setText("Tu salud en nuestras manos ");
        PanelAgendarCita.add(LbSloganHealtHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, 15));

        LbTituloHealtHelp.setFont(new java.awt.Font("Verdana", 1, 28)); // NOI18N
        LbTituloHealtHelp.setForeground(new java.awt.Color(255, 255, 255));
        LbTituloHealtHelp.setText("HealtHelp");
        PanelAgendarCita.add(LbTituloHealtHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        LbNombrePacienteInterfaz.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LbNombrePacienteInterfaz.setForeground(new java.awt.Color(255, 255, 255));
        LbNombrePacienteInterfaz.setText("Rosendo Bucuru");
        PanelAgendarCita.add(LbNombrePacienteInterfaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 180, 40));

        LbImagenUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbImagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Foto usuario.png"))); // NOI18N
        PanelAgendarCita.add(LbImagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 40, 40));

        BnVolverOpiniones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BótonVolver.png"))); // NOI18N
        BnVolverOpiniones.setBorder(null);
        BnVolverOpiniones.setBorderPainted(false);
        BnVolverOpiniones.setContentAreaFilled(false);
        BnVolverOpiniones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BnVolverOpiniones.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BótonVolver2 .png"))); // NOI18N
        BnVolverOpiniones.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BótonVolver2 .png"))); // NOI18N
        BnVolverOpiniones.setSelected(true);
        BnVolverOpiniones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnVolverOpinionesActionPerformed(evt);
            }
        });
        PanelAgendarCita.add(BnVolverOpiniones, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 210, 70));

        LbSubtituloAgendarCita.setForeground(new java.awt.Color(6, 52, 86));
        LbSubtituloAgendarCita.setText("Citas agendadas");
        LbSubtituloAgendarCita.setFont(new java.awt.Font("Sitka Banner", 1, 32)); // NOI18N
        LbSubtituloAgendarCita.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DATE_RANGE);
        PanelAgendarCita.add(LbSubtituloAgendarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 290, -1));

        LbCitasAgendadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbCitasAgendadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario.png"))); // NOI18N
        LbCitasAgendadas.setToolTipText("CITAS AGENDADAS");
        LbCitasAgendadas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbCitasAgendadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbCitasAgendadasMouseClicked(evt);
            }
        });
        PanelAgendarCita.add(LbCitasAgendadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 40, 40));

        LbEditarPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbEditarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar-pequeño.png"))); // NOI18N
        LbEditarPerfil.setToolTipText("EDITAR PERFIL");
        LbEditarPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbEditarPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbEditarPerfilMouseClicked(evt);
            }
        });
        PanelAgendarCita.add(LbEditarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 40, 40));

        LbCerrarSesión.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbCerrarSesión.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion-pequeño.png"))); // NOI18N
        LbCerrarSesión.setToolTipText("CERRAR SESIÓN");
        LbCerrarSesión.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbCerrarSesión.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbCerrarSesiónMouseClicked(evt);
            }
        });
        PanelAgendarCita.add(LbCerrarSesión, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 40, 40));

        TablaCitasAgendadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Disponibilidad", "Hora", "Tipo Problema", "Situacion"
            }
        ));
        TablaCitasAgendadas.setBackgoundHead(new java.awt.Color(255, 255, 255));
        TablaCitasAgendadas.setBackgoundHover(new java.awt.Color(255, 255, 255));
        TablaCitasAgendadas.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        TablaCitasAgendadas.setColorSecondary(new java.awt.Color(218, 218, 218));
        TablaCitasAgendadas.setForegroundHead(new java.awt.Color(0, 0, 0));
        TablaCitasAgendadas.setForegroundHover(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(TablaCitasAgendadas);
        if (TablaCitasAgendadas.getColumnModel().getColumnCount() > 0) {
            TablaCitasAgendadas.getColumnModel().getColumn(0).setResizable(false);
            TablaCitasAgendadas.getColumnModel().getColumn(1).setResizable(false);
            TablaCitasAgendadas.getColumnModel().getColumn(2).setResizable(false);
            TablaCitasAgendadas.getColumnModel().getColumn(3).setResizable(false);
            TablaCitasAgendadas.getColumnModel().getColumn(4).setResizable(false);
            TablaCitasAgendadas.getColumnModel().getColumn(5).setResizable(false);
        }

        PanelAgendarCita.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 840, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LbCitasAgendadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbCitasAgendadasMouseClicked

        HH_TablaCitasPaciente citasAgendadas = new HH_TablaCitasPaciente();
        citasAgendadas.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_LbCitasAgendadasMouseClicked

    private void LbEditarPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbEditarPerfilMouseClicked

        HH_Cambios editarperfilpaciente = new HH_Cambios();
        editarperfilpaciente.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_LbEditarPerfilMouseClicked

    private void LbCerrarSesiónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbCerrarSesiónMouseClicked

        MenuEntrada menu = new MenuEntrada();
        menu.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_LbCerrarSesiónMouseClicked

    private void BnVolverOpinionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnVolverOpinionesActionPerformed
        
        HhAgendarCita agendar = new HhAgendarCita();
        agendar.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BnVolverOpinionesActionPerformed

    private void LbLogoAppHealtHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbLogoAppHealtHelpMouseClicked
    
        HhAgendarCita principal = new HhAgendarCita();
        principal.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_LbLogoAppHealtHelpMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HH_TablaCitasPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HH_TablaCitasPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HH_TablaCitasPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HH_TablaCitasPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HH_TablaCitasPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BnVolverOpiniones;
    private javax.swing.JLabel LbCerrarSesión;
    private javax.swing.JLabel LbCitasAgendadas;
    private javax.swing.JLabel LbEditarPerfil;
    public static javax.swing.JLabel LbImagenUsuario;
    private javax.swing.JLabel LbLogoAppHealtHelp;
    public static javax.swing.JLabel LbNombrePacienteInterfaz;
    private javax.swing.JLabel LbSloganHealtHelp;
    private RSMaterialComponent.RSLabelTextIcon LbSubtituloAgendarCita;
    private javax.swing.JLabel LbTituloHealtHelp;
    private org.edisoncor.gui.panel.Panel PanelAgendarCita;
    public static RSMaterialComponent.RSTableMetroCustom TablaCitasAgendadas;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}