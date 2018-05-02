package main;

import characterproducts.Warrior;
import factories.CharacterFactory;
import factories.MonsterFactory;
import gamelogic.GameLogic;
import monsterproducts.Berserker;
import monsterproducts.Orch;

public class Main {

	public static void main(String[] args) {

		GameLogic gameLogic = new GameLogic();
		MonsterFactory orch;
		MonsterFactory berserker;
		CharacterFactory playerCharacter;

		String winner = "";

		orch = new Orch();
		berserker = new Berserker();
		playerCharacter = new Warrior();

		orch.setDamage(gameLogic.randomizer(4));
		berserker.setDamage(gameLogic.randomizer(7));
		playerCharacter.setDamage(gameLogic.randomizer(8));

		orch.setMonsterHealth(gameLogic.randomizer(4));
		berserker.setMonsterHealth(gameLogic.randomizer(3));
		playerCharacter.setCharacterHealth(gameLogic.randomizer(6));

		winner = gameLogic.evaluator(orch.getDamage(), orch.getMonsterHealth(), playerCharacter.getDamage(),
				playerCharacter.getCharacterHealth());

		System.out.println("Winner of fight 1 is: " + winner);

		if (winner == "The player.") {
			winner = gameLogic.evaluator(berserker.getDamage(), berserker.getMonsterHealth(),
					playerCharacter.getDamage(), playerCharacter.getCharacterHealth());
			System.out.println("Winner of fight 2 is: " + winner + " Congratulations! You lived.");
		} else if (winner == "It's a tie.") {
			System.out.println("You both walk home ashamed.");
		} else {
			System.out.println("Too bad. Thanks for playing.");
		}

	}

}
