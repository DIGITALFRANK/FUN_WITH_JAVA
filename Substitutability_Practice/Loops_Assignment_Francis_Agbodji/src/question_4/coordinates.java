package question_4;

import java.util.Scanner;

public class coordinates {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the maximum x?");
		int x = keyboard.nextInt();
		System.out.println("What is the maximum y?");
		int y = keyboard.nextInt();
		
		for (int i = 0; i <= x; i++) {
			for (int j = 0; j <= y; j++) {
				System.out.println("(" + i + "," + j + ")");
			}
		}
		keyboard.close();
	}

}
