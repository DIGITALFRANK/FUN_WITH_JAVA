package question_3;

import java.util.Scanner;


public class space_weight {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your current weight");
		int weight = keyboard.nextInt();
		
		System.out.println(
			"I have info for the following planets \n => please select a number"
			+ "\n"
			+ "\n"
			+ "1 - Venus"
			+ "\n"
			+ "\n"
			+ "2 - Mars"
			+ "\n"
			+ "\n"
			+ "3 - Jupiter"
			+ "\n"
			+ "\n"
			+ "4 - Saturn"
			+ "\n"
			+ "\n"
			+ "5 - Uranus"
			+ "\n"
			+ "\n"
			+ "6 - Neptune"
			);
		
		int planet = keyboard.nextInt();
		
		
		double venus = 0.78;
		double mars = 0.39;
		double jupiter = 2.65;
		double saturn = 1.17;
		double uranus = 1.05;
		double neptune = 1.23;
		
		
		if (planet == 1) {
			System.out.println("On Venus, you weight " + venus * weight + " pounds");
		} else if (planet == 2) {
			System.out.println("On Mars, you weight " + mars * weight + " pounds");
		} else if (planet == 3) {
			System.out.println("On Jupiter, you weight " + jupiter * weight + " pounds");
		} else if (planet == 4) {
			System.out.println("On Saturn, you weight " + saturn * weight + " pounds");
		} else if (planet == 5) {
			System.out.println("On Uranus, you weight " + uranus * weight + " pounds");
		} else if (planet == 6) {
			System.out.println("On Neptune, you weight " + neptune * weight + " pounds");
		} else {
			System.out.println("Select from planet 1 through 6! please restart the program");
		}
	}

}
