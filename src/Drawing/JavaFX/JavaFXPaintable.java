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
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Thomas
 */
public class JavaFXPaintable implements IPaintable {
    private final GraphicsContext gc;
    
    /**
     * 
     * @param gc 
     */
    public JavaFXPaintable(GraphicsContext gc) {
        this.gc = gc;
    }
    
    @Override
    public void setColor(Color color) {
        gc.setFill(color.fromRGB());
        gc.setStroke(color.fromRGB());
    }
    
    @Override
    public void paintOval(Oval oval) {
        setColor(oval.getColor());
        gc.fillOval(oval.getAnchor().x, oval.getAnchor().y, oval.getWidth(), oval.getHeight());
    }
    
    @Override
    public void paintLine(Point from, Point to, int weight) {
        setColor(new Color());
        gc.setLineWidth(weight);
        gc.strokeLine(from.x, from.y, to.x, to.y);
    }
    
    @Override
    public void paintText(PaintedText text) {
        setColor(text.getColor());
        gc.strokeText(text.getContent(), text.getAnchor().x, text.getAnchor().y);
    }
    
    @Override
    public void paintImage(Image image) {
        setColor(new Color(255, 255, 255));
        gc.drawImage(new javafx.scene.image.Image(image.getFile().getAbsolutePath()), image.getAnchor().x, image.getAnchor().y);
    }
    
    @Override
    public void clear() {
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
    }
}
