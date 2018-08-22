package question_4;

import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class how_many_times {

	public static void main(String[] args) {
		 int[] myArray = {20, 42, 20, 58, 107, 512, 717, 20, 107, 42};
		
//		int N = 10;
//		int[] myArray = new int[N];
//		for (int i = 0; i < N; i++) {
//			myArray[i] = (int) (Math.random() * 1000);
//		}
		
		
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
		System.out.println("Enter a value to count:");
		int value = keyboard.nextInt();
		int counter = 0;
		
		for (int i = 0; i < myArray.length; i++) {
			if (value != myArray[i]) {
				continue;
			} else {
				counter += 1;
			}
		}
		System.out.println(value + " showed up " + counter + " times");
	}

}
