package FlappyBird;

public class Main implements Runnable{
	
	private int width = 12801;
	private int height = 720;

	private Thread thread;
	
	private void start(){
		thread = new Thread(this, "Hra"); 
		thread.start();
	}
	
	public void run(){
		
	}
	
	public static void main(String[] args) {
		new Main().start();
	}

}
