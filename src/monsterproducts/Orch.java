package monsterproducts;

import factories.MonsterFactory;

public class Orch extends MonsterFactory {

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
		return "RAAAAAAAAAAAAAA!";
	}

	@Override
	public String description() {
		return "This orch smells horrible. It feels bad.";
	}

	@Override
	public String toString() {
		return "This is the Orch.";
	}

}
