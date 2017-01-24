/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_02.Chapter_Test_012;

/**
 *
 *
 */
import java.util.Scanner;

public class Chapter_Test_012_02 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		int balance = input.nextInt();
		double rate = input.nextDouble();
		
		double interest = balance * (rate / 1200);
		
		System.out.println("The interest is " + interest);
	}

}
