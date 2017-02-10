/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_03;

/**
 * @author up
 *
 */
import javax.swing.JOptionPane;

public class Chapter_Test_018 {
	public static void main(String[] args){
		String yearString = JOptionPane.showInputDialog("Enter a year: ");
		int year = Integer.parseInt(yearString);
		
		boolean isLeapYear = 
				(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		JOptionPane.showMessageDialog(null, year + " is a leap year? " + isLeapYear);
	}

}
