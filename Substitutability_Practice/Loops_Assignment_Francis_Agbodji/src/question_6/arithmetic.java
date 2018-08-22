package question_6;

import java.util.Scanner;

public class arithmetic {
	public static String expression;
	public static String[] splitExpression = new String[3];
	public static double result;
	
	public static double calculation() {
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*' || expression.charAt(i) == '/') {
				char operator = expression.charAt(i);
				
				switch (operator) {
				case '+':
					splitExpression = expression.split("\\+");
					result = Double.parseDouble(splitExpression[0]) + Double.parseDouble(splitExpression[1]);
					break;
				case '-':
					splitExpression = expression.split("\\-");
					result = Double.parseDouble(splitExpression[0]) - Double.parseDouble(splitExpression[1]);
					break;
				case '*':
					splitExpression = expression.split("\\*");
					result = Double.parseDouble(splitExpression[0]) * Double.parseDouble(splitExpression[1]);
					break;
				case '/':
					splitExpression = expression.split("\\/");
					result = Double.parseDouble(splitExpression[0]) / Double.parseDouble(splitExpression[1]);
					break;
				default:
					Scanner keyboard = new Scanner(System.in);
					System.out.println("please enter a valid expression limited to +, -, *, /: no spaces:");
					expression = keyboard.nextLine();
					
					keyboard.close();
					calculation();
					break;
				}

			}
		}
		System.out.println("the result is: " + result);
		return result;
	}

	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter your arithmetic expression: limit to +, -, *, /: no spaces:");
		expression = keyboard.nextLine();
		
		keyboard.close();
		calculation();
	}

}









