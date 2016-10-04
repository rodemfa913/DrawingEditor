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
public abstract class Shape extends Graphic {
    private java.awt.Color strokeColor;
    private java.awt.BasicStroke strokeStyle;
    protected java.awt.Shape shp;
    
    @Override
    public org.json.JSONObject getAtts() {
        org.json.JSONObject atts = super.getAtts(),
                style = new org.json.JSONObject();
        style.put("red", strokeColor.getRed()).put("green", strokeColor.getGreen());
        style.put("blue", strokeColor.getBlue()).put("alpha", strokeColor.getAlpha());
        style.put("width", (int) strokeStyle.getLineWidth());
        style.put("cap", strokeStyle.getEndCap()).put("join", strokeStyle.getLineJoin());
        atts.put("stroke", style);
        return atts;
    }
    @Override
    public void setAtts(org.json.JSONObject atts) {
        super.setAtts(atts);
        org.json.JSONObject style = atts.getJSONObject("stroke");
        int red = style.getInt("red"),
            green = style.getInt("green"),
            blue = style.getInt("blue"),
            alpha = style.getInt("alpha");
        strokeColor = new java.awt.Color(red, green, blue, alpha);
        red = style.getInt("width");
        green = style.getInt("cap");
        blue = style.getInt("join");
        strokeStyle = new java.awt.BasicStroke(red, green, blue);
    }
    
    @Override
    public java.awt.Rectangle getBoundary() {
        if (transform.isIdentity()) return shp.getBounds();
        java.awt.geom.Path2D.Double pack = new java.awt.geom.Path2D.Double(shp, transform);
        return pack.getBounds();
    }
    @Override
    public void draw(java.awt.Graphics2D g2) {
        java.awt.geom.AffineTransform initAt = g2.getTransform();
        g2.transform(transform);
        g2.setColor(fillColor);
        g2.fill(shp);
        g2.setTransform(initAt);
        g2.setColor(strokeColor);
        g2.setStroke(strokeStyle);
        if (transform.isIdentity()) g2.draw(shp);
        else g2.draw(new java.awt.geom.Path2D.Double(shp, transform));
    }
}
