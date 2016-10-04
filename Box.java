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
public abstract class Box extends Shape {
    protected int width, height;
    
    @Override
    public org.json.JSONObject getAtts() {
        org.json.JSONObject atts = super.getAtts();
        atts.put("width", width).put("height", height);
        return atts;
    }
    @Override
    public void setAtts(org.json.JSONObject atts) {
        super.setAtts(atts);
        width = atts.getInt("width");
        height = atts.getInt("height");
    }
}
