package FlappyBird;

import static org.lwjgl.glfw.GLFW.*;

import static org.lwjgl.opengl.GL11.*;


public class Main implements Runnable{
	
	private int width = 1920;
	private int height = 1080;

	private Thread thread;
	private boolean running = false;
	
	
	private void start(){
		running = false;
		thread = new Thread(this, "Hra"); 
		thread.start();
		
	}
	
	private void init() {
		if (glfwInit() != GL_TRUE) {
			
		}
	}
	
	public void run(){
		init();
		while (running){
			update();
			render();
		}
	}
	
	private void update() {
		
	}
	
	private void render() {
		
	}
	
	public static void main(String[] args){
		new Main().start();
	}

}
