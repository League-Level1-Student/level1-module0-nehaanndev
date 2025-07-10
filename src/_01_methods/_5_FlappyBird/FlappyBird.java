package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int birdX = 400;
    int birdY = 300;
    int gravity = 1;
    int birdYVelocity = -10;
    int pipeX = 800;
    int upperPipeY = 0;
    int lowerPipeHeight = 600;
    int upperPipeHeight = (int) random(100, 400);
    int pipeGap = 250;
    int lowerpipeY = upperPipeHeight + pipeGap;
    int pipeWidth = 150;
    int score = 0;
    




    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	teleportPipes();
    }
    
    
    public void teleportPipes() {
    	background(100, 225, 250);
    	fill(10, 250, 50);
    	rect(pipeX, upperPipeY, pipeWidth, upperPipeHeight);
    	rect(pipeX, lowerpipeY, pipeWidth, lowerPipeHeight);
    	if (pipeX < -20) {
    		pipeX = 800;
    	    upperPipeHeight = (int) random(100, 400);
    	    lowerpipeY = upperPipeHeight + pipeGap;
    		
    	}
    	pipeX -= 10;
    }

    @Override
    public void draw() {
    	teleportPipes();
    	fill(250, 175, 50);
    	stroke(0, 0, 0);
    	ellipse(birdX, birdY, 50, 50);
    	birdY += birdYVelocity;
    	birdYVelocity += gravity;
    
    	if (intersectsPipes() == true) {
    		fill(10,150,100);
    		rect(0,0,800,600);
    		fill (0,0,0);
    		rect(100,100,600,400);
    		fill (225,250,100);
    	    textSize(150);
    		text("GAME", 175, 250);
    		text ("OVER", 175, 400);
    		score = 0;
    	}else {
    	fill (0,0,0);
    	textSize(25);
    	score += 1;
    	text("Score:" + score , 50, 50);
    	}
    	
    }
    @Override
    public void mousePressed() {
    	birdYVelocity = -10;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
    boolean intersectsPipes() { 
        if (birdY > upperPipeY && birdX > pipeX && birdX < (pipeX+pipeWidth)){
           return true; }
       else if (birdY>lowerpipeY && birdX > pipeX && birdX < (pipeX+pipeWidth)) {
           return true; }
       else { return false; }
}

}
