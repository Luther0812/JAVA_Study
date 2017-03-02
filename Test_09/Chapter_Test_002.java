/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_002 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first String: ");
		String s1 = input.nextLine();
		System.out.print("Enter second String: ");
		String s2 = input.nextLine();
		if(s1.length() > s2.length()){
			System.out.println("The first string is not a substring of second string");
			System.exit(0);
		}else{
			for(int i = 0; i <= s2.length() - s1.length(); i++){
				if(s1.equals(s2.substring(i, i + s1.length()))){
					System.out.println("The first string is a substring of second string");
					System.exit(0);
				}
			}
			System.out.println("The first string is not a substring of second string");
			System.exit(0);
		}
	}

}
