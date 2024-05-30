package views;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Login extends javax.swing.JFrame {

    private Map<String, String> usuarios;

    public Login() {
        initComponents();
        setTitle("Login");
        setDefaultCloseOperation(Home.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        usuarios = new HashMap<>();
        usuarios.put("admin", "admin123");
        usuarios.put("operador", "operador123");
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

        lblIniciar.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblIniciar.setForeground(new java.awt.Color(255, 255, 255));
        lblIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciar.setText("INICIAR SESIÓN");
        paneBg.add(lblIniciar);
        lblIniciar.setBounds(0, 272, 800, 30);

        txtUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtUsuario.setText("Usuario");
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        paneBg.add(txtUsuario);
        txtUsuario.setBounds(210, 320, 360, 30);

        txtContrasena.setForeground(new java.awt.Color(51, 51, 51));
        txtContrasena.setText("Contraseña");
        txtContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContrasenaMouseClicked(evt);
            }
        });
        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyPressed(evt);
            }
        });
        paneBg.add(txtContrasena);
        txtContrasena.setBounds(210, 360, 360, 30);

        btnEntrar.setBackground(new java.awt.Color(0, 0, 0));
        btnEntrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        paneBg.add(btnEntrar);
        btnEntrar.setBounds(330, 400, 120, 30);

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/gladiadores_logo.png"))); // NOI18N
        lblLogo.setPreferredSize(new java.awt.Dimension(300, 300));
        paneBg.add(lblLogo);
        lblLogo.setBounds(0, 60, 800, 240);

        paneScratch.setForeground(new java.awt.Color(255, 255, 255));
        paneScratch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/scratch.png"))); // NOI18N
        paneBg.add(paneScratch);
        paneScratch.setBounds(0, 0, 800, 500);

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

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String usuario = txtUsuario.getText();
        String contrasena = new String(txtContrasena.getPassword());
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (validarUsuario(usuario, contrasena)) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
            Home ventanaHome = new Home();
            this.dispose();
            ventanaHome.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Inicio de sesión fallido, intentelo de nuevo.");
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtContrasenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContrasenaMouseClicked
        txtContrasena.setText(null);
    }//GEN-LAST:event_txtContrasenaMouseClicked

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        txtUsuario.setText(null);
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String usuario = txtUsuario.getText();
            String contrasena = new String(txtContrasena.getPassword());
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (validarUsuario(usuario, contrasena)) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
                Home ventanaHome = new Home();
                this.dispose();
                ventanaHome.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Inicio de sesión fallido, intentelo de nuevo.");
            }
        }
    }//GEN-LAST:event_txtContrasenaKeyPressed

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

    private boolean validarUsuario(String usuario, String contrasena) {
        String contrasenaGuardada = usuarios.get(usuario);
        return contrasenaGuardada != null && contrasenaGuardada.equals(contrasena);
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
