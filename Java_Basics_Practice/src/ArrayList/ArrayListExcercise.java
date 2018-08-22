package ArrayList;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;


public class ArrayListExcercise {
	
	static ArrayList<Integer> A1 = new ArrayList<Integer>();
	static ArrayList<Integer> A2 = new ArrayList<Integer>();
	
	
	public static ArrayList<Integer> storeEvenNumbers(int N) {
		for (int i = 1; i <= N; i++) {
			if (i % 2 == 0) {
				A1.add(i);
			}
		}
		return A1;
	}
	
	
	public static ArrayList<Integer> printEvenNumbers() {
		// for loop
//		for (int i = 0; i < A1.size(); i++) {
//			A2.add(A1.get(i) * 2);
//		}
		
		// for each loop
		for (Integer i: A1) {
			A2.add(i * 2);
		}
		return A2;
	}
	
	
	public static Integer retrieveEvenNumber(Integer N) {		
		if (A1.contains(N)) {
			return N;
		} else {
			return 0;
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(storeEvenNumbers(10));
		System.out.println(printEvenNumbers());
		System.out.println(retrieveEvenNumber(8));
	}

}
