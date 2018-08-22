package monsters;

public class testMonsters {

	public static void main(String[] args) {
		// Program at the "interface" defined in the superclass.
	      // Declare instances of the superclass, substituted by subclasses.
	      Monster m1 = new FireMonster("r2u2");   // upcast
	      Monster m2 = new WaterMonster("u2r2");  // upcast
	      Monster m3 = new StoneMonster("r2r2");  // upcast

	      // Invoke the actual implementation
	      m1.attack();  // Run FireMonster's attack()
	      m2.attack();  // Run WaterMonster's attack()
	      m3.attack();  // Run StoneMonster's attack()

	      // m1 dies, generate a new instance and re-assign to m1.
	      m1 = new StoneMonster("a2b2");  // upcast
	      m1.attack();  // Run StoneMonster's attack()

	      // We have a problem here!!!
	      Monster m4 = new Monster("u2u2");
	      m4.attack();  // garbage!!!
	}

}
