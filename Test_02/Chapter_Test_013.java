/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_02;

/**
 *
 *
 */
import java.util.Scanner;

public class Chapter_Test_013 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		int amount = input.nextInt();
		System.out.print("Enter monthly interest rate: ");
		double rate = input.nextDouble();
		System.out.print("Enter number of years: ");
		int years = input.nextInt();
		
		double value = amount * Math.pow((1 + rate / 100), (years));
		
		System.out.println("Accumulated value is " + value);
	}

}
