package question_5;

import java.util.Scanner;

public class comma_seperated_values {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter several words seperated by commas:");
		String words = keyboard.nextLine();
		
		String[] wordsArr = words.split(", ");
		for (String word: wordsArr) {
			System.out.println(word);
		}
	}

}
