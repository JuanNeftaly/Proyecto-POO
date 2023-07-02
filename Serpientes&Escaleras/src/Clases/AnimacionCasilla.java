package Clases;
// finalizado

import java.awt.Color;
import java.awt.Graphics;
import static java.awt.image.ImageObserver.ERROR;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AnimacionCasilla implements Runnable {

    private int dado;
    private JLabel jLabel1;
    private Graphics graphics;
    static boolean reversa = false, pause = false;
    private Casillas casillas;
    private JButton bttnDado;
    private Color color;

    public AnimacionCasilla(int dado, JLabel jLabel1, Graphics graphics, Casillas casillas, JButton bttnDado, Color color) {
        this.dado = dado;
        this.jLabel1 = jLabel1;
        this.graphics = graphics;
        this.casillas = casillas;
        this.bttnDado = bttnDado;
        this.color = color;
    }

    @Override
    public void run() {
        //Mueve la ficha la cantidad de espacios que indicó el dado
        for (int i = 0; i < dado; i++) {

            //Indica la columna en la que está la ficha
            casillas.setContColumna(casillas.getContColumna() + 1);

            try {
                //Tiempo esperado antes de borrar la ficha anterior
                Thread.sleep(500);
                jLabel1.repaint();
                //Tiempo esperado antes de pintar la siguiente ficha
                Thread.sleep(10);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            }

            //Selección del color de la ficha
            graphics.setColor(color);
            //Pinta la ficha en la posición correspondiente
            graphics.fillOval(casillas.getxPos() - 20, casillas.getyPos() - 20, 30, 30);

            //En caso de llegar al final de esa fila
            if (casillas.getContColumna() == casillas.getLimiteColumna()) {

                //Indica el cambio de fila de la ficha
                casillas.setContFila(casillas.getContFila() + 1);
                //Cambia la posición de la ficha a la siguiente fila
                casillas.setyPos(casillas.getyPos() - casillas.getyDif());
                //Se reinicia el contador de columnas
                casillas.setContColumna(0);

                //Permite que la ficha se quede en la misma posición
                pause = true;

                //Activacion del movimiento en reversa
                if (!reversa) {
                    reversa = true;

                    //Desactivación del movimiento en reversa
                } else {
                    reversa = false;
                }
            }

            //La ficha se mueve de izquierda a derecha
            if (!reversa && !pause) {
                casillas.setxPos(casillas.getxPos() + casillas.getxDif());

                //La ficha se mueve de derecha a izquierda (en reversa)
            } else if (reversa && !pause) {
                casillas.setxPos(casillas.getxPos() - casillas.getxDif());

                //Se reactiva el movimiento de la ficha
            } else {
                pause = false;
            }
        }

        //En caso de haber caído en una casilla especial
        if (casillas.VerificadorEscaleras() || casillas.VerificadorSerpientes()) {

            //Se modifica la posición en base a las casillas especiales
            casillas.CasillasEscalera();
            casillas.CasillaSerpiente();

            try {
                Thread.sleep(500);
                jLabel1.repaint();
                Thread.sleep(10);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            }

            graphics.setColor(color);
            graphics.fillOval(casillas.getxPos() - 20, casillas.getyPos() - 20, 30, 30);

            //En caso de ser par se mueve a la derecha
            //Al ser impar se mueve a la izquierda
            if (casillas.getContFila() % 2 == 0) {
                reversa = false;
            } else {
                reversa = true;
            }

            if (!reversa) {
                casillas.setxPos(casillas.getxPos() + casillas.getxDif());

            } else if (reversa) {
                casillas.setxPos(casillas.getxPos() - casillas.getxDif());
            }
        }

        if (casillas.getContTotal() != casillas.getTotalCasillas()) {
            bttnDado.setEnabled(true);
        }else{
            bttnDado.setEnabled(false);
        }
    }
}
