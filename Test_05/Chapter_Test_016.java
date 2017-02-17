/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
public class Chapter_Test_016 {
	public static void main(String[] args){
		System.out.printf("%-6s%10s%-6s\n", "year", "", "Days");
		for(int i = 2000; i <= 2010; i++){
			int days = numberOfDaysInAYear(i);
			System.out.printf("%-6d%10s%-6d\n", i, "", days);
		}
	}
	
	public static int numberOfDaysInAYear(int year){
		int days = 365;
		if(isLeapYear(year)){
			days = 366;
		}
		return days;
	}
	
	public static boolean isLeapYear(int year){
		if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)){
			return true;
		}else{
			return false;
		}
	}

}
