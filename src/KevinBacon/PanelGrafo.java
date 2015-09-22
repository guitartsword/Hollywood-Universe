/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KevinBacon;

import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;

/**
 *
 * @author Isaias
 */
public class PanelGrafo extends javax.swing.JPanel {
    private Color transparent;
    private BufferedImage background;
    private double scale = 1.2;
    /**
     * Creates new form PanelGrafo
     */
    public PanelGrafo() {
        initComponents();
        transparent = new Color(0,0,0,0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void setTransparentImage(){
        background = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_4BYTE_ABGR);
        for(int i = 0; i < background.getWidth(); i++){
            for (int j = 0; j < background.getHeight(); j++) {
                background.setRGB(i, j, transparent.getRGB());
            }
        }
    }
    public void addImage(BufferedImage image, int x, int y){
        try{
            BufferedImage part = background.getSubimage(x-image.getWidth()/2, y-image.getHeight()/2, image.getWidth(), image.getHeight());
            for(int i = 0; i < part.getWidth(); i++){
                for (int j = 0; j < part.getHeight(); j++) {
                    int alpha = new Color(image.getRGB(i, j), true).getAlpha();
                    if(alpha > 40){
                        part.setRGB(i, j, image.getRGB(i, j));
                    }
                }
            }
            repaint();
            System.out.println("Nueva imagen!");
        }catch(java.awt.image.RasterFormatException e){
            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(background != null) {
            g.drawImage(background, 0, 0, this);
        }
        /*
        Graphics2D g2 = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();
        // Translate used to make sure scale is centered
        g2.translate(w/2, h/2);
        g2.scale(scale, scale);
        g2.translate(-w/2, -h/2);*/
    }    
}
