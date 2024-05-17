package serpientesEscaleras;

import java.awt.Color;

public class Ficha {
    
    private int filaActual;
    private int columnaActual;
    private Color color;

    public Ficha() {
    }

    public Ficha(int filaActual, int columnaActual, Color color) {
        this.filaActual = filaActual;
        this.columnaActual = columnaActual;
        this.color = color;
    }

    public int getFilaActual() {
        return filaActual;
    }

    public void setFilaActual(int filaActual) {
        this.filaActual = filaActual;
    }

    public int getColumnaActual() {
        return columnaActual;
    }

    public void setColumnaActual(int columnaActual) {
        this.columnaActual = columnaActual;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public void mover(int nuevaFila, int nuevaColumna) {
        filaActual = nuevaFila;
        columnaActual = nuevaColumna;
    }
    
}
