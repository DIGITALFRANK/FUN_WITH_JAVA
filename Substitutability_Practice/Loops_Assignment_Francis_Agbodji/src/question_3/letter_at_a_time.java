package question_3;

import java.util.Scanner;

public class letter_at_a_time {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's your message?");
		String input = keyboard.nextLine();
		
		for (int i = 0; i < input.length(); i++) {
			System.out.println(i + ": " + "'" + input.charAt(i) + "'");
		}
		keyboard.close();
	}

}
