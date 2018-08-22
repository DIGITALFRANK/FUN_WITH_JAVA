package office_staff;

public class Employee {

	public Employee(long id,String name, String address, long phone) {
		this.employeeId = id; 
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	
	
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	
	
	public double calculateSalary() {
		double salary =  basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100); 
		System.out.println(salary);
		return salary;
	}
	
	public double calculateTransportAllowance() {
		double transportAllowance = (10 * basicSalary)/100; 
		System.out.println(transportAllowance);
		return transportAllowance;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
