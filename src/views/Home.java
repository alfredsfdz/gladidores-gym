package views;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Alfred-PC
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Home() {
        initComponents();
        setTitle("Home");
        setDefaultCloseOperation(Home.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneBgHome = new javax.swing.JPanel();
        paneBotones = new javax.swing.JPanel();
        miAgMiembro = new javax.swing.JButton();
        miMiembros = new javax.swing.JButton();
        miRegistro = new javax.swing.JButton();
        miMembresias = new javax.swing.JButton();
        miReportes = new javax.swing.JButton();
        btnAgMiembro = new javax.swing.JButton();
        lblAgMiembro = new javax.swing.JLabel();
        btnMiembros = new javax.swing.JButton();
        lblMiembros = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        lblRegistro = new javax.swing.JLabel();
        btnMembresias = new javax.swing.JButton();
        lblMembresias = new javax.swing.JLabel();
        btnReportes = new javax.swing.JButton();
        lblReportes = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        lblUsuarios = new javax.swing.JLabel();
        btnInformacion = new javax.swing.JButton();
        lblInformacion = new javax.swing.JLabel();
        lblScratchHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        paneBgHome.setBackground(new java.awt.Color(29, 29, 29));
        paneBgHome.setLayout(null);

        paneBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        miAgMiembro.setBackground(new java.awt.Color(0, 0, 0));
        miAgMiembro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        miAgMiembro.setForeground(new java.awt.Color(255, 255, 255));
        miAgMiembro.setText("Agregar miembro");
        miAgMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAgMiembroActionPerformed(evt);
            }
        });
        paneBotones.add(miAgMiembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 256, 30));

        miMiembros.setBackground(new java.awt.Color(0, 0, 0));
        miMiembros.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        miMiembros.setForeground(new java.awt.Color(255, 255, 255));
        miMiembros.setText("Miembros");
        miMiembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMiembrosActionPerformed(evt);
            }
        });
        paneBotones.add(miMiembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 0, 256, 30));

        miRegistro.setBackground(new java.awt.Color(0, 0, 0));
        miRegistro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        miRegistro.setForeground(new java.awt.Color(255, 255, 255));
        miRegistro.setText("Registro");
        miRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegistroActionPerformed(evt);
            }
        });
        paneBotones.add(miRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 0, 256, 30));

        miMembresias.setBackground(new java.awt.Color(0, 0, 0));
        miMembresias.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        miMembresias.setForeground(new java.awt.Color(255, 255, 255));
        miMembresias.setText("Membresías");
        miMembresias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMembresiasActionPerformed(evt);
            }
        });
        paneBotones.add(miMembresias, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 0, 256, 30));

        miReportes.setBackground(new java.awt.Color(0, 0, 0));
        miReportes.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        miReportes.setForeground(new java.awt.Color(255, 255, 255));
        miReportes.setText("Reportes");
        miReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReportesActionPerformed(evt);
            }
        });
        paneBotones.add(miReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1024, 0, 256, 30));

        paneBgHome.add(paneBotones);
        paneBotones.setBounds(0, 0, 1280, 30);

        btnAgMiembro.setBackground(new java.awt.Color(0, 0, 0));
        btnAgMiembro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add_icon.png"))); // NOI18N
        btnAgMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgMiembroActionPerformed(evt);
            }
        });
        paneBgHome.add(btnAgMiembro);
        btnAgMiembro.setBounds(120, 143, 260, 180);

        lblAgMiembro.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        lblAgMiembro.setForeground(new java.awt.Color(255, 255, 255));
        lblAgMiembro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgMiembro.setText("Agregar miembro");
        paneBgHome.add(lblAgMiembro);
        lblAgMiembro.setBounds(120, 329, 260, 24);

        btnMiembros.setBackground(new java.awt.Color(0, 0, 0));
        btnMiembros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/miembros_icon.png"))); // NOI18N
        btnMiembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiembrosActionPerformed(evt);
            }
        });
        paneBgHome.add(btnMiembros);
        btnMiembros.setBounds(510, 143, 260, 180);

        lblMiembros.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        lblMiembros.setForeground(new java.awt.Color(255, 255, 255));
        lblMiembros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMiembros.setText("Miembros");
        paneBgHome.add(lblMiembros);
        lblMiembros.setBounds(510, 329, 260, 24);

        btnRegistro.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/qr_icon.png"))); // NOI18N
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        paneBgHome.add(btnRegistro);
        btnRegistro.setBounds(900, 143, 260, 180);

        lblRegistro.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistro.setText("Registro");
        paneBgHome.add(lblRegistro);
        lblRegistro.setBounds(900, 329, 260, 24);

        btnMembresias.setBackground(new java.awt.Color(0, 0, 0));
        btnMembresias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/memb_icon.png"))); // NOI18N
        btnMembresias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMembresiasActionPerformed(evt);
            }
        });
        paneBgHome.add(btnMembresias);
        btnMembresias.setBounds(315, 396, 260, 180);

        lblMembresias.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        lblMembresias.setForeground(new java.awt.Color(255, 255, 255));
        lblMembresias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMembresias.setText("Membresías");
        paneBgHome.add(lblMembresias);
        lblMembresias.setBounds(315, 582, 260, 24);

        btnReportes.setBackground(new java.awt.Color(0, 0, 0));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/reporte_icon.png"))); // NOI18N
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        paneBgHome.add(btnReportes);
        btnReportes.setBounds(705, 396, 260, 180);

        lblReportes.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        lblReportes.setForeground(new java.awt.Color(255, 255, 255));
        lblReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReportes.setText("Reportes");
        paneBgHome.add(lblReportes);
        lblReportes.setBounds(705, 582, 260, 24);

        btnUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        btnUsuarios.setFont(new java.awt.Font("Roboto Black", 1, 70)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user_icon.png"))); // NOI18N
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        paneBgHome.add(btnUsuarios);
        btnUsuarios.setBounds(30, 560, 100, 100);

        lblUsuarios.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        lblUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarios.setText("Usuarios");
        paneBgHome.add(lblUsuarios);
        lblUsuarios.setBounds(30, 670, 100, 19);

        btnInformacion.setBackground(new java.awt.Color(0, 0, 0));
        btnInformacion.setFont(new java.awt.Font("Roboto Black", 1, 70)); // NOI18N
        btnInformacion.setForeground(new java.awt.Color(255, 255, 255));
        btnInformacion.setText("?");
        paneBgHome.add(btnInformacion);
        btnInformacion.setBounds(1150, 560, 100, 100);

        lblInformacion.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        lblInformacion.setForeground(new java.awt.Color(255, 255, 255));
        lblInformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInformacion.setText("Información");
        paneBgHome.add(lblInformacion);
        lblInformacion.setBounds(1150, 670, 100, 19);

        lblScratchHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/scratchtwo.png"))); // NOI18N
        paneBgHome.add(lblScratchHome);
        lblScratchHome.setBounds(0, 30, 1280, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneBgHome, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneBgHome, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        confirmarCierreVentana();
    }//GEN-LAST:event_formWindowClosing

    private void miAgMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgMiembroActionPerformed
        this.setVisible(true);
        Agregar ventanaAgregar = new Agregar();
        ventanaAgregar.setVisible(true);
    }//GEN-LAST:event_miAgMiembroActionPerformed

    private void miMiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMiembrosActionPerformed
        this.setVisible(true);
        Miembros ventanaMiembros = new Miembros();
        ventanaMiembros.setVisible(true);
    }//GEN-LAST:event_miMiembrosActionPerformed

    private void miRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegistroActionPerformed
        this.setVisible(true);
        Registro ventanaRegistro = new Registro();
        ventanaRegistro.setVisible(true);
    }//GEN-LAST:event_miRegistroActionPerformed

    private void miMembresiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMembresiasActionPerformed
        this.setVisible(true);
        Membresias ventanaMembresias = new Membresias();
        ventanaMembresias.setVisible(true);
    }//GEN-LAST:event_miMembresiasActionPerformed

    private void miReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReportesActionPerformed
        this.setVisible(true);
        Reportes ventanaReportes = new Reportes();
        ventanaReportes.setVisible(true);
    }//GEN-LAST:event_miReportesActionPerformed

    private void btnAgMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgMiembroActionPerformed
        this.setVisible(true);
        Agregar ventanaAgregar = new Agregar();
        ventanaAgregar.setVisible(true);
    }//GEN-LAST:event_btnAgMiembroActionPerformed

    private void btnMiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiembrosActionPerformed
        this.setVisible(true);
        Miembros ventanaMiembros = new Miembros();
        ventanaMiembros.setVisible(true);
    }//GEN-LAST:event_btnMiembrosActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        this.setVisible(true);
        Registro ventanaRegistro = new Registro();
        ventanaRegistro.setVisible(true);
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnMembresiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembresiasActionPerformed
        this.setVisible(true);
        Membresias ventanaMembresias = new Membresias();
        ventanaMembresias.setVisible(true);
    }//GEN-LAST:event_btnMembresiasActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        this.setVisible(true);
        Reportes ventanaReportes = new Reportes();
        ventanaReportes.setVisible(true);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        this.setVisible(true);
        Usuarios ventanaUsuarios = new Usuarios();
        ventanaUsuarios.setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    private void confirmarCierreVentana() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        int opcion = JOptionPane.showConfirmDialog(
                this,
                "¿Realmente desea cerrar la ventana?",
                "Confirmar cierre",
                JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            dispose();
        } else {
            setDefaultCloseOperation(Home.DO_NOTHING_ON_CLOSE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgMiembro;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnMembresias;
    private javax.swing.JButton btnMiembros;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel lblAgMiembro;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblMembresias;
    private javax.swing.JLabel lblMiembros;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblScratchHome;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JButton miAgMiembro;
    private javax.swing.JButton miMembresias;
    private javax.swing.JButton miMiembros;
    private javax.swing.JButton miRegistro;
    private javax.swing.JButton miReportes;
    private javax.swing.JPanel paneBgHome;
    private javax.swing.JPanel paneBotones;
    // End of variables declaration//GEN-END:variables
}
