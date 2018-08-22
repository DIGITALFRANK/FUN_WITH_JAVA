package question_2;

import java.util.Scanner;

public class find_value_in_array {

	public static void main(String[] args) {
		// int[] myArray = {100, 22, 53, 84, 105, 365, 72, 8, 900, 15};
		
		int N = 10;
		int[] myArray = new int[N];
		for (int i = 0; i < N; i++) {
			myArray[i] = (int) (Math.random() * 1000);
		}
		
		for (int i = 0; i < myArray.length; i++) {
			if (i == myArray.length -1) {
				System.out.print(myArray[i]);
			} else {
				System.out.print(myArray[i] + ", ");
			}
		}
		
		System.out.println();
		System.out.println();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a value to search for:");
		int value = keyboard.nextInt();
		
		
		int i = 0;
		
		while (i < myArray.length) {
			if (value != myArray[i]) {
				if (i == myArray.length -1) {
					System.out.println("The value you inputed is not part of the Array");
					System.out.println("Restart the program and enter another value.");
					break;
				}
			} else {
				System.out.println("We've found your value at index #" + i + "!");
				break;
			}
			i++;
		}
	}

}


