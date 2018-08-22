package developers_DAO;

import java.util.*;

interface DeveloperDao {
	public ArrayList<Developer> getAllDevelopers();
	public Developer getDeveloper(int DeveloperId);
	public void updateDeveloper(Developer Developer);
	public void deleteDeveloper(Developer Developer);
}
