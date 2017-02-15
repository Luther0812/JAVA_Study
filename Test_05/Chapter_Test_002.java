/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_002 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int result = sumDigits(number);
		System.out.println("The result is " + result);
	}
	
	public static int sumDigits(int i){
		int result = 0;
		while(i >= 9){
			result = result + i % 10;
			i = i / 10;
		}
		result = result + i;
		return result;
	}

}
