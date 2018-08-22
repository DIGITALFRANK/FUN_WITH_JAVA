package question_4;


public class Pythagorean_Theorum {

	public static double getHypotenuse(double side1, double side2) {
		double hypotenuse = Math.sqrt((side1*side1) + (side2*side2));
		return hypotenuse;
	}
	
	
	public static void main(String[] args) {
		System.out.println(getHypotenuse(4, 5));
		System.out.println(getHypotenuse(8, 12));
		System.out.println(getHypotenuse(14, 7));

	}

}


// byte range -128 to 127