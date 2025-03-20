package _01_methods._1_houses;

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

		drawHouse(9, 50);

		
	}

	void drawHouse(int houseNum, int h) {
		
		for (int count = 0; count < 10; count++) {
			rob.move(100);
			rob.turn(90);
			rob.move(50);
			rob.turn(90);
			rob.move(100);
			rob.turn(90);
			rob.turn(180);
			rob.setPenColor(50, 100, 50);
			rob.move(30);
			rob.setPenColor(0,0,0);
			rob.turn(-90);

		}
	}

}
