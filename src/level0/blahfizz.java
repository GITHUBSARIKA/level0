package level0;

import javax.swing.JOptionPane;

//Copyright Wintriss Technical Schools 2013
/**
 * Fizz Buzz
 * 
 * In this project, we're going to build FizzBuzz. It's a children's game where
 * you count from 1 to 20. Easy, right? Here's the catch: instead of saying
 * numbers divisible by 3, say "Blah". And instead of saying numbers divisible
 * by 4, say "Buzz". For numbers divisible by both 3 and 4, say "BlahBuzz".
 * 
 * So the rules are: Any number divisible by 3 is replaced by the word blah Any
 * number divisible by 4 is replaced by the word buzz. Numbers divisible by both
 * 3 and 5 become blahbuzz.
 * 
 * Print your results to the console, or using JOptionPane if you like.
 **/

public class blahfizz {
	public static void main(String[] args) {
		for (int i = 1; i < 21; i++){
			if(i % 3 ==0 && i % 4 == 0){
				System.out.println("blahbuzz");
				
	}else if (i % 3 == 0) {
				System.out.println("blah");
			
				
			}else if(i % 4 == 0){
			 System.out.println("buzz");
			}else{
				System.out.println(i);
			}
				

            	 
            	 
			
				
			
			}

		}
}
