package main;

import factories.CharacterFactory;
import factories.MonsterFactory;
import gamelogic.*;
import monsterproducts.Berserker;
import monsterproducts.Orch;

public class Main {

	public static void main(String[] args) {

		MonsterFactory monster1;
		MonsterFactory monster2;
		CharacterFactory playerCharacter;
		GameLogic gameLogic = new GameLogic();

		String winner = "";

		monster1 = gameLogic.monsterRandomizer();
		monster1.setDamage(gameLogic.randomizer(5));
		monster1.setMonsterHealth(gameLogic.randomizer(5));
		monster2 = gameLogic.monsterRandomizer();
		monster2.setDamage(gameLogic.randomizer(5));
		monster2.setMonsterHealth(gameLogic.randomizer(5));
		playerCharacter = gameLogic.characterRandomizer();
		playerCharacter.setCharacterHealth(gameLogic.randomizer(8));
		playerCharacter.setDamage(gameLogic.randomizer(8));

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
