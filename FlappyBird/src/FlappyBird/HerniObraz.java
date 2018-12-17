package FlappyBird;

public class HerniObraz {
	
	private int screenWidth;
	private int screenHeight;
	private boolean isSplash = true;

public HerniObraz (int screenWidth, int screenHeight, boolean isSplash) {
	this.screenWidth = screenWidth;
	this.screenHeight = screenHeight;
	this.isSplash = isSplash;
}


public void paintComponent(Graphics G) {
	super.paintComponent(g);
	}
}
