/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_02;

/**
 *
 *
 */
import java.util.Scanner;

public class Chapter_Test_008 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code : ");
		int code = input.nextInt();
		
		char value = (char)code;
		
		System.out.println("The character for ASCII code " + code + " is " + value);
	}

}
