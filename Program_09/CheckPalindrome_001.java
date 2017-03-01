/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_09;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class CheckPalindrome_001 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		if(isPalindrome(s)){
			System.out.println(s + " is a palindome");
		}else{
			System.out.println(s + " is not a palindome");
		}
	}
	
	public static boolean isPalindrome(String s){
		int low = 0;
		int high = s.length() - 1;
		while(low < high){
			if(s.charAt(low) != s.charAt(high)){
				return false;
			}
			low++;
			high--;
		}
		return true;
	}

}
