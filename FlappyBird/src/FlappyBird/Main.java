package FlappyBird;

import javafx.*;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	    public static void main(String[] args) {
	        launch(args);
	    }
	    
	    
	    public void start(Stage primaryStage) {
	    	
	        StackPane root = new StackPane();
	        primaryStage.setScene(new Scene(root, 1280, 720));
	        primaryStage.show();
	        primaryStage.setTitle("Flappy Bird"); 
	        primaryStage.getIcons().add(new Image("/ptak.jpg"));
	        
	        Postava postava = new Postava(50,50,primaryStage);
	     
	        Group root1 = new Group();
	     
	        Canvas canvas = new Canvas( 512, 512 );
	        root1.getChildren().add( canvas );
	     
	        GraphicsContext gc = canvas.getGraphicsContext2D();
	     
	     
	     
	        final long startNanoTime = System.nanoTime();
	     
	        new AnimationTimer()
	        {
	            public void handle(long currentNanoTime)
	            {
	                double t = (currentNanoTime - startNanoTime) / 1000000000.0; 
	     
	                double x = 232 + 128 * Math.cos(t);
	                double y = 232 + 128 * Math.sin(t);
	             
	            }
	        }.start();
	     
	        	primaryStage.show();
	    }
	    
	}
	


