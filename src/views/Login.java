package views;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneBg = new javax.swing.JPanel();
        lblIniciar = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        paneScratch = new javax.swing.JLabel();
        lblScratch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        paneBg.setBackground(new java.awt.Color(29, 29, 29));
        paneBg.setLayout(null);

        lblIniciar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblIniciar.setForeground(new java.awt.Color(255, 255, 255));
        lblIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciar.setText("INICIAR SESION");
        paneBg.add(lblIniciar);
        lblIniciar.setBounds(0, 290, 800, 22);

        txtUsuario.setEditable(false);
        txtUsuario.setBackground(new java.awt.Color(229, 229, 229));
        txtUsuario.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtUsuario.setText("Usuario");
        paneBg.add(txtUsuario);
        txtUsuario.setBounds(210, 320, 360, 30);

        txtContrasena.setBackground(new java.awt.Color(229, 229, 229));
        txtContrasena.setForeground(new java.awt.Color(51, 51, 51));
        txtContrasena.setText("Contraseña");
        paneBg.add(txtContrasena);
        txtContrasena.setBounds(210, 360, 360, 30);

        btnEntrar.setBackground(new java.awt.Color(0, 0, 0));
        btnEntrar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("ENTRAR");
        paneBg.add(btnEntrar);
        btnEntrar.setBounds(330, 400, 120, 30);

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/gladiadores_logo.png"))); // NOI18N
        lblLogo.setPreferredSize(new java.awt.Dimension(300, 300));
        paneBg.add(lblLogo);
        lblLogo.setBounds(0, 70, 800, 240);

        paneScratch.setForeground(new java.awt.Color(255, 255, 255));
        paneScratch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/scratch.png"))); // NOI18N
        paneBg.add(paneScratch);
        paneScratch.setBounds(0, 0, 0, 0);

        lblScratch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/scratch.png"))); // NOI18N
        paneBg.add(lblScratch);
        lblScratch.setBounds(0, 0, 800, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneBg, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneBg, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblIniciar;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblScratch;
    private javax.swing.JPanel paneBg;
    private javax.swing.JLabel paneScratch;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
