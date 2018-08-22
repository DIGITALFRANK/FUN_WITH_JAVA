package exceptions_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		System.out.print("Please provide input for 'nextLine() method': ");
//		String str = scan.nextLine();
//		System.out.println(str);
//		System.out.print("Please provide input for 'next() method'    : ");
//		str = scan.next();
//		System.out.println(str);
//		int n = scan.nextInt();
//		System.out.println(n);
//		System.out.println("End of the program");
		

//		try {
//			FileReader reader = new FileReader(
//					new File("C:\\Users\\Student\\Desktop\\test.txt"));
//			Scanner scan = new Scanner(reader);
//			while(scan.hasNextLine()) {
//				System.out.println(scan.nextLine());
//			}
//			scan.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("Error Reading the File");
//			e.printStackTrace();
//		}
		
//		try {
//			File input = new File("C:\\Users\\Student\\Desktop\\test.txt");
//			FileInputStream fis = new FileInputStream(input);
//			Scanner scan = new Scanner(fis);
//			while(scan.hasNext()) {
//				System.out.println(scan.nextLine());
//			}
//			scan.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("Error Reading the File");
//			e.printStackTrace();
//		}

		try {
			FileReader reader = new FileReader(
					new File("C:\\Users\\Student\\Desktop\\test.txt"));
			Scanner scan = new Scanner(reader);
			String nextLine = scan.nextLine();
			String regex = "(\\s)+";
			String[] header = nextLine.split(regex);
			System.out.println(header[0]+"\t"+header[1]+"\t"+header[2]);
			while (scan.hasNext()) {
				String[] row = scan.nextLine().split(regex);
				System.out.println(row[0]+"\t"+row[1]+"\t"+row[2]);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error Reading the File");
			e.printStackTrace();
		}
	}

}
