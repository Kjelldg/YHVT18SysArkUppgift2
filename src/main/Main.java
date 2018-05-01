package main;

import factories.CharacterFactory;
import factories.MonsterFactory;
import gamelogic.*;
import monsterproducts.Berserker;
import monsterproducts.Orch;

public class Main {

	public static void main(String[] args) {

		GameLogic gameLogic = new GameLogic();
		MonsterFactory monster1;
		MonsterFactory monster2;
		CharacterFactory playerCharacter;

		String winner = "";

		playerCharacter = gameLogic.characterRandomizer();
		monster1 = gameLogic.monsterRandomizer();
		monster2 = gameLogic.monsterRandomizer();

		playerCharacter.setDamage(gameLogic.randomizer(8));
		monster1.setDamage(gameLogic.randomizer(5));
		monster2.setDamage(gameLogic.randomizer(5));

		playerCharacter.setCharacterHealth(gameLogic.randomizer(8));
		monster1.setMonsterHealth(gameLogic.randomizer(5));
		monster2.setMonsterHealth(gameLogic.randomizer(5));

		winner = gameLogic.evaluator(monster1.getDamage(), monster1.getMonsterHealth(), playerCharacter.getDamage(),
				playerCharacter.getCharacterHealth());

		System.out.println("Winner of fight 1 is: " + winner);

		if (winner == "The player.") {
			winner = gameLogic.evaluator(monster2.getDamage(), monster2.getMonsterHealth(), playerCharacter.getDamage(),
					playerCharacter.getCharacterHealth());
			System.out.println("Winner of fight 2 is: " + winner + " Congratulations! You lived.");
		} else if (winner == "It's a tie.") {
			System.out.println("You both walk home ashamed.");
		} else {
			System.out.println("Too bad. Thanks for playing.");
		}

	}

}
