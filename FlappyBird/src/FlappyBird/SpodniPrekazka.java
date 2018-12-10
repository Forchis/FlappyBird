package FlappyBird;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class SpodniPrekazka {

	private Image spodniprekazka;
	private int xLoc = 0, yLoc = 0;

	public SpodniPrekazka(int initialWidth, int initialHeight) {
	//	spodniprekazka = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource());
		scaleSpodniPrekazka(initialWidth, initialHeight);
	}
	

	public void scaleSpodniPrekazka(int width, int height) {
		spodniprekazka = spodniprekazka.getScaledInstance(width, height, Image.SCALE_SMOOTH);		
	}
	
	
	public Image getPipe() {
		return spodniprekazka;
	}
	

	public int getWidth() {
		return spodniprekazka.getWidth(null);
	}
	
	
	public int getHeight() {
		return spodniprekazka.getHeight(null);
	}
	
	
	public void setX(int x) {
		xLoc = x;
	}
	
	
	public int getX() {
		return xLoc;
	}
	

	public void setY(int y) {
		yLoc = y;
	}
	

	public int getY() {
		return yLoc;
	}
	

	public Rectangle getRectangle() {
		return (new Rectangle(xLoc, yLoc, spodniprekazka.getWidth(null), spodniprekazka.getHeight(null)));
	}
	

	public BufferedImage getBI() {
		BufferedImage bi = new BufferedImage(spodniprekazka.getWidth(null), spodniprekazka.getHeight(null), BufferedImage.TYPE_INT_ARGB);
		Graphics g = bi.getGraphics();
		g.drawImage(spodniprekazka, 0, 0, null);
		g.dispose();
		return bi;
	}
}