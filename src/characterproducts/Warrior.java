package characterproducts;

import factories.CharacterFactory;

public class Warrior extends CharacterFactory {

	@Override
	public void setCharacterHealth(int characterHealth) {
		super.setCharacterHealth(characterHealth);
	}

	@Override
	public void setDamage(int damage) {
		super.setDamage(damage);
	}

	@Override
	public String personalMotto() {
		return "I believe it is hammer time.";
	}

}
