package question_1;

public class specific_legal_problems {

	public static void main(String[] args) {
		int age = 26;
		
		if (age <= 0) {
			System.out.println("You aren't born yet.");
		} else if (age < 16) {
			System.out.println("You can't drive.");
		} else if (age >= 16 && age < 18) {
			System.out.println("You can't vote.");
		}  else if (age >= 18 && age < 25) {
			System.out.println("You can't rent a car.");
		} else if (age >= 25) {
			System.out.println("You can do anything that's legal.");
		} else {
			System.out.println("Please change the 'age' variable to your age.");
		}

	}

}
