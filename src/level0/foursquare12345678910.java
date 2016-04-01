package level0;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class foursquare12345678910 {

	// 2. Create a new Robot
	Robot dumby = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		dumby.setSpeed(10);
		// 5. Set the pen width to 5
		dumby.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 4; i++) {
			dumby.turn(90);
			drawSquare();
		}
		// 7. Set the pen color to random

		// 1. Call the drawSquare() method

		// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		for (int i = 0; i < 4; i++) {
			dumby.setRandomPenColor();
			dumby.penDown();
			dumby.move(500);
			dumby.turn(90);

		}
	}

	public static void main(String[] args) {
		new foursquare12345678910().go();
	}

}
