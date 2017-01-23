/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_02;

/**
 *
 *
 */
import java.util.Scanner;

public class Chapter_Test_007 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		
		int minutes = input.nextInt();
		int years = minutes / (365 * 24 * 60);
		int remainingMinutes = minutes % (365 * 24 * 60);
		int days = remainingMinutes / (24 * 60);
		
		System.out.println(minutes + " minutes is approximately " + years + 
				" years and " + days + " days");
		
	}

}
