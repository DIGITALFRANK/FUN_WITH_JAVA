package developers_DAO;

import java.util.*;

public class DeveloperDaoImp1 implements DeveloperDao {
	ArrayList<Developer> Developers;
	
	public DeveloperDaoImp1() {
		Developers = new ArrayList<Developer>();
		Developer Developer1 = new Developer("Kushagra", 0);
		Developer Developer2 = new Developer("Vikram", 1);
		Developers.add(Developer1);
		Developers.add(Developer2);
	}
	

	@Override
	public ArrayList<Developer> getAllDevelopers() {
		return Developers;
	}
	@Override
	public Developer getDeveloper(int DeveloperId) {
		return Developers.get(DeveloperId);
	}
	@Override
	public void updateDeveloper(Developer Developer) {
		Developers.get(Developer.getDeveloperId()).setName(Developer.getName());
		System.out.println("DeveloperId " + Developer.getDeveloperId() + ", updated in the databse");
	}
	@Override
	public void deleteDeveloper(Developer Developer) {
		Developers.remove(Developer.getDeveloperId());
		System.out.println("DeveloperId " + Developer.getDeveloperId() + ", deleted from database");
	}
}















