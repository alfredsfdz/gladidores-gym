package views;

public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Registro() {
        initComponents();
        setTitle("Registro");
        setDefaultCloseOperation(Registro.DISPOSE_ON_CLOSE);
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

        paneBgReg = new javax.swing.JPanel();
        paneQR = new javax.swing.JPanel();
        paneFoto = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblIDMiem = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblNombreMiem = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblApellidosMiem = new javax.swing.JLabel();
        lblVencimiento = new javax.swing.JLabel();
        lblFechaVen = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        separator1 = new javax.swing.JSeparator();
        paneVencimiento = new javax.swing.JPanel();
        lblEstadoMem = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblScratchReg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneBgReg.setBackground(new java.awt.Color(29, 29, 29));
        paneBgReg.setLayout(null);

        javax.swing.GroupLayout paneQRLayout = new javax.swing.GroupLayout(paneQR);
        paneQR.setLayout(paneQRLayout);
        paneQRLayout.setHorizontalGroup(
            paneQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        paneQRLayout.setVerticalGroup(
            paneQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        paneBgReg.add(paneQR);
        paneQR.setBounds(910, 190, 300, 300);

        javax.swing.GroupLayout paneFotoLayout = new javax.swing.GroupLayout(paneFoto);
        paneFoto.setLayout(paneFotoLayout);
        paneFotoLayout.setHorizontalGroup(
            paneFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        paneFotoLayout.setVerticalGroup(
            paneFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        paneBgReg.add(paneFoto);
        paneFoto.setBounds(640, 190, 210, 210);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/gladiadores_logo_small.png"))); // NOI18N
        paneBgReg.add(lblLogo);
        lblLogo.setBounds(1060, 50, 150, 100);

        lblIDMiem.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        lblIDMiem.setForeground(new java.awt.Color(255, 255, 255));
        lblIDMiem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIDMiem.setText("-");
        paneBgReg.add(lblIDMiem);
        lblIDMiem.setBounds(130, 190, 500, 33);

        lblID.setFont(new java.awt.Font("Roboto Black", 1, 28)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblID.setText("ID:");
        paneBgReg.add(lblID);
        lblID.setBounds(70, 190, 40, 33);

        lblNombreMiem.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        lblNombreMiem.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreMiem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreMiem.setText("-");
        paneBgReg.add(lblNombreMiem);
        lblNombreMiem.setBounds(210, 240, 420, 33);

        lblNombre.setFont(new java.awt.Font("Roboto Black", 1, 28)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre.setText("Nombre:");
        paneBgReg.add(lblNombre);
        lblNombre.setBounds(70, 240, 120, 33);

        lblApellidos.setFont(new java.awt.Font("Roboto Black", 1, 28)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblApellidos.setText("Apellidos:");
        paneBgReg.add(lblApellidos);
        lblApellidos.setBounds(70, 290, 140, 33);

        lblApellidosMiem.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        lblApellidosMiem.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidosMiem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblApellidosMiem.setText("-");
        paneBgReg.add(lblApellidosMiem);
        lblApellidosMiem.setBounds(230, 290, 400, 33);

        lblVencimiento.setFont(new java.awt.Font("Roboto Black", 1, 28)); // NOI18N
        lblVencimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblVencimiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVencimiento.setText("Vencimiento:");
        paneBgReg.add(lblVencimiento);
        lblVencimiento.setBounds(80, 450, 190, 40);

        lblFechaVen.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        lblFechaVen.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaVen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFechaVen.setText("-");
        paneBgReg.add(lblFechaVen);
        lblFechaVen.setBounds(290, 450, 560, 40);

        separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        paneBgReg.add(separator);
        separator.setBounds(880, 190, 20, 340);
        paneBgReg.add(separator1);
        separator1.setBounds(70, 530, 1140, 20);

        paneVencimiento.setBackground(new java.awt.Color(0, 0, 0));

        lblEstadoMem.setBackground(new java.awt.Color(255, 255, 255));
        lblEstadoMem.setFont(new java.awt.Font("Roboto Black", 1, 38)); // NOI18N
        lblEstadoMem.setForeground(new java.awt.Color(255, 255, 255));
        lblEstadoMem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstadoMem.setText("ESTADO MEMBRESÍA");

        javax.swing.GroupLayout paneVencimientoLayout = new javax.swing.GroupLayout(paneVencimiento);
        paneVencimiento.setLayout(paneVencimientoLayout);
        paneVencimientoLayout.setHorizontalGroup(
            paneVencimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEstadoMem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
        );
        paneVencimientoLayout.setVerticalGroup(
            paneVencimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEstadoMem, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        paneBgReg.add(paneVencimiento);
        paneVencimiento.setBounds(70, 560, 1140, 60);

        lblHora.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHora.setText("00:00:00");
        paneBgReg.add(lblHora);
        lblHora.setBounds(1060, 640, 140, 33);

        lblFecha.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFecha.setText("DD/MM/YYYY");
        paneBgReg.add(lblFecha);
        lblFecha.setBounds(70, 640, 210, 33);

        lblScratchReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/scratchtwo.png"))); // NOI18N
        paneBgReg.add(lblScratchReg);
        lblScratchReg.setBounds(0, 0, 1280, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneBgReg, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneBgReg, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblApellidosMiem;
    private javax.swing.JLabel lblEstadoMem;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFechaVen;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDMiem;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreMiem;
    private javax.swing.JLabel lblScratchReg;
    private javax.swing.JLabel lblVencimiento;
    private javax.swing.JPanel paneBgReg;
    private javax.swing.JPanel paneFoto;
    private javax.swing.JPanel paneQR;
    private javax.swing.JPanel paneVencimiento;
    private javax.swing.JSeparator separator;
    private javax.swing.JSeparator separator1;
    // End of variables declaration//GEN-END:variables
}
