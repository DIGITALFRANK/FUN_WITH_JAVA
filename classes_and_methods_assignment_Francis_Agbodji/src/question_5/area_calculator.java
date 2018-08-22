package question_5;

import java.util.*;

public class area_calculator {
	
	static Scanner keyboard = new Scanner(System.in);
	
	
	// area methods
	public static double area_circle(int radius) {		
		double area = Math.PI * (radius*radius);
		return area;
	}
	public static int area_rectangle(int length, int width) {		
		int area = length * width;
		return area;
	}
	public static int area_square(int side) {	
		int area = side*side;
		return area;
	}
	public static double area_triangle(double base, double height) {		
		double area = 0.5 * base * height;
		return area;
	}

	// display select options to user
	public static void displayOptions() {
		System.out.println("select an option below");
		System.out.println();
		System.out.println("  'C'  : \t Circle");
		System.out.println("-------------------------------");
		System.out.println("  'R'  : \t Rectangle");
		System.out.println("-------------------------------");
		System.out.println("  'S'  : \t Square");
		System.out.println("-------------------------------");
		System.out.println("  'T'  : \t Triangle");
		System.out.println("-------------------------------");
		System.out.println("  'E'  : \t Exit out of program");
	}
	
	// run the correct method with parameters based on user input
	public static void select() {
		char input = keyboard.next().charAt(0);
		
		do {
			switch (input) {
			case 'C': case 'c':
				System.out.println("Enter the circle's radius:");
				int radius = keyboard.nextInt();
				System.out.println("--------------------------------------------");
				System.out.println("The circle's area is: " + area_circle(radius));
				System.out.println("--------------------------------------------");
				System.out.println();
				System.out.println();
				displayOptions();
				select();
				break;
			case 'R': case 'r':
				System.out.println("Enter the rectangle's length:");
				int length = keyboard.nextInt();
				System.out.println("Enter the rectangle's width:");
				int width = keyboard.nextInt();
				System.out.println("--------------------------------------------");
				System.out.println("The rectangle's area is: " + area_rectangle(length, width));
				System.out.println("--------------------------------------------");
				System.out.println();
				System.out.println();
				displayOptions();
				select();
				break;
			case 'S': case 's':
				System.out.println("Enter the length of the square's sides:");
				int side = keyboard.nextInt();
				System.out.println("--------------------------------------------");
				System.out.println("The square's area is: " + area_square(side));
				System.out.println("--------------------------------------------");
				System.out.println();
				System.out.println();
				displayOptions();
				select();
				break;
			case 'T': case 't':
				System.out.println("Enter the triangle's base:");
				double base = keyboard.nextDouble();
				System.out.println("Enter the triangle's height:");
				double height = keyboard.nextInt();
				System.out.println("--------------------------------------------");
				System.out.println("The triangle's area is: " + area_triangle(base, height));
				System.out.println("--------------------------------------------");
				System.out.println();
				System.out.println();
				displayOptions();
				select();
				break;
			case 'E': case 'e':
				System.out.println("********** GOODBYE ***********");
				
				break;
			default:
				System.out.println("Please enter a valid selection or Exit");
				select();
				break;
			}
		} while (input != 'E' && input != 'e');
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("******* Area Calculator Program *******");
		System.out.println("---------------------------------------");
		displayOptions();
		select();
	}

}












