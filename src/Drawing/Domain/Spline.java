/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing.Domain;

import Drawing.Override.Color;
import java.awt.Point;
import java.util.List;

/**
 *
 * @author Thomas
 */
public class Spline extends DrawingItem{
    
    private List<Point> points;
    private int weight;
    private int degree;

    /**
     * Get the value of degree
     *
     * @return the value of degree
     */
    public int getDegree() {
        return degree;
    }

    /**
     * Set the value of degree
     *
     * @param degree new value of degree
     */
    public void setDegree(int degree) {
        this.degree = degree;
    }


    /**
     * Get the value of weight
     *
     * @return the value of weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Set the value of weight
     *
     * @param weight new value of weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }


    /**
     * Get the value of points
     *
     * @return the value of points
     */
    public List<Point> getPoints() {
        return points;
    }

    /**
     *
     * @param points
     * @param weight
     * @param degree
     * @param anchor
     * @param color
     * @param previousState
     */
    public Spline(List<Point> points, int weight, int degree, Point anchor, Color color, DrawingItem previousState) {
        super(anchor, color, previousState);
        this.points = points;
        this.weight = weight;
        this.degree = degree;
    }

    /**
     *
     * @param points
     * @param weight
     * @param degree
     * @param anchor
     * @param color
     */
    public Spline(List<Point> points, int weight, int degree, Point anchor, Color color) {
        super(anchor, color);
        this.points = points;
        this.weight = weight;
        this.degree = degree;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "Spline{" + "points=" + points + ", weight=" + weight + ", degree=" + degree + '}';
    }

    @Override
    public boolean insideBoundingBox(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    

    
}
