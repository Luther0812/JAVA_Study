/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_02.Chapter_Test_012;

/**
 *
 *
 */
import javax.swing.JOptionPane;

public class Chapter_Test_012_01 {
	public static void main(String[] args){
		String balanceString = JOptionPane.showInputDialog("Enter the balance: ");
		String rateString = JOptionPane.showInputDialog("Enter the rate: ");
		
		int balance = Integer.parseInt(balanceString);
		double rate = Double.parseDouble(rateString);
		
		double interest = balance * (rate / 1200);
		
		String output = "The interest is " + interest;
		
		JOptionPane.showMessageDialog(null, output);
	}

}
