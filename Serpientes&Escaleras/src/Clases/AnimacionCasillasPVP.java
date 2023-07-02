package Clases; 
// finalizado

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AnimacionCasillasPVP implements Runnable {

    private int dadoP1, dadoP2;
    private JLabel jLabel1;
    private Graphics graphicsP1, graphicsP2;
    static boolean reversaP1 = false, pauseP1 = false, reversaP2 = false, pauseP2 = false;
    private Casillas casillasP1, casillasP2;
    private JButton bttP1, bttP2;
    private Color cP1, cP2;

    public AnimacionCasillasPVP(int dadoP1, int dadoP2, JLabel jLabel1, Graphics graphicsP1, Graphics graphicsP2, Casillas casillasP1,
            Casillas casillasP2, JButton bttP1, JButton bttP2, Color cP1, Color cP2) {
        this.dadoP1 = dadoP1;
        this.dadoP2 = dadoP2;
        this.jLabel1 = jLabel1;
        this.graphicsP1 = graphicsP1;
        this.graphicsP2 = graphicsP2;
        this.casillasP1 = casillasP1;
        this.casillasP2 = casillasP2;
        this.bttP1 = bttP1;
        this.bttP2 = bttP2;
        this.cP1 = cP1;
        this.cP2 = cP2;
    }
    
    public void setDadoP1(int dadoP1) {
        this.dadoP1 = dadoP1;
    }

    public void setDadoP2(int dadoP2) {
        this.dadoP2 = dadoP2;
    }

    @Override
    public void run() {
        //Mueve la ficha la cantidad de espacios que indicó el dado
        if (dadoP2 == 0) {
            for (int i = 0; i < dadoP1; i++) {

                //Indica la columna en la que está la ficha
                casillasP1.setContColumna(casillasP1.getContColumna() + 1);

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
                graphicsP1.setColor(cP1);

                graphicsP2.setColor(cP2);
                //Pinta la ficha en la posición correspondiente MODIFICADO
                graphicsP1.fillOval(casillasP1.getxPos() - 20, casillasP1.getyPos() - 30, 30, 30);

                RepintaFichaSec(casillasP2, graphicsP2, reversaP2);

                //En caso de llegar al final de esa fila
                if (casillasP1.getContColumna() == casillasP1.getLimiteColumna()) {

                    //Indica el cambio de fila de la ficha
                    casillasP1.setContFila(casillasP1.getContFila() + 1);
                    //Cambia la posición de la ficha a la siguiente fila
                    casillasP1.setyPos(casillasP1.getyPos() - casillasP1.getyDif());
                    //Se reinicia el contador de columnas
                    casillasP1.setContColumna(0);

                    //Permite que la ficha se quede en la misma posición
                    pauseP1 = true;

                    //Activacion del movimiento en reversaP1
                    if (!reversaP1) {
                        reversaP1 = true;

                        //Desactivación del movimiento en reversaP1
                    } else {
                        reversaP1 = false;
                    }
                }

                //La ficha se mueve de izquierda a derecha
                if (!reversaP1 && !pauseP1) {
                    casillasP1.setxPos(casillasP1.getxPos() + casillasP1.getxDif());

                    //La ficha se mueve de derecha a izquierda (en reversaP1)
                } else if (reversaP1 && !pauseP1) {
                    casillasP1.setxPos(casillasP1.getxPos() - casillasP1.getxDif());

                    //Se reactiva el movimiento de la ficha
                } else {
                    pauseP1 = false;
                }
            }

            //En caso de haber caído en una casilla especial
            if (casillasP1.VerificadorEscaleras() || casillasP1.VerificadorSerpientes()) {

                //Se modifica la posición en base a las casillas especiales
                casillasP1.CasillasEscalera();
                casillasP1.CasillaSerpiente();

                try {
                    Thread.sleep(500);
                    jLabel1.repaint();
                    Thread.sleep(10);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR",
                            JOptionPane.ERROR_MESSAGE);
                }

                graphicsP1.setColor(cP1);
                //MODIFICADO
                graphicsP1.fillOval(casillasP1.getxPos() - 20, casillasP1.getyPos() - 30, 30, 30);

                RepintaFichaSec(casillasP2, graphicsP2, reversaP2);

                //En caso de ser par se mueve a la derecha
                //Al ser impar se mueve a la izquierda
                if (casillasP1.getContFila() % 2 == 0) {
                    reversaP1 = false;
                } else {
                    reversaP1 = true;
                }

                if (!reversaP1) {
                    casillasP1.setxPos(casillasP1.getxPos() + casillasP1.getxDif());

                } else if (reversaP1) {
                    casillasP1.setxPos(casillasP1.getxPos() - casillasP1.getxDif());
                }
            }
            
            if(casillasP1.getContTotal() == casillasP2.getContTotal()){
                casillasP1.setDesembaques(casillasP1.getDesembaques()+1);
                
                ResetPosition(casillasP2, graphicsP2);
                
                reversaP2 = false;
                
                RepintaFichaPrin(casillasP1, graphicsP1, reversaP1);
            }

            bttP2.setEnabled(true);
        }
        
        //Mueve la ficha la cantidad de espacios que indicó el dado
        if (dadoP1 == 0) {
            for (int i = 0; i < dadoP2; i++) {

                casillasP2.setContColumna(casillasP2.getContColumna() + 1);

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
                graphicsP1.setColor(cP1);

                graphicsP2.setColor(cP2);

                RepintaFichaPrin(casillasP1, graphicsP1, reversaP1);

                //NUEVO
                graphicsP2.fillOval(casillasP2.getxPos() - 20, casillasP2.getyPos(), 30, 30);

                //En caso de llegar al final de esa fila
                if (casillasP2.getContColumna() == casillasP2.getLimiteColumna()) {

                    //Indica el cambio de fila de la ficha
                    casillasP2.setContFila(casillasP2.getContFila() + 1);
                    //Cambia la posición de la ficha a la siguiente fila
                    casillasP2.setyPos(casillasP2.getyPos() - casillasP2.getyDif());
                    //Se reinicia el contador de columnas
                    casillasP2.setContColumna(0);

                    //Permite que la ficha se quede en la misma posición
                    pauseP2 = true;

                    //Activacion del movimiento en reversaP1
                    if (!reversaP2) {
                        reversaP2 = true;

                        //Desactivación del movimiento en reversaP1
                    } else {
                        reversaP2 = false;
                    }
                }

                //La ficha se mueve de izquierda a derecha
                if (!reversaP2 && !pauseP2) {
                    casillasP2.setxPos(casillasP2.getxPos() + casillasP2.getxDif());

                    //La ficha se mueve de derecha a izquierda (en reversaP1)
                } else if (reversaP2 && !pauseP2) {
                    casillasP2.setxPos(casillasP2.getxPos() - casillasP2.getxDif());

                    //Se reactiva el movimiento de la ficha
                } else {
                    pauseP2 = false;
                }
            }

            //En caso de haber caído en una casilla especial
            if (casillasP2.VerificadorEscaleras() || casillasP2.VerificadorSerpientes()) {
                //Se modifica la posición en base a las casillas especiales

                casillasP2.CasillasEscalera();
                casillasP2.CasillaSerpiente();

                try {
                    Thread.sleep(500);
                    jLabel1.repaint();
                    Thread.sleep(10);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR",
                            JOptionPane.ERROR_MESSAGE);
                }

                graphicsP2.setColor(cP2);

                graphicsP2.fillOval(casillasP2.getxPos() - 20, casillasP2.getyPos(), 30, 30);

                RepintaFichaPrin(casillasP1, graphicsP1, reversaP1);

                //En caso de ser par se mueve a la derecha
                //Al ser impar se mueve a la izquierda
                if (casillasP2.getContFila() % 2 == 0) {
                    reversaP2 = false;
                } else {
                    reversaP2 = true;
                }

                if (!reversaP2) {
                    casillasP2.setxPos(casillasP2.getxPos() + casillasP2.getxDif());

                } else if (reversaP2) {
                    casillasP2.setxPos(casillasP2.getxPos() - casillasP2.getxDif());
                }
            }
            
            if(casillasP2.getContTotal() == casillasP1.getContTotal()){
                casillasP2.setDesembaques(casillasP2.getDesembaques()+1);
                
                ResetPosition(casillasP1, graphicsP1);
                reversaP1 = false;
                
                RepintaFichaSec(casillasP2, graphicsP2, reversaP2);
            }

            bttP1.setEnabled(true);
        }
    }
    
    private void RepintaFichaSec(Casillas casillasSec, Graphics graphicSec, boolean revSec) {
        if (casillasSec.getContTotal() == 0) {
            graphicSec.fillOval(casillasSec.getxPos() - 20, casillasSec.getyPos(), 30, 30);
        } else if (casillasSec.getContColumna() == 0) {
            graphicSec.fillOval(casillasSec.getxPos() - 20, casillasSec.getyPos() + casillasSec.getyDif(), 30, 30);
        } else {
            if (revSec) {
                graphicSec.fillOval((casillasSec.getxPos() + casillasSec.getxDif()) - 20, casillasSec.getyPos(), 30, 30);
            } else {
                graphicSec.fillOval((casillasSec.getxPos() - casillasSec.getxDif()) - 20, casillasSec.getyPos(), 30, 30);
            }
        }
    }
    
    private void RepintaFichaPrin(Casillas casillasPrin, Graphics graphicPrin, boolean revPrin) {

        if (casillasPrin.getContTotal() == 0) {
            graphicPrin.fillOval(casillasPrin.getxPos() - 20, casillasPrin.getyPos() - 30, 30, 30);

        } else if (casillasPrin.getContColumna() == 0) {
            graphicPrin.fillOval(casillasPrin.getxPos() - 20, (casillasPrin.getyPos()
                    + casillasPrin.getyDif()) - 30, 30, 30);
        } else {
            if (revPrin) {
                graphicPrin.fillOval((casillasPrin.getxPos() + casillasPrin.getxDif()) - 20, casillasPrin.getyPos() - 30, 30, 30);

            } else {
                graphicPrin.fillOval((casillasPrin.getxPos() - casillasPrin.getxDif()) - 20, casillasPrin.getyPos() - 30, 30, 30);
            }
        }
    }
    
    private void ResetPosition(Casillas casillas, Graphics graphics) {
        if (casillasP2.getContTotal() == casillasP1.getContTotal()) {
            try {
                Thread.sleep(500);
                jLabel1.repaint();
                Thread.sleep(10);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            }
            
            casillas.setContColumna(1);
            casillas.setContFila(0);
            casillas.setxPos(casillas.getxInicio()+casillas.getxDif());
            casillas.setyPos(casillas.getyInicio());
            casillas.setContTotal(1);

            graphics.fillOval(casillas.getxInicio() - 20, casillas.getyInicio() - 30, 30, 30);
        }
    }
}
