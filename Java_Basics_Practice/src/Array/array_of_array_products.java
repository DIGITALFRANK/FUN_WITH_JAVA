package Array;

public class array_of_array_products {
	
	static int[] newArr;
	
	static public int[] getProductArray(int[] arr) {
		
		// try 1
//		newArr = new int[arr.length]; 
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					continue;
//				} else {
//					newArr[i] = arr[i] * arr[j];
//				}
//			}
//		}
//		
//		return newArr;
		
		
		
		
		// try 2
		
		int n = arr.length;
		int[] result = new int[n];
		int product = 1;
		
		for (int i = 0; i < n; i++) {
			result[i] = product;
			product *= arr[i];
		}
		
		product = 1;
		
		for (int i = n -1; i >= 0; i--) {
			
		}
		
		return result;
		
		
		
	}

	
	
	public static void main(String[] args) {
		int[] testArray1 = {8, 10, 2};
		int[] testArray2 = {2, 7, 3, 4};
		System.out.println(getProductArray(testArray1));
//		System.out.println(getProductArray(testArray2));
		
		for (int i = 0; i < testArray1.length; i++) {
			System.out.print(testArray1[i] + ", ");
		}
//		System.out.println();
//		for (int i = 0; i < testArray2.length; i++) {
//			System.out.print(testArray2[i] + ", ");
//		}
		System.out.println();
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + ", ");
		}
	}

}
