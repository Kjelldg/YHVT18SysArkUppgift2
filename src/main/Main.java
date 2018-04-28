package main;

import factories.MonsterFactory;
import monsterproducts.Berserker;
import monsterproducts.Orch;

public class Main {

	public static void main(String[] args) {

		MonsterFactory orch1 = new Orch();
		MonsterFactory berserker1 = new Berserker();

		System.out.println("Orch lines below:");
		System.out.println(orch1.battleCry());
		System.out.println(orch1.description());
		orch1.setMonsterHealth(1000);
		System.out.println(orch1.getMonsterHealth());

		System.out.println("Berserker lines below:");
		System.out.println(berserker1.battleCry());
		System.out.println(berserker1.description());
		berserker1.setMonsterHealth(1000);
		System.out.println(berserker1.getMonsterHealth());

		System.out.println(orch1.getMonsterHealth());
	}

}
