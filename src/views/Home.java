/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

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
        btnInformacion = new javax.swing.JButton();
        lblInformacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneBgHome.setBackground(new java.awt.Color(29, 29, 29));
        paneBgHome.setLayout(null);

        paneBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        miAgMiembro.setBackground(new java.awt.Color(0, 0, 0));
        miAgMiembro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        miAgMiembro.setForeground(new java.awt.Color(255, 255, 255));
        miAgMiembro.setText("Agregar miembro");
        paneBotones.add(miAgMiembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 256, 30));

        miMiembros.setBackground(new java.awt.Color(0, 0, 0));
        miMiembros.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        miMiembros.setForeground(new java.awt.Color(255, 255, 255));
        miMiembros.setText("Miembros");
        paneBotones.add(miMiembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 0, 256, 30));

        miRegistro.setBackground(new java.awt.Color(0, 0, 0));
        miRegistro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        miRegistro.setForeground(new java.awt.Color(255, 255, 255));
        miRegistro.setText("Registro QR");
        paneBotones.add(miRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 0, 256, 30));

        miMembresias.setBackground(new java.awt.Color(0, 0, 0));
        miMembresias.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        miMembresias.setForeground(new java.awt.Color(255, 255, 255));
        miMembresias.setText("Membresias");
        paneBotones.add(miMembresias, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 0, 256, 30));

        miReportes.setBackground(new java.awt.Color(0, 0, 0));
        miReportes.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        miReportes.setForeground(new java.awt.Color(255, 255, 255));
        miReportes.setText("Reportes");
        paneBotones.add(miReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1024, 0, 256, 30));

        paneBgHome.add(paneBotones);
        paneBotones.setBounds(0, 0, 1280, 30);

        btnAgMiembro.setBackground(new java.awt.Color(0, 0, 0));
        btnAgMiembro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add_icon.png"))); // NOI18N
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
        paneBgHome.add(btnMembresias);
        btnMembresias.setBounds(315, 396, 260, 180);

        lblMembresias.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        lblMembresias.setForeground(new java.awt.Color(255, 255, 255));
        lblMembresias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMembresias.setText("Membresias");
        paneBgHome.add(lblMembresias);
        lblMembresias.setBounds(315, 582, 260, 24);

        btnReportes.setBackground(new java.awt.Color(0, 0, 0));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/reporte_icon.png"))); // NOI18N
        paneBgHome.add(btnReportes);
        btnReportes.setBounds(705, 396, 260, 180);

        lblReportes.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        lblReportes.setForeground(new java.awt.Color(255, 255, 255));
        lblReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReportes.setText("Reportes");
        paneBgHome.add(lblReportes);
        lblReportes.setBounds(705, 582, 260, 24);

        btnInformacion.setBackground(new java.awt.Color(0, 0, 0));
        btnInformacion.setFont(new java.awt.Font("Roboto Black", 1, 70)); // NOI18N
        btnInformacion.setForeground(new java.awt.Color(255, 255, 255));
        btnInformacion.setText("?");
        paneBgHome.add(btnInformacion);
        btnInformacion.setBounds(1145, 560, 100, 100);

        lblInformacion.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        lblInformacion.setForeground(new java.awt.Color(255, 255, 255));
        lblInformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInformacion.setText("Información");
        paneBgHome.add(lblInformacion);
        lblInformacion.setBounds(1145, 666, 100, 19);

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
    }// </editor-fold>//GEN-END:initComponents

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgMiembro;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnMembresias;
    private javax.swing.JButton btnMiembros;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnReportes;
    private javax.swing.JLabel lblAgMiembro;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblMembresias;
    private javax.swing.JLabel lblMiembros;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JButton miAgMiembro;
    private javax.swing.JButton miMembresias;
    private javax.swing.JButton miMiembros;
    private javax.swing.JButton miRegistro;
    private javax.swing.JButton miReportes;
    private javax.swing.JPanel paneBgHome;
    private javax.swing.JPanel paneBotones;
    // End of variables declaration//GEN-END:variables
}
