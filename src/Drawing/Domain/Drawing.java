/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing.Domain;

import Drawing.JavaFX.IPaintable;
import Drawing.JavaFX.JavaFXPaintable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thomas
 */
public class Drawing {
    
    private String name;
    private int width;
    private int height;
    private List<DrawingItem> items;

    /**
     * Get the value of height
     *
     * @return the value of height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set the value of height
     *
     * @param height new value of height
     */
    public void setHeight(int height) {
        this.height = height;
    }


    /**
     * Get the value of width
     *
     * @return the value of width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Set the value of width
     *
     * @param width new value of width
     */
    public void setWidth(int width) {
        this.width = width;
    }


    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param name
     * @param width
     * @param height
     */
    public Drawing(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
        
        items = new ArrayList<>();
    }
    public void addItem(DrawingItem item)
    {
        items.add(item);
    }
    
    public Boolean revert(DrawingItem oldItem, DrawingItem newItem){
        newItem.previousState = oldItem;
        items.add(newItem);
        items.remove(oldItem);
        return true;
        
    }
    
    public Boolean Overlaps(DrawingItem item)
    {
        ///
        return false;
    }

    @Override
    public String toString() {
        return "Drawing{" + "name=" + name + ", width=" + width + ", height=" + height + '}';
    }

    public void paint(IPaintable paintable) {
        for (DrawingItem item : items) {
            System.out.println(item);
            item.paint(paintable);
        }
    }
    
    
    

}
