/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwged;

/**
 * Represents a general path.
 * @author Rodemfa913
 */
public class Path extends Shape {
    private String data;
    
    /**
     * Creates an empty path.
     */
    public Path() {
        shp = new java.awt.geom.Path2D.Double();
    }
    
    @Override
    public org.json.JSONObject getAtts() {
        org.json.JSONObject atts = super.getAtts();
        atts.put("data", data);
        return atts;
    }
    /**
     * Set the attributes of the path.
     * @param atts
     */
    @Override
    public void setAtts(org.json.JSONObject atts) {
        super.setAtts(atts);
        data = atts.getString("data");
        java.awt.geom.Path2D.Double pth = (java.awt.geom.Path2D.Double) shp;
        pth.reset();
        pth.moveTo(x, y);
        String[] cmd = data.split("\\s+");
        int i = 0;
        while (i < cmd.length) {
            java.awt.geom.Point2D.Double currPoint = (java.awt.geom.Point2D.Double) pth.getCurrentPoint();
            switch (cmd[i++]) {
                case "arcto":
                    int v0 = Integer.parseInt(cmd[i++]),
                        v1 = Integer.parseInt(cmd[i++]),
                        v2 = Integer.parseInt(cmd[i++]);
                    boolean large = cmd[i++].equals("true");
                    boolean sweep = cmd[i++].equals("true");
                    int xf = Integer.parseInt(cmd[i++]),
                        yf = Integer.parseInt(cmd[i++]);
                    arcTo(pth, currPoint, v0, v1, v2, large, sweep, xf, yf);
                    break;
                case "curveto":
                    v0 = Integer.parseInt(cmd[i++]) + (int) currPoint.x;
                    v1 = Integer.parseInt(cmd[i++])+ (int) currPoint.y;
                    v2 = Integer.parseInt(cmd[i++]) + (int) currPoint.x;
                    int v3 = Integer.parseInt(cmd[i++]) + (int) currPoint.y;
                    xf = Integer.parseInt(cmd[i++]) + (int) currPoint.x;
                    yf = Integer.parseInt(cmd[i++]) + (int) currPoint.y;
                    pth.curveTo(v0, v1, v2, v3, xf, yf);
                    break;
                case "lineto":
                    xf = Integer.parseInt(cmd[i++]) + (int) currPoint.x;
                    yf = Integer.parseInt(cmd[i++]) + (int) currPoint.y;
                    pth.lineTo(xf, yf);
                    break;
                case "moveto":
                    xf = Integer.parseInt(cmd[i++]) + (int) currPoint.x;
                    yf = Integer.parseInt(cmd[i++]) + (int) currPoint.y;
                    pth.moveTo(xf, yf);
                    break;
                case "quadto":
                    v0 = Integer.parseInt(cmd[i++]) + (int) currPoint.x;
                    v1 = Integer.parseInt(cmd[i++]) + (int) currPoint.y;
                    xf = Integer.parseInt(cmd[i++]) + (int) currPoint.x;
                    yf = Integer.parseInt(cmd[i++]) + (int) currPoint.y;
                    pth.quadTo(v0, v1, xf, yf);
                    break;
                case "close":
                    pth.closePath();
            }
        }
    }
    
    private void arcTo(java.awt.geom.Path2D.Double pth, java.awt.geom.Point2D.Double cp,
            int a, int b, int alpha, boolean large, boolean sweep, int xf, int yf) {
        double beta = Math.PI * alpha / 180; // degrees -> radians
        double z = xf * Math.cos(beta) + yf * Math.sin(beta),
               w = yf * Math.cos(beta) - xf * Math.sin(beta);
        double a2 = Math.pow(a, 2), b2 = Math.pow(b, 2);
        double s = 4 * a2 * b2 / (a2 * Math.pow(w, 2) +b2 * Math.pow(z, 2));
        if (s < 1) {
            z *= Math.sqrt(s);
            w *= Math.sqrt(s);
            s = 1;
        }
        s = Math.sqrt(s - 1);
        double cz = b * z, cw = a * w;
        if ((large && !sweep) || (!large && sweep)) {
            cz -= a * w * s;
            cw += b * z * s;
        } else {
            cz += a * w * s;
            cw -= b * z * s;
        }
        cz /= 2 * b;
        cw /= 2 * a;
        java.awt.geom.Arc2D.Double arc = new java.awt.geom.Arc2D.Double();
        arc.x = cz - a;
        arc.y = cw - b;
        arc.width = 2 * a;
        arc.height = 2 * b;
        arc.start = Math.atan2(cw / b, -cz / a) * 180 / Math.PI; // radians -> degrees
        arc.extent = Math.atan2((cw - w) / b, (z - cz) / a) * 180 / Math.PI - arc.start;
        if (sweep && arc.extent >= 0) arc.extent -= 360;
        else if (!sweep && arc.extent <= 0) arc.extent += 360;
        java.awt.geom.AffineTransform at = new java.awt.geom.AffineTransform();
        at.translate(cp.x, cp.y);
        at.rotate(beta);
        pth.append(new java.awt.geom.Path2D.Double(arc, at), true);
    }
}
