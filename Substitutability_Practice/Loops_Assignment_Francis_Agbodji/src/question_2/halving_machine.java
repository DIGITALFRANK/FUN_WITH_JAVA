package question_2;

import java.util.Scanner;

public class halving_machine {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("please enter a number:");
		int num = keyboard.nextInt(); 
		int result = 0;

		do {
			if (num <= 0) {
				System.out.println("Hey! That's against the rules");
				break;
			}
			if (num % 2 != 0) { // odd
				result = (num + 1)/2;
				System.out.println("The result is " + result);
				num = result;
			} else { // even
				result = num/2;
				System.out.println("The result is " + result);
				num = result;
			}
		} while (result != 1);
		keyboard.close();
		System.out.println("Congrats! The halving machine has stopped.");
	}

}
