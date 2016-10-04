/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing.Domain;

import java.awt.Point;
import Drawing.Override.Color;
import java.util.List;

/**
 *
 * @author Thomas
 */
public class Polygon extends DrawingItem{
    
        private List<Point> vertices;
        private int weight;

    /**
     * Get the value of Vertices
     *
     * @return the value of Vertices
     */
    public List<Point> getVertices() {
        return vertices;
    }
    /**
     * Get the value of Weight
     *
     * @return the value of Weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Set the value of Weight
     *
     * @param Weight new value of Weight
     */
    public void setWeight(int Weight) {
        this.weight = Weight;
    }

    /**
     *
     * @param vertices
     * @param weight
     * @param anchor
     * @param color
     * @param previousState
     */
    public Polygon(List<Point> vertices, int weight, Point anchor, Color color, DrawingItem previousState) {
        super(anchor, color, previousState);
        this.vertices = vertices;
        this.weight = weight;
    }

    /**
     *
     * @param vertices
     * @param weight
     * @param anchor
     * @param color
     */
    public Polygon(List<Point> vertices, int weight, Point anchor, Color color) {
        super(anchor, color);
        this.vertices = vertices;
        this.weight = weight;
    }
    

    @Override
    public String toString() {
        return super.toString() + "Polygon{" + "vertices=" + vertices + ", weight=" + weight + '}';
    }

    @Override
    public boolean insideBoundingBox(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
