/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_008 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		System.out.println(s + "'s binary is " + binaryToDecimal(s));
	}
	
	public static int binaryToDecimal(String s){
		int num = 0;
		int t = 0;
		for(int i = s.length() - 1; i >= 0; i--){
			num = num + (int)((s.charAt(i) - '0') * Math.pow(2, t));
			t++;
		}
		return num;
	}

}
