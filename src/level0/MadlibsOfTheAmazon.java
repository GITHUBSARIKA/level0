package level0;
import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
           JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river,here's how to do it...");
		// Get the user to enter an adjective
           String adjective=JOptionPane.showInputDialog("enter an adjective");
		// Get the user to enter a type of liquid
           String liquid=JOptionPane.showInputDialog("enter an liquid");
		// Get the user to enter a body part"
           String bodypart=JOptionPane.showInputDialog("enter an body part");
		// Get the user to enter a verb
           String verb=JOptionPane.showInputDialog("enter an verb");
		// Get the user to enter a place
           String place=JOptionPane.showInputDialog("enter a place");
		// Fit the user's words into this sentence, and save it in a String:
           String words=" Piranhas are more "+ adjective+" during the day, so cross the river atnight. Piranhas are attracted to fresh "+ liquid+" and will moslikely take a bite out of your"+ bodypart+" if you "+verb+ " Whatever you do, if you have an open wound, try to find another way to get back to the "+place+". Good luck!";
	       JOptionPane.showMessageDialog(null,words);

	}
}



