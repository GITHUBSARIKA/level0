
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class spiralmaker {

	public static void main(String[] args) {
		     Tortoise.setSpeed(10);
		// 3. Make a variable to hold the number of sides and set it to 0
		      int sides=0;
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		  String shape= JOptionPane.showInputDialog("which spiral they would you like (square, triangle, or pentagon) ");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		if (shape.equals("pentagon")) {
			sides=5;
			
		}
		if (shape.equals("square")) {
			sides=4;
		}
		if (shape.equals("triangle")) {
		sides=3;	
		}
		
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
		else{
			JOptionPane.showMessageDialog(null, "sorry I don't knw how to draw a " + shape);
			
		}
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		      for (int i = 0; i < 80; i++) {
			  Tortoise.move(4*i);
			  Tortoise.turn(360/sides);
			}
		
		
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		   
	}

}




