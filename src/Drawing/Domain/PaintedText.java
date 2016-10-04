/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing.Domain;

import java.awt.Point;
import Drawing.Override.Color;
import java.awt.Font;

/**
 *
 * @author Thomas
 */
public class PaintedText extends DrawingItem{
    
    private String content;
    
    private Font font;

    /**
     * Get the value of font
     *
     * @return the value of font
     */
    public Font getFont() {
        return font;
    }

    /**
     * Set the value of font
     *
     * @param font new value of font
     */
    public void setFont(Font font) {
        this.font = font;
    }

    /**
     * Get the value of content
     *
     * @return the value of content
     */
    public String getContent() {
        return content;
    }

    /**
     * Set the value of content
     *
     * @param content new value of content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     *
     * @param content
     * @param font
     * @param anchor
     * @param color
     * @param previousState
     */
    public PaintedText(String content, Font font, Point anchor, Color color, DrawingItem previousState) {
        super(anchor, color, previousState);
        this.content = content;
        this.font = font;
    }

    /**
     *
     * @param content
     * @param font
     * @param anchor
     * @param color
     */
    public PaintedText(String content, Font font, Point anchor, Color color) {
        super(anchor, color);
        this.content = content;
        this.font = font;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "PaintedText{" + "content=" + content + ", font=" + font + '}';
    }

    @Override
    public boolean insideBoundingBox(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

}
