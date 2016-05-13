package level0;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class tortoiseshapechoosre456 {
	public static void main(String[] args) {
		String shape = JOptionPane.showInputDialog("What shape do you want?square, triangle, or circle");
		if (shape.equals("square")) {
			for (int i = 0; i < 4; i++) {
				Tortoise.setSpeed(10);
				Tortoise.move(100);
				Tortoise.turn(90);
			}
		}
		if (shape.equals("triangle")) {
			for (int i = 0; i < 3; i++) {
				Tortoise.setSpeed(10);
				Tortoise.move(100);
				Tortoise.turn(120);
			}

		}
		if (shape.equals("circle")) {
			for (int i = 0; i <400 ; i++) {
				Tortoise.setSpeed(10);
				Tortoise.move(1);
				Tortoise.turn(360/200);
			}

		}

	}
}
