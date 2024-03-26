package zombie;

public class Hero extends Unit implements Damage, Attack{

	public Hero(int pos, int hp, int max) {
		super(pos, hp, max);
	}

	@Override
	public void demage(int attack) {
		while(attack>0) {
			this.setHpMinus();
			attack--;
		}
	}

	@Override
	public void attack(Unit monster) {
		
	}
	
}
