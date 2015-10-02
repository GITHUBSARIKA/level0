package level0;

import javax.swing.JOptionPane;

public class myAges {
public static void main(String[] args) {
	String old=JOptionPane.showInputDialog("How old are you?");
	int age=Integer.parseInt(old);
	for ( int age9 = 0; age9 <=age; age9++) {
		System.out.println(age9);
		
	}
}
}
