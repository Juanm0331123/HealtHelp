/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.SqlRegistroPaciente;
import Clases.temporal;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
/**
 *
 * @author Hogar-PC
 */
public class Iniciar_Sesion_HH extends javax.swing.JFrame {

    /**
     * Creates new form Iniciar_Sesion_HH
     */
    public Iniciar_Sesion_HH() {
        initComponents();
        this.setLocationRelativeTo(null);
        //Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,27,27);
        //AWTUtilities.setWindowShape(this, forma);
    }
    
    private void limpiarCampos(){
        
        this.TxNumeroIdentificacion.setText("");
        this.TxContraseña.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        LbTituloIniciarSesion = new javax.swing.JLabel();
        SeparadorIniciarSesion = new javax.swing.JSeparator();
        LbCorreoElectronico = new javax.swing.JLabel();
        LbContraseña = new javax.swing.JLabel();
        LbOlvidasteContraseña = new javax.swing.JLabel();
        BnIngresar = new rojerusan.RSMaterialButtonRectangle();
        BnSalir = new rojerusan.RSMaterialButtonRectangle();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        TxNumeroIdentificacion = new RSMaterialComponent.RSTextFieldOne();
        TxContraseña = new RSMaterialComponent.RSPasswordOne();
        LbLogo = new javax.swing.JLabel();
        LbTituloHealtHelp = new javax.swing.JLabel();
        LbSloganHealtHelp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        panel1.setColorPrimario(new java.awt.Color(0, 102, 153));
        panel1.setColorSecundario(new java.awt.Color(0, 153, 102));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 189, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LbTituloIniciarSesion.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        LbTituloIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        LbTituloIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbTituloIniciarSesion.setText("INICIAR SESIÓN");
        jPanel1.add(LbTituloIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 330, 43));
        jPanel1.add(SeparadorIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 329, 10));

        LbCorreoElectronico.setFont(new java.awt.Font("Century Gothic", 2, 16)); // NOI18N
        LbCorreoElectronico.setForeground(new java.awt.Color(255, 255, 255));
        LbCorreoElectronico.setText("Número identificación");
        jPanel1.add(LbCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 255, -1));

        LbContraseña.setFont(new java.awt.Font("Century Gothic", 2, 16)); // NOI18N
        LbContraseña.setForeground(new java.awt.Color(255, 255, 255));
        LbContraseña.setText("Contraseña");
        jPanel1.add(LbContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        LbOlvidasteContraseña.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        LbOlvidasteContraseña.setText("¿Olvidaste tu contraseña?");
        LbOlvidasteContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LbOlvidasteContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbOlvidasteContraseñaMouseClicked(evt);
            }
        });
        jPanel1.add(LbOlvidasteContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 233, -1));

        BnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        BnIngresar.setForeground(new java.awt.Color(0, 153, 153));
        BnIngresar.setText("Ingresar");
        BnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(BnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 120, 50));

        BnSalir.setBackground(new java.awt.Color(255, 255, 255));
        BnSalir.setForeground(new java.awt.Color(0, 153, 153));
        BnSalir.setText("Salir");
        BnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 120, 50));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 310, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 310, 10));

        TxNumeroIdentificacion.setBackground(new java.awt.Color(0, 153, 153));
        TxNumeroIdentificacion.setForeground(new java.awt.Color(255, 255, 255));
        TxNumeroIdentificacion.setBorderColor(new java.awt.Color(0, 153, 153));
        TxNumeroIdentificacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxNumeroIdentificacion.setPhColor(new java.awt.Color(255, 255, 255));
        TxNumeroIdentificacion.setPlaceholder("Número de identificación.");
        TxNumeroIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxNumeroIdentificacionActionPerformed(evt);
            }
        });
        TxNumeroIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxNumeroIdentificacionKeyTyped(evt);
            }
        });
        jPanel1.add(TxNumeroIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 310, 32));

        TxContraseña.setBackground(new java.awt.Color(0, 153, 153));
        TxContraseña.setForeground(new java.awt.Color(255, 255, 255));
        TxContraseña.setBorderColor(new java.awt.Color(0, 153, 153));
        TxContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxContraseña.setPhColor(new java.awt.Color(255, 255, 255));
        TxContraseña.setPlaceholder("Contraseña.");
        jPanel1.add(TxContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 310, 32));

        panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 400, 650));

        LbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoAppGRANDERecortado.png"))); // NOI18N
        panel1.add(LbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 280, 240));

        LbTituloHealtHelp.setFont(new java.awt.Font("Segoe UI", 1, 68)); // NOI18N
        LbTituloHealtHelp.setForeground(new java.awt.Color(255, 255, 255));
        LbTituloHealtHelp.setText("HEALTHELP");
        panel1.add(LbTituloHealtHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 380, 100));

        LbSloganHealtHelp.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        LbSloganHealtHelp.setForeground(new java.awt.Color(255, 255, 255));
        LbSloganHealtHelp.setText("Tu salud en nuestras manos ");
        panel1.add(LbSloganHealtHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, 15));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnSalirActionPerformed
    
        MenuEntrada menuentrada = new MenuEntrada();
        menuentrada.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BnSalirActionPerformed

    private void LbOlvidasteContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbOlvidasteContraseñaMouseClicked
     
        HhOlvidoContraseña hholvidocontraseña = new HhOlvidoContraseña();
        hholvidocontraseña.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_LbOlvidasteContraseñaMouseClicked

    private void BnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnIngresarActionPerformed
    
        String DocumentoIdentidad= TxNumeroIdentificacion.getText();
        String busqueda_Usuario = SqlRegistroPaciente.buscarUsuarioRegistrado(TxNumeroIdentificacion.getText(), TxContraseña.getText());

        if (busqueda_Usuario.equals("Usuario encontrado")) {
            temporal tm = new temporal();
            tm.setID(TxNumeroIdentificacion.getText());
            String busqueda_nombre = SqlRegistroPaciente.buscarNombreUsuario(TxContraseña.getText());
            HhAgendarCita agendarcita = new HhAgendarCita();
            tm.setNombre(busqueda_nombre);
            agendarcita.setVisible(true);
            this.dispose();
        } else {
            HH_ErrorContrasenia error = new HH_ErrorContrasenia();
            error.setVisible(true);
            this.dispose();
        }
        
        
    }//GEN-LAST:event_BnIngresarActionPerformed

    private void TxNumeroIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxNumeroIdentificacionKeyTyped

        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

    }//GEN-LAST:event_TxNumeroIdentificacionKeyTyped

    private void TxNumeroIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxNumeroIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxNumeroIdentificacionActionPerformed

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
            java.util.logging.Logger.getLogger(Iniciar_Sesion_HH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciar_Sesion_HH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciar_Sesion_HH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar_Sesion_HH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciar_Sesion_HH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle BnIngresar;
    public rojerusan.RSMaterialButtonRectangle BnSalir;
    private javax.swing.JLabel LbContraseña;
    private javax.swing.JLabel LbCorreoElectronico;
    private javax.swing.JLabel LbLogo;
    private javax.swing.JLabel LbOlvidasteContraseña;
    private javax.swing.JLabel LbSloganHealtHelp;
    private javax.swing.JLabel LbTituloHealtHelp;
    private javax.swing.JLabel LbTituloIniciarSesion;
    private javax.swing.JSeparator SeparadorIniciarSesion;
    public static RSMaterialComponent.RSPasswordOne TxContraseña;
    public static RSMaterialComponent.RSTextFieldOne TxNumeroIdentificacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private org.edisoncor.gui.panel.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
