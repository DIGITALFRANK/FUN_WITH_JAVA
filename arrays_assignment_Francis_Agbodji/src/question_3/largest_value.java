package question_3;

public class largest_value {

	public static void main(String[] args) {
		// int[] myArray = {62, 37, 4500, 187, 265, 777, 2, 48, 91, 150};
		
		int N = 10;
		int[] myArray = new int[N];
		for (int i = 0; i < N; i++) {
			myArray[i] = (int) (Math.random() * 1000);
		}
		
		
		for (int i = 0; i < myArray.length; i++) {
			if (i == myArray.length -1) {
				System.out.print(myArray[i]);
			} else {
				System.out.print(myArray[i] + ", ");
			}
		}
		System.out.println();
		
		int maxValue = myArray[0];
		int maxValueIndex = 0;
		
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > maxValue) {
				maxValue = myArray[i];
				maxValueIndex = i;
			}
		}
		System.out.println("The largest number is " + maxValue + " and is at index " + maxValueIndex);
		

	}

}
