package zombie;

public class Boss extends Unit implements Damage, Attack{
	private int shield;
	
	public Boss(int pos, int hp, int max, int shield) {
		super(pos, hp, max);
		this.shield = shield;
	}

	@Override
	public void demage(int attack) {
		while(attack>0) {
			if(isDead()) {
				break;
			}
			if(this.shield > 0) {
				this.shield--;
			}else {
				this.setHpMinus();				
			}
			attack--;
		}
	}

	@Override
	public void attack(Unit hero) {
		int attack = ran.nextInt(this.getMax())+2;
		int random = ran.nextInt(5);
		if(random == 1) {
			attack *= 2;
		}
		System.out.printf("Boss %d 공격⚔️\n",attack);
		while(attack>0) {
			if(hero.isDead()) {
				break;
			}
			hero.setHpMinus();
			attack--;
		}
	}
	
}
