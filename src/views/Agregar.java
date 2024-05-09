/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

/**
 *
 * @author Alfred-PC
 */
public class Agregar extends javax.swing.JFrame {

    /**
     * Creates new form Agregar
     */
    public Agregar() {
        initComponents();
        setTitle("Agregar miembro");
        setDefaultCloseOperation(Agregar.DISPOSE_ON_CLOSE);
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

        paneBgAgr = new javax.swing.JPanel();
        paneBotones = new javax.swing.JPanel();
        miAgMiembro = new javax.swing.JButton();
        miMiembros = new javax.swing.JButton();
        miRegistro = new javax.swing.JButton();
        miMembresias = new javax.swing.JButton();
        miReportes = new javax.swing.JButton();
        paneFoto = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblNac = new javax.swing.JLabel();
        dateNac = new com.toedter.calendar.JDateChooser();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnTomar = new javax.swing.JButton();
        btnElegir = new javax.swing.JButton();
        lblScratchAgr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneBgAgr.setBackground(new java.awt.Color(29, 29, 29));
        paneBgAgr.setLayout(null);

        paneBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        miAgMiembro.setBackground(new java.awt.Color(0, 0, 0));
        miAgMiembro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        miAgMiembro.setForeground(new java.awt.Color(255, 255, 255));
        miAgMiembro.setText("Agregar miembro");
        paneBotones.add(miAgMiembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 30));

        miMiembros.setBackground(new java.awt.Color(0, 0, 0));
        miMiembros.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        miMiembros.setForeground(new java.awt.Color(255, 255, 255));
        miMiembros.setText("Miembros");
        miMiembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMiembrosActionPerformed(evt);
            }
        });
        paneBotones.add(miMiembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 160, 30));

        miRegistro.setBackground(new java.awt.Color(0, 0, 0));
        miRegistro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        miRegistro.setForeground(new java.awt.Color(255, 255, 255));
        miRegistro.setText("Registro");
        miRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegistroActionPerformed(evt);
            }
        });
        paneBotones.add(miRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 160, 30));

        miMembresias.setBackground(new java.awt.Color(0, 0, 0));
        miMembresias.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        miMembresias.setForeground(new java.awt.Color(255, 255, 255));
        miMembresias.setText("Membresias");
        miMembresias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMembresiasActionPerformed(evt);
            }
        });
        paneBotones.add(miMembresias, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 160, 30));

        miReportes.setBackground(new java.awt.Color(0, 0, 0));
        miReportes.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        miReportes.setForeground(new java.awt.Color(255, 255, 255));
        miReportes.setText("Reportes");
        miReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReportesActionPerformed(evt);
            }
        });
        paneBotones.add(miReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 160, 30));

        paneBgAgr.add(paneBotones);
        paneBotones.setBounds(0, 0, 800, 30);

        javax.swing.GroupLayout paneFotoLayout = new javax.swing.GroupLayout(paneFoto);
        paneFoto.setLayout(paneFotoLayout);
        paneFotoLayout.setHorizontalGroup(
            paneFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        paneFotoLayout.setVerticalGroup(
            paneFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        paneBgAgr.add(paneFoto);
        paneFoto.setBounds(460, 70, 250, 250);

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back_icon.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        paneBgAgr.add(lblBack);
        lblBack.setBounds(30, 52, 35, 35);

        lblNombre.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        paneBgAgr.add(lblNombre);
        lblNombre.setBounds(90, 70, 70, 17);

        txtNombres.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        paneBgAgr.add(txtNombres);
        txtNombres.setBounds(90, 90, 300, 30);

        lblApellidos.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setText("Apellido(s)");
        paneBgAgr.add(lblApellidos);
        lblApellidos.setBounds(90, 130, 80, 17);

        txtApellidos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        paneBgAgr.add(txtApellidos);
        txtApellidos.setBounds(90, 150, 300, 30);

        lblNumero.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("Número de teléfono");
        paneBgAgr.add(lblNumero);
        lblNumero.setBounds(90, 190, 140, 17);

        txtNumero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        paneBgAgr.add(txtNumero);
        txtNumero.setBounds(90, 210, 300, 30);

        lblNac.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        lblNac.setForeground(new java.awt.Color(255, 255, 255));
        lblNac.setText("Fecha de nacimiento");
        paneBgAgr.add(lblNac);
        lblNac.setBounds(90, 250, 140, 17);
        paneBgAgr.add(dateNac);
        dateNac.setBounds(90, 270, 110, 30);

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar campos");
        paneBgAgr.add(btnLimpiar);
        btnLimpiar.setBounds(90, 380, 140, 30);

        btnAgregar.setBackground(new java.awt.Color(0, 51, 51));
        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar miembro");
        paneBgAgr.add(btnAgregar);
        btnAgregar.setBounds(250, 380, 150, 30);

        btnTomar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnTomar.setText("Tomar foto");
        paneBgAgr.add(btnTomar);
        btnTomar.setBounds(460, 330, 120, 30);

        btnElegir.setBackground(new java.awt.Color(0, 0, 51));
        btnElegir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnElegir.setForeground(new java.awt.Color(255, 255, 255));
        btnElegir.setText("Elegir foto");
        paneBgAgr.add(btnElegir);
        btnElegir.setBounds(590, 330, 120, 30);

        lblScratchAgr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/scratchtwo.png"))); // NOI18N
        paneBgAgr.add(lblScratchAgr);
        lblScratchAgr.setBounds(0, 30, 800, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneBgAgr, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneBgAgr, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void miMiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMiembrosActionPerformed
        this.dispose();
        Miembros ventanaMiembros = new Miembros();
        ventanaMiembros.setVisible(true);
    }//GEN-LAST:event_miMiembrosActionPerformed

    private void miRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegistroActionPerformed
        this.dispose();
        Registro ventanaRegistro = new Registro();
        ventanaRegistro.setVisible(true);
    }//GEN-LAST:event_miRegistroActionPerformed

    private void miMembresiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMembresiasActionPerformed
        this.dispose();
        Membresias ventanaMembresias = new Membresias();
        ventanaMembresias.setVisible(true);
    }//GEN-LAST:event_miMembresiasActionPerformed

    private void miReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReportesActionPerformed
        this.dispose();
        Reportes ventanaReportes = new Reportes();
        ventanaReportes.setVisible(true);
    }//GEN-LAST:event_miReportesActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnElegir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnTomar;
    private com.toedter.calendar.JDateChooser dateNac;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNac;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblScratchAgr;
    private javax.swing.JButton miAgMiembro;
    private javax.swing.JButton miMembresias;
    private javax.swing.JButton miMiembros;
    private javax.swing.JButton miRegistro;
    private javax.swing.JButton miReportes;
    private javax.swing.JPanel paneBgAgr;
    private javax.swing.JPanel paneBotones;
    private javax.swing.JPanel paneFoto;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
