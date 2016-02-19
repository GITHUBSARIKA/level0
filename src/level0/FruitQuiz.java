package level0;

import java.applet.AudioClip;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FruitQuiz extends KeyAdapter {

	void makeQuestions() {
		question1 = new JLabel(
				"<html>Which is not a real animal? <br> A: Flubber Monkey <br> B: Pink Fairy Armadillo <br> C: Dumbo Octopus</html>");
		// 11. Make another question called "question2"
		question2 = new JLabel(
				"<html>What plant has teeth? <br> A: oak tree <br> B: venus plant <br> C: palm tree</html>");
		question3 = new JLabel(
				"<html>What animal lives in the ocean? <br> A: elephant <br> B: dolphin <br> C:crab</html>");
		question4 = new JLabel("<html>what is the weirdest thing? <br> A:cellphone <br> B: goo <br> C:yourself</html>");
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		int keyCode = arg0.getKeyCode();
		System.out.println(keyCode);

		int apple = 37;
		int banana = 39;
		int carrot = 38;         
      
		if (question1.isShowing()) {
	 		if (keyCode == banana) {
				correct();
				nextQuestion(question2);
			} else {
				incorrect();
			}

		}

		// 12. If question2 is showing,
		if (question2.isShowing()) {
			if (keyCode == banana) {
				correct();
				nextQuestion(question3);
			} else {
				incorrect();
			}
		}
		if (question3.isShowing()) {
			if (keyCode == banana) {
				correct();
				nextQuestion(question4);
			} else {
				incorrect();
			}

		}
		if (question4.isShowing()) {
			if (keyCode == carrot) {
				correct();
				nextQuestion(question1);
			} else {
				incorrect();
			}

		}

		// 13. check if it is right or wrong like you did for question1
	}

	private void correct() {
		playSound("meow.wav");

	}

	private void incorrect() {
		playSound("wrong.wav");    
	}

	private void nextQuestion(JLabel newQuestion) {
		frame.remove(question1);
		frame.remove(question2);
		frame.remove(question3);
		frame.remove(question4);
		frame.add(newQuestion);
		frame.pack();
		frame.setVisible(true);
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	public static void main(String[] args) {
		new FruitQuiz().go();
	}

	JFrame frame = new JFrame();

	private void go() {
		makeQuestions();
		frame.add(question1);
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
	}

	JLabel question1 = new JLabel(), question2 = new JLabel(), question3 = new JLabel(), question4 = new JLabel(),
			question5;
}
