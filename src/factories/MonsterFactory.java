package factories;

public abstract class MonsterFactory {

	protected int monsterHealth = 10;
	protected int damage = 0;

	public abstract String battleCry();

	public abstract String description();

	public int getMonsterHealth() {
		return monsterHealth;
	}

	public void setMonsterHealth(int monsterHealth) {
		this.monsterHealth = monsterHealth;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

}
