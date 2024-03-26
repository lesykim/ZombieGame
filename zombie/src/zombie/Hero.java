package zombie;

public class Hero extends Unit implements Damage, Attack{

	public Hero(int pos, int hp, int max) {
		super(pos, hp, max);
	}

	@Override
	public void demage(int attack) {
		while(attack>0) {
			if(this.isDead()) {
				break;
			}
			this.setHpMinus();
			attack--;
		}
	}

	@Override
	public void attack(Unit monster) {
		int attack = ran.nextInt(this.getMax())+2;
		int random = ran.nextInt(5);
		if(random == 1) {
			attack *= 2;
			System.out.println("크리티컬💥💥 ");
		}
		System.out.printf("Hero %d 공격⚔️\n",attack);
		while(attack>0) {
			if(monster.isDead()) {
				break;
			}
			monster.setHpMinus();
			attack--;
		}
	}
	
}
