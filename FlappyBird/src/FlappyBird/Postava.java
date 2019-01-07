package FlappyBird;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;


import javafx.scene.shape.Rectangle;




public class Postava {
	
	private Image postava;
	private int xLoc = 0, yLoc = 0;
		//obrázek postavy 
	
	public Postava( int initialWidth, int initialHeight) {
		//postava = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource());//dodat cestu k obrázku
		//scaleBird(initialWidth, initialHeight);
		
	}
	
	public void scaleBird(int width, int height) {
		//postava = postava.getScaledInstance(width, height, Image.SCALE_SMOOTH);

	}
	

	public Image getBird() {
		return postava;
	}
	
	public int getWidth() {
		try { 
				return (int)postava.getWidth(null);
				
		}
		catch(Exception e) {
			return -1;
		}
	}
	
	public int getHeight() {
		try {
				return (int)postava.getHeight(null);
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
		return (new Rectangle(xLoc, yLoc,postava.getWidth(null), postava.getHeight(null)));
	}
	
	public BufferedImage getBI() {
		BufferedImage bi = new BufferedImage((int)postava.getWidth(null), (int)postava.getHeight(null), BufferedImage.TYPE_INT_ARGB);
		Graphics g = bi.getGraphics();
		g.drawImage(postava, 0, 0, null);
		g.dispose();
		return bi;
		
	}
}
