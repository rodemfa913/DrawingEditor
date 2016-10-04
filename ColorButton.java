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
public class ColorButton extends javax.swing.JButton {
    private java.awt.Color currentColor;
    
    public ColorButton() {
        super();
        setBackground(java.awt.Color.WHITE);
        setMargin(new java.awt.Insets(0, 0, 0, 0));
        currentColor = new java.awt.Color(0, 0, 0, 255);
        setToolTipText("rgba(0, 0, 0, 255)");
        addActionListener((java.awt.event.ActionEvent evt) -> {
            java.awt.Color newColor = javax.swing.JColorChooser.showDialog(this, "Choose a color", currentColor);
            if (newColor != null) {
                currentColor = newColor;
                setToolTipText();
            }
        });
    }
    
    public java.awt.Color getColor() {return currentColor;}
    public void setColor(java.awt.Color newColor) {
        currentColor = newColor;
        setToolTipText();
        repaint();
    }
    
    private void setToolTipText() {
        int red = currentColor.getRed();
        int green = currentColor.getGreen();
        int blue = currentColor.getBlue();
        int alpha = currentColor.getAlpha();
        setToolTipText("rgba(" + red + ", " + green + ", " + blue + ", " + alpha + ")");
    }
    
    @Override
    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        java.awt.Insets ins = getInsets();
        int x = ins.left;
        int y = ins.top;
        int width = getWidth() - x - ins.right;
        int height = getHeight() - y - ins.bottom;
        g.setColor(currentColor);
        g.fillRect(x, y, width / 2, height);
        int red = currentColor.getRed();
        int green = currentColor.getGreen();
        int blue = currentColor.getBlue();
        g.setColor(new java.awt.Color(red, green, blue, 255));
        g.fillRect(x + width / 2, y, width / 2, height);
    }
}
