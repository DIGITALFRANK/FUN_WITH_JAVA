package question_5;

public class ten_to_20 {
	
	public static void incrementBy2() {		
		int i = 10;
		while (i <= 20) {
			System.out.println(i);
			i+=2;
			if (i == 16) {
				i+=2;
				continue;
			}
		}
	}
	
	public static void incrementBy1() {
		int i = 10;
		while (i <= 20) {
			if (i % 2 != 0 || i == 16) {
				i++;
				continue;
			} else {
				System.out.println(i);
			}
			i++;
		}
	}

	public static void endlessLoop() {
		int num = 10;
		while (true) {
			System.out.println(num);
			num+=2;
			if (num == 16) {
				num+=2;
				continue;
			}
			if (num > 20) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		incrementBy2();
		System.out.println();
		incrementBy1();
		System.out.println();
		endlessLoop();
	}

}
