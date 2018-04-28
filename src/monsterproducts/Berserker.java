package monsterproducts;

import factories.MonsterFactory;

public class Berserker extends MonsterFactory {

	@Override
	public void setMonsterHealth(int monsterHealth) {
		super.setMonsterHealth(999);
	}

	@Override
	public String battleCry() {

		return "It's Luigi time!";
	}

	@Override
	public String description() {
		return "This is the berserker.";
	}

}
