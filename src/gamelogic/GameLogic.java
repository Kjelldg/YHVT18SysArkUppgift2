package gamelogic;

import java.util.Random;

public class GameLogic {

	private Random randomizer = new Random();

	// Randomizes a number.
	public int randomizer(int incomingNumber) {

		int randomizedNumber = randomizer.nextInt(incomingNumber) + 1;

		return randomizedNumber;
	}

	// Evaluates the winner based on damage and health of monsters and the player.
	public String evaluator(int monsterDamage, int monsterHealth, int playerDamage, int playerHealth) {

		if (monsterDamage > playerHealth) {
			return "The monster.";
		} else if (playerDamage > monsterHealth) {
			return "The player.";
		} else {
			return "It's a tie.";
		}

	}

}
