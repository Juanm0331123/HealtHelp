/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author user 123
 */
public class HH_MensajeErrorOpiniones extends javax.swing.JDialog {

    /**
     * Creates new form HH_FechaCita
     */
    public HH_MensajeErrorOpiniones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCTextField1 = new app.bolivia.swing.JCTextField();
        PanelFechaCita = new org.edisoncor.gui.panel.Panel();
        jLabel12 = new javax.swing.JLabel();
        LbNombreUsuarioFechaCita = new javax.swing.JLabel();
        BnFechaCita = new rojerusan.RSMaterialButtonRectangle();
        LbTituloFechaCita = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Lb2 = new javax.swing.JLabel();
        Lb1 = new javax.swing.JLabel();

        jCTextField1.setText("jCTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        PanelFechaCita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 79, 95), 5));
        PanelFechaCita.setForeground(new java.awt.Color(1, 122, 91));
        PanelFechaCita.setColorPrimario(new java.awt.Color(255, 255, 255));
        PanelFechaCita.setColorSecundario(new java.awt.Color(255, 255, 255));
        PanelFechaCita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Foto usuario.png"))); // NOI18N
        PanelFechaCita.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 40, 40));

        LbNombreUsuarioFechaCita.setFont(new java.awt.Font("Segoe Script", 3, 16)); // NOI18N
        LbNombreUsuarioFechaCita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbNombreUsuarioFechaCita.setText("Sr. Rosendo Bucurú");
        PanelFechaCita.add(LbNombreUsuarioFechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 380, -1));

        BnFechaCita.setBackground(new java.awt.Color(224, 79, 95));
        BnFechaCita.setText("OK");
        BnFechaCita.setFocusable(false);
        BnFechaCita.setFont(new java.awt.Font("Roboto Medium", 1, 32)); // NOI18N
        BnFechaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnFechaCitaActionPerformed(evt);
            }
        });
        PanelFechaCita.add(BnFechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 80, 70));

        LbTituloFechaCita.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        LbTituloFechaCita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbTituloFechaCita.setText("ERROR");
        LbTituloFechaCita.setToolTipText("");
        PanelFechaCita.add(LbTituloFechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 380, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Error (1).png"))); // NOI18N
        PanelFechaCita.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 140, 130));

        Lb2.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        Lb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lb2.setText("Verifique sus datos y vuelva a intentarlo.");
        PanelFechaCita.add(Lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 340, 20));

        Lb1.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        Lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lb1.setText("Ha ocurrido un error al insertar la opinión.");
        PanelFechaCita.add(Lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 340, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 377, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BnFechaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnFechaCitaActionPerformed
        this.dispose();
    }//GEN-LAST:event_BnFechaCitaActionPerformed

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
            java.util.logging.Logger.getLogger(HH_MensajeErrorOpiniones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HH_MensajeErrorOpiniones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HH_MensajeErrorOpiniones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HH_MensajeErrorOpiniones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HH_MensajeErrorOpiniones dialog = new HH_MensajeErrorOpiniones(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle BnFechaCita;
    private javax.swing.JLabel Lb1;
    private javax.swing.JLabel Lb2;
    private javax.swing.JLabel LbNombreUsuarioFechaCita;
    private javax.swing.JLabel LbTituloFechaCita;
    private org.edisoncor.gui.panel.Panel PanelFechaCita;
    private app.bolivia.swing.JCTextField jCTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    // End of variables declaration//GEN-END:variables
}
