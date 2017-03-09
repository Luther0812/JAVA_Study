/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_13;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class QuotientWithMethod_004 {
	public static int quotient(int number1, int number2){
		if(number2 == 0){
			throw new ArithmeticException("Divisor can not be zero");
		}else{
			return number1 / number2;
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		try{
			int result = quotient(number1, number2);
			System.out.println(number1 + " / " + number2 + " is " + result);
		}catch(ArithmeticException ex){
			System.out.println("Exception: an integer can not be divided by zero");
		}
		
		System.out.print("Exception continues...");
	}

}