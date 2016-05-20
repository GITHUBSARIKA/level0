package level0;
import java.net.URI;

import javax.swing.JOptionPane;

public class crazycat935 {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
              String cats=JOptionPane.showInputDialog("How many cats do you have?");
		// 2. Convert their answer into an int
              int ads=Integer.parseInt(cats);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
              if (ads>3) {
				JOptionPane.showMessageDialog(null, "You are a crazy lady");
			}
		// 4. If they have 3 or less, call the method below to show them a cat video
              if (ads<3) {
				playVideo("https://www.youtube.com/watch?v=G8KpPw303PY");
			}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		      if (ads==0) {
				
			}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

