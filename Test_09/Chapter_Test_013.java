/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author up
 *
 */
public class Chapter_Test_013 {
	public static void main(String[] args){
		String s = args[0];
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
