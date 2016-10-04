/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing.Domain;

import Drawing.JavaFX.IPaintable;
import java.awt.Point;
import Drawing.Override.Color;

/**
 *
 * @author Thomas
 */
public class Oval extends DrawingItem{
    
    private double width;
    private double height;

    /**
     *
     * @param width
     * @param height
     * @param anchor
     * @param color
     * @param previousState
     */
    public Oval(double width, double height, Point anchor, Color color, DrawingItem previousState) {
        super(anchor, color, previousState);
        this.width = width;
        this.height = height;
    }

    /**
     *
     * @param width
     * @param height
     * @param anchor
     * @param color
     */
    public Oval(double width, double height, Point anchor, Color color) {
        super(anchor, color);
        this.width = width;
        this.height = height;
    }
    /**
     * Get the value of height
     *
     * @return the value of height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set the value of height
     *
     * @param height new value of height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Get the value of width
     *
     * @return the value of width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set the value of width
     *
     * @param width new value of width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString() + "Oval{" + "width=" + width + ", height=" + height + '}';
    }

    @Override
    public boolean insideBoundingBox(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paint(IPaintable paintable) {
        paintable.paintOval(this);
    }
}
