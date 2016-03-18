package level0;

import javax.swing.JOptionPane;

public class fizbuzz {
	public static void main(String[] args) {
		for (int i = 1; i < 16; i++) {
if (i % 3 ==0 && i % 5 == 0) {
				System.out.println("fizz buzz");
			}                       
else if (i % 3 == 0) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);

			}
			
		}
	}
}