/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_02.Chapter_Test_011;

/**
 *
 *
 */
import javax.swing.JOptionPane;

public class Chapter_Test_011_01 {
	public static void main(String[] args){
		String name = JOptionPane.showInputDialog("Enter employee's name: ");
		String hoursString = JOptionPane.showInputDialog("Enter number of hours worked in a week: ");
		String rateString = JOptionPane.showInputDialog("Enter hourly pay rate: ");
		String taxFederalString = JOptionPane.showInputDialog("Enter federal tax withholding rate: ");
		String taxStateString = JOptionPane.showInputDialog("Enter state tax withholding rate: ");
		double hours = Integer.parseInt(hoursString);
		double rate = Double.parseDouble(rateString);
		double taxFederal = Double.parseDouble(taxFederalString);
		double taxState = Double.parseDouble(taxStateString);
		
		double grossPay = hours * rate;
		double federalTax = grossPay * taxFederal;
		double stateTax = grossPay * taxState;
		double totalDeduction = federalTax + stateTax;
		double netpay = grossPay - totalDeduction;
		
		String output = "Employee Name: " + name + "\n" + 
		"Hours Worked: " + hours + "\n" + 
				"Pay Rate: $" + rate + "\n" + 
		"Gross Pay: $" + grossPay + "\n" + 
				"Deduction: " + "\n\t" + 
		"Federal Withholding (" + taxFederal * 100 + "%)" + "\n\t" + 
				"State Withholding (" + taxState * 100 + "%)" + "\n\t" + 
		"Total Deduction: $" + totalDeduction + "\n" + 
				"Net Pay: " + netpay;
		
		JOptionPane.showMessageDialog(null, output);
	}

}
