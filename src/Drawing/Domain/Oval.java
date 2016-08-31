/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing.Domain;

/**
 *
 * @author Thomas
 */
public class Oval extends DrawingItem{
    
    private double width;
    private double height;

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
  
    

    
}
