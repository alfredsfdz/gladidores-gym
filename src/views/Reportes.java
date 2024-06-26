/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

/**
 *
 * @author Alfred-PC
 */
public class Reportes extends javax.swing.JFrame {

    /**
     * Creates new form Reportes
     */
    public Reportes() {
        initComponents();
        setTitle("Reportes");
        setDefaultCloseOperation(Reportes.DISPOSE_ON_CLOSE);
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

        paneBgRepo = new javax.swing.JPanel();
        paneBotones = new javax.swing.JPanel();
        miAgMiembro = new javax.swing.JButton();
        miMiembros = new javax.swing.JButton();
        miRegistro = new javax.swing.JButton();
        miMembresias = new javax.swing.JButton();
        miReportes = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblDesde = new javax.swing.JLabel();
        dateFechaA = new com.toedter.calendar.JDateChooser();
        lblHasta = new javax.swing.JLabel();
        dateFechaB = new com.toedter.calendar.JDateChooser();
        btnBuscarFecha = new javax.swing.JButton();
        lblReportes = new javax.swing.JLabel();
        scrolltMiembros = new javax.swing.JScrollPane();
        tableMiembros = new javax.swing.JTable();
        lblScratchMiem = new javax.swing.JLabel();
        lblScratchMiem1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneBgRepo.setBackground(new java.awt.Color(29, 29, 29));
        paneBgRepo.setLayout(null);

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
        paneBotones.add(miReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1024, 0, 256, 30));

        paneBgRepo.add(paneBotones);
        paneBotones.setBounds(0, 0, 1280, 30);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/gladiadores_logo_small.png"))); // NOI18N
        paneBgRepo.add(lblLogo);
        lblLogo.setBounds(1100, 100, 150, 100);

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back_icon_big.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        paneBgRepo.add(lblBack);
        lblBack.setBounds(30, 50, 55, 55);

        lblDesde.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        lblDesde.setForeground(new java.awt.Color(255, 255, 255));
        lblDesde.setText("Desde:");
        paneBgRepo.add(lblDesde);
        lblDesde.setBounds(30, 120, 70, 17);
        paneBgRepo.add(dateFechaA);
        dateFechaA.setBounds(30, 140, 140, 30);

        lblHasta.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        lblHasta.setForeground(new java.awt.Color(255, 255, 255));
        lblHasta.setText("Hasta:");
        paneBgRepo.add(lblHasta);
        lblHasta.setBounds(190, 120, 70, 17);
        paneBgRepo.add(dateFechaB);
        dateFechaB.setBounds(190, 140, 140, 30);

        btnBuscarFecha.setBackground(new java.awt.Color(0, 0, 51));
        btnBuscarFecha.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscarFecha.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarFecha.setText("Buscar");
        paneBgRepo.add(btnBuscarFecha);
        btnBuscarFecha.setBounds(350, 140, 140, 30);

        lblReportes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblReportes.setForeground(new java.awt.Color(255, 255, 255));
        lblReportes.setText("Reportes de pagos por rangos de fechas");
        paneBgRepo.add(lblReportes);
        lblReportes.setBounds(30, 170, 330, 60);

        tableMiembros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "Estado de membresía", "Fecha inicio de membresía ", "Fecha y hora de creación"
            }
        ));
        scrolltMiembros.setViewportView(tableMiembros);

        paneBgRepo.add(scrolltMiembros);
        scrolltMiembros.setBounds(30, 232, 1220, 460);

        lblScratchMiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/scratchtwo.png"))); // NOI18N
        paneBgRepo.add(lblScratchMiem);
        lblScratchMiem.setBounds(0, 30, 1280, 690);

        lblScratchMiem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/scratchtwo.png"))); // NOI18N
        paneBgRepo.add(lblScratchMiem1);
        lblScratchMiem1.setBounds(0, 30, 1280, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneBgRepo, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneBgRepo, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAgMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgMiembroActionPerformed
        this.dispose();
        Agregar ventanaAgregar = new Agregar();
        ventanaAgregar.setVisible(true);
    }//GEN-LAST:event_miAgMiembroActionPerformed

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

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void miMiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMiembrosActionPerformed
        this.dispose();
        Miembros ventanaMiembros = new Miembros();
        ventanaMiembros.setVisible(true);
    }//GEN-LAST:event_miMiembrosActionPerformed

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarFecha;
    private com.toedter.calendar.JDateChooser dateFechaA;
    private com.toedter.calendar.JDateChooser dateFechaB;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblDesde;
    private javax.swing.JLabel lblHasta;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblScratchMiem;
    private javax.swing.JLabel lblScratchMiem1;
    private javax.swing.JButton miAgMiembro;
    private javax.swing.JButton miMembresias;
    private javax.swing.JButton miMiembros;
    private javax.swing.JButton miRegistro;
    private javax.swing.JButton miReportes;
    private javax.swing.JPanel paneBgRepo;
    private javax.swing.JPanel paneBotones;
    private javax.swing.JScrollPane scrolltMiembros;
    private javax.swing.JTable tableMiembros;
    // End of variables declaration//GEN-END:variables
}
