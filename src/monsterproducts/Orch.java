package monsterproducts;

import factories.MonsterFactory;

public class Orch extends MonsterFactory {

	@Override
	public void setMonsterHealth(int monsterHealth) {

		super.setMonsterHealth(monsterHealth);
	}

	@Override
	public String battleCry() {
		return "RAAAAAAAAAAAAAA!";
	}

	@Override
	public String description() {
		return "This orch smells horrible. It feels bad.";
	}

}
