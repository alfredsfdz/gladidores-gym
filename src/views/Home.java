package views;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneBgHome = new javax.swing.JPanel();
        paneBotones = new javax.swing.JPanel();
        btnAyuda = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnMembresias = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        btnMiembros1 = new javax.swing.JButton();
        btnAgMiembro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(1080, 720));

        paneBgHome.setBackground(new java.awt.Color(29, 29, 29));
        paneBgHome.setLayout(null);

        paneBotones.setBackground(new java.awt.Color(255, 255, 255));
        paneBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAyuda.setText("Ayuda");
        paneBotones.add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 180, 30));

        btnReportes.setText("Reportes");
        paneBotones.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 180, 30));

        btnMembresias.setText("Membresias");
        paneBotones.add(btnMembresias, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 180, 30));

        btnRegistro.setText("Registro");
        paneBotones.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 180, 30));

        btnMiembros1.setText("Miembros");
        paneBotones.add(btnMiembros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 180, 30));

        btnAgMiembro.setText("Agregar miembro");
        paneBotones.add(btnAgMiembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 30));

        paneBgHome.add(paneBotones);
        paneBotones.setBounds(0, 0, 1080, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneBgHome, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneBgHome, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnMembresias;
    private javax.swing.JButton btnMiembros1;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnReportes;
    private javax.swing.JPanel paneBgHome;
    private javax.swing.JPanel paneBotones;
    // End of variables declaration//GEN-END:variables
}
