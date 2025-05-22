package _01_methods._1_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();

	public void run() {
		// Check the recipe to find out what code to put here
		rob.setX(50);
		rob.setY(500);
		rob.setSpeed(100);
		rob.setPenWidth(5);
		rob.penDown();
		Random r = new Random();
		for (int i = 0; i <8;i++) {
		int height = r.nextInt(3);
		if (height == 0) {
			drawHouse("small", "red");
		} else if(height == 1) {
			drawHouse("medium", "blue");
		} else if(height == 2) {
			drawHouse("large", "Pink");
		}
		}
	}

	void drawHouse (String h, String c) {
		if (c.equals("red")) {
			rob.setPenColor(150, 50, 50);
		}else if (c.equals("blue")) {
			rob.setPenColor(50, 50, 150);
		}else {
		rob.setRandomPenColor();
		}
		if (h.equals("small")){
			rob.move(60);
			pointedRoof();
			rob.move(60);
			rob.turn(90);
		}else if (h.equals("medium")){
			rob.move(120);
			pointedRoof();
			rob.move(120);
			rob.turn(90);
		}else if (h.equals("large")){
			rob.move(250);
			flatRoof();
			rob.move(250);
			rob.turn(90);
		}
		rob.setPenColor(50, 100, 50);
		rob.turn(180);
		rob.move(30);
		rob.turn(-90);
	}
	void flatRoof () {
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
	}
	void pointedRoof () {
		rob.turn(45);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(45);
	}
	
}
