package FlappyBird;


import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;




public class Postava {
	
	private Image postava;
	private int xLoc = 0, yLoc = 0;
		
	
	public Postava( int initialWidth, int initialHeight, Stage theStage) {
		postava = new Image("/ptak.jpg", initialWidth, initialHeight, false, false);
		/*postava = new Image("C:/ptak.jpg"); 
		scaleBird(initialWidth, initialHeight);*/
		
		  theStage.setTitle( "Canvas Example" );
	         
		    Group root = new Group();
		    Scene theScene = new Scene( root );
		    theStage.setScene( theScene );
		         
		    Canvas canvas = new Canvas( 400, 200 );
		    root.getChildren().add( canvas );
		         
		    GraphicsContext gc = canvas.getGraphicsContext2D();
		         
		    gc.setFill( Color.RED );
		    gc.setStroke( Color.BLACK );
		    gc.setLineWidth(2);
		    Font theFont = Font.font( "Times New Roman", FontWeight.BOLD, 48 );
		    gc.setFont( theFont );
		   /* gc.fillText( "Hello, World!", 60, 50 );
		    gc.strokeText( "Hello, World!", 60, 50 );*/
		     
		    //Image earth = new Image( "earth.png" );
		    gc.drawImage( postava, 180, 100 );
		         
		    theStage.show();
	}
	
	public void scaleBird(int width, int height) {
		//postava = new Image("my/res/flower.png", width, height, false, false);
		//postava = postava.getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH);

	}
	

	public Image getBird() {
		return postava;
	}
	
	public int getWidth() {
		try { 
				return (int)postava.getWidth();
				
		}
		catch(Exception e) {
			return -1;
		}
	}
	
	public int getHeight() {
		try {
				return (int)postava.getHeight();
		}
		catch(Exception e) {
			return -1;
		}
	}
	
	public void setX(int x) {
		xLoc = x;
	}
	
	public void setY(int y) {
		yLoc = y;
	
	}
	
	public int getY() {
		return yLoc;
	}
	
	public int getX() {
		return xLoc;
	}
	
	public Rectangle getRectangle() {
		return (new Rectangle(xLoc, yLoc,postava.getWidth(), postava.getHeight()));
	}
	
	public BufferedImage getBI() {
		BufferedImage bi = new BufferedImage((int)postava.getWidth(), (int)postava.getHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics g = bi.getGraphics();
		//g.drawImage(postava, 0, 0, null);
		ImageView iv3 = new ImageView();
        iv3.setImage(postava);
		g.dispose();
		return bi;
		
	}
}
