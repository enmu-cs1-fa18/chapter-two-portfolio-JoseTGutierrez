
public class PennyCalculator {
	 /*
	  * Assignment:  
	  *
	  *    Write a program to handle this task. You have 458 pennies in a jar. Calculate the number of dollars, 
	  *    quarters, dimes, nickels and pennies you will get from the bank. (The bank will give you the fewest coins 
	  *    possible.) Print out the number of dollars, quarters, dimes, nickels, and pennies you will get from the 
	  *    bank. Print out the total number of coins you will get. (Is a dollar bill a coin?)  
	  *    Print out each value on a different line.  
	 */
	public static void main(String[] args) {
		int pennies = 458;
		int quarters, dimes, nickels;
		quarters = pennies/25;
		pennies = pennies - quarters*25;
		dimes = pennies / 10;
		pennies = pennies - dimes*10;
		nickels = pennies / 5;
		pennies = pennies - nickels * 5;
		
		
		
		System.out.println("Quarters: " + quarters + " Dimes: " + dimes + " Nickels: " + nickels + " Pennies: " + pennies);
		
		System.out.println("Total number of coins: " + (quarters + dimes + nickels + pennies));
	}

}