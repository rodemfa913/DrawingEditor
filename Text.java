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
public class Text extends Graphic {
    private int fontName, fontStyle, fontSize;
    private String content;
    private final java.awt.Rectangle boundary;
    
    public Text() {boundary = new java.awt.Rectangle();}
    
    @Override
    public org.json.JSONObject getAtts() {
        org.json.JSONObject atts = super.getAtts();
        atts.put("font-name", fontName).put("font-style", fontStyle);
        atts.put("font-size", fontSize).put("content", content);
        return atts;
    }
    @Override
    public void setAtts(org.json.JSONObject atts) {
        super.setAtts(atts);
        fontName = atts.getInt("font-name");
        fontStyle = atts.getInt("font-style");
        fontSize = atts.getInt("font-size");
        content = atts.getString("content");
    }
    
    @Override
    public java.awt.Rectangle getBoundary() {
        if (transform.isIdentity()) return boundary.getBounds();
        java.awt.geom.Path2D.Double pack = new java.awt.geom.Path2D.Double(boundary, transform);
        return pack.getBounds();
    }
    @Override
    public void draw(java.awt.Graphics2D g2) {
        java.awt.geom.AffineTransform initAt = g2.getTransform();
        g2.transform(transform);
        g2.setColor(fillColor);
        String[] ftNames = {"Serif", "SansSerif", "Monospaced"};
        java.awt.Font font = new java.awt.Font(ftNames[fontName], fontStyle, fontSize);
        g2.setFont(font);
        java.awt.FontMetrics metrics = g2.getFontMetrics(font);
        int h = metrics.getHeight();
        boundary.x = x;
        boundary.y = y - metrics.getAscent();
        boundary.width = boundary.height = 0;
        String[] lines = content.split("\n");
        for (String line : lines) {
            int w = metrics.stringWidth(line);
            if (w > boundary.width) boundary.width = w;
            g2.drawString(line, x, y + boundary.height);
            boundary.height += h;
        }
        g2.setTransform(initAt);
    }
}
