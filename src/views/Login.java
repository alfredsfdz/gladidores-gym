package views;

public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneBg = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        lblIniciar = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        paneScratch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        paneBg.setBackground(new java.awt.Color(29, 29, 29));
        paneBg.setLayout(null);

        lblClose.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
        paneBg.add(lblClose);
        lblClose.setBounds(760, 0, 40, 40);

        lblMin.setFont(new java.awt.Font("Roboto Black", 1, 30)); // NOI18N
        lblMin.setForeground(new java.awt.Color(255, 255, 255));
        lblMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMin.setText("-");
        paneBg.add(lblMin);
        lblMin.setBounds(720, 0, 40, 40);

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
        txtUsuario.setBounds(220, 320, 360, 30);

        txtContrasena.setBackground(new java.awt.Color(229, 229, 229));
        txtContrasena.setForeground(new java.awt.Color(51, 51, 51));
        txtContrasena.setText("Contraseña");
        paneBg.add(txtContrasena);
        txtContrasena.setBounds(220, 360, 360, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ENTRAR");
        paneBg.add(jButton1);
        jButton1.setBounds(340, 400, 120, 30);

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/gladiadores_logo.png"))); // NOI18N
        lblLogo.setPreferredSize(new java.awt.Dimension(300, 300));
        paneBg.add(lblLogo);
        lblLogo.setBounds(0, 70, 800, 240);

        paneScratch.setForeground(new java.awt.Color(255, 255, 255));
        paneScratch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/scratch.png"))); // NOI18N
        paneBg.add(paneScratch);
        paneScratch.setBounds(0, 0, 800, 500);

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblIniciar;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMin;
    private javax.swing.JPanel paneBg;
    private javax.swing.JLabel paneScratch;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
