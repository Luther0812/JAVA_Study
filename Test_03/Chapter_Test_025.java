/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_03;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_025 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three side: ");
		
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		if((number1 + number2 > number3) && (number1 + number3 > number2) && (number2 + number3 > number1)){
			System.out.println("The length is " + (number1 + number2 + number3));
		}else{
			System.out.println("The value is invalid");
		}
	}

}
