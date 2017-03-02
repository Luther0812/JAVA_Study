/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_012 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two words: ");
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		if(isAnagram(s1, s2)){
			System.out.println("The two words are anagram");
		}else{
			System.out.println("The two words are not anagram");
		}
	}
	
	public static boolean isAnagram(String s1, String s2){
		String s1Sort = sort(s1);
		String s2Sort = sort(s2);
		if(s1Sort.equals(s2Sort)){
			return true;
		}else{
			return false;
		}
	}
	
	public static String sort(String s){
		StringBuilder s1 = new StringBuilder(s);
		for(int i = 0; i < s1.length(); i++){
			for(int j = 0; j < s1.length(); j++){
				if(s1.charAt(i) < s1.charAt(j)){
					char t = s1.charAt(i);
					s1.replace(i, (i + 1), String.valueOf(s1.charAt(j)));
					s1.replace(j, j + 1, String.valueOf(t));
				}
			}
		}
		return s1.toString();
	}

}
