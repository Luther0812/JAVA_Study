/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_13;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class QuotientWithIf_002 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		if(number2 == 0){
			System.out.println("Divisor can not be zero");
		}else{
			System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
		}
	}

}
