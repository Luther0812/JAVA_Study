/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_03;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_012 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		if(number % 5 == 0 && number % 6 == 0){
			System.out.println(number + " is divisible by both 5 and 6");
		}
		
		if(number % 5 == 0 || number % 6 == 0){
			System.out.println(number + " is divisible by 5 or 6, but not both");
		}
		
		if(!(number % 5 == 0 && number % 6 == 0)){
			System.out.println(number + " is not divisible by either 5 or 6");
		}
	}

}
