/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_025 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long number = input.nextLong();
		String result = convertMillis(number);
		System.out.println("The result is " + result);
	}
	
	public static String convertMillis(long mills){
		long total = mills / 1000;
		long seconds = total % 60;
		long secondsRemain = total / 60;
		long minutes = secondsRemain % 60;
		long hour = secondsRemain / 60;
		String result = hour + ":" + minutes + ":" + seconds;
		return result;
	}

}
