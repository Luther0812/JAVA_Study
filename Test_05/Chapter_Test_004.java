/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_004 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		reverse(number);
	}
	
	public static void reverse(int number){
		int result = 0;
		while(number > 9){
			int temp = number % 10;
			number = number / 10;
			result = result * 10 + temp;
		}
		result = result * 10 + number;
		System.out.println("The result is " + result);
	}

}
