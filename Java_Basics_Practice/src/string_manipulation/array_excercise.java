package string_manipulation;

public class array_excercise {
	
//	public static int[] compare(int[] arr1, int[] arr2) {
//		int n = arr1.length;
//		int[] result = 
//	}
	

	public static void main(String[] args) {
		int[] arr1 = {2, 6, 29, 10, 11, 55};
		int[] arr2 = {22, 6, 21, 10, 11, 45};
		int[] arr3 = new int[6];
				
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				arr3[i] = arr1[i];
			}
		}
		
		
		for (int num3: arr3) {
			System.out.println(num3);
		}
	}

}
