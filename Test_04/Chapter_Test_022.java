/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_022 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double amount = input.nextDouble();
		System.out.print("Number of Years: ");
		int number = input.nextInt();
		System.out.print("Annual Interest Rate: ");
		double rate = input.nextDouble();
		
		double monthlyInterestRate = rate / 1200;
		double monthlyPayment = amount * monthlyInterestRate / (1 - 1 / Math.pow(1 + 
				monthlyInterestRate,number * 12));
		double totalPayment = monthlyPayment * number * 12;
		
		System.out.println("Monthly Payment:" + monthlyPayment);
		System.out.println("Total Payment:" + totalPayment);
		
		double interest;
		double principal;
		double balance = amount;
		
		for(int i = 1; i <= number * 12; i++){
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
		}
	}

}
