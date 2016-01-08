package level0;

import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
	String birthday=JOptionPane.showInputDialog("Is your birthday tody");
	if(birthday.equals("yes")){
	 JOptionPane.showMessageDialog(null,"happy birthday to you");
	}
	 if (birthday.equals("no")) {
     JOptionPane.showMessageDialog(null,"A very unbirthday to you");
	
	}
}
}
