package string_manipulation;

import java.util.Scanner;

public class StringExamples {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter something > ");
		String inputString = input.nextLine();
		
		String newString = "";
		
		for (int i = inputString.length() - 1; i >= 0; i--) {
			newString = newString + inputString.charAt(i);
			
		}
		
		System.out.print("your input in reverse is: " + newString);

	}

}




//public class HelloWorld {
//
//	public static void main(String[] args) {
//		String str = "Hello class, let's think string manipulation";
//		
//		int n = str.length();
//		String reversed = "";
//		for (int i=n-1; i>=0; i--) {
//			reversed = reversed + str.charAt(i);
//		}
//
//		String[] reversedArray = reversed.split(" ");
//		String result = "";
//		for (String s:reversedArray) {
//			result = " " + s + result;
//			System.out.println(result);
//		}
//		System.out.println("Input String: "+str);
//		System.out.println("Reversed    : "+reversed);
//		System.out.println("Final Result: "+result.substring(1));
//	}
//}










