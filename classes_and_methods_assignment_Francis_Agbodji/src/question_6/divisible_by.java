package question_6;

public class divisible_by {
	
	public static boolean isDivisibleBy2(int n) {	
		boolean even = (n % 2) == 0 ? true : false;
		return even;
	}
	
	public static boolean isDivisibleBy3(int n) {	
		boolean triple = (n % 3) == 0 ? true : false;
		return triple;
	}
	
	
	public static void main(String[] args) {
		for (int i = 1; i < 21; ++i) {
			if (isDivisibleBy2(i) && isDivisibleBy3(i)) {
				System.out.println(i + " <=");
			} else if (isDivisibleBy2(i)) {
				System.out.println(i + " <");
			} else if (isDivisibleBy3(i)) {
				System.out.println(i + " =");
			} else {
				System.out.println(i);
			}
		}
	}

}
