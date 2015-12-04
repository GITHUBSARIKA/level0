package level0;

 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLow {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101);
		// 2. Print out the random variable above
		   System.out.println(random);
		// 11. do the following 10 times
		for (int i = 0; i < 11; i++) {
			
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
                String number=JOptionPane.showInputDialog("Guess a number between 1-100");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int change=Integer.parseInt(number);
			// 5. if they guess is correct
			     if(random==change){
			      JOptionPane.showMessageDialog(null, "you win");
			      System.exit(0);
			     }
				// 6. win
			// 7. if the guess is high
			     else if(change>random)	{     
			      JOptionPane.showMessageDialog(null, "you are too high");
			     }
			     else if(change<random){
			      JOptionPane.showMessageDialog(null, "your awnser is too low");
			     }
			     
				// 8. tell them it's too high
			// 9. if the guess is low
				// 10. tell them it's too low
		}
		// 12. tell them they lose
	JOptionPane.showMessageDialog(null,"you lose");
	}
}

