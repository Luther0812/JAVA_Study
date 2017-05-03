/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_20;

/**
 * @author up
 *
 */
public class RecursivePalindromeUsingSubstring_003 {
	public static boolean isPalindrome(String s){
		if(s.length() <= 1){
			return true;
		}else if(s.charAt(0) != s.charAt(s.length() - 1)){
			return false;
		}else{
			return isPalindrome(s.substring(1, s.length() - 1));
		}
	}
	
	public static void main(String[] args){
		System.out.println("Is moom a palindrome?" + isPalindrome("moon"));
	}

}
