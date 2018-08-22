package office_staff;

public class Manager extends Employee {

	public Manager(int id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		this.basicSalary = salary;
	}
	
	public double calculateTransportAllowance() {
		double transportAllowance = (15 * basicSalary)/100; 
		System.out.println(transportAllowance);
		return transportAllowance;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
