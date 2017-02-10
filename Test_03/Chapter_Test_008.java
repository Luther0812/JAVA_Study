/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_03;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_008 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three numbers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		if(number1 <= number2){
			if(number3 <= number1){
				System.out.print("The order of three numbers is " + number3 + " <= " + number1 + " <= " + number2);
			}else if(number3 <= number2){
				System.out.print("The order of three numbers is " + number1 + " <= " + number3 + " <= " + number2);
			}else{
				System.out.print("The order of three numbers is " + number1 + " <= " + number2 + " <= " + number3);
			}
		}else if(number3 <= number2){
			System.out.print("The order of three numbers is " + number3 + " <= " + number2 + " <= " + number1);
		}else if(number3 <= number1){
			System.out.print("The order of three numbers is " + number2 + " <= " + number3 + " <= " + number1);
		}else{
			System.out.print("The order of three numbers is " + number2 + " <= " + number1 + " <= " + number3);
		}
	}

}
