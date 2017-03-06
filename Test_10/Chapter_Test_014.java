/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_10;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_014 {
	public static void main(String[] args){
		MyDate d1 = new MyDate();
		long num = 561555550000L;
		MyDate d2 = new MyDate();
		d2.setDate(num);
		System.out.println("d1 " + d1.getYear() + " " + d1.getMonth() + " " + d1.getDay());
		System.out.println("d2 " + d2.getYear() + " " + d2.getMonth() + " " + d2.getDay());
	}

}

class MyDate{
	private int year;
	private int month;
	private int day;
	
	public MyDate(){
		long totalDays = System.currentTimeMillis() / (1000 * 24 * 60 * 60) + 1;
		int year = 1970;
		while(totalDays > 366){
			if(MyDate.isYear(year)){
				totalDays -= 366;
			}else{
				totalDays -= 365;
			}
			year++;
		}
		if(MyDate.isYear(year) && totalDays == 366){
			this.year = year;
			this.month = 12;
			this.day = 31;
		}else if(!MyDate.isYear(year) && totalDays == 366){
			this.year = year + 1;
			this.month = 1;
			this.day = 1;
		}else{
			this.year = year;
			if(MyDate.isYear(year)){
				if(totalDays <= 31){
					this.month = 1;
					this.day = (int)totalDays;
				}else if(totalDays <= 60){
					this.month = 2;
					this.day = (int)totalDays - 31;
				}else if(totalDays <= 91){
					this.month = 3;
					this.day = (int)totalDays - 60;
				}else if(totalDays <= 121){
					this.month = 4;
					this.day = (int)totalDays - 91;
				}else if(totalDays <= 152){
					this.month = 5;
					this.day = (int)totalDays - 121;
				}else if(totalDays <= 182){
					this.month = 6;
					this.day = (int)totalDays - 152;
				}else if(totalDays <= 213){
					this.month = 7;
					this.day = (int)totalDays - 182;
				}else if(totalDays <= 244){
					this.month = 8;
					this.day = (int)totalDays - 213;
				}else if(totalDays <= 274){
					this.month = 9;
					this.day = (int)totalDays - 244;
				}else if(totalDays <= 305){
					this.month = 10;
					this.day = (int)totalDays - 274;
				}else if(totalDays <= 335){
					this.month = 11;
					this.day = (int)totalDays - 305;
				}else{
					this.month = 12;
					this.day = (int)totalDays - 335;
				}
			}else{
				if(totalDays <= 31){
					this.month = 1;
					this.day = (int)totalDays;
				}else if(totalDays <= 59){
					this.month = 2;
					this.day = (int)totalDays - 31;
				}else if(totalDays <= 90){
					this.month = 3;
					this.day = (int)totalDays - 59;
				}else if(totalDays <= 120){
					this.month = 4;
					this.day = (int)totalDays - 90;
				}else if(totalDays <= 151){
					this.month = 5;
					this.day = (int)totalDays - 120;
				}else if(totalDays <= 181){
					this.month = 6;
					this.day = (int)totalDays - 151;
				}else if(totalDays <= 212){
					this.month = 7;
					this.day = (int)totalDays - 181;
				}else if(totalDays <= 243){
					this.month = 8;
					this.day = (int)totalDays - 212;
				}else if(totalDays <= 273){
					this.month = 9;
					this.day = (int)totalDays - 243;
				}else if(totalDays <= 304){
					this.month = 10;
					this.day = (int)totalDays - 273;
				}else if(totalDays <= 334){
					this.month = 11;
					this.day = (int)totalDays - 304;
				}else{
					this.month = 12;
					this.day = (int)totalDays - 334;
				}
			}
		}
	}
	
	public MyDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear(){
		return year;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getDay(){
		return day;
	}
	
	public void setDate(long elapsedTime){
		long totalDays = elapsedTime / (1000 * 24 * 60 * 60) + 1;
		int year = 1970;
		while(totalDays > 366){
			if(MyDate.isYear(year)){
				totalDays -= 366;
			}else{
				totalDays -= 365;
			}
			year++;
		}
		if(MyDate.isYear(year) && totalDays == 366){
			this.year = year;
			this.month = 12;
			this.day = 31;
		}else if(!MyDate.isYear(year) && totalDays == 366){
			this.year = year + 1;
			this.month = 1;
			this.day = 1;
		}else{
			this.year = year;
			if(MyDate.isYear(year)){
				if(totalDays <= 31){
					this.month = 1;
					this.day = (int)totalDays;
				}else if(totalDays <= 60){
					this.month = 2;
					this.day = (int)totalDays - 31;
				}else if(totalDays <= 91){
					this.month = 3;
					this.day = (int)totalDays - 60;
				}else if(totalDays <= 121){
					this.month = 4;
					this.day = (int)totalDays - 91;
				}else if(totalDays <= 152){
					this.month = 5;
					this.day = (int)totalDays - 121;
				}else if(totalDays <= 182){
					this.month = 6;
					this.day = (int)totalDays - 152;
				}else if(totalDays <= 213){
					this.month = 7;
					this.day = (int)totalDays - 182;
				}else if(totalDays <= 244){
					this.month = 8;
					this.day = (int)totalDays - 213;
				}else if(totalDays <= 274){
					this.month = 9;
					this.day = (int)totalDays - 244;
				}else if(totalDays <= 305){
					this.month = 10;
					this.day = (int)totalDays - 274;
				}else if(totalDays <= 335){
					this.month = 11;
					this.day = (int)totalDays - 305;
				}else{
					this.month = 12;
					this.day = (int)totalDays - 335;
				}
			}else{
				if(totalDays <= 31){
					this.month = 1;
					this.day = (int)totalDays;
				}else if(totalDays <= 59){
					this.month = 2;
					this.day = (int)totalDays - 31;
				}else if(totalDays <= 90){
					this.month = 3;
					this.day = (int)totalDays - 59;
				}else if(totalDays <= 120){
					this.month = 4;
					this.day = (int)totalDays - 90;
				}else if(totalDays <= 151){
					this.month = 5;
					this.day = (int)totalDays - 120;
				}else if(totalDays <= 181){
					this.month = 6;
					this.day = (int)totalDays - 151;
				}else if(totalDays <= 212){
					this.month = 7;
					this.day = (int)totalDays - 181;
				}else if(totalDays <= 243){
					this.month = 8;
					this.day = (int)totalDays - 212;
				}else if(totalDays <= 273){
					this.month = 9;
					this.day = (int)totalDays - 243;
				}else if(totalDays <= 304){
					this.month = 10;
					this.day = (int)totalDays - 273;
				}else if(totalDays <= 334){
					this.month = 11;
					this.day = (int)totalDays - 304;
				}else{
					this.month = 12;
					this.day = (int)totalDays - 334;
				}
			}
		}
	}
	
	public static boolean isYear(int year){
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			return true;
		}else{
			return false;
		}
	}
}
