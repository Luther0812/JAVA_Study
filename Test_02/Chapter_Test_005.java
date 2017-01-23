/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_02;

/**
 *
 *
 */
import java.util.Scanner;

public class Chapter_Test_005 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double total = input.nextDouble();
		double rate = input.nextDouble();
		
		double gratuity = total * rate / 100.0;
		double subtotal = total + gratuity;
		
		System.out.println("The gratuity is " + gratuity + 
				" and total is " + subtotal);
	}

}
