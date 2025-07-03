package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 400;
    int y = 300;
    int gravity = 1;
    int birdYVelocity = 0;
    int X = 0;



    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	teleportPipes();
    }
    
    
    public void teleportPipes() {
    	background(25, 50, 75);
    	fill(10, 200, 50);
    	rect(X, 500, width, height);
    	if (X > 800) {
    		X = 0;
    	}
    	X += 10;
    }

    @Override
    public void draw() {
    	teleportPipes();
    	fill(250, 175, 50);
    	stroke(0, 0, 0);
    	ellipse(x, y, 50, 50);
    	x += 10;
    	y += birdYVelocity;
    	birdYVelocity += gravity;
    	

    }
    @Override
    public void mousePressed() {
    	y = 300;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
