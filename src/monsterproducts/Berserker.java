package monsterproducts;

import factories.MonsterFactory;

public class Berserker extends MonsterFactory {

	@Override
	public void setMonsterHealth(int monsterHealth) {
		super.setMonsterHealth(monsterHealth);
	}

	@Override
	public void setDamage(int damage) {
		super.setDamage(damage);
	}

	@Override
	public String battleCry() {
		return "It's Luigi time!";
	}

	@Override
	public String description() {
		return "This is the berserker.";
	}

	@Override
	public String toString() {
		return "This is the berserker.";
	}

}
