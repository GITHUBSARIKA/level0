package level0;

import javax.swing.JOptionPane;

import com.spun.util.velocity.ParseCall;

public class votingbootgh821 {
	public static void main(String[] args) {
		String frontier = JOptionPane.showInputDialog("Who will you vote for?");
		String Sarika = JOptionPane.showInputDialog("How old are you?");
		int ager = Integer.parseInt(Sarika);
		if (ager < 18) {
			JOptionPane.showMessageDialog(null, "You get out of here, you are too young");
		}
		if (ager > 18) {
			JOptionPane.showMessageDialog(null, frontier + " is gonna win");
		}
	}
}
