/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_02;

/**
 *
 *
 */
import java.util.Scanner;

public class Chapter_Test_006 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int num = input.nextInt();
		
		int a = num % 10;
		num = num / 10;
		int b = num % 10;
		num = num / 10;
		int c = num % 10;
		num = num / 10;
		
		int sum = a + b + c;
		System.out.println("The sum of the digits is " + sum);
	}

}
