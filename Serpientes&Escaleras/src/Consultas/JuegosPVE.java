package Consultas;
// aprobado

import Conexiones.*;
import static Conexiones.Consultas.consultarPVE;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanc
 */
public class JuegosPVE extends javax.swing.JFrame {

    /**
     * Creates new form JuegosPVE
     */
    public JuegosPVE() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/Serpiente.jpg")).getImage());

        Usuario usuarios = new Usuario();
        ArrayList<String> user = usuarios.obtenerUsuarios();

        // ciclo para rellenar datos, pero solo del primer jugador
        for (int i = 0; i < user.size(); i++) {
            cmbP1.addItem(user.get(i));
        }
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
        jLabel2 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblParticipantes = new javax.swing.JTable();
        cmbP1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jLabel2.setText("Seleccione al jugador a consultar:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        btnConsultar.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultar.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(0, 0, 0));
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 90, 30));

        btnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 80, 30));

        tblParticipantes.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        tblParticipantes.setForeground(new java.awt.Color(0, 0, 0));
        tblParticipantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Nickname", "Inicio Partida", "Fin Partida", "Tiros Dado", "Avances", "Retroceso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblParticipantes);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 610, 70));

        cmbP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbP1ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        //  cuestiones de la tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) tblParticipantes.getModel();
        modeloTabla.setRowCount(0);
        // jalamos los datos de donde vienen
        String getNickname = (String) cmbP1.getSelectedItem();
        int columnas = modeloTabla.getColumnCount();

        consultarPVE(getNickname, columnas, modeloTabla);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // borrar la ventana
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cmbP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbP1ActionPerformed

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
            java.util.logging.Logger.getLogger(JuegosPVE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegosPVE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegosPVE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegosPVE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegosPVE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbP1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblParticipantes;
    // End of variables declaration//GEN-END:variables
}
