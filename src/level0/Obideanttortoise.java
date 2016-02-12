package level0;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class Obideanttortoise {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		// We are going to make an obedient tortoise that will obey our commands to draw shapes. Please note that this
		// is not a recipe, but a list step-by-step instructions.

		// 1. Make a new class, create a main method, and show the tortoise.
		Tortoise.show();
		// 2. Have the Tortoise draw a square.

		// 3. Extract this code into a drawSquare() method.
		
		// 4. Have the Tortoise draw a triangle.

		// 5. Extract this code into a drawTriangle() method.
		
		// 6. Have the Tortoise draw a circle.
       
		// 7. Extract this code into a drawCircle() method.
		//
		// 8. Ask the user which shape they want. Draw the appropriate shape depending on their answer.
		String color=JOptionPane.showInputDialog("What color do you want");
		if (color.equals("red")) {
		 Tortoise.setPenColor(Color.red);	
		}
		if (color.equals("cyan")) {
		Tortoise.setPenColor(Color.cyan);	
		}
		if (color.equals("magenta")) {
			Tortoise.setPenColor(Color.magenta);
		}
        String shape=JOptionPane.showInputDialog("What shape do you want");
        if (shape.equalsIgnoreCase("square") ) {
        drawSquare();
        }
		if (shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}
		if (shape.equalsIgnoreCase("circle")) {
			 drawCircle();
		}
		
		
		// 9. Ask the user which color they want. Color the the shape depending on their answer.
		
	}

	//
	static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			Tortoise.move(1);
			Tortoise.turn(1);
		}
	}

	static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			Tortoise.move(100);
			Tortoise.turn(120);
		}
	}

	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			Tortoise.penDown();
			Tortoise.move(100);
			Tortoise.turn(90);
			
		}
	}
}
