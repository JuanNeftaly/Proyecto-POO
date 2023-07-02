package Consultas;
// aprobado

import javax.swing.ImageIcon;

/**
 *
 * @author juanc
 */
public class MenuConsulta extends javax.swing.JFrame {

    /**
     * Creates new form MenuConsulta
     */
    public MenuConsulta() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/Serpiente.jpg")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMejoresJugadores = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();
        btnJuegosPVE = new javax.swing.JButton();
        btnJuegosPVP = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnTableros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMejoresJugadores.setBackground(new java.awt.Color(255, 255, 255));
        btnMejoresJugadores.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        btnMejoresJugadores.setForeground(new java.awt.Color(0, 0, 0));
        btnMejoresJugadores.setText("Mejores Jugadores");
        btnMejoresJugadores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMejoresJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMejoresJugadoresActionPerformed(evt);
            }
        });
        jPanel1.add(btnMejoresJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 140, 30));

        btnListado.setBackground(new java.awt.Color(255, 255, 255));
        btnListado.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btnListado.setForeground(new java.awt.Color(0, 0, 0));
        btnListado.setText("Lista Jugadores");
        btnListado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnListado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 30));

        btnJuegosPVE.setBackground(new java.awt.Color(255, 255, 255));
        btnJuegosPVE.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btnJuegosPVE.setForeground(new java.awt.Color(0, 0, 0));
        btnJuegosPVE.setText("Juegos PvE");
        btnJuegosPVE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnJuegosPVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuegosPVEActionPerformed(evt);
            }
        });
        jPanel1.add(btnJuegosPVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 140, 30));

        btnJuegosPVP.setBackground(new java.awt.Color(255, 255, 255));
        btnJuegosPVP.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btnJuegosPVP.setForeground(new java.awt.Color(0, 0, 0));
        btnJuegosPVP.setText("Juegos PvP");
        btnJuegosPVP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnJuegosPVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuegosPVPActionPerformed(evt);
            }
        });
        jPanel1.add(btnJuegosPVP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 140, 30));

        btnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 140, 30));

        btnTableros.setBackground(new java.awt.Color(255, 255, 255));
        btnTableros.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        btnTableros.setForeground(new java.awt.Color(0, 0, 0));
        btnTableros.setText("Tableros");
        btnTableros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTableros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablerosActionPerformed(evt);
            }
        });
        jPanel1.add(btnTableros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMejoresJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMejoresJugadoresActionPerformed
        TopJugadores NewForm = new TopJugadores();
        NewForm.setVisible(true);
    }//GEN-LAST:event_btnMejoresJugadoresActionPerformed

    private void btnListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoActionPerformed
        // creamos nueva ventana 
        ListaJugadores NewForm = new ListaJugadores();
        NewForm.setVisible(true);
    }//GEN-LAST:event_btnListadoActionPerformed

    private void btnJuegosPVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegosPVEActionPerformed
        JuegosPVE NewForm = new JuegosPVE();
        NewForm.setVisible(true);
    }//GEN-LAST:event_btnJuegosPVEActionPerformed

    private void btnJuegosPVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegosPVPActionPerformed
        JuegosPVP NewForm = new JuegosPVP();
        NewForm.setVisible(true);
    }//GEN-LAST:event_btnJuegosPVPActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnTablerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablerosActionPerformed
        // TODO add your handling code here:
        Tableros NewForm = new Tableros();
        NewForm.setVisible(true);
    }//GEN-LAST:event_btnTablerosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJuegosPVE;
    private javax.swing.JButton btnJuegosPVP;
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnMejoresJugadores;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnTableros;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
