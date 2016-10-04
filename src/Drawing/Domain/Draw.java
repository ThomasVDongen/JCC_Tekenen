/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing.Domain;

import Drawing.Override.Color;
import Drawing.JavaFX.JavaFXPaintable;
import java.awt.Point;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author thomv
 */
public class Draw extends Application {
    
    private Canvas canvas;

    private Drawing drawing;
    
    private JavaFXPaintable paintable;

    //<editor-fold defaultstate="collapsed" desc="Properties">
    /**
     * Get the value of drawing
     *
     * @return the value of drawing
     */
    public Drawing getDrawing() {
        return drawing;
    }
    
    /**
     * Get the value of canvas
     *
     * @return the value of canvas
     */
    public Canvas getCanvas() {
        return canvas;
    }
    //</editor-fold>
    
    /**
     * 
     * @param stage 
     */
    @Override
    public void start(Stage stage) {
        stage.setResizable(false);
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 600, 500);
        
        Button btn;
        btn = new Button("Start Drawing");
        btn.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            test();
        });
        
        canvas = new Canvas(scene.getWidth(), scene.getHeight());
        root.getChildren().add(canvas);
        root.getChildren().add(btn);
        
        stage.setTitle("Drawing Tool");
        stage.setScene(scene);
        stage.show();
        
        drawing = new Drawing("Main", (int)scene.getWidth(), (int)scene.getHeight());
        paintable = new JavaFXPaintable(canvas.getGraphicsContext2D());
    }
    
    /**
     * Canvas refresh
     */
    public void draw(){
        paintable.clear();
        //drawing.paint(paintable);
    }
    
    /**
     * TESTING
     */
    public void test(){
        //drawing.addItem(new Oval(new Point(10, 10), new Color(0, 0, 255), 50, 50));
        
        //drawing.addItem(new Image(new Point(1,1), new Color(255, 0, 0), new File(DrawingTool.class.getResource("C:\\Users\\thomv\\Desktop\\prosbo_hires.jpg").getFile()), 10));
        draw();
    }
    
    /**
     * 
     * @param args 
     */
    public static void main (String[] args){
        launch(args);
    }
}
