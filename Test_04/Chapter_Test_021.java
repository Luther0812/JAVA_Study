/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_021 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double amount = input.nextDouble();
		System.out.print("Number of Years: ");
		int number = input.nextInt();
		
		System.out.printf("%-16s%-16s%-16s\n","Interest Rate","Monthly Payment","Total Payment");
		
		double rate = 5.0;
		while(rate <= 8.0){
			double monthlyInterestRate = rate / 1200;
			double monthlyPayment = amount * monthlyInterestRate / (1 - 1 / Math.pow(1 + 
					monthlyInterestRate,number * 12));
			double totalPayment = monthlyPayment * number * 12;
			
			System.out.printf("%-16.2f%-16.2f%-16.2f\n",rate,monthlyPayment,totalPayment);
			rate = rate + 0.125;
		}
	}

}
