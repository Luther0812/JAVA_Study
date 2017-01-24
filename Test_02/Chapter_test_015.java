/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_02;

/**
 *
 *
 */
import java.util.Scanner;

public class Chapter_test_015 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter annualRate: ");
		double annualRate = input.nextDouble();
		
		double monthlyRate = annualRate / 1200;
		
		double firstAmount = amount * (1 + monthlyRate);
		double secondAmount = (amount + firstAmount) * (1 + monthlyRate);
		double thirdAmount = (amount + secondAmount) * (1 + monthlyRate);
		double fourthAmount = (amount + thirdAmount) * (1 + monthlyRate);
		double fifthAmount = (amount + fourthAmount) * (1 + monthlyRate);
		double sixthAmount = (amount + fifthAmount) * (1 + monthlyRate);
		
		System.out.println("The Sixth Month Amount is: " + sixthAmount);
	}

}
