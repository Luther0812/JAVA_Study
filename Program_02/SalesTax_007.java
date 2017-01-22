/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_02;

/**
 *
 *
 */
import java.util.Scanner;

public class SalesTax_007 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter purchase amount: ");
		double purchaseAmount = input.nextDouble();
		
		double tax = purchaseAmount * 0.06;
		System.out.println("Sales tax is " + (int)(tax * 100) / 100.0);
	}

}
