package question_1;

import java.util.*;

public class Student {
	
	public String name;
	public String grade;
	public double GPA;
	static Scanner keyboard = new Scanner(System.in);
	int studentId = 1;
	
	public Student(String name, String grade, double GPA) {
		this.name = name;
		this.grade = grade;
		this.GPA = GPA;
	}
	
	public static void getStudentInfo(Student student) {
			System.out.println("NAME: " + student.name + ", " + "GRADE: " + student.grade + ", " + "GPA: " + student.GPA);	
	}
	

	
	
	
	public static void main(String[] args) {
		float sumGPA = 0;
		
		for (int i = 0; i < 3; i++) {
			int studentId = i + 1;
			String studentName;
			String studentGrade;
			double studentGPA;
			Student[] classRoom = new Student[3];
			
			// get student's name
			System.out.println("Enter student " + studentId + "'s NAME:");
			studentName = keyboard.next();
			// get student's grade
			System.out.println("Enter student " + studentId + "'s letter GRADE:");
			studentGrade = keyboard.next();
			// get student's GPA and add it to the class' GPA to later compute average 
			System.out.println("Enter student " + studentId + "'s GPA:");
			studentGPA = keyboard.nextDouble();
			sumGPA += studentGPA;
			// create instance of Student
			classRoom[i] = new Student(studentName, studentGrade, studentGPA);
			
			// print out student's info
			System.out.println();
			System.out.println("You've created Student " + studentId + " as follows:");
			getStudentInfo(classRoom[i]);
			System.out.println();
		}
		
		keyboard.close();
		System.out.println("The average GPA of your 3 students is " + sumGPA/3);
		
	}
}
