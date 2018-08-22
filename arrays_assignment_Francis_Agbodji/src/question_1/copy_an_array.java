package question_1;

public class copy_an_array {

	public static void main(String[] args) {
		// int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int N = 10;
		int[] arr1 = new int[N];
		for (int i = 0; i < N; i++) {
			arr1[i] = (int) (Math.random() * 100);
		}
		
		
		
		int[] arr2 = new int[10];
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("This is the original array");
		for (int i = 0; i < arr1.length; i++) {
			if (i == arr1.length -1) {
				System.out.print(arr1[i]);
			} else {
				System.out.print(arr1[i] + ",");
			}
		}	
		System.out.println();
		System.out.println();
		System.out.println("This is the copied version");
		for (int i = 0; i < arr2.length; i++) {
			if (i == arr2.length -1) {
				System.out.print(arr2[i]);
			} else {
				System.out.print(arr2[i] + ",");
			}
		}
	}

}





