package level0;



import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class dizzytortoise {
	// TODO Auto-generated method stub


	public static void main(String[] args) {
		//
		// 1. Use the dance method to make the Tortoise spin.
		 
		 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin
		  String dizzy=JOptionPane.showInputDialog("How dizzy you want to be?1-10");
		 // that number of times.
		 int spinNumber=Integer.parseInt(dizzy);
		 dance(spinNumber);

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
