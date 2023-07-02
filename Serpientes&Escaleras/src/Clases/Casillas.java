package Clases;
// finalizado

public class Casillas {

    private int xInicio, yInicio, xDif, yDif, totalCasillas, limiteColumna,
            contFila, contColumna, contTotal, xPos, yPos, serpientesBajadas, escalerasSubidas, desembaques;

    private boolean primerTablero;

    public Casillas() {
    }

    public Casillas(int xInicio, int yInicio, int xDif, int yDif, int totalCasillas, int limiteColumna, boolean primerTablero) {
        this.xInicio = xInicio;
        this.yInicio = yInicio;
        this.xDif = xDif;
        this.yDif = yDif;
        this.totalCasillas = totalCasillas;
        this.limiteColumna = limiteColumna;
        this.contFila = 0;
        this.contColumna = 0;
        this.contTotal = 0;
        this.xPos = xInicio;
        this.yPos = yInicio;
        this.primerTablero = primerTablero;
        this.serpientesBajadas = 0;
        this.escalerasSubidas = 0;
        this.desembaques = 0;
    }

    public int getxInicio() {
        return xInicio;
    }

    public void setxInicio(int xInicio) {
        this.xInicio = xInicio;
    }

    public int getyInicio() {
        return yInicio;
    }

    public void setyInicio(int yInicio) {
        this.yInicio = yInicio;
    }

    public int getxDif() {
        return xDif;
    }

    public void setxDif(int xDif) {
        this.xDif = xDif;
    }

    public int getyDif() {
        return yDif;
    }

    public void setyDif(int yDif) {
        this.yDif = yDif;
    }

    public int getTotalCasillas() {
        return totalCasillas;
    }

    public void setTotalCasillas(int totalCasillas) {
        this.totalCasillas = totalCasillas;
    }

    public int getContFila() {
        return contFila;
    }

    public void setContFila(int contFila) {
        this.contFila = contFila;
    }

    public int getContColumna() {
        return contColumna;
    }

    public void setContColumna(int contColumna) {
        this.contColumna = contColumna;
    }

    public int getContTotal() {
        return contTotal;
    }

    public void setContTotal(int contTotal) {
        this.contTotal = contTotal;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getLimiteColumna() {
        return limiteColumna;
    }

    public void setLimiteColumna(int limiteColumna) {
        this.limiteColumna = limiteColumna;
    }

    public int getSerpientesBajadas() {
        return serpientesBajadas;
    }

    public void setSerpientesBajadas(int serpientesBajadas) {
        this.serpientesBajadas = serpientesBajadas;
    }

    public int getEscalerasSubidas() {
        return escalerasSubidas;
    }

    public void setEscalerasSubidas(int escalerasSubidas) {
        this.escalerasSubidas = escalerasSubidas;
    }

    public int getDesembaques() {
        return desembaques;
    }

    public void setDesembaques(int desembaques) {
        this.desembaques = desembaques;
    }

    //Cambia todos los valores de posición de la ficha en caso de caer en el inicio de una escalera
    public void CasillasEscalera() {
        if (primerTablero) {
            switch (getContTotal()) {
                case 3:
                    setxPos(355);
                    setyPos(124);
                    setContTotal(22);
                    setContColumna(4);
                    setContFila(3);
                    
                    break;

                case 5:
                    setxPos(635);
                    setyPos(278);
                    setContTotal(8);
                    setContColumna(2);
                    setContFila(1);

                    break;
                    
                case 11:
                    setxPos(215);
                    setyPos(47);
                    setContTotal(26);
                    setContColumna(2);
                    setContFila(4);

                    break;
                    
                case 20:
                    setxPos(635);
                    setyPos(47);
                    setContTotal(29);
                    setContColumna(5);
                    setContFila(4);
            
                    break;
            }
        } else {
            switch (getContTotal()) {
                case 4:
                    setxPos(539);
                    setyPos(253);
                    setContTotal(19);
                    setContColumna(5);
                    setContFila(2);

                    break;
                    
                case 17:
                    setxPos(422);
                    setyPos(88);
                    setContTotal(39);
                    setContColumna(4);
                    setContFila(5);

                    break;
                    
                case 22:
                    setxPos(773);
                    setyPos(88);
                    setContTotal(36);
                    setContColumna(1);
                    setContFila(5);

                    break;
                    
                case 31:
                    setxPos(188);
                    setyPos(33);
                    setContTotal(44);
                    setContColumna(2);
                    setContFila(6);
            }
        }
    }

    //Cambia todos los valores de posición de la ficha en caso de caer en la cabeza de una serpiente
    public void CasillaSerpiente() {
        if (primerTablero) {
            switch (getContTotal()) {
                case 17:
                    setxPos(495);
                    setyPos(355);
                    setContTotal(4);
                    setContColumna(4);
                    setContFila(0);

                    break;
                    
                case 19:
                    setxPos(775);
                    setyPos(278);
                    setContTotal(7);
                    setContColumna(1);
                    setContFila(1);

                    break;
                    
                case 21:
                    setxPos(495);
                    setyPos(278);
                    setContTotal(9);
                    setContColumna(3);
                    setContFila(1);

                    break;
                    
                case 27:
                    setxPos(75);
                    setyPos(355);
                    setContTotal(1);
                    setContColumna(1);
                    setContFila(0);
            }
        } else {
            switch (getContTotal()) {
                case 16:
                    setxPos(305);
                    setyPos(363);
                    setContTotal(3);
                    setContColumna(3);
                    setContFila(0);

                    break;
                    
                case 20:
                    setxPos(773);
                    setyPos(308);
                    setContTotal(8);
                    setContColumna(1);
                    setContFila(1);

                    break;
                    
                case 37:
                    setxPos(539);
                    setyPos(198);
                    setContTotal(24);
                    setContColumna(3);
                    setContFila(3);

                    break;
                    
                case 43:
                    setxPos(188);
                    setyPos(143);
                    setContTotal(30);
                    setContColumna(2);
                    setContFila(4);
            }
        }
    }

    public boolean VerificadorEscaleras() {
        if (primerTablero) {
            switch (getContTotal()) {
                case 3:
                case 5:
                case 11:
                case 20:
                    setEscalerasSubidas(getEscalerasSubidas()+1);

                    return true;

                default:
                    return false;
            }
        } else {
            switch (getContTotal()) {
                case 4:
                case 17:
                case 22:
                case 31:
                    setEscalerasSubidas(getEscalerasSubidas()+1);
                    
                    return true;

                default:
                    return false;
            }
        }
    }
    
    public boolean VerificadorSerpientes(){
        if (primerTablero) {
            switch (getContTotal()) {
                case 17:
                case 19:
                case 21:
                case 27:
                    setSerpientesBajadas(getSerpientesBajadas()+1);
                    
                    return true;

                default:
                    return false;
            }
        } else {
            switch (getContTotal()) {
                case 16:
                case 20:
                case 37:
                case 43:
                    setSerpientesBajadas(getSerpientesBajadas()+1);

                    return true;

                default:
                    return false;
            }
        }
    }
}
