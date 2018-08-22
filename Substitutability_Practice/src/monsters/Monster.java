package monsters;

public class Monster {
	Monster(String name) {
		this.name = name;
	}

	private String name;
		
	public String getName() {
		return name;
	}
	public void attack() {
		System.out.println("!^_&^$@+%$* I don't know how to attack!");
	}
}
