/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwged;

/**
 * Represents a rectangle.
 * @author Rodemfa913
 */
public class Rect extends Box {
    /**
     * Creates a rectangle with location (0, 0) and size (0, 0).
     */
    public Rect() {
        shp = new java.awt.geom.Rectangle2D.Double();
    }
    
    /**
     * Set the attributes for the rectangle.
     * @param atts
     */
    @Override
    public void setAtts(org.json.JSONObject atts) {
        super.setAtts(atts);
        java.awt.geom.Rectangle2D.Double rect = (java.awt.geom.Rectangle2D.Double) shp;
        rect.x = x;
        rect.y = y;
        rect.width = width;
        rect.height = height;
    }
}
