package question_2;

import java.util.Scanner;


public class day_of_the_week {

	public static String dayOfWeek(int number) {
		String day = "";
		if (number == 1 ) {
			day = "Monday";
		} else if (number == 2) {
			day = "Tuesday";
		} else if (number == 3) {
			day = "Wednesday";
		} else if (number == 4) {
			day = "Thursday";
		} else if (number == 5) {
			day = "Friday";
		} else if (number == 6) {
			day = "Saturday";
		} else if (number == 7) {
			day = "Sunday";
		} else {
			System.out.println("Please enter an integer between 1 and 7 (inclusive)");
		}
		return day;
	}
	
	
	public static void main(String[] args) {
		
		String returnedDay;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter an integer between 1 and 7 (inclusive)");
		int day = keyboard.nextInt();

		returnedDay = dayOfWeek(day);
		System.out.println("Weekday " + day + " is " + returnedDay);
		
	}

}
