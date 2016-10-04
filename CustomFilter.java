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
public class CustomFilter extends javax.swing.filechooser.FileFilter {
    @Override
    public boolean accept(java.io.File f) {
        return (f.isDirectory() || f.getAbsolutePath().endsWith(".txt"));
    }
    @Override
    public String getDescription() {
        return "Text files (*.txt)";
    }
}
