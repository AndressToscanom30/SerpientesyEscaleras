package serpientesEscaleras;

import java.awt.Color;
import javax.swing.ImageIcon;

public class Jugador {

    private String nombre;
    private int position;
    private int id;
    private Color color;

    public Jugador(String nombre, int id, Color color) {
        this.nombre = nombre;
        this.id = id;
        this.position = 1;
        this.color = color;
    }
    
    public Jugador(String nombre, Color color) {
        this.nombre = nombre;
        this.color = color;
        this.position = 1;
    }

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
