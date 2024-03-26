package zombie;

public class Zombie extends Unit implements Damage, Attack{

	// pos : 위치 / hp : 현재체력 / max 최대공격력
	
	public Zombie(int pos, int hp, int max) {
		super(pos, hp, max);
	}

	@Override
	public void demage(int attack) {
		while(attack>0) {
			if(isDead()) {
				break;
			}
			this.setHpMinus();
			attack--;
		}
	}

	@Override
	public void attack(Unit hero) {
		int attack = ran.nextInt(this.getMax())+2;
		System.out.printf("zombie %d 공격⚔️\n",attack);
		while(attack>0) {
			if(hero.isDead()) {
				break;
			}
			hero.setHpMinus();
			attack--;
		}
	}
	
}
