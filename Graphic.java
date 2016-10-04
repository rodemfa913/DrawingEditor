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
public abstract class Graphic {
    protected final java.awt.geom.AffineTransform transform;
    protected int x, y;
    protected java.awt.Color fillColor;
    public boolean selected;
    
    public Graphic() {transform = new java.awt.geom.AffineTransform();}
    
    public org.json.JSONObject getAtts() {
        org.json.JSONObject atts = new org.json.JSONObject();
        double[] mtx = new double[6];
        transform.getMatrix(mtx);
        String trans = "matrix";
        for (double d : mtx) trans += " ".concat(Double.toString(d));
        atts.put("transform", trans);
        atts.put("x", x).put("y", y);
        org.json.JSONObject style = new org.json.JSONObject();
        style.put("red", fillColor.getRed()).put("green", fillColor.getGreen());
        style.put("blue", fillColor.getBlue()).put("alpha", fillColor.getAlpha());
        atts.put("fill", style);
        return atts;
    }
    public void setAtts(org.json.JSONObject atts) {
        transform.setToIdentity();
        String[] trans = atts.getString("transform").split("\\s+");
        int i = 0;
        while (i < trans.length) {
            double[] mtx = new double[6];
            switch(trans[i++]) {
                case "translate":
                    mtx[4] = Integer.parseInt(trans[i++]);
                    mtx[5] = Integer.parseInt(trans[i++]);
                    transform.translate(mtx[4], mtx[5]);
                    break;
                case "rotate":
                    mtx[0] = Integer.parseInt(trans[i++]);
                    transform.rotate(Math.PI * mtx[0] / 180);
                    break;
                case "scale":
                    mtx[0] = Double.parseDouble(trans[i++]);
                    mtx[3] = Double.parseDouble(trans[i++]);
                    transform.scale(mtx[0], mtx[3]);
                    break;
                case "shear":
                    mtx[2] = Double.parseDouble(trans[i++]);
                    mtx[1] = Double.parseDouble(trans[i++]);
                    transform.shear(mtx[2], mtx[1]);
                    break;
                case "matrix":
                    for (int j = 0; j < mtx.length; j++) mtx[j] = Double.parseDouble(trans[i++]);
                    transform.setTransform(mtx[0], mtx[1], mtx[2], mtx[3], mtx[4], mtx[5]);
            }
        }
        x = atts.getInt("x");
        y = atts.getInt("y");
        org.json.JSONObject style = atts.getJSONObject("fill");
        int red = style.getInt("red"),
            green = style.getInt("green"),
            blue = style.getInt("blue"),
            alpha = style.getInt("alpha");
        fillColor = new java.awt.Color(red, green, blue, alpha);
    }
    
    public abstract java.awt.Rectangle getBoundary();
    public abstract void draw(java.awt.Graphics2D g2);
}
