/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing.JavaFX;

import Drawing.Domain.Image;
import Drawing.Domain.Oval;
import Drawing.Domain.PaintedText;
import Drawing.Override.Color;
import java.awt.Point;


/**
 *
 * @author Thomas
 */
public interface IPaintable {
    /**
     *
     * @param color
     */
    public void setColor(Color color);
    
    /**
     * 
     * @param oval 
     */
    public void paintOval(Oval oval);
    
    /**
     * 
     * @param from
     * @param to
     * @param weight 
     */
    public void paintLine(Point from, Point to, int weight);
    
    /**
     * 
     * @param text 
     */
    public void paintText(PaintedText text);
    
    /**
     * 
     * @param image 
     */
    public void paintImage(Image image);
    
    /**
     * This method will clear the canvas
     */
    public void clear();
}
