/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_010 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int num = input.nextInt();
		System.out.println("The num " + num + "'s binary is " + decimalToBinary(num));;
	}
	
	public static String decimalToBinary(int num){
		StringBuilder s = new StringBuilder();
		while(num >= 2){
			char c = (char)(num % 2 + '0');
			num = num / 2;
			s.insert(0, c);
		}
		s.insert(0, (char)(num + '0'));
		return s.toString();
	}

}
