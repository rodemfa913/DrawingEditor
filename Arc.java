/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwged;

/**
 * Represents an elliptical arc.
 * @author Rodemfa913
 */
public class Arc extends Box {
    /**
     * Creates an arc with location (0, 0), size (0, 0) and angular extents (start = 0, extent = 0).
     * Angles are measured in degrees, start in the direction of the positive X axis and increase
     * toward the direction of the positive Y axis (clockwise direction).
     */
    public Arc() {
        shp = new java.awt.geom.Arc2D.Double();
    }
    
    @Override
    public org.json.JSONObject getAtts() {
        org.json.JSONObject atts = super.getAtts();
        java.awt.geom.Arc2D.Double arc = (java.awt.geom.Arc2D.Double) shp;
        atts.put("start", -(int) arc.start).put("extent", -(int) arc.extent);
        return atts;
    }
    /**
     * Set the attributes for the arc.
     * @param atts
     */
    @Override
    public void setAtts(org.json.JSONObject atts) {
        super.setAtts(atts);
        java.awt.geom.Arc2D.Double arc = (java.awt.geom.Arc2D.Double) shp;
        arc.x = x - width / 2.0;
        arc.y = y - height / 2.0;
        arc.width = width;
        arc.height = height;
        arc.start = -atts.getInt("start");
        arc.extent = -atts.getInt("extent");
    }
    
    @Override
    public java.awt.Rectangle getBoundary() {
        java.awt.geom.Path2D.Double pack = new java.awt.geom.Path2D.Double(shp, transform);
        return pack.getBounds();
    }
}
