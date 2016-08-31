/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing.Domain;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Thomas
 */
public abstract class DrawingItem implements Comparable<DrawingItem>{
    
    private Point anchor;
    private Color color;
    private DrawingItem previousState;

    /**
     * Get the value of previousState
     *
     * @return the value of previousState
     */
    public DrawingItem getPreviousState() {
        return previousState;
    }

    /**
     * Get the value of color
     *
     * @return the value of color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Set the value of color
     *
     * @param color new value of color
     */
    public void setColor(Color color) {
        this.color = color;
    }


    /**
     * Get the value of anchor
     *
     * @return the value of anchor
     */
    public Point getAnchor() {
        return anchor;
    }

    /**
     * Set the value of anchor
     *
     * @param anchor new value of anchor
     */
    public void setAnchor(Point anchor) {
        this.anchor = anchor;
    }

    @Override
    public int compareTo(DrawingItem o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
