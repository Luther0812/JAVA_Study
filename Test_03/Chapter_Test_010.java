/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_03;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_010 {
	public static void main(String[] args){
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		
		System.out.print("What is " + number1 + " + " + number2 + "?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		if(number1 + number2 == answer){
			System.out.println("You are correct");
		}else{
			System.out.println("Your answer is wrong\n" + number1 +
					 " + " + number2 + " should be " + (number1 + number2));
		}
	}

}
