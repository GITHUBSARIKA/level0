package level0;
import javax.swing.JOptionPane;

import com.spun.util.velocity.ParseCall;
public class rollercoaster466665 {
public static void main(String[] args) {
String height=JOptionPane.showInputDialog("Enter your height in INCHES");
int fret=Integer.parseInt(height);
int feet=fret/12;
if (feet >4 ) {
JOptionPane.showMessageDialog(null, "You can go on the roller coaster but too bad because on this Roller Coaster \nyou will die but it is too late you have already sat down. BYE");
}	
else if (feet<4) {
JOptionPane.showMessageDialog(null, "You cannot go because you are too short but you are lucky becuse\n on that roller coaster you will die.BYE lucky person");	
}
else if (feet == 4){
JOptionPane.showMessageDialog(null,"You can go on the roller coaster but too bad because on this Roller Coaster \nyou will die but it is too late you have already sat down. BYE ");
}
}
}

