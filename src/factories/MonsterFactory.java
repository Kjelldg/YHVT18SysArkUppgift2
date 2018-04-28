package factories;

public abstract class MonsterFactory {

	protected int monsterHealth = 10;

	public abstract String battleCry();

	public abstract String description();

	public int getMonsterHealth() {
		return monsterHealth;
	}

	public void setMonsterHealth(int monsterHealth) {
		this.monsterHealth = monsterHealth;
	}

}
