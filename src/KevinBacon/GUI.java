/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KevinBacon;

import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Brenda
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() throws IOException {
        this.setUndecorated(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        b_ingresar.setIcon(new ImageIcon("./src/Imagenes/entrar-.png"));
        b_ingresar.setRolloverIcon(new ImageIcon("./src/Imagenes/entrar.png"));
        b_ingresar.setVisible(true);
        //Pantalla Completa
        Toolkit tk = Toolkit.getDefaultToolkit();
        x = (int) tk.getScreenSize().getWidth();
        y = (int) tk.getScreenSize().getHeight();
        BufferedImage bi = ImageIO.read(new File("./src/Imagenes/fondo.png"));
        Image img = Toolkit.getDefaultToolkit().createImage(bi.getSource()).getScaledInstance(x, y, 0);
        Fondo.setIcon(new ImageIcon(img));
        Fondo.setLocation(0, 0);
        Fondo.setSize(x, y);
        this.setSize(x, y);
        menu.setOpaque(false);
        menu1.setOpaque(false);
        ((PanelGrafo)menu1).setTransparentImage();
        menu.setLocation((x / 2) - 150, y / 5);

        //
        menu1.setVisible(false);
        g = new SparseMultigraph<>();
        historial= new Stack();
        leer(new File("./default.txt"));
        System.out.println(g.toString());
        //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu1 = new PanelGrafo();
        menu = new javax.swing.JPanel();
        b_ingresar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        menu1.setBackground(new java.awt.Color(255, 255, 255));
        menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(menu1);
        menu1.setBounds(260, 20, 830, 540);

        menu.setBackground(new java.awt.Color(255, 255, 255));

        b_ingresar.setContentAreaFilled(false);
        b_ingresar.setFocusable(false);
        b_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ingresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(b_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(b_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );

        getContentPane().add(menu);
        menu.setBounds(20, 20, 230, 220);
        getContentPane().add(Fondo);
        Fondo.setBounds(10, 570, 0, 60);

        jMenu1.setText("File");

        jMenuItem1.setText("Cargar ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ingresarActionPerformed
        try {
            menu.setVisible(false);
            menu1.setVisible(true);
            BufferedImage bi = ImageIO.read(new File("./src/Imagenes/fondo2.png"));
            Image img = Toolkit.getDefaultToolkit().createImage(bi.getSource()).getScaledInstance(x, y, 0);
            Fondo.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_b_ingresarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        leer(cargar());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MousePressed
        try {
            ((PanelGrafo)menu1).addImage(ImageIO.read(new File("./src/Imagenes/star.png")), evt.getX(), evt.getY());
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menu1MousePressed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUI().setVisible(true);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public File cargar() {
        try {
            this.setAlwaysOnTop(false);
            JFileChooser jfc = new JFileChooser();
            FileFilter filtro = new FileNameExtensionFilter("Hollywood", "txt");
            jfc.setFileFilter(filtro);
            File archivo = null;
            int op = jfc.showOpenDialog(null);
            if (op == JFileChooser.APPROVE_OPTION) {
                archivo = jfc.getSelectedFile();
                return archivo;
            } else {
                return null;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar el archivo", "ERROR", 2);
            return null;
        }
    }

    public boolean leer(File archivo) {
        Scanner sc = null;
        try {
            if (archivo != null) {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    //Lectura del Archivo
                    String nombre1 = sc.next();
                    String relacion = sc.next();
                    String nombre2 = sc.next();
                    nombre1 = nombre1.replace("\n", "").replace("\r", "");
                    relacion = relacion.replace("\n", "").replace("\r", "");
                    nombre2 = nombre2.replace("\n", "").replace("\r", "");
                    nombre1 = nombre1.toUpperCase();
                    relacion = relacion.toUpperCase();
                    nombre2 = nombre2.toUpperCase();
                    String[] Actor1 = nombre1.split("//");
                    String[] Actor2 = nombre2.split("//");
                    crearGrafo(Actor1, Actor2, relacion);
                }
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Formato Invalido", "ERROR", 2);
            return false;
        }
    }

    public void drawPic() throws IOException {
        BufferedImage foto = ImageIO.read(new File("./src/Imagenes/star.png"));
        Graphics2D g = foto.createGraphics();
        g.setFont(new Font("SansSerif", Font.BOLD, 10));
        g.drawString("Isaias del Valle", 40, 69);
        Image img;
        img = Toolkit.getDefaultToolkit().createImage(foto.getSource()).getScaledInstance(150, 150, 0);
    }

    public void crearGrafo(String[] Actor1, String[] Actor2, String relacion) {
        Actor temp1 = null;
        Actor temp2 = null;
        try {
            //Busqueda de Existencia
            if (g.getVertices() !=null) {
                for (Actor temp : g.getVertices()) {
                    if ((Actor1[0] + " " + Actor1[1]).equals(temp.getNombreCompleto())) {
                        temp1 = temp;
                    }
                    if ((Actor2[0] + " " + Actor2[1]).equals(temp.getNombreCompleto())) {
                        temp2 = temp;
                    }
                }
            }
            //Creacion
            if (temp1 == null && temp2 == null) {
                temp1 = new Actor((Actor1[0] + " " + Actor1[1]), Integer.parseInt(Actor1[2]), Actor1[3]);
                historial.push("Se leyo de un Archvio y se creo el Actor "+temp1.toString());
                temp2 = new Actor((Actor2[0] + " " + Actor2[1]), Integer.parseInt(Actor2[2]), Actor2[3]);
                historial.push("Se leyo de un Archvio y se creo el Actor "+temp2.toString());
                if(Actor1.length>4){
                    for (int i = 4; i < Actor1.length; i++) {
                        String[] pelicula=Actor1[i].split("-");
                        historial.push("Se leyo de un Archvio y se agrego la pelicula "+pelicula[0]+" al actor "+temp1.toString());
                        temp1.addParticapado(new Pelicula(pelicula[0],Integer.parseInt(pelicula[1]),pelicula[2]));
                    }
                }
                if(Actor2.length>4){
                    for (int i = 4; i < Actor2.length; i++) {
                        String[] pelicula=Actor2[i].split("-");
                        historial.push("Se leyo de un Archvio y se agrego la pelicula "+pelicula[0]+" al actor "+temp2.toString());
                        temp2.addParticapado(new Pelicula(pelicula[0],Integer.parseInt(pelicula[1]),pelicula[2]));
                    }
                }
                
                
                g.addVertex(temp1);
                g.addVertex(temp2);
            }else if (temp1==null){
                temp1 = new Actor((Actor1[0] + " " + Actor1[1]), Integer.parseInt(Actor1[2]), Actor1[3]);
                if(Actor1.length>4){
                    for (int i = 4; i < Actor1.length; i++) {
                        String[] pelicula=Actor1[i].split("-");
                        historial.push("Se leyo de un Archvio y se agrego la pelicula "+pelicula[0]+" al actor "+temp1.toString());
                        temp1.addParticapado(new Pelicula(pelicula[0],Integer.parseInt(pelicula[1]),pelicula[2]));
                    }
                }
                historial.push("Se leyo de un Archvio y se creo el Actor "+temp1.toString());
                g.addVertex(temp1);
            }else if(temp2==null){
                temp2 = new Actor((Actor2[0] + " " + Actor2[1]), Integer.parseInt(Actor2[2]), Actor2[3]);
                if(Actor2.length>4){
                    for (int i = 4; i < Actor2.length; i++) {
                        String[] pelicula=Actor2[i].split("-");
                        historial.push("Se leyo de un Archvio y se agrego la pelicula "+pelicula[0]+" al actor "+temp2.toString());
                        temp2.addParticapado(new Pelicula(pelicula[0],Integer.parseInt(pelicula[1]),pelicula[2]));
                    }
                }
                historial.push("Se leyo de un Archvio y se creo el Actor "+temp2.toString());
                g.addVertex(temp2);
            }
            
            if(!temp1.getNombreCompleto().equals(temp2.getNombreCompleto())){
                boolean pasar=true;
                for (Relaciones temp: g.getEdges()) {
                    if(temp.getA1().equals(temp1.getNombreCompleto()) && temp.getA2().equals(temp2.getNombreCompleto())){
                        pasar=false;
                    }
                }
                if(pasar){
                    historial.push("Se leyo de un Archvio y se agrego la relacion "+relacion+" entre "+temp1.toString()+" y "+temp2.toString());
                    g.addEdge(new Relaciones(relacion,temp1.getNombreCompleto(),temp2.getNombreCompleto()), temp1, temp2);
                }  
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al crear el grafo", "ERROR", 2);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton b_ingresar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menu1;
    // End of variables declaration//GEN-END:variables
    int x;
    int y;
    Graph<Actor, Relaciones> g;
    Stack historial;
}