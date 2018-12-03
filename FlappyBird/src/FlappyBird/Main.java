package FlappyBird;

public class Main implements Runnable{
	
	private int width = 12801;
	private int height = 720;

	private Thread thread;
	private boolean running = false;
	
	
	private void start(){
		running = false;
		thread = new Thread(this, "Hra"); 
		thread.start();
		
	}
	
	public void run(){
		while (running){
			update();
			render();
		}
	}
	
	private void update() {
		
	}
	
	public void render() {
		
	}
	
	public static void main(String[] args){
		new Main().start();
	}

}
