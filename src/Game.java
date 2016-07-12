
public abstract class Game {
	public final String GAME_NAME;
	
	public Game(String name){
		GAME_NAME = name;
	}
	
	abstract public void play();
}
