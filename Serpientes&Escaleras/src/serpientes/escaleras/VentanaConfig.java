/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package serpientes.escaleras;

import java.awt.Color;

/**
 *
 * @author juanc
 */
public class VentanaConfig extends javax.swing.JFrame {

    /**
     * Creates new form VentanaConfig
     */
    public VentanaConfig() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        jPanel2.setBackground(new Color(60,63,65, 225));
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
        jPanel2 = new javax.swing.JPanel();
        avisoFicha = new javax.swing.JLabel();
        btnArwRgtSkn = new javax.swing.JButton();
        btnArwLftSkn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        avisoTablero = new javax.swing.JLabel();
        btnArwLftBkg = new javax.swing.JButton();
        btnSve = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnArwRgtBkg1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setFocusTraversalPolicyProvider(true);

        avisoFicha.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        avisoFicha.setForeground(new java.awt.Color(255, 255, 255));
        avisoFicha.setText("Elige tu ficha");
        avisoFicha.setAlignmentX(320.0F);
        avisoFicha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnArwRgtSkn.setBackground(new java.awt.Color(0, 0, 0));
        btnArwRgtSkn.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        btnArwRgtSkn.setForeground(new java.awt.Color(255, 255, 255));
        btnArwRgtSkn.setText(">");
        btnArwRgtSkn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnArwRgtSkn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArwRgtSknActionPerformed(evt);
            }
        });

        btnArwLftSkn.setBackground(new java.awt.Color(0, 0, 0));
        btnArwLftSkn.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        btnArwLftSkn.setForeground(new java.awt.Color(255, 255, 255));
        btnArwLftSkn.setText("<");
        btnArwLftSkn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnArwLftSkn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArwLftSknActionPerformed(evt);
            }
        });

        jLabel3.setText("aqui irian las fichas");

        avisoTablero.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        avisoTablero.setForeground(new java.awt.Color(255, 255, 255));
        avisoTablero.setText("Elige el tablero");
        avisoTablero.setAlignmentX(320.0F);
        avisoTablero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnArwLftBkg.setBackground(new java.awt.Color(0, 0, 0));
        btnArwLftBkg.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        btnArwLftBkg.setForeground(new java.awt.Color(255, 255, 255));
        btnArwLftBkg.setText("<");
        btnArwLftBkg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnArwLftBkg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArwLftBkgActionPerformed(evt);
            }
        });

        btnSve.setBackground(new java.awt.Color(0, 0, 0));
        btnSve.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btnSve.setForeground(new java.awt.Color(255, 255, 255));
        btnSve.setText("Guardar");
        btnSve.setAlignmentX(320.0F);
        btnSve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSveActionPerformed(evt);
            }
        });

        jLabel1.setText("aqui irian los tableros");

        btnArwRgtBkg1.setBackground(new java.awt.Color(0, 0, 0));
        btnArwRgtBkg1.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        btnArwRgtBkg1.setForeground(new java.awt.Color(255, 255, 255));
        btnArwRgtBkg1.setText(">");
        btnArwRgtBkg1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnArwRgtBkg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArwRgtBkg1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnArwLftSkn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel3)
                                .addGap(79, 79, 79)
                                .addComponent(btnArwRgtSkn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnArwLftBkg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnArwRgtBkg1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(btnSve, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 98, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avisoTablero)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(avisoFicha)
                        .addGap(14, 14, 14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(avisoFicha)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnArwLftSkn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArwRgtSkn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(avisoTablero)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnArwLftBkg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnArwRgtBkg1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSve, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 31, 550, 340));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.gif"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(640, 400));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArwRgtSknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArwRgtSknActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArwRgtSknActionPerformed

    private void btnArwLftSknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArwLftSknActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArwLftSknActionPerformed

    private void btnArwLftBkgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArwLftBkgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArwLftBkgActionPerformed

    private void btnSveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSveActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        
        menu.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnSveActionPerformed

    private void btnArwRgtBkg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArwRgtBkg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArwRgtBkg1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaConfig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoFicha;
    private javax.swing.JLabel avisoTablero;
    private javax.swing.JButton btnArwLftBkg;
    private javax.swing.JButton btnArwLftSkn;
    private javax.swing.JButton btnArwRgtBkg1;
    private javax.swing.JButton btnArwRgtSkn;
    private javax.swing.JButton btnSve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}