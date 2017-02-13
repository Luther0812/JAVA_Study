/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_028 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year and the first day of the year: ");
		int year = input.nextInt();
		int day = input.nextInt();
		String month = "";
		String week = "";
		int daysOfMonth = 0;
		int totalDays = day;
		for(int i = 1; i <= 12; i++){
			if(year % 400 == 0 || (year % 100 == 0 && year % 4 == 0)){
				if(i == 2 || i == 4 || i == 6 || i == 8 || i == 9 || 1 == 11){
					daysOfMonth = 31;
				}else if(i == 3){
					daysOfMonth = 29;
				}else if(i == 5 || i == 7 || i == 10 || i == 11){
					daysOfMonth = 30;
				}
			}else{
				if(i == 2 || i == 4 || i == 6 || i == 8 || i == 9 || 1 == 11){
					daysOfMonth = 31;
				}else if(i == 3){
					daysOfMonth = 28;
				}else if(i == 5 || i == 7 || i == 10 || i == 11){
					daysOfMonth = 30;
				}
			}
			
			totalDays = (totalDays + daysOfMonth) % 7;
			
			switch(totalDays){
			case 0:
				week = "Sunday";
				break;
			case 1:
				week = "Monday";
				break;
			case 2:
				week = "Tuesday";
				break;
			case 3:
				week = "Wednesday";
				break;				
			case 4:
				week = "Thursday";
				break;
			case 5:
				week = "Friday";
				break;
			case 6:
				week = "Saturday";
				break;
			}
			
			switch(i){
			case 1:
				month = "January";
				break;
			case 2:
				month = "February";
				break;
			case 3:
				month = "March";
				break;
			case 4:
				month = "April";
				break;
			case 5:
				month = "May";
				break;
			case 6:
				month = "June";
				break;
			case 7:
				month = "July";
				break;
			case 8:
				month = "August";
				break;
			case 9:
				month = "September";
				break;
			case 10:
				month = "October";
				break;
			case 11:
				month = "November";
				break;
			case 12:
				month = "December";
				break;
			}
			
			System.out.println(month + " " + "1, " + year + " is " + week);
		}
	}

}
