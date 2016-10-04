/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing.Override;

/**
 *
 * @author Thomas
 */
public class Color {
    private int red;

    private int green;

    private int blue;
    
    private double opacity;

    //<editor-fold defaultstate="collapsed" desc="Properties">
    /**
     * Get the red level
     * @return 
     */
    public int getRed() {
        return red;
    }

    /**
     * Set the red level
     * @param red 
     */
    public void setRed(int red) {
        this.red = red;
    }

    /**
     * Get the green level
     * @return 
     */
    public int getGreen() {
        return green;
    }

    /**
     * Set the green level
     * @param green 
     */
    public void setGreen(int green) {
        this.green = green;
    }

    /**
     * Get the blue level
     * @return 
     */
    public int getBlue() {
        return blue;
    }

    /**
     * Set the blue level
     * @param blue 
     */
    public void setBlue(int blue) {
        this.blue = blue;
    }

    /**
     * Get the opacity level
     * @return 
     */
    public double getOpacity() {
        return opacity;
    }
    
    /**
     * Set the opacity level
     * @param opacity 
     */
    public void setOpacity(double opacity) {
        this.opacity = opacity;
    }
    //</editor-fold>
    
    /**
     * Makes a color with default black
     */
    public Color() {
        red = 0;
        green = 0;
        blue = 0;
        opacity = 0;
    }
    
    /**
     * Makes a color using RGB values
     * @param red
     * @param green
     * @param blue 
     */
    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        opacity = 0;
    }

    /**
     * Makes a color using RGB values and an opacity
     * @param red
     * @param green
     * @param blue
     * @param opacity 
     */
    public Color(int red, int green, int blue, double opacity) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.opacity = opacity;
    }
    
    /**
     * Return the JavaFX color object
     * @return 
     */
    public javafx.scene.paint.Color fromRGB() {
        return javafx.scene.paint.Color.rgb(red, green, blue, opacity);
    }
}
