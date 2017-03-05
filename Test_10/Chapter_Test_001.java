/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_10;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_001 {
	public static void main(String[] args){
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		System.out.println("The first time is " + t1.getHour() + " hours " + t1.getMinute() + " minutes " + t1.getSecond() + " seconds");
		System.out.println("The second time is " + t2.getHour() + " hours " + t2.getMinute() + " minutes " + t2.getSecond() + " seconds");
	}

}

class Time{
	private long hour;
	private long minute;
	private long second;
	
	public Time(){
		long totalMillseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMillseconds / 1000;
		
		this.second = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		this.minute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		this.hour = totalHours % 24;
	}
	
	public Time(long totalMillseconds){		
		long totalSeconds = totalMillseconds / 1000;
		
		this.second = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		this.minute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		this.hour = totalHours % 24;
	}
	
	public Time(long hour, long minute, long second){
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	
	public long getSecond(){
		return second;
	}
	
	public long getMinute(){
		return minute;
	}
	
	public long getHour(){
		return hour;
	}
	
	public void setTime(long elapseTime){
		long totalSeconds = elapseTime / 1000;
		
		this.second = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		this.minute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		this.hour = totalHours % 24;
	}
}
