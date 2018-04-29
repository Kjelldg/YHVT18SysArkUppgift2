package gamelogic;

import java.util.Random;
import java.util.function.LongBinaryOperator;

import factories.MonsterFactory;
import monsterproducts.Berserker;
import monsterproducts.Orch;
import factories.CharacterFactory;
import characterproducts.*;

public class GameLogic {

	private Random randomizer = new Random();

	// Randomizes a number.
	public int randomizer(int incomingNumber) {

		int randomizedNumber = randomizer.nextInt(incomingNumber) + 1;

		return randomizedNumber;
	}

	// Randomizes a monster.
	public MonsterFactory monsterRandomizer() {

		int randomNumber = randomizer.nextInt(2) + 1;

		if (randomNumber == 1) {
			MonsterFactory orch1 = new Orch();
			return orch1;
		} else if (randomNumber == 2) {
			MonsterFactory berserker1 = new Berserker();
			return berserker1;
		}

		return null;
	}

	// Randomizes the player's character.
	public CharacterFactory characterRandomizer() {

		int randomNumber = randomizer.nextInt(2) + 1;

		if (randomNumber == 1) {
			CharacterFactory mage = new Mage();
			return mage;
		} else if (randomNumber == 2) {
			CharacterFactory warrior = new Warrior();
			return warrior;
		}

		return null;
	}

	public String evaluator(int monsterDamage, int monsterHealth, int playerDamage, int playerHealth) {

		boolean loop = true;

		if (monsterDamage > playerHealth) {
			loop = false;
			return "The monster.";
		} else if (playerDamage > monsterHealth) {
			loop = false;
			return "The player.";
		} else {
			return "It's a tie.";
		}

	}

}
