/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_005 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = input.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = input.nextInt();
		System.out.print("Enter the third number: ");
		int num3 = input.nextInt();
		
		displaySortedNumbers(num1, num2, num3);
	}
	
	public static void displaySortedNumbers(int num1, int num2, int num3){
		if(num1 <= num2){
			if(num2 <= num3){
				System.out.println("The number is " + num1 + " < " + num2 + " < " + num3);
			}else if(num1 <= num3){
				System.out.println("The number is " + num1 + " < " + num3 + " < " + num2);
			}else{
				System.out.println("The number is " + num3 + " < " + num1 + " < " + num2);
			}
		}else{
			if(num1 <= num3){
				System.out.println("The number is " + num2 + " < " + num1 + " < " + num3);
			}else if(num2 <= num3){
				System.out.println("The number is " + num2 + " < " + num3 + " < " + num1);
			}else{
				System.out.println("The number is " + num3 + " < " + num2 + " < " + num1);
			}
		}
	}

}
