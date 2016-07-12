package not_for_use;

/**
 * @author Jordane
 *
 */
import java.util.Scanner;
import java.lang.Math;

public class Carol_Core {

	public static void main(String[] args) {
		
		System.out.println("Hi may name is Carol, we're going to play a game.\nI'm going to ask you to name a arabic letter and \nyou will tell me the english untoned equivalent.\nLet's get started.\n");
		Scanner onoff = new Scanner(System.in);	
		Scanner imput = new Scanner(System.in);
		
//VAR Declared for later use in Carol
		char [] ArabicChars = {'ا' , 'ب' , 'ت' , 'ث' , 'ج' , 'ح' , 'خ' , 'د' , 'ذ' , 'ز' , 'ر' , 'س' , 'ش' , 'ص' , 'ض' , 'ط' , 'ظ' , 'ع' , 'غ' , 'ف' ,'ق' , 'ك' , 'ل' , 'م' , 'ن' , 'ه' , 'و' , 'ي' };
	    String [] EnglishTonedEqv = { "ʾalif" , "bāʾ" , "tāʾ" , "ṯāʾ" , "ǧīm", "ḥāʾ" , "ḫāʾ" , "dāl" , "ḏāl" , "zāy" , "rāʾ" , "sīn" , "šīn" , "ṣād" , "ḍād" , "ṭāʾ" , "ẓāʾ" , "ʿayn" , "ġayn" , "fāʾ" , "qāf" , "kāf" , "lām" , "mīm" , "nūn" , "hāʾ" , "wāw", "yāʾ"};
	    String [] EnglishEqv = { "ʾalif" , "baʾ" , "ta'" , "tha" , "jim", "ha" , "kha" , "dal" , "dhal" , "zay", "ri" , "sin" , "scin" , "sad" , "dad" , "taʾ" , "za" , "'ayn" , "ghayn" , "fa" , "qaf" , "kaf" , "lam" , "miim" , "nuun" , "ha" , "wow", "ya"};
	    int randr = 0;
	    String ans = "";
	    
//The loop
	    for (int oi = 1 ;oi > 0; oi += 0 )
	    {
	    	
	    	//Randomizer
	    	randr = (int) (Math.random()*27) + 0;
	    	
	    	//Questionnaire
	    	System.out.println("What is this character " + ArabicChars[randr]);//@Addon get an answer bank(one that comes on and off) Equivalent 
	    	
	    	//Answer input
	    	ans= imput.nextLine();
	    	
	    	//Check Answer
	    	if (ans.equals(EnglishEqv[randr])){
	    		System.out.println("Good job you got it right, but keep going.\nThe toned Equivalent is " + EnglishTonedEqv[randr] + "\n");
	    	} else {
	    		System.out.println("Sorry possible male or female the correct answer is " + EnglishEqv[randr] + " and the toned Equivalent is "+ EnglishTonedEqv[randr] + ".\nBut still keep going you only get better.\n");
	    	}
	    	
	    	//LoopExit
	    	System.out.println("If you want to keep play enter any letter but 0\noh and only enter Integers an thing else and I might crash.");//@change @temp
	    	oi = onoff.nextInt();
	    	
	    }
	    //Scanner object close(s)
	    onoff.close();
	    imput.close();
//End statement 
	    System.out.println ("Thank you for playing, come back soon");
	    


	}

}
