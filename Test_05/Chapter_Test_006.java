/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_006 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		displayPattern(number);
	}
	
	public static void displayPattern(int number){
		int count = 1;
		for(int i = 1; i <= number; i++){
			for(int j = 1; j <= (number - i); j++){
				System.out.printf("%4s", " ");
			}
			for(int t = i; t >= 1; t--){
				System.out.printf("%4d", t);
			}
			System.out.println();
		}
	}

}
