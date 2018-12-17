package FlappyBird;

import java.awt.Toolkit;

import javafx.scene.image.Image;




public class Postava {
	
	private Image postava;
	private int xLoc = 0, yLoc = 0;
		//obrázek postavy 
	
	public Postava( int initialWidth, int initialHeight) {
		postava = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource());//dodat cestu k obrázku
		//scaleBird(initialWidth, initialHeight);
		
	}
	
	public void scaleBird(int width, int height) {
		postava = postava.getScaledInstance(width, height, Image.SCALE_SMOOTH);

	}
	

	public Image getBird() {
		return postava;
	}
	
	public double getWidth() {
		try { 
				return postava.getWidth();
				
		}
		catch(Exception e) {
			return -1;
		}
	}
	
	public double getHeight() {
		try {
				return postava.getHeight();
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
	
	//d
	
	
}
