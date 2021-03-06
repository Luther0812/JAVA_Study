/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_02;

/**
 *
 *
 */
import javax.swing.JOptionPane;

public class Chapter_Test_010 {
	public static void main(String[] args){		
		//Receive the amount
		String amountString = JOptionPane.showInputDialog("Enter an amount in double, for example 11.56: ");
		double amount = Double.parseDouble(amountString);
		
		int remainingAmount = (int)(amount * 100);
		
		//Find the number of one dollars
		int numberOfDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		//Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		//Find the number of dimes in the remaining amount
		int numberOfDiems = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		//Find the number of nickels in the remaing amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;
		
		//Find the number of pennies in the remaing amount
		int numberOfPennies = remainingAmount;
		
		//Display result
		System.out.println("Your amount " + amount + " consists of \n" + 
		"\t" + numberOfDollars + " Dollars\n" + 
				"\t" + numberOfQuarters + " Quarters\n" + 
		"\t" + numberOfDiems + " Diems\n" + 
				"\t" + numberOfNickels + " Nickels\n" + 
		"\t" + numberOfPennies + " Pennies\n");;
	}

}
