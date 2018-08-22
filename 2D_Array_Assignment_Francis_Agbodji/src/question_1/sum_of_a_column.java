package question_1;

import java.util.Scanner;


public class sum_of_a_column {

	static int[][] two_D = new int[3][3];
	static Scanner keyboard = new Scanner(System.in);
	

	public static void populate2DArray() {
		for (int i = 0; i < two_D.length; i++) {
			for (int j = 0; j < two_D[i].length; j++) {
				two_D[i][j] = (int) (Math.random() * 10);
			}	
		}
	}
	
	// make this print 3 by 3 for better visualization
	public static void print2DArray() {
		for (int i = 0; i < two_D.length; i++) {
			for (int num :two_D[i]) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	

	
	
	
	public static void main(String[] args) {
		populate2DArray();
		print2DArray();
		System.out.println("which colum would you like the sum of?");
		System.out.println("Select 1, 2, or 3");
		int column = keyboard.nextInt();
		System.out.println("The sum of the column is " + (two_D[0][column -1] + two_D[1][column - 1] + two_D[2][column - 1]) + "." );

	}

}
