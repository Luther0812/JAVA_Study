/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_02;

/**
 *
 *
 */
public class ShowCurrentTime_006 {
	public static void main(String[] args){
		//Obtain the total millisseconds since midnight,Jan 1,1970
		long totalMillseconds = System.currentTimeMillis();
		
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
