import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class speakandspell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		for (int i = 0; i < 20; i++) {
			
		}
              spell("Jolly old saint nicholas la la la la ");
              		
		// 2. Catch the user's answer in a String
 String answer=JOptionPane.showInputDialog(" please type your answer");
		// 3. If the user spelled the word correctly, speak "correct
 if (answer.equals("happiness")) {
	 spell("correct");
 }
 
		
	 
	 
	 // 4. Otherwise say "wrong"
 else                   {
	 spell("wrong");
 }	 

		// 5. repeat the process for other words
		
	}

	static void spell(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}



