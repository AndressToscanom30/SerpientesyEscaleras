package serpientesEscaleras;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class Tablero extends JPanel {

    private int rows;
    private int cols;

    private int[] serpientesInicio;
    private int[] serpientesFin;
    private int[] escalerasInicio;
    private int[] escalerasFin;

    private JLabel jlPlayer1;
    private JLabel jlPlayer2;
    private JLabel jlPlayer3;
    private JLabel jlPlayer4;
    
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JRadioButton jRadioButton4;
    private JTabbedPane jTabbedPane1;
    private JPanel jPanel1;
    private JButton jbLanzarDado;
    private JTextArea jtaHistorial;
    private static final int CELL_SIZE = 55;
    private List<Jugador> jugadores;

    public Tablero(int rows, int cols, List<Jugador> jugadores) {
        this.rows = rows;
        this.cols = cols;
        this.jugadores = new ArrayList<>(jugadores);
        configurarSerpientesYEscaleras(10, 10);
        inicializarJugadores();

    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBoard(g);
    }

    public void setComponents(JRadioButton jRadioButton2, JRadioButton jRadioButton3, JRadioButton jRadioButton4, JPanel jPanel1, JTabbedPane jTabbedPane1, JButton jbLanzarDado, JTextArea jtaHistorial) {

        this.jRadioButton2 = jRadioButton2;
        this.jRadioButton3 = jRadioButton3;
        this.jRadioButton4 = jRadioButton4;
        this.jPanel1 = jPanel1;
        this.jTabbedPane1 = jTabbedPane1;
        this.jbLanzarDado = jbLanzarDado;
        this.jtaHistorial = jtaHistorial;
        this.jlPlayer1 = jlPlayer1;
        this.jlPlayer2 = jlPlayer2;
        this.jlPlayer3 = jlPlayer3;
        this.jlPlayer4 = jlPlayer4;
 
    }
    
    private void drawBoard(Graphics g) {
        
        int panelWidth = getWidth();
        int panelHeight = getHeight();
        
        double CELL_SIZE_X = (double) panelWidth / cols;
        double CELL_SIZE_Y = (double) panelHeight / rows;
        
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, panelWidth, panelHeight);

        for (int row = 0; row < rows; row++) {
            
            if (row % 2 == 0) {
                
                for (int col = 0; col < cols; col++) {
                    
                    int x = (int) (col * CELL_SIZE_X);
                    int y = (int) ((rows - row - 1) * CELL_SIZE_Y);
                    int cellValue = row * cols + col + 1;

                    Color cellColor = Color.WHITE;
                    Color textColor = Color.BLACK;

                    boolean isSerpienteStart = false;
                    boolean isSerpienteEnd = false;
                    boolean isEscaleraStart = false;
                    boolean isEscaleraEnd = false;

                    for (int i = 0; i < serpientesInicio.length; i++) {
                        
                        if (cellValue == serpientesInicio[i]) {
                            
                            isSerpienteStart = true;
                            
                        }
                        
                        if (cellValue == serpientesFin[i]) {
                            
                            isSerpienteEnd = true;
                            
                        }
                        
                    }

                    for (int i = 0; i < escalerasInicio.length; i++) {
                        
                        if (cellValue == escalerasInicio[i]) {
                            
                            isEscaleraStart = true;
                            
                        }
                        
                        if (cellValue == escalerasFin[i]) {
                            
                            isEscaleraEnd = true;
                            
                        }
                        
                    }

                    if (isSerpienteStart && isSerpienteEnd) {
                        cellColor = new Color(255, 105, 97);
                    } else if (isEscaleraStart && isEscaleraEnd) {
                        cellColor = new Color(255, 235, 153);
                    } else if (isSerpienteStart || isSerpienteEnd) {
                        cellColor = new Color(255, 105, 97);
                    } else if (isEscaleraStart || isEscaleraEnd) {
                        cellColor = new Color(255, 235, 153);
                    }

                    g.setColor(cellColor);
                    g.fillRect(x, y, (int) CELL_SIZE_X, (int) CELL_SIZE_Y);
                    
                    g.setColor(Color.GRAY);
                    g.drawRect(x, y, (int) CELL_SIZE_X, (int) CELL_SIZE_Y);

                    if (cellColor.equals(Color.BLACK)) {
                        
                        textColor = Color.WHITE;
                        
                    }

                    g.setColor(textColor);
                    g.drawString(String.valueOf(cellValue), x + (int) (CELL_SIZE_X / 4), y + (int) (3 * CELL_SIZE_Y / 4));
                    
                }
                
            } 
            
            else {
                
                for (int col = cols - 1; col >= 0; col--) {
                    
                    int x = (int) (col * CELL_SIZE_X);
                    int y = (int) ((rows - row - 1) * CELL_SIZE_Y);
                    int cellValue = row * cols + (cols - col);

                    Color cellColor = Color.WHITE;
                    Color textColor = Color.BLACK;

                    boolean isSerpienteStart = false;
                    boolean isSerpienteEnd = false;
                    boolean isEscaleraStart = false;
                    boolean isEscaleraEnd = false;

                    for (int i = 0; i < serpientesInicio.length; i++) {
                        
                        if (cellValue == serpientesInicio[i]) {
                            
                            isSerpienteStart = true;
                            
                        }
                        
                        if (cellValue == serpientesFin[i]) {
                            
                            isSerpienteEnd = true;
                            
                        }
                        
                    }

                    for (int i = 0; i < escalerasInicio.length; i++) {
                        
                        if (cellValue == escalerasInicio[i]) {
                            
                            isEscaleraStart = true;
                            
                        }
                        
                        if (cellValue == escalerasFin[i]) {
                            
                            isEscaleraEnd = true;
                            
                        }
                        
                    }

                    if (isSerpienteStart && isSerpienteEnd) {
                        cellColor = new Color(255, 105, 97);
                    } else if (isEscaleraStart && isEscaleraEnd) {
                        cellColor = new Color(255, 235, 153);
                    } else if (isSerpienteStart || isSerpienteEnd) {
                        cellColor = new Color(255, 105, 97);
                    } else if (isEscaleraStart || isEscaleraEnd) {
                        cellColor = new Color(255, 235, 153);
                    }

                    g.setColor(cellColor);
                    g.fillRect(x, y, (int) CELL_SIZE_X, (int) CELL_SIZE_Y);
                    g.setColor(Color.GRAY);
                    g.drawRect(x, y, (int) CELL_SIZE_X, (int) CELL_SIZE_Y);

                    if (cellColor.equals(Color.BLACK)) {
                        
                        textColor = Color.WHITE;
                        
                    }

                    g.setColor(textColor);
                    g.drawString(String.valueOf(cellValue), x + (int) (CELL_SIZE_X / 4), y + (int) (3 * CELL_SIZE_Y / 4));
                }
            }
        }

        for (Jugador jugador : jugadores) {
            
            int position = jugador.getPosition() - 1;
            int row, col;

            if (position / cols % 2 == 0) {
                
                row = position / cols;
                col = position % cols;
                
            } 
            
            else {
                
                row = position / cols;
                col = cols - 1 - (position % cols);
                
            }

            int x = (int) (col * CELL_SIZE_X + CELL_SIZE_X / 4);
            int y = (int) ((rows - row - 1) * CELL_SIZE_Y + CELL_SIZE_Y / 4);

            g.setColor(jugador.getColor());
            g.fillOval(x, y, CELL_SIZE / 4, CELL_SIZE / 4);
            
        }

    }

    public void moverJugador(Jugador jugador, int movimiento, JTextArea area, JButton buton, JLabel jugadorActual, Jugador siguiente) {
        
        jugadorActual.setText(siguiente.getNombre());
        
        int oldPost = jugador.getPosition();
        int newPost = oldPost + movimiento;

        if (newPost > rows * cols) {
            
            newPost = oldPost;
            
        } 
        
        else if (isSerpienteInicio(newPost)) {
            
            newPost = getSerpienteFin(newPost);
            area.setText(area.getText() + jugador.getNombre() + " cayó en una serpiente en " + oldPost + " y cayó en " + newPost +".\n");
            
        } 
        
        else if (isEscaleraInicio(newPost)) {
            
            newPost = getEscaleraFin(newPost);
            area.setText(area.getText() + jugador.getNombre() + " tomó una escalera y se movió de " + oldPost + " a " + newPost + ".\n");
            
        } 
        
        else {
            
            area.setText(area.getText() + jugador.getNombre() + " se movió " + movimiento + " casillas." + "\n");
            
        }

        jugador.setPosition(newPost);

        if (newPost == rows * cols) {
            
            buton.setEnabled(false);
            JOptionPane.showMessageDialog(this, jugador.getNombre() + " ha ganado la partida.", "¡WINNER!", JOptionPane.INFORMATION_MESSAGE);
            area.setText(area.getText() + jugador.getNombre() + " se movió " + movimiento + " casillas." + "\n");
            
        }

        repaint();
        
    }

    public void actualizarTablero(List<Jugador> jugadores) {

        if (jRadioButton2.isSelected()) {
            rows = 10;
            cols = 10;
        } else if (jRadioButton3.isSelected()) {
            rows = 13;
            cols = 13;
        } else if (jRadioButton4.isSelected()) {
            rows = 15;
            cols = 15;
        }
        
        Tablero tablero = new Tablero(rows, cols, jugadores);

        jPanel1.removeAll();
        jPanel1.add(tablero, BorderLayout.CENTER);

        jPanel1.revalidate();
        jPanel1.repaint();

        jTabbedPane1.setSelectedIndex(1);

    }
    
    private void configurarSerpientesYEscaleras(int numEscaleras, int numSerpientes) {
        
        boolean creado = false;
        int maxIntentos = 10;
        int intentosRealizados = 0;

        while (!creado && intentosRealizados < maxIntentos) {
            
            if (numEscaleras <= 0 || numSerpientes <= 0) {
                
                System.err.println("El número de escaleras y serpientes debe ser positivo.");
                return;
                
            }

            Random random = new Random();
            int totalCasillas = rows * cols;
            int cantidadUbicaciones = numEscaleras + numSerpientes;

            if (totalCasillas < cantidadUbicaciones) {
                
                System.err.println("La cantidad de serpientes y escaleras excede el tamaño del tablero.");
                return;
                
            }

            serpientesInicio = new int[numSerpientes];
            serpientesFin = new int[numSerpientes];
            escalerasInicio = new int[numEscaleras];
            escalerasFin = new int[numEscaleras];

            List<Integer> casillasPosibles = new ArrayList<>();
            
            for (int i = 2; i < totalCasillas; i++) {
                
                casillasPosibles.add(i);
                
            }

            int maxIntentosUbicacion = 10000;
            creado = true;

            for (int i = 0; i < numSerpientes && creado; i++) {
                
                int inicioSerpiente = ubicarfichasSnakes(random, casillasPosibles);
                serpientesInicio[i] = inicioSerpiente;
                
                int finSerpiente = generarUbicacionFinalSerpiente(random, inicioSerpiente, casillasPosibles, maxIntentosUbicacion);
                
                if (finSerpiente == -1) {
                    
                    creado = false;
                    break;
                    
                }
                
                serpientesFin[i] = finSerpiente;
                
            }

            if (creado) {
                
                for (int i = 0; i < numEscaleras && creado; i++) {
                    
                    int inicioEscalera = ubicarfichasSnakes(random, casillasPosibles);
                    escalerasInicio[i] = inicioEscalera;
                    int finEscalera = generarUbicacionFinalEscalera(random, inicioEscalera, casillasPosibles, maxIntentosUbicacion);
                    
                    if (finEscalera == -1) {
                        
                        creado = false;
                        break;
                        
                    }
                    
                    escalerasFin[i] = finEscalera;
                    
                }
                
            }

            intentosRealizados++;
        }

        if (!creado){
            
            System.err.println("No se pudo ubicar todas las serpientes y escaleras en el tablero después de " + maxIntentos + " intentos.");
        
        }
        
    }

    private int generarUbicacionFinalSerpiente(Random random, int inicioUbicacion, List<Integer> casillasPosibles, int maxIntentos) {
        
        int intentos = 0;
        int finUbicacion = -1;

        do {
            
            try {
                
                finUbicacion = random.nextInt(Math.max(1, inicioUbicacion - 1)) + 1;
                
            } catch (IllegalArgumentException ex) {
                
                if (intentos >= maxIntentos) {
                    
                    return -1;
                }
                
                intentos++;
                continue;
                
            }

            intentos++;

            if (intentos > maxIntentos) {
                
                return -1;
            
            }
            
        } while(!casillasPosibles.contains(finUbicacion));

        casillasPosibles.remove(Integer.valueOf(finUbicacion));
        return finUbicacion;
    }

    private int generarUbicacionFinalEscalera(Random random, int ubicacionI, List<Integer> casillasHabiles, int maxIntentos){
        
        int intentos = 0;
        int finUbicacion;
        
        do {
            
            finUbicacion = random.nextInt(rows * cols - ubicacionI) + ubicacionI + 1;
            intentos++;
            
            if (intentos > maxIntentos){
                
                return -1;
                
            }
            
        } while (!casillasHabiles.contains(finUbicacion));

        casillasHabiles.remove(Integer.valueOf(finUbicacion));
        return finUbicacion;
        
    }

    private int ubicarfichasSnakes(Random random, List<Integer> casillasHabiles) {
        
        int index = random.nextInt(casillasHabiles.size());
        int ubicacion = casillasHabiles.get(index);
        casillasHabiles.remove(index);
        
        return ubicacion;
        
    }

    public void toConfiguracion(){
        
        jTabbedPane1.setSelectedIndex(0);
        jbLanzarDado.setEnabled(true);
        jtaHistorial.setText("");
        
    }

    private boolean isSerpienteInicio(int pos) {

        for (int i : serpientesInicio) {
            
            if (i == pos) {
                
                return true;
                
            }
            
        }

        return false;

    }

    private int getSerpienteFin(int pos) {
        
        for (int i = 0; i < serpientesInicio.length; i++) {
            
            if (serpientesInicio[i] == pos) {
                
                return serpientesFin[i];
                
            }
            
        }
        
        return pos;
        
    }

    private boolean isEscaleraInicio(int pos) {
        
        for (int i : escalerasInicio) {
            
            if (i == pos) {
                
                return true;
                
            }
            
        }
        
        return false;
        
    }

    private int getEscaleraFin(int pos) {
        
        for (int i = 0; i < escalerasInicio.length; i++) {
            
            if (escalerasInicio[i] == pos) {
                
                return escalerasFin[i];
                
            }
            
        }
        
        return pos;
        
    }

    private void inicializarJugadores() {
        
        for (Jugador jugador : jugadores) {
            
            jugador.setPosition(1);
            
        }
        
    }

}