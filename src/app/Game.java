package app;
import java.util.Random;

/**
 * This Game class simulates a battle between Superman
 * and Batman until one of them is defeated.
 */
public class Game {

	/**
	 * This main method is the entry point of the program. We start
	 * by creating/initializing the super heroes then simulating
	 * the battle.
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create a random health between 1 and 1000
		Random rand = new Random();
		int health1 = rand.ints(1, (1000 + 1)).findFirst().getAsInt();
		int health2 = rand.ints(1, (1000 + 1)).findFirst().getAsInt();
		
		// Create Superman and Batman
		System.out.println("Creating our Super Heroes......");
		Superman superman = new Superman(health1);
		Batman batman = new Batman(health2);
		System.out.println("Super Heroes created");
		
		// Run the game until one of the Super Heroes is dead
		System.out.println("Running our game...");
		while (!superman.isDead() && !batman.isDead()) {
			
			// Attack each other
			superman.attack(batman);
			batman.attack(superman);
			
			// See if anybody survived
			if (superman.isDead()) {
				System.out.println("Batman defeated Superman");
			}
			if (batman.isDead()) {
				System.out.println("Superman defeated Batman");
			}
		}
		
	}

}
