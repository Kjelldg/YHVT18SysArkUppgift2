package characterproducts;

import factories.CharacterFactory;

public class Mage extends CharacterFactory {

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
		return "The truth is out there.";

	}

}
