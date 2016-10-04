/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing.Domain;

import java.awt.Point;
import Drawing.Override.Color;
import java.io.File;

/**
 *
 * @author Thomas
 */
public class Image extends DrawingItem{
    
    private File file;
    private double size;

    /**
     * Get the value of size
     *
     * @return the value of size
     */
    public double getSize() {
        return size;
    }

    /**
     * Set the value of size
     *
     * @param size new value of size
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Get the value of file
     *
     * @return the value of file
     */
    public File getFile() {
        return file;
    }

    /**
     * Set the value of file
     *
     * @param file new value of file
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     *
     * @param file
     * @param size
     * @param anchor
     * @param color
     * @param previousState
     */
    public Image(File file, double size, Point anchor, Color color, DrawingItem previousState) {
        super(anchor, color, previousState);
        this.file = file;
        this.size = size;
    }

    /**
     *
     * @param file
     * @param size
     * @param anchor
     * @param color
     */
    public Image(File file, double size, Point anchor, Color color) {
        super(anchor, color);
        this.file = file;
        this.size = size;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "Image{" + "file=" + file + ", size=" + size + '}';
    }

    @Override
    public boolean insideBoundingBox(Point point) {
        return false;
    }

    
    
    

}
