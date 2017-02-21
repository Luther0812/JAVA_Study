/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_033 {
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
		
		long totalRemainSeconds = totalSeconds - currentHour * 3600 + currentMinute * 60 +currentSecond;
		long totalDays = totalRemainSeconds / (24 * 3600);
		
		int year = 1970;
		while(totalDays > getTotalNumberOfDays(year)){
			totalDays = totalDays - getTotalNumberOfDays(year);
			year++;
		}
		
		int month = 1;
		while(totalDays > getNumberOfDaysInMonth(year, month)){
			totalDays = totalDays - getNumberOfDaysInMonth(year, month);
			month++;
		}
		
		//Display results
		System.out.println("Current time is " + year + "/" + month + "/" + totalDays + " " + (currentHour + 8) + ":" + 
		currentMinute + ":" + currentSecond + "GMT");
	}
	
	public static int getTotalNumberOfDays(int year){
		int total = 0;
		if(isLeapYear(year)){
			total = 366;
			return total;
		}else{
			total = 365;
			return total;
		}
	}
	
	public static int getNumberOfDaysInMonth(int year, int month){
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month ==10 || month == 12){
			return 31;
		}
		if(month == 4 || month == 6 || month == 9 || month == 11){
			return 30;
		}
		if(month == 2) return isLeapYear(year) ? 29 : 28;
		return 0;
	}
	
	public static boolean isLeapYear(int year){
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

}
