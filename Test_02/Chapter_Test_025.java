/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_02;

/**
 *
 *
 */
import java.util.Scanner;

public class Chapter_Test_025 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT: ");
		long offset = input.nextLong();
		long offsetMillsecondes = offset * 2 * 3600 * 1000;
		
		long totalMillseconds = System.currentTimeMillis() + offsetMillsecondes;
		
		//Obtain the total seconds since midnight ,Jan 1,1970
		long totalSeconds = totalMillseconds / 1000;
		
		//Compute the current seconds in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		//Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		//Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		
		//Obtain the total hours
		long totalHours = totalMinutes / 60;
		
		//Compute the current hour
		long currentHour = totalHours % 24;
		
		//Display results
		System.out.println("Current time is " + currentHour + ":" + 
		currentMinute + ":" + currentSecond + "GMT");
	}

}
