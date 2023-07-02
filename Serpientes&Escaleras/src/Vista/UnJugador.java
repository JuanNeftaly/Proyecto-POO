package Vista;
// aprobado

import Clases.*;
import Conexiones.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class UnJugador extends javax.swing.JFrame {

    private String imgTablero;
    private Casillas casillas = new Casillas();
    private int dadosTirados = 0;
    // cosas de la base 
    private String nickname, inicio, fin;
    private Color selectedColor;
    private boolean primera;

    Graphics graphics;

    public UnJugador(String imgTablero, Casillas casillas, String nickname, Color selectedColor, boolean primera) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/Serpiente.jpg")).getImage());

        this.selectedColor = selectedColor;
        
        this.nickname = nickname;
        this.primera = primera;

        ggPanel.setBackground(new Color(60, 63, 65, 225));

        //Se ocultan todos los datos del ganador
        ggLabel.setVisible(false);
        ggPanel.setVisible(false);
        lblDT.setVisible(false);
        lblResDT.setVisible(false);
        lblES.setVisible(false);
        lblResES.setVisible(false);
        lblSB.setVisible(false);
        lblResSB.setVisible(false);

        this.getContentPane().setBackground(Color.BLACK); // color
        this.setLocationRelativeTo(null); // centrar 

        this.casillas = casillas;

        //Se guarda el tablero seleccionado desde la ventana Configuraciones
        this.imgTablero = imgTablero;

        //Se manda el url de la imagen del tablero y el label en el cual se pondrá
        EscalaImagen(imgTablero, lblTablero);

        graphics = lblTablero.getGraphics();
        lblTablero.paintComponents(graphics);

        // tomar inicio partida
        inicio = ConsultarFecha.consultarFecha();

    }

    // arreglos para guardar las cosas
    String imgArray[] = new String[]{"/imagenes/Dado1.png", "/imagenes/Dado2.png", "/imagenes/Dado3.png",
        "/imagenes/Dado4.png", "/imagenes/Dado5.png", "/imagenes/Dado6.png"};
    String txtArray[] = new String[]{"Sacaste 1", "Sacaste 2", "Sacaste 3",
        "Sacaste 4", "Sacaste 5", "Sacaste 6"};

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnDado = new javax.swing.JButton();
        lblDescripcion = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ggPanel = new javax.swing.JPanel();
        ggLabel = new javax.swing.JLabel();
        lblDT = new javax.swing.JLabel();
        lblResDT = new javax.swing.JLabel();
        lblES = new javax.swing.JLabel();
        lblResES = new javax.swing.JLabel();
        lblSB = new javax.swing.JLabel();
        lblResSB = new javax.swing.JLabel();
        lblTablero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDado.setBackground(new java.awt.Color(0, 0, 0));
        btnDado.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btnDado.setForeground(new java.awt.Color(255, 255, 255));
        btnDado.setText("Dado");
        btnDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadoActionPerformed(evt);
            }
        });
        jPanel2.add(btnDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 30));

        lblDescripcion.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 90, -1));

        lblImagen.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 90, 80));

        btnVolver.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver al menu");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 150, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 60, 120, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ggLabel.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        ggLabel.setForeground(new java.awt.Color(204, 204, 204));
        ggLabel.setText("FELICIDADES HAS GANADO!!!");

        lblDT.setFont(new java.awt.Font("Lucida Console", 3, 18)); // NOI18N
        lblDT.setForeground(new java.awt.Color(204, 204, 204));
        lblDT.setText("Dados tirados:");

        lblResDT.setFont(new java.awt.Font("Lucida Console", 2, 18)); // NOI18N
        lblResDT.setForeground(new java.awt.Color(204, 204, 204));
        lblResDT.setText("da");

        lblES.setFont(new java.awt.Font("Lucida Console", 3, 18)); // NOI18N
        lblES.setForeground(new java.awt.Color(204, 204, 204));
        lblES.setText("Escaleras subidas:");

        lblResES.setFont(new java.awt.Font("Lucida Console", 2, 18)); // NOI18N
        lblResES.setForeground(new java.awt.Color(204, 204, 204));
        lblResES.setText("da");

        lblSB.setFont(new java.awt.Font("Lucida Console", 3, 18)); // NOI18N
        lblSB.setForeground(new java.awt.Color(204, 204, 204));
        lblSB.setText("Serpientes bajadas:");

        lblResSB.setFont(new java.awt.Font("Lucida Console", 2, 18)); // NOI18N
        lblResSB.setForeground(new java.awt.Color(204, 204, 204));
        lblResSB.setText("da");

        javax.swing.GroupLayout ggPanelLayout = new javax.swing.GroupLayout(ggPanel);
        ggPanel.setLayout(ggPanelLayout);
        ggPanelLayout.setHorizontalGroup(
            ggPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ggPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(ggPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSB)
                    .addComponent(lblES))
                .addGap(94, 94, 94))
            .addGroup(ggPanelLayout.createSequentialGroup()
                .addGroup(ggPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ggPanelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(lblDT))
                    .addGroup(ggPanelLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(lblResDT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ggPanelLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(lblResES, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ggPanelLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(lblResSB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ggPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(ggLabel)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        ggPanelLayout.setVerticalGroup(
            ggPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ggPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ggLabel)
                .addGap(18, 18, 18)
                .addComponent(lblDT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResDT)
                .addGap(18, 18, 18)
                .addComponent(lblES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResES)
                .addGap(18, 18, 18)
                .addComponent(lblSB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResSB)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(ggPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 410, 260));

        lblTablero.setForeground(new java.awt.Color(0, 0, 0));
        lblTablero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 834, 388));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadoActionPerformed
        //Guarda el valor del dado
        int dado = Dado();

        btnVolver.setEnabled(false);
        
        // al dado le sumamos 1, entonces le restamos
        int index = dado - 1;
        lblDescripcion.setText(txtArray[index]);

        //Se manda la imagen del dado correspondiente y el label en el cual se pondrá la imagen
        EscalaImagen(imgArray[index], lblImagen);

        //Aumenta el contador de la cantidad de dados tirados
        dadosTirados++;

        btnDado.setEnabled(false);

        //Inicia el juego
        Juego(dado);
    }//GEN-LAST:event_btnDadoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EscalaImagen(String imgUrl, JLabel label) {
        //Se crea un image icon utilizando la dirección donde está almacenada la imagen
        ImageIcon imgIcon = new ImageIcon(getClass().getResource(imgUrl));
        //Se convierte a un objeto tipo Image la imagen original
        Image img = imgIcon.getImage();
        //Se modifica la imagen original en base a las dimensiones del label deseado
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        //Se crea un nuevo ImageIcon en base a la imagen modificada
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        //Se pone la imagen en el label
        label.setIcon(scaledIcon);
    }

    private void Juego(int dado) {
        //En caso de que el jugador no haya llegado a la última casilla
        if (casillas.getContTotal() < casillas.getTotalCasillas()) {

            //En caso de que el dado no sobrepase la cantidad de casillas restantes para ganar
            if (dado <= (casillas.getTotalCasillas() - casillas.getContTotal())) {

                //Establece la casilla actual en la que se encuentra el jugador
                casillas.setContTotal(casillas.getContTotal() + dado);

                //Se prepara la animación del movimiento de la ficha
                AnimacionCasilla animation = new AnimacionCasilla(dado, lblTablero, graphics, casillas, btnDado
                        , selectedColor);
                Thread threadAnimation = new Thread(animation);

                //Inicia la animación
                threadAnimation.start();
            } else if(dado >= (casillas.getTotalCasillas() - casillas.getContTotal())&&casillas.getContTotal() != casillas.getTotalCasillas()) {
                btnDado.setEnabled(true);
            }
        }

        //En caso de haber ganado
        if (casillas.getContTotal() == casillas.getTotalCasillas()) {
            //Se desactiva la opción de seguir tirando el dado
            btnDado.setEnabled(false);

            //Modifica las estadisticas del ganador
            Ganador();
        }
    }

    //Muestra el panel del ganador con las estadisticas modificadas
    private void Ganador() {
        ggLabel.setVisible(true);
        ggPanel.setVisible(true);
        lblDT.setVisible(true);
        lblResDT.setText(String.valueOf(dadosTirados));
        lblResDT.setVisible(true);
        lblES.setVisible(true);
        lblResES.setText(String.valueOf(casillas.getEscalerasSubidas()));
        lblResES.setVisible(true);
        lblSB.setVisible(true);
        lblResSB.setText(String.valueOf(casillas.getSerpientesBajadas()));
        lblResSB.setVisible(true);

        // guardar datos 
        Usuario user = new Usuario();
        int avances = casillas.getEscalerasSubidas();
        int retrocesos = casillas.getSerpientesBajadas();
        int id = user.obtenerIdUser(nickname);
        fin = ConsultarFecha.consultarFecha();
        int idTablero = TableroSeleccionado();

        AgregarPvE.agregarDatos_Juego(inicio, fin, dadosTirados, avances, retrocesos, id, idTablero);
    }
    
    public int TableroSeleccionado() {

        //En caso de que el jugador haya seleccionado el primer tablero devuelve la direccion respectiva de la imagen
        if (primera) {
            return 1;

            //En caso de haber seleccionado la imagen del segundo tablero
        } else {
            return 2;
        }
    }

    // funcion de dado
    private int Dado() {
        return (int) (Math.random() * 6) + 1;
    }

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
            java.util.logging.Logger.getLogger(UnJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnJugador(null, null, null, null, false).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDado;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel ggLabel;
    private javax.swing.JPanel ggPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDT;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblES;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblResDT;
    private javax.swing.JLabel lblResES;
    private javax.swing.JLabel lblResSB;
    private javax.swing.JLabel lblSB;
    private javax.swing.JLabel lblTablero;
    // End of variables declaration//GEN-END:variables
}
