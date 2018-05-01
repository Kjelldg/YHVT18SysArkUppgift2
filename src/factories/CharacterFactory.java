package factories;

import gamelogic.GameLogic;

public abstract class CharacterFactory {

	protected int characterHealth = 10;
	protected int damage = 0;

	public abstract String personalMotto();

	public int getCharacterHealth() {
		return characterHealth;
	}

	public void setCharacterHealth(int characterHealth) {
		this.characterHealth = characterHealth;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

}
