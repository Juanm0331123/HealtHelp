/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.SqlRegistroMedico;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import rojerusan.RSNotifyShadowAnimated;

/**
 *
 * @author Juan Mguel
 */
public class RegistroHH_Medico extends javax.swing.JFrame {

    public static FileInputStream imagen;
    public int longitudBytes;
    public static String tipo_documento;

    /**
     * Creates new form RegistroHH_Medico
     */
    public RegistroHH_Medico() {
        initComponents();
        this.setLocationRelativeTo(null);
        LbImagenCargar.setVisible(false);
    }

    private void limpiarCampos() {

        this.CbxTipoDocumentoRegistro.setSelectedIndex(0);
        this.TxNumeroDocumentoRegistro.setText("");
        this.RSCalendarFechaNacimientoRegistro.setDatoFecha(null);
        this.TxEpsDondeTrabaja.setText("");
        this.TxCelularRegistro.setText("");
        this.TxEspecialidad.setText("");
        this.TxNombreRegistro.setText("");
        this.TxApellidoRegistro.setText("");
        this.TxCorreoElectronicoRegistro.setText("");
        this.TxContraseñaRegistro.setText("");
        this.LbImagenCargar.setIcon(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRegistro = new org.edisoncor.gui.panel.Panel();
        jSeparator1 = new javax.swing.JSeparator();
        LbTituloRegistro = new javax.swing.JLabel();
        RSCalendarFechaNacimientoRegistro = new rojeru_san.componentes.RSDateChooser();
        BnRegistrarseRegistro = new rojerusan.RSMaterialButtonRectangle();
        TxNumeroDocumentoRegistro = new RSMaterialComponent.RSTextFieldIconOne();
        CbxTipoDocumentoRegistro = new RSMaterialComponent.RSComboBox();
        TxEpsDondeTrabaja = new RSMaterialComponent.RSTextFieldIconOne();
        TxNombreRegistro = new RSMaterialComponent.RSTextFieldIconOne();
        TxContraseñaRegistro = new RSMaterialComponent.RSPasswordIconOne();
        TxCorreoElectronicoRegistro = new RSMaterialComponent.RSTextFieldIconOne();
        BnSalir = new rojerusan.RSMaterialButtonRectangle();
        TxEspecialidad = new RSMaterialComponent.RSTextFieldIconOne();
        TxCelularRegistro = new RSMaterialComponent.RSTextFieldIconOne();
        panel1 = new org.edisoncor.gui.panel.Panel();
        BnCargarImagenPerfilPaciente = new rojerusan.RSMaterialButtonRectangle();
        LbProfesionalSaludAgendarCita1 = new javax.swing.JLabel();
        LbImagenCargar = new javax.swing.JLabel();
        TxApellidoRegistro = new RSMaterialComponent.RSTextFieldIconOne();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        PanelRegistro.setColorPrimario(new java.awt.Color(0, 102, 153));
        PanelRegistro.setColorSecundario(new java.awt.Color(0, 153, 102));
        PanelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelRegistro.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 190, -1, -1));

        LbTituloRegistro.setFont(new java.awt.Font("Century Gothic", 3, 56)); // NOI18N
        LbTituloRegistro.setForeground(new java.awt.Color(255, 255, 255));
        LbTituloRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbTituloRegistro.setText("REGISTRO");
        PanelRegistro.add(LbTituloRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 320, -1));

        RSCalendarFechaNacimientoRegistro.setColorForeground(new java.awt.Color(0, 0, 0));
        RSCalendarFechaNacimientoRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RSCalendarFechaNacimientoRegistro.setPlaceholder("Fecha de nacimiento.");
        PanelRegistro.add(RSCalendarFechaNacimientoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 350, -1));

        BnRegistrarseRegistro.setBackground(new java.awt.Color(255, 255, 255));
        BnRegistrarseRegistro.setForeground(new java.awt.Color(0, 0, 0));
        BnRegistrarseRegistro.setText("REGISTRARSE");
        BnRegistrarseRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnRegistrarseRegistroActionPerformed(evt);
            }
        });
        PanelRegistro.add(BnRegistrarseRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 130, 50));

        TxNumeroDocumentoRegistro.setForeground(new java.awt.Color(0, 0, 0));
        TxNumeroDocumentoRegistro.setBorderColor(new java.awt.Color(255, 255, 255));
        TxNumeroDocumentoRegistro.setColorIcon(new java.awt.Color(0, 0, 0));
        TxNumeroDocumentoRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxNumeroDocumentoRegistro.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DESCRIPTION);
        TxNumeroDocumentoRegistro.setPlaceholder("Número de documento.");
        TxNumeroDocumentoRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxNumeroDocumentoRegistroKeyTyped(evt);
            }
        });
        PanelRegistro.add(TxNumeroDocumentoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 350, 40));

        CbxTipoDocumentoRegistro.setForeground(new java.awt.Color(0, 0, 0));
        CbxTipoDocumentoRegistro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "\t                                Tipo de documento.    ", "                                            Cédula", "                                               NIT", "                                         Pasaporte" }));
        CbxTipoDocumentoRegistro.setColorArrow(new java.awt.Color(0, 0, 0));
        CbxTipoDocumentoRegistro.setColorBoton(new java.awt.Color(255, 255, 255));
        CbxTipoDocumentoRegistro.setColorFondo(new java.awt.Color(255, 255, 255));
        CbxTipoDocumentoRegistro.setColorSeleccion(new java.awt.Color(0, 102, 204));
        PanelRegistro.add(CbxTipoDocumentoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 350, 40));

        TxEpsDondeTrabaja.setForeground(new java.awt.Color(0, 0, 0));
        TxEpsDondeTrabaja.setBorderColor(new java.awt.Color(255, 255, 255));
        TxEpsDondeTrabaja.setColorIcon(new java.awt.Color(0, 0, 0));
        TxEpsDondeTrabaja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxEpsDondeTrabaja.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DOMAIN);
        TxEpsDondeTrabaja.setPlaceholder("Eps donde trabaja.");
        PanelRegistro.add(TxEpsDondeTrabaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 350, 40));

        TxNombreRegistro.setForeground(new java.awt.Color(0, 0, 0));
        TxNombreRegistro.setBorderColor(new java.awt.Color(255, 255, 255));
        TxNombreRegistro.setColorIcon(new java.awt.Color(0, 0, 0));
        TxNombreRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxNombreRegistro.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ACCOUNT_CIRCLE);
        TxNombreRegistro.setPlaceholder("Nombre.");
        TxNombreRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxNombreRegistroKeyTyped(evt);
            }
        });
        PanelRegistro.add(TxNombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 350, 40));

        TxContraseñaRegistro.setForeground(new java.awt.Color(0, 0, 0));
        TxContraseñaRegistro.setBorderColor(new java.awt.Color(255, 255, 255));
        TxContraseñaRegistro.setColorIcon(new java.awt.Color(0, 0, 0));
        TxContraseñaRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxContraseñaRegistro.setPlaceholder("Contraseña.");
        PanelRegistro.add(TxContraseñaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 350, 40));

        TxCorreoElectronicoRegistro.setForeground(new java.awt.Color(0, 0, 0));
        TxCorreoElectronicoRegistro.setBorderColor(new java.awt.Color(255, 255, 255));
        TxCorreoElectronicoRegistro.setColorIcon(new java.awt.Color(0, 0, 0));
        TxCorreoElectronicoRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxCorreoElectronicoRegistro.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EMAIL);
        TxCorreoElectronicoRegistro.setPlaceholder("Correo electrónico.");
        TxCorreoElectronicoRegistro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxCorreoElectronicoRegistroFocusLost(evt);
            }
        });
        PanelRegistro.add(TxCorreoElectronicoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 350, 40));

        BnSalir.setBackground(new java.awt.Color(255, 255, 255));
        BnSalir.setForeground(new java.awt.Color(0, 0, 0));
        BnSalir.setText("Salir");
        BnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnSalirActionPerformed(evt);
            }
        });
        PanelRegistro.add(BnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 650, 120, 50));

        TxEspecialidad.setForeground(new java.awt.Color(0, 0, 0));
        TxEspecialidad.setBorderColor(new java.awt.Color(255, 255, 255));
        TxEspecialidad.setColorIcon(new java.awt.Color(0, 0, 0));
        TxEspecialidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxEspecialidad.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MODE_EDIT);
        TxEspecialidad.setPlaceholder("Especialidad.");
        PanelRegistro.add(TxEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 350, 40));

        TxCelularRegistro.setForeground(new java.awt.Color(0, 0, 0));
        TxCelularRegistro.setBorderColor(new java.awt.Color(255, 255, 255));
        TxCelularRegistro.setColorIcon(new java.awt.Color(0, 0, 0));
        TxCelularRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxCelularRegistro.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PHONE_ANDROID);
        TxCelularRegistro.setPlaceholder("Número de celular.");
        TxCelularRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxCelularRegistroKeyTyped(evt);
            }
        });
        PanelRegistro.add(TxCelularRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 350, 40));

        panel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(255, 255, 255));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BnCargarImagenPerfilPaciente.setBackground(new java.awt.Color(255, 255, 255));
        BnCargarImagenPerfilPaciente.setForeground(new java.awt.Color(0, 0, 0));
        BnCargarImagenPerfilPaciente.setText("EXAMINAR");
        BnCargarImagenPerfilPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnCargarImagenPerfilPacienteActionPerformed(evt);
            }
        });
        panel1.add(BnCargarImagenPerfilPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 100, 40));

        LbProfesionalSaludAgendarCita1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LbProfesionalSaludAgendarCita1.setForeground(new java.awt.Color(178, 181, 244));
        LbProfesionalSaludAgendarCita1.setText("Cargar imagen perfil");
        panel1.add(LbProfesionalSaludAgendarCita1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 180, -1));

        LbImagenCargar.setFont(new java.awt.Font("Algerian", 2, 16)); // NOI18N
        LbImagenCargar.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(LbImagenCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -150, 210, 210));

        PanelRegistro.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 350, 40));

        TxApellidoRegistro.setForeground(new java.awt.Color(0, 0, 0));
        TxApellidoRegistro.setBorderColor(new java.awt.Color(255, 255, 255));
        TxApellidoRegistro.setColorIcon(new java.awt.Color(0, 0, 0));
        TxApellidoRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxApellidoRegistro.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ACCOUNT_CIRCLE);
        TxApellidoRegistro.setPlaceholder("Apellido.");
        TxApellidoRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxApellidoRegistroKeyTyped(evt);
            }
        });
        PanelRegistro.add(TxApellidoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 350, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BnRegistrarseRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnRegistrarseRegistroActionPerformed

        Date fecha = RSCalendarFechaNacimientoRegistro.getDatoFecha();

        if (CbxTipoDocumentoRegistro.getSelectedIndex() == 0) {
            HH_MensajeError error = new HH_MensajeError(this, true);
            HH_MensajeError.Lb1.setText("Debes seleccionar un tipo de documento.");
            HH_MensajeError.Lb2.setText("Vuelve a intentarlo nuevamente.");
            error.setVisible(true);
        } ///////////////////////////////////////////////////////////////////////////////////
        else if (TxNumeroDocumentoRegistro.getText().isEmpty()) {
            HH_MensajeError error = new HH_MensajeError(this, true);
            HH_MensajeError.Lb1.setText("Debes digitar un número de documento.");
            HH_MensajeError.Lb2.setText("Vuelve a intentarlo nuevamente.");
            error.setVisible(true);
        } ///////////////////////////////////////////////////////////////////////////////
        else if (fecha == null) {
            HH_MensajeError error = new HH_MensajeError(this, true);
            HH_MensajeError.Lb1.setText("Debes digitar tu fecha de nacimiento.");
            HH_MensajeError.Lb2.setText("Vuelve a intentarlo nuevamente.");
            error.setVisible(true);
        } ///////////////////////////////////////////////////////////////////////////////
        else if (TxEpsDondeTrabaja.getText().isEmpty()) {
            HH_MensajeError error = new HH_MensajeError(this, true);
            HH_MensajeError.Lb1.setText("Debes digitar la eps en la que trabajas.");
            HH_MensajeError.Lb2.setText("Vuelve a intentarlo nuevamente.");
            error.setVisible(true);
        } ///////////////////////////////////////////////////////////////////////////////
        else if (TxCelularRegistro.getText().isEmpty()) {
            HH_MensajeError error = new HH_MensajeError(this, true);
            HH_MensajeError.Lb1.setText("Debes digitar tu número de celular.");
            HH_MensajeError.Lb2.setText("Vuelve a intentarlo nuevamente.");
            error.setVisible(true);
        } /////////////////////////////////////////////////////////////////////////////
        else if (TxEspecialidad.getText().isEmpty()) {
            HH_MensajeError error = new HH_MensajeError(this, true);
            HH_MensajeError.Lb1.setText("Debes digitar tu especialidad obligatoriamente.");
            HH_MensajeError.Lb2.setText("Vuelve a intentarlo nuevamente.");
            error.setVisible(true);
        } /////////////////////////////////////////////////////////////////////////////
        else if (TxNombreRegistro.getText().isEmpty()) {
            HH_MensajeError error = new HH_MensajeError(this, true);
            HH_MensajeError.Lb1.setText("Debes digitar tu nombre obligatoriamente.");
            HH_MensajeError.Lb2.setText("Vuelve a intentarlo nuevamente.");
            error.setVisible(true);
        } /////////////////////////////////////////////////////////////////////////////
        else if (TxApellidoRegistro.getText().isEmpty()) {
            HH_MensajeError error = new HH_MensajeError(this, true);
            HH_MensajeError.Lb1.setText("Debes digitar tu apellido obligatoriamente.");
            HH_MensajeError.Lb2.setText("Vuelve a intentarlo nuevamente.");
            error.setVisible(true);
        } /////////////////////////////////////////////////////////////////////////////
        else if (TxCorreoElectronicoRegistro.getText().isEmpty()) {
            HH_MensajeError error = new HH_MensajeError(this, true);
            HH_MensajeError.Lb1.setText("No puedes dejar el campo correo vacio.");
            HH_MensajeError.Lb2.setText("Vuelve a intentarlo nuevamente.");
            error.setVisible(true);
        } /////////////////////////////////////////////////////////////////////////////
        else if (TxContraseñaRegistro.getText().isEmpty()) {
            HH_MensajeError error = new HH_MensajeError(this, true);
            HH_MensajeError.Lb1.setText("No puedes dejar el campo contraseña vacio.");
            HH_MensajeError.Lb2.setText("Vuelve a intentarlo nuevamente.");
            error.setVisible(true);
        } /////////////////////////////////////////////////////////////////////////////
        else if (LbImagenCargar.getIcon() == null) {
            HH_MensajeError error = new HH_MensajeError(this, true);
            HH_MensajeError.Lb1.setText("Debes cargar una imagen de perfil.");
            HH_MensajeError.Lb2.setText("Vuelve a intentarlo nuevamente.");
            error.setVisible(true);
        } /////////////////////////////////////////////////////////////////////////////        
        else {

            tipo_documento = CbxTipoDocumentoRegistro.getSelectedItem().toString().trim();
            int opcion = SqlRegistroMedico.guardar();
            if (opcion > 0) {
                HH_MensajeSuccessful error = new HH_MensajeSuccessful(this, true);
                HH_MensajeSuccessful.L1.setText("El registro se ha realizado con exito.");
                HH_MensajeSuccessful.L2.setText("Puedes iniciar sesión con tus datos.");
                error.setVisible(true);
                limpiarCampos();
            } else {
                HH_MensajeError error = new HH_MensajeError(this, true);
                HH_MensajeError.Lb1.setText("Ha ocurrido un error al realizar el registro.");
                HH_MensajeError.Lb2.setText("Vuelve a intentarlo nuevamente.");
                error.setVisible(true);
                limpiarCampos();
            }
            this.limpiarCampos();

        }
    }//GEN-LAST:event_BnRegistrarseRegistroActionPerformed

    private void BnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnSalirActionPerformed

        MenuEntrada menuentrada = new MenuEntrada();
        menuentrada.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BnSalirActionPerformed

    private void BnCargarImagenPerfilPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnCargarImagenPerfilPacienteActionPerformed

        JFileChooser se = new JFileChooser();
        FileNameExtensionFilter extension = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        se.setFileFilter(extension);
        int estado = se.showOpenDialog(this);
        System.out.print(estado);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {

                imagen = new FileInputStream(se.getSelectedFile());
                longitudBytes = (int) se.getSelectedFile().length();

                Image icono = ImageIO.read(se.getSelectedFile()).getScaledInstance(LbImagenCargar.getWidth(), LbImagenCargar.getHeight(), Image.SCALE_DEFAULT);
                LbImagenCargar.setIcon(new ImageIcon(icono));
                LbImagenCargar.updateUI();

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_BnCargarImagenPerfilPacienteActionPerformed

    private void TxNumeroDocumentoRegistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxNumeroDocumentoRegistroKeyTyped

        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

    }//GEN-LAST:event_TxNumeroDocumentoRegistroKeyTyped

    private void TxCelularRegistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxCelularRegistroKeyTyped

        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

    }//GEN-LAST:event_TxCelularRegistroKeyTyped

    private void TxNombreRegistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxNombreRegistroKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z' && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }

    }//GEN-LAST:event_TxNombreRegistroKeyTyped

    private void TxApellidoRegistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxApellidoRegistroKeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z' && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }

    }//GEN-LAST:event_TxApellidoRegistroKeyTyped

    private void TxCorreoElectronicoRegistroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxCorreoElectronicoRegistroFocusLost

        if (!TxCorreoElectronicoRegistro.getText().contains("@") || !TxCorreoElectronicoRegistro.getText().contains(".")) {
            HH_MensajeError error = new HH_MensajeError(this, true);
            HH_MensajeError.Lb1.setText("Correo electronico.");
            HH_MensajeError.Lb2.setText("Vuelve a intentarlo nuevamente.");
            error.setVisible(true);
        }


    }//GEN-LAST:event_TxCorreoElectronicoRegistroFocusLost

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
            java.util.logging.Logger.getLogger(RegistroHH_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroHH_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroHH_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroHH_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroHH_Medico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle BnCargarImagenPerfilPaciente;
    private rojerusan.RSMaterialButtonRectangle BnRegistrarseRegistro;
    private rojerusan.RSMaterialButtonRectangle BnSalir;
    public static RSMaterialComponent.RSComboBox CbxTipoDocumentoRegistro;
    public static javax.swing.JLabel LbImagenCargar;
    private javax.swing.JLabel LbProfesionalSaludAgendarCita1;
    private javax.swing.JLabel LbTituloRegistro;
    private org.edisoncor.gui.panel.Panel PanelRegistro;
    private rojeru_san.componentes.RSDateChooser RSCalendarFechaNacimientoRegistro;
    public static RSMaterialComponent.RSTextFieldIconOne TxApellidoRegistro;
    public static RSMaterialComponent.RSTextFieldIconOne TxCelularRegistro;
    public static RSMaterialComponent.RSPasswordIconOne TxContraseñaRegistro;
    public static RSMaterialComponent.RSTextFieldIconOne TxCorreoElectronicoRegistro;
    public static RSMaterialComponent.RSTextFieldIconOne TxEpsDondeTrabaja;
    public static RSMaterialComponent.RSTextFieldIconOne TxEspecialidad;
    public static RSMaterialComponent.RSTextFieldIconOne TxNombreRegistro;
    public static RSMaterialComponent.RSTextFieldIconOne TxNumeroDocumentoRegistro;
    private javax.swing.JSeparator jSeparator1;
    private org.edisoncor.gui.panel.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
