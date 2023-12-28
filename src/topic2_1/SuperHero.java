package topic2_1;
import java.util.Random;

/**
 * This SuperHero class represents a super hero with
 * a name, health, and ability to attack opponents.
 */
public class SuperHero {
	private String name;
	private int health;
	private boolean isDead;

	/**
	 * Constructs a SuperHero with name and initial
	 * health value.
	 * @param name, The name of the super hero.
	 * @param health, The initial health of the super hero.
	 */
public SuperHero(String name, int health) {
	
	// Initialize internal variables
	this.name = name;
	this.health = health;
}

/**
 * Method to attack another SuperHero, causing random
 * damage between 1 and 10.
 * @param opponent, The SuperHero to be attacked.
 */
public void attack(SuperHero opponent) {
	
	// Create a random number between 1 and 10
	Random rand = new Random();
	int damage = rand.ints(1, (10 + 1)).findFirst().getAsInt();
	
	// Set the health of the provided opponent
	opponent.determineHealth(damage);
	System.out.println(String.format("%s has damage of %d and health of %d", opponent.name, damage, opponent.health));
}

/**
 * Method to check is the super hero is dead.
 * @return true if the super hero is dead, otherwise false.
 */
public boolean isDead() {
	
	// Return dead state
	return this.isDead;
}

/**
 * Method to determine health after receiving damage.
 * @param damage
 */
private void determineHealth(int damage) {
	
	// If no more health then mark as dead else
	// subtract damage from health and continue
	if (this.health - damage <= 0) {
		this.health = 0;
		this.isDead = true;
	}
	
	else {
		this.health = this.health - damage;
	}
	
}

}


