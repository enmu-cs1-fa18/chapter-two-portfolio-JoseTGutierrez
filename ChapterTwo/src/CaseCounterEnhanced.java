import java.util.Scanner;

/**
 * Calculates how many full cases can be filled with a given number of cans.
 * 
 * @author
 * @version
 * @date
 */
public class CaseCounterEnhanced {
	/*
	 * SPECIFICATIONS:
	 * A case holds 12 cans.
	 * Prompt the user to input a number of cans.
	 * Prompt user to input the cost of a can.
	 *  
	 * Print out how many full cases you will have. 
	 * Print out how many cans are left over. 
	 * Print out the total dollar value of the cans, formatted as money.
	 * 
	 * Make sure that each output value is printed on a separate line
	 * and that you describe each output clearly with words.
	 */
	
	/**
	 * The main method where you will execute your code.
	 * @param args
	 */
	public static void main(String[] args) {

		int numberOfCans;
		float cost;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input number of cans: ");
		
		numberOfCans = input.nextInt();
		
		System.out.println("Input cost of cans: ");
		
		cost = input.nextFloat();
		
		System.out.println("Full cases: " + numberOfCans/12);
		
		System.out.println("Left over cans: " + numberOfCans%12);
		
		System.out.println("Total dollar value: $" + numberOfCans * cost);
		

	}

}
