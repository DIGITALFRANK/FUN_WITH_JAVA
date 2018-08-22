package developers_DAO;

public class DaoPatternDemo {

	public static void main(String[] args) {
		DeveloperDao DeveloperDao = new DeveloperDaoImp1();
		
		for (Developer Developer : DeveloperDao.getAllDevelopers()) {
			System.out.println("DeveloperId: " + Developer.getDeveloperId() + ", Name: " + Developer.getName());
		}
		
		Developer Developer = DeveloperDao.getAllDevelopers().get(0);
		Developer.setName("Lokesh");
		DeveloperDao.updateDeveloper(Developer);
		
		DeveloperDao.getDeveloper(0);
		System.out.println("DeveloperId: " + Developer.getDeveloperId() + ", Name: " + Developer.getName());
	}
}
