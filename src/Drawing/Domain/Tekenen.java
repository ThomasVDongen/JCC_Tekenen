/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing.Domain;

import Drawing.JavaFX.JavaFXPaintable;
import Drawing.Override.Color;
import java.awt.Font;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Thomas
 */
public class Tekenen extends Application {

    //<editor-fold defaultstate="collapsed" desc="Properties">
    private Drawing drawing;
    private Canvas canvas;
    private JavaFXPaintable paintable;

    /**
     *
     * @return
     */
    public Drawing getDrawing() {
        return drawing;
    }

    /**
     *
     * @return
     */
    public Canvas getCanvas() {
        return canvas;
    }

    //</editor-fold>
    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
         launch(args);
    }

    /**
     *
     * @param stage
     */
    public void start(Stage stage) {
        //starting the scene
        stage.setResizable(false);
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 600, 500);
        //creating the controls
        Button serialize;
        serialize = new Button("Serialze Drawing");
        Button deserialize;
        deserialize = new Button("Load drawing");
        canvas = new Canvas(scene.getWidth(), scene.getHeight());
        ///adding the controls to the root
        root.getChildren().add(canvas);
        root.getChildren().add(serialize);
        root.getChildren().add(deserialize);
        //stage settings
        stage.setTitle("Drawing Tool");
        stage.setScene(scene);
        stage.show();
        //creating a drawing
        drawing = new Drawing("Main", (int)scene.getWidth(), (int)scene.getHeight());
        //creating a paintable
        paintable = new JavaFXPaintable(canvas.getGraphicsContext2D());
        //making a list of points 
        List<Point> points = new ArrayList();
        points.add(new Point(500,2000));
        points.add(new Point(300,300));
        points.add(new Point(80,80));
        //adding items to the painting
        drawing.addItem(new Oval(10, 10, new Point(10, 10), new Color(10,10,10)));
        drawing.addItem(new Spline(points, 3, 3, new Point(500,500), new Color(1,2,3)));
        //painting the drawing
        drawing.paint(paintable);
    }
    
    
}
