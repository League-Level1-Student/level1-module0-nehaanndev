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
        
    }

    @Override
    public void draw() {
    	background(25, 50, 75);
    	fill(10, 200, 50);
    	rect(X, 500, width, height);
    	fill(250, 175, 50);
    	stroke(0, 0, 0);
    	ellipse(x, y, 50, 50);
    	x += 10;
    	X += 10;
    	y -= birdYVelocity;
    	birdYVelocity -= gravity;

    }
    @Override
    public void mousePressed() {
    	birdYVelocity = 0;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
