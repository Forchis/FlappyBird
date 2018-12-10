package FlappyBird;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class HorniPrekazka {
	private Image horniprekazka;
	private int xLoc = 0, yLoc = 0;
	public HorniPrekazka(int initialWidth, int initialHeight) {
		//horniprekazka = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource());
		scaleHorniPrekazka(initialWidth, initialHeight);
	}


	public void scaleHorniPrekazka(int width, int height) {
		horniprekazka = horniprekazka.getScaledInstance(width, height, Image.SCALE_SMOOTH);		
	}

	public Image getPrekazka() {
		return horniprekazka;
	}


	public int getWidth() {
		return horniprekazka.getWidth(null);
	}


	public int getHeight() {
		return horniprekazka.getHeight(null);
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
		return (new Rectangle(xLoc, yLoc, horniprekazka.getWidth(null), horniprekazka.getHeight(null)));
	}
	

	public BufferedImage getBI() {
		BufferedImage bi = new BufferedImage(horniprekazka.getWidth(null), horniprekazka.getHeight(null), BufferedImage.TYPE_INT_ARGB);
		Graphics g = bi.getGraphics();
		g.drawImage(horniprekazka, 0, 0, null);
		g.dispose();
		return bi;
	}
	}
