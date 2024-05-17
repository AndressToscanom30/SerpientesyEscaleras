package serpientesEscaleras;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class serpientesEscaleras extends javax.swing.JFrame {

    public serpientesEscaleras() {
        initComponents();
        this.setLocationRelativeTo(null);

        initComponents2();
    }

    private void initComponents2() {
        jPanel1.setPreferredSize(new Dimension(400, 400));
        Tablero tablero = new Tablero(0, 0, jugadoresTotales);
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(tablero, BorderLayout.CENTER);

        jbJugar1.setBorderPainted(false);
        jbJugar1.setFocusPainted(false);
        jbJugar1.setContentAreaFilled(false);

    }

    Tablero tablero = new Tablero(10, 10, new ArrayList<>());

    Dado dado = new Dado();

    List<Jugador> jugadoresTotales = new ArrayList<>();
    private int jugadorActualN = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jtpConfiguracion = new javax.swing.JPanel();
        jbJugar1 = new javax.swing.JButton();
        jlJugador1 = new javax.swing.JLabel();
        jugador1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jugador2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jlJugador4 = new javax.swing.JLabel();
        jugador3 = new javax.swing.JTextField();
        jlJugador3 = new javax.swing.JLabel();
        jugador4 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jtpTablero = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jbLanzarDado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaHistorial = new javax.swing.JTextArea();
        jbToConfiguracion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlPlayer = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtpConfiguracion.setBackground(new java.awt.Color(255, 255, 255));

        jbJugar1.setFont(new java.awt.Font("Vensim Sans Tamil", 0, 24)); // NOI18N
        jbJugar1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Andrés Toscano\\Documents\\NetBeansProjects\\SerpientesORIGINAL\\src\\main\\java\\resources\\Start.png")); // NOI18N
        jbJugar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbJugar1ActionPerformed(evt);
            }
        });

        jlJugador1.setText("Jugador 1");

        jugador1.setBackground(new java.awt.Color(102, 255, 0));
        jugador1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Andrés Toscano\\Documents\\NetBeansProjects\\SerpientesORIGINAL\\src\\main\\java\\resources\\2.png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Andrés Toscano\\Documents\\NetBeansProjects\\SerpientesORIGINAL\\src\\main\\java\\resources\\3.png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Andrés Toscano\\Documents\\NetBeansProjects\\SerpientesORIGINAL\\src\\main\\java\\resources\\4.png")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Andrés Toscano\\Documents\\NetBeansProjects\\SerpientesORIGINAL\\src\\main\\java\\resources\\5.png")); // NOI18N

        jugador2.setBackground(new java.awt.Color(255, 182, 193));

        jLabel2.setText("Jugador 2");

        jlJugador4.setText("Jugador 4");

        jugador3.setBackground(new java.awt.Color(0, 153, 255));

        jlJugador3.setText("Jugador 3");

        jugador4.setBackground(new java.awt.Color(255, 204, 51));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablero Size"));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("10x10");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("13x13");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("15x15");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addGap(6, 6, 6)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jtpConfiguracionLayout = new javax.swing.GroupLayout(jtpConfiguracion);
        jtpConfiguracion.setLayout(jtpConfiguracionLayout);
        jtpConfiguracionLayout.setHorizontalGroup(
            jtpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtpConfiguracionLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jtpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtpConfiguracionLayout.createSequentialGroup()
                        .addGroup(jtpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jtpConfiguracionLayout.createSequentialGroup()
                                .addGroup(jtpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9))
                            .addComponent(jlJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jtpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbJugar1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jtpConfiguracionLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jtpConfiguracionLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jtpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jtpConfiguracionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jtpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jtpConfiguracionLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jtpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtpConfiguracionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        jtpConfiguracionLayout.setVerticalGroup(
            jtpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtpConfiguracionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtpConfiguracionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jtpConfiguracionLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jtpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlJugador1))
                        .addGap(13, 13, 13)
                        .addGroup(jtpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbJugar1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jtpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jtpConfiguracionLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jtpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jugador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jtpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlJugador4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jtpConfiguracionLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jtpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jugador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlJugador3))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jtpConfiguracion);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );

        jbLanzarDado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jbLanzarDado.setText("Lanzar dado");
        jbLanzarDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLanzarDadoActionPerformed(evt);
            }
        });

        jtaHistorial.setEditable(false);
        jtaHistorial.setColumns(20);
        jtaHistorial.setRows(5);
        jScrollPane1.setViewportView(jtaHistorial);

        jbToConfiguracion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jbToConfiguracion.setText("Voler a \nconfiguración");
        jbToConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbToConfiguracionActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        texto.setText("Jugador en turno: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jtpTableroLayout = new javax.swing.GroupLayout(jtpTablero);
        jtpTablero.setLayout(jtpTableroLayout);
        jtpTableroLayout.setHorizontalGroup(
            jtpTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtpTableroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jtpTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jtpTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jtpTableroLayout.createSequentialGroup()
                            .addComponent(jbLanzarDado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jScrollPane1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jtpTableroLayout.createSequentialGroup()
                        .addComponent(jbToConfiguracion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        jtpTableroLayout.setVerticalGroup(
            jtpTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtpTableroLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jtpTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jtpTableroLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jbLanzarDado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbToConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jtpTablero);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -33, 750, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jbJugar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbJugar1ActionPerformed
        
        Jugador player1 = new Jugador(jugador1.getText(), 1, new Color(102,255,0));
        Jugador player2 = new Jugador(jugador2.getText(), 2, new Color(255,182,193));
        Jugador player3 = new Jugador(jugador3.getText(), 3, new Color(0,153,255));
        Jugador player4 = new Jugador(jugador4.getText(), 4, new Color(255,204,51));
        
        if (buttonGroup1.getSelection() == null) {
            
            JOptionPane.showMessageDialog(rootPane, "No puedes dejar opciones sin llenar.");
            
        } 
        
        else{
            
            int jugadores = 0;

            if (!jugador1.getText().isEmpty()){
                
                jugadoresTotales.add(player1);
                jugadores++;
            }
            
            if (!jugador2.getText().isEmpty()){
                
                jugadoresTotales.add(player2);
                jugadores++;
                
            }
            
            if (!jugador3.getText().isEmpty()){
                
                jugadoresTotales.add(player3);
                jugadores++;
                
            }
            
            if (!jugador4.getText().isEmpty()){
                
                jugadoresTotales.add(player4);
                jugadores++;
                
            }
        
            if (jugadores >= 2){
                
                tablero.setComponents(jRadioButton2, jRadioButton3, jRadioButton4, jPanel1, jTabbedPane1, jbLanzarDado, jtaHistorial);
                tablero.actualizarTablero(jugadoresTotales);
                
            }
            
            else{
                
                JOptionPane.showMessageDialog(rootPane, "Ey, mínimo deben participar 2 jugadores");
                
            }
            
        }
        
    }//GEN-LAST:event_jbJugar1ActionPerformed

    private void jbLanzarDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLanzarDadoActionPerformed

        int resultadoDado = dado.tirarDado();

        Jugador jugadorActual = jugadoresTotales.get(jugadorActualN);
        Jugador jugadorSiguiente = jugadoresTotales.get((jugadorActualN + 1) % jugadoresTotales.size());
        tablero.moverJugador(jugadorActual, resultadoDado, jtaHistorial, jbLanzarDado, jlPlayer, jugadorSiguiente);
        jugadorActualN = (jugadorActualN + 1) % jugadoresTotales.size();
        repaint();

    }//GEN-LAST:event_jbLanzarDadoActionPerformed

    private void jbToConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbToConfiguracionActionPerformed
        
        tablero.toConfiguracion();
        jugadoresTotales.clear();
        
    }//GEN-LAST:event_jbToConfiguracionActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new serpientesEscaleras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbJugar1;
    private javax.swing.JButton jbLanzarDado;
    private javax.swing.JButton jbToConfiguracion;
    private javax.swing.JLabel jlJugador1;
    private javax.swing.JLabel jlJugador3;
    private javax.swing.JLabel jlJugador4;
    private javax.swing.JLabel jlPlayer;
    private javax.swing.JTextArea jtaHistorial;
    private javax.swing.JPanel jtpConfiguracion;
    private javax.swing.JPanel jtpTablero;
    private javax.swing.JTextField jugador1;
    private javax.swing.JTextField jugador2;
    private javax.swing.JTextField jugador3;
    private javax.swing.JTextField jugador4;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
