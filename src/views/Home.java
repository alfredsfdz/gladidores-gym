/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import javax.swing.JFrame;

/**
 *
 * @author alfre
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);     
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
        btnAgMiembro = new javax.swing.JButton();
        btnMiembros = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        btnMembresias = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneBgHome.setBackground(new java.awt.Color(29, 29, 29));
        paneBgHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgMiembro.setText("Agregar miembro");
        paneBotones.add(btnAgMiembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 256, 30));

        btnMiembros.setText("Miembros");
        btnMiembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiembrosActionPerformed(evt);
            }
        });
        paneBotones.add(btnMiembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 0, 256, 30));

        btnRegistro.setText("Registro QR");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        paneBotones.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 0, 256, 30));

        btnMembresias.setText("Membresias");
        btnMembresias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMembresiasActionPerformed(evt);
            }
        });
        paneBotones.add(btnMembresias, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 0, 256, 30));

        btnReportes.setText("Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        paneBotones.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1024, 0, 256, 30));

        paneBgHome.add(paneBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneBgHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneBgHome, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnMiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiembrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMiembrosActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnMembresiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembresiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMembresiasActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgMiembro;
    private javax.swing.JButton btnMembresias;
    private javax.swing.JButton btnMiembros;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnReportes;
    private javax.swing.JPanel paneBgHome;
    private javax.swing.JPanel paneBotones;
    // End of variables declaration//GEN-END:variables
}
