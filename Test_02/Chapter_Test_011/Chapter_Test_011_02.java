/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_02.Chapter_Test_011;

/**
 *
 *
 */
import java.util.Scanner;

public class Chapter_Test_011_02 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double rate = input.nextDouble();
		System.out.print("Enter Federal tax withholding rate: ");
		double taxFederal = input.nextDouble();
		System.out.print("Enter State tax withholding rate: ");
		double taxState = input.nextDouble();
		
		double grossPay = hours * rate;
		double federalTax = taxFederal * grossPay;
		double stateTax = taxState * grossPay;
		double totalDeduction = federalTax + stateTax;
		double netpay = grossPay - totalDeduction;
		
		String output = "Employee Name: " + name + "\n" + 
		"Hours Worked: " + hours + "\n" + 
				"Pay Rate: $" + rate + "\n" + 
		"Gross Pay: $" + grossPay + "\n" + 
				"Deduction: " + "\n\t" + 
		"Federal Withholding (" + federalTax * 100 + "%)" + "\n\t" + 
				"State Withholding (" + stateTax * 100 + "%)" + "\n\t" + 
		"Total Deduction: $" + totalDeduction + "\n" + 
				"Net Pay: " + netpay;
		
		System.out.println(output);
	}

}
