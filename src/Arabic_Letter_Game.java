/**
 * 
 */

/**
 * @author Jordane
 *
 */
import java.util.Scanner;
import java.lang.Math;

public class Arabic_Letter_Game extends Game {
	private Player player;
	private Scanner input = new Scanner(System.in);
	private int random_number = 0;
	
	private final String [] ARABIC_LETTERS = {
			"ا" , "ب" , "ت" , "ث" , "ج" , "ح" , "خ" ,
			"د" , "ذ" , "ز" , "ر" , "س" , "ش" , "ص" ,
			"ض" , "ط" , "ظ" , "ع" , "غ" , "ف" , "ق" ,
			"ك" , "ل" , "م" , "ن" , "ه" , "و" , "ي" 
	};
	private final String [] LATIN_ARABIC_LETTER_SPELLING = {
			"alif" , "ba" , "ta" , "tha" , "jim" , "ha" , "kha" ,
			"dal" , "dhal" , "zay" , "ri" , "sin" , "scin" , "sad" ,
			"dad" , "ta" , "za" , "ayn" , "ghayn" , "fa" , "qaf" ,
			"kaf" , "lam" , "miim" , "nuun" , "ha" , "wow", "ya"
	};
	private final String [] TONED_EQUIVALENT_LATIN_SPELLINGS = {
			"alif" , "ba" , "ta" , "tha" , "jim", "ha" , "kha" ,
			"dal" , "dhal" , "zay", "ri" , "sin" , "scin" , "sad" ,
			"dad" , "taʾ" , "za" , "'ayn" , "ghayn" , "fa" , "qaf" ,
			"kaf" , "lam" , "miim" , "nuun" , "ha" , "wow", "ya"
	};
	
	
	public Arabic_Letter_Game(Player p) {
		super("Arabic Letter Choosing Game");
		player = p;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
	public void start(){
		System.out.println(
				"Hello "+player.NAME+", your about to play "+this.GAME_NAME+"."
				+"\nThis game was design to help you learn the Arabic Alphabet,\nI will post a random"
				+ "Arabic letter to the screen and your going\nto tell me the latin equivalent based on wheither"
				+ "your right or\nwrong you gain points. Are you ready?"
				);
		@SuppressWarnings("unused")
		String useless = input.nextLine();
		System.out.println("I don't care begin.\n\n");
	}
	
	// this needs more refinement to better fine in the system of classes
	public void loop(){
		String answer = "";
		int loop_counter = 0;
		while(true){
			loop_counter ++;//change to ++
			choose_random_number();
			
			System.out.println("What is this character " + ARABIC_LETTERS[get_random_number()]);//@Addon get an answer bank(one that comes on and off) Equivalent
			
			answer = input.nextLine();
			
			if (answer.equals(LATIN_ARABIC_LETTER_SPELLING[get_random_number()])){
	    		System.out.println(
	    				"Good job you got it right, but keep going.\nThe toned Equivalent is "
	    				+ TONED_EQUIVALENT_LATIN_SPELLINGS[get_random_number()] + "\n"
	    				);
	    		player.add_to_score(1);
	    	} else {
	    		System.out.println(
	    					"Sorry possible male or female the correct answer is " + LATIN_ARABIC_LETTER_SPELLING[get_random_number()] + " "
	    					+ "and the toned Equivalent is "+ TONED_EQUIVALENT_LATIN_SPELLINGS[get_random_number()] + "."
	    					+ "\nBut still keep going you only get better.\n"
	    					);
	    	}
			
			if(loop_counter%5==0){
				if(ask_to_exit())
					break;
			}
			
		}
	}
	//tested
	private boolean ask_to_exit() {
		String response = "";
		while (true){
			System.out.println("Would you like to stop playing?(\"yes\" or \"no\" responses only)");
			response = input.nextLine();
			if (response.equals("yes") || response.equals("no"))
				break;
		}
		if(response.equals("yes"))
			return true;
		return false;
	}
	//tested
	private void choose_random_number(){
		set_random_number((int) (Math.random()*27));
	}
	
	public int get_random_number() {
		return random_number;
	}

	public void set_random_number(int random_number) {
		this.random_number = random_number;
	}
	
}
