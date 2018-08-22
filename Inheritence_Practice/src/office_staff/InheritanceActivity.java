package office_staff;


public class InheritanceActivity {

	public static void main(String[] args) {
		
		Manager Peter = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		Peter.calculateSalary();
		
		Trainee Jack = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		Jack.calculateSalary();
		
		Peter.calculateTransportAllowance();
		Jack.calculateTransportAllowance();
		
//		System.out.println(Jack.basicSalary);
//		System.out.println(Jack.employeeName);	
	}

}
