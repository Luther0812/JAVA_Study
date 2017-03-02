/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_011 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		System.out.println("The sorted is " + sort(s));
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
