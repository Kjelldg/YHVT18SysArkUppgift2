package factories;

public abstract class CharacterFactory {

	protected int characterHealth = 10;

	public abstract String personalMotto();

	public int getCharacterHealth() {
		return characterHealth;
	}

	public void setCharacterHealth(int characterHealth) {
		this.characterHealth = characterHealth;
	}

}
