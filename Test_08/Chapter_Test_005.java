/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_08;

import java.util.GregorianCalendar;

/**
 * @author up
 *
 */
public class Chapter_Test_005 {
	public static void main(String[] args){
		java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();
		System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR));
		System.out.println("Month is " + calendar.get(GregorianCalendar.MONTH));
		System.out.println("Day is " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
		
		calendar.setTimeInMillis(1234567898765L);
		System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR));
		System.out.println("Month is " + calendar.get(GregorianCalendar.MONTH));
		System.out.println("Day is " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
	}

}
