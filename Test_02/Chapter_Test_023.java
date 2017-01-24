/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_02;

/**
 *
 *
 */
import java.util.Scanner;

public class Chapter_Test_023 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter v0,v1, and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double acceleration = (v1 - v0) / t;
		
		System.out.print("The average acceleration is " + acceleration);
	}

}
