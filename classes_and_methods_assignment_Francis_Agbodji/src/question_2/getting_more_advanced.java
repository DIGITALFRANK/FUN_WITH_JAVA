package question_2;

import java.util.*;
import question_1.Student;

public class getting_more_advanced {
		
	public static void main(String[] args) {
		
		Student[] classRoom = new Student[3];
		Scanner keyboard = new Scanner(System.in);
		
		
		for (int i = 0; i < classRoom.length; i++) {
			int studentId = i + 1;
			String studentName;
			String studentGrade;
			double studentGPA;
			
			// get student's name
			System.out.println("Enter student " + studentId + "'s NAME:");
			studentName = keyboard.next();
			// get student's grade
			System.out.println("Enter student " + studentId + "'s letter GRADE:");
			studentGrade = keyboard.next();
			// get student's GPA
			System.out.println("Enter student " + studentId + "'s GPA:");
			studentGPA = keyboard.nextDouble();
			// create instance of Student
			classRoom[i] = new Student(studentName, studentGrade, studentGPA);
		}
		
		keyboard.close();
		
		System.out.println();
		System.out.println();
		
		// loop to print all student's info
		System.out.println("Ok. This is your classroom:");
		System.out.println();
		for (Student student :classRoom) {
			System.out.println("NAME: " + student.name + ", " + "GRADE: " + student.grade + ", " + "GPA: " + student.GPA);
		}
		
		// loop to sum up all GPA's in order to calculate class average GPA
		System.out.println();
		double sumGPA = 0;
		for (Student student :classRoom) {
			sumGPA += student.GPA;
		}
		System.out.println("CLASS AVERAGE GPA: " + sumGPA/classRoom.length);
	}
}















