package level0;

import javax.swing.JOptionPane;

public class greeter2 {
public static void main(String[] args) {
String name=JOptionPane.showInputDialog("what is your name?");
JOptionPane.showMessageDialog(null, "Nice to meet you "+name);
String color=JOptionPane.showInputDialog("what is your favorite color");
}
}
