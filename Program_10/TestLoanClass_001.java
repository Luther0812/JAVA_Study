/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_10;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class TestLoanClass_001 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter yearly interest rate, for example. 8.25: ");
		double annualInterestRate = input.nextDouble();
		
		System.out.print("Enter number of years as an integer: ");
		int numberOfYears = input.nextInt();
		
		System.out.print("Enter loan amount, for example, 120000.95: ");
		double loanAmount = input.nextDouble();
		
		Loan_002 loan = new Loan_002(annualInterestRate, numberOfYears, loanAmount);
		
		System.out.printf("The loan was created on %s\nThe monthly payment is %.2f\nThe total payment is %.2f\n", loan.getLoanDate().toString(), 
				loan.getMonthlyPayment(), loan.getTotalPayment());
	}

}
