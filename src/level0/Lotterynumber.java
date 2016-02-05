package level0;

import java.util.Random;

public class Lotterynumber {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int lottery = new Random().nextInt(49) + 1;
			System.out.println(lottery);
		}
	}
}
