/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwged;

/**
 *
 * @author Rodemfa913
 */
public class DrawingPanel extends javax.swing.JPanel {
    private final java.util.ArrayList<Graphic> elements;
    private int zoomFactor;
    
    public DrawingPanel() {
        setBackground(java.awt.Color.WHITE);
        elements = new java.util.ArrayList<>();
        zoomFactor = 0;
    }
    
    public int getZoomFactor() {return zoomFactor;}
    public void setZoomFactor(int zf) {zoomFactor = zf;}
    public double getScale() {return Math.pow(2, zoomFactor / 2.0);}
    
    public void addElement(Graphic L) {
        elements.add(L);
    }
    public Graphic getElement(int index) {
        return elements.get(index);
    }
    public void removeElement(int index) {
        elements.remove(index);
    }
    public void moveElementForward(int index) {
        Graphic L = elements.remove(index);
        elements.add(index + 1, L);
    }
    public void clear() {
        elements.clear();
    }
    
    @Override
    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
        g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        java.awt.Dimension dim = getPreferredSize();
        g2.setColor(java.awt.Color.GRAY);
        g2.drawRect(0, 0, dim.width, dim.height);
        java.awt.geom.AffineTransform initAt = g2.getTransform();
        double scl = getScale();
        g2.scale(scl, scl);
        java.awt.Rectangle boundary = null;
        for (Graphic L : elements) {
            L.draw(g2);
            if (L.selected) boundary = L.getBoundary();
        }
        g2.setTransform(initAt);
        if (boundary != null) {
            boundary.x = (int) (scl * boundary.x - 2);
            boundary.y = (int) (scl * boundary.y - 2);
            boundary.width = (int) (scl * boundary.width + 4);
            boundary.height = (int) (scl * boundary.height + 4);
            g2.setColor(java.awt.Color.BLUE);
            float[] dash = {10};
            g2.setStroke(new java.awt.BasicStroke(1, 0, 0, 1, dash, 0));
            g2.draw(boundary);
        }
    }
}
