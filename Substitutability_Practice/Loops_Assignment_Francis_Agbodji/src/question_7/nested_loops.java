package question_7;





public class nested_loops {

	public static void loops() {
		// 1
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(8);
			}
			System.out.println();
		}
		System.out.println();
		// 2
		for (int i = 4; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(8);
			}
			System.out.println();
		}
		System.out.println();
		// 3
		for (int i = 0; i < 5; i++) {
			System.out.println(8);
		}
	}
	
		
	
	
	
	
	
	
	
	public static void main(String[] args) {
		loops();
	}
	
	
}
