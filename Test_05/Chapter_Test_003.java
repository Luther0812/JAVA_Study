/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_003 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		if(isPalindrome(number)){
			System.out.println("The number " + number + " is palindrome");
		}else{
			System.out.println("The number " + number + " is not palindrome");
		}
	}
	
	public static boolean isPalindrome(int number){
		int numberReverse = reverse(number);
		if(number == numberReverse){
			return true;
		}else{
			return false;
		}
	}
	
	public static int reverse(int number){
		int count = 1;
		int result = 0;
		while(number >= 9){
			int temp = number % 10;
			number = number / 10;
			result = result * 10 + temp;
		}
		result = result * 10 + number;
		return result;
	}

}
