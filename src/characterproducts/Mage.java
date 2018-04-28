package characterproducts;

import factories.CharacterFactory;

public class Mage extends CharacterFactory {

	@Override
	public void setCharacterHealth(int characterHealth) {
		super.setCharacterHealth(characterHealth);
	}

	@Override
	public String personalMotto() {
		return "Trust no one.";

	}

}
