package zombie;

public class Game {
	private Zombie zombie;
	private Hero hero;
	private Boss boss;
	
	private Game() {
		zombie = new Zombie(5,100,5);
		hero = new Hero(0,200,10);
		boss = new Boss(10,300,20,100);
	}
	
	private static Game instance = new Game();
	
	public static Game getInstance() {
		return instance;
	}
	
	public void run() {
		
	}
}
