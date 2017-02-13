/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_029 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year and the first day of the year: ");
		int year = input.nextInt();
		int day = input.nextInt();
		String month = "";
		String week = "";
		int daysOfMonth = 0;
		int totalDays = day;
		int days = 0;
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
			
			if(year % 400 == 0 || (year % 100 == 0 && year % 4 == 0)){
				switch(i){
				case 1:
					days = 31;
					break;
				case 2:
					days = 29;
					break;
				case 3:
					days = 31;
					break;
				case 4:
					days = 30;
					break;
				case 5:
					days = 31;
					break;
				case 6:
					days = 30;
					break;
				case 7:
					days = 31;
					break;
				case 8:
					days = 31;
					break;
				case 9:
					days = 30;
					break;
				case 10:
					days = 31;
					break;
				case 11:
					days = 30;
					break;
				case 12:
					days = 31;
					break;
				}
			}else{
				switch(i){
				case 1:
					days = 31;
					break;
				case 2:
					days = 28;
					break;
				case 3:
					days = 31;
					break;
				case 4:
					days = 30;
					break;
				case 5:
					days = 31;
					break;
				case 6:
					days = 30;
					break;
				case 7:
					days = 31;
					break;
				case 8:
					days = 31;
					break;
				case 9:
					days = 30;
					break;
				case 10:
					days = 31;
					break;
				case 11:
					days = 30;
					break;
				case 12:
					days = 31;
					break;
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
			
			System.out.println(month + " " + i + ", " + year + " is " + week);
			System.out.println(month + "      " + year);
			System.out.println("----------------------------------------------");
			System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");
			for(int l = 1; l <= days; l++){
				if(l == 1){
					for(int t = 0; t < totalDays; t++){
						System.out.print("       ");
					}
					System.out.print(l + "      ");
					if(totalDays == 6){
						System.out.print("\n");
					}
				}else{
					System.out.print(l + "      ");
					if((l - (7 - totalDays)) % 7 == 0){
						System.out.print("\n");
					}
				}
			}
		}
	}
}