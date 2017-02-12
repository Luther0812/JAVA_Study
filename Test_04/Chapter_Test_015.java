/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_015 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		if(number1 <= number2){
			int temp = number1;
			for(; temp >= 1; temp--){
				if(number1 % temp == 0 && number2 % temp == 0){
					System.out.println("The max common divisor is " + temp);
					break;
				}
			}
		}else{
			int temp = number2;
			for(; temp >= 1; temp--){
				if(number1 % temp == 0 && number2 % temp == 0){
					System.out.println("The max common divisor is " + temp);
					break;
				}
			}
		}
	}

}
