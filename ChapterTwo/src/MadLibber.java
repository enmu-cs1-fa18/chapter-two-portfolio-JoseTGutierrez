import java.util.Scanner;
/**
 * Gets words from user to fill in the gaps in a story.
 * @author
 * @version
 * @date
 *
 */
public class MadLibber {
	/* 
	 * 	  Assignment:
	 * 	  The user inputs two adjectives, three nouns, a number, a verb, and a body part. 
	 *    The program outputs this story with the nouns and adjectives inserted into the 
	 *    appropriate places in the song below (it's a MadLib). Make sure the printed lines are 
	 *    all about the same length. Be sure to follow all the standards of good coding.
	 *    Keep your inputs respectable on the version you copy/paste to submit to me!
	 */
	
	/*	  MADLIB:
	 * 
	 *    Hey baby, I guarantee there'll be Adj1 times. I guarantee that at some
	 *    Noun1, Number1 or both of us is gonna want to get out of this Noun2. But
	 *    I also guarantee that if I don't ask you to be Adj2, I'll Verb1 it for the
	 *    rest of my Noun3, because I know in my Bodypart1, you're the only one for me.
	 *    
	 *    Be sure to double check the spacing on your output!
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String adj1, noun1, num1, noun2, adj2, verb1, noun3, bodypart1;
		
		adj1 = input.nextLine();
		noun1 = input.nextLine();
		num1 = input.nextLine();
		noun2 = input.nextLine();
		adj2 = input.nextLine();
		verb1 = input.nextLine();
		noun3 = input.nextLine();
		bodypart1 = input.nextLine();
		
		
		System.out.println("Hey baby, I guarantee there'll be " + adj1 + " times. I guarantee that at some, " + noun1 + ", " + num1 +" or both of us is gonna want to get out of this " + noun2 + ". but I also guarantee that if I dont ask you to be " + adj2 + " I'll " + verb1 + "it for the rest of my " + noun3 + ", because I know in my " + bodypart1 + ", you're the only one for me.");

	}

}
