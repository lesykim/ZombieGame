package zombie;

import java.util.Random;

public class Unit {
	private int pos;
	private int hp;
	private boolean isDead;

	int max;
	Random ran;
	
	public Unit(int pos, int hp, int max) {
		this.pos=pos;
		this.hp = hp;
		this.max=max;
		ran = new Random();
	}

	public int getHp() {
		return hp;
	}

	public void setHpPlus() {
		this.hp++;
	}
	
	public void setHpMinus() {
		if(this.hp == 0) {
			this.isDead = true;
		}
		if(!isDead) {
			this.hp--;
		}
	}

	public int getPos() {
		return pos;
	}

	public void moveForword() {
		this.pos++;
	}
}
