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
	
	//public scaleBird(int width, int height) {
		//postava = postava.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		//postava.
	

	public Image getBird() {
		return postava;
	}
	
	
	
}
