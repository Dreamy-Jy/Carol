/**
 * 
 */

/**
 * @author Jordane
 *
 */
public class Player {
	public final String NAME;
	private int score;
	
	public Player(String name){
		this.NAME = name;
		score = 0;
	}
	
	public int get_score(){
		return score;
	}
	
	public void set_score(int new_score){
		score = new_score;
	}
	
	public void add_to_score(int add_by){
		set_score(this.get_score()+ add_by );
	}
	
}
