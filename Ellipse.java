/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwged;

/**
 * Represents an ellipse.
 * @author Rodemfa913
 */
public class Ellipse extends Box {
    /**
     * Creates an ellipse with location (0, 0) and size (0, 0).
     */
    public Ellipse() {
        shp = new java.awt.geom.Ellipse2D.Double();
    }
    
    /**
     * Set the attributes for the ellipse.
     * @param atts
     */
    @Override
    public void setAtts(org.json.JSONObject atts) {
        super.setAtts(atts);
        java.awt.geom.Ellipse2D.Double elp = (java.awt.geom.Ellipse2D.Double) shp;
        elp.x = x - width / 2.0;
        elp.y = y - height / 2.0;
        elp.width = width;
        elp.height = height;
    }
}
