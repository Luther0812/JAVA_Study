/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_007 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount invested: ");
		double amount = input.nextDouble();
		System.out.print("Annual interest reate: ");
		double rate = input.nextDouble();
		int count = 30;
		System.out.printf("%-6s%5s%-10s\n", "Years", " ", "Future Value");
		for(int i = 1; i <= count; i++){
			double monthRate = rate / 12.0;
			double result = futureInvestmentValue(amount, monthRate, i);
			System.out.printf("%-6d%5s%-10.2f\n", i, " ", result);
		}
	}
	
	public static double futureInvestmentValue(double amount, double rate, int year){
		double value = amount * Math.pow((1 + rate / 100), (12 * year));
		return value;
	}

}
