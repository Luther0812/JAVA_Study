/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_34;

/**
 * @author up
 *
 */
import javax.swing.*;

public class JOptionPaneDemo_005 {
	public static void main(String[] args){
		Object[] rateList = new Object[25];
		int i = 0;
		for(double rate = 5; rate <= 8; rate += 1.0 / 8){
			rateList[i++] = new Double(rate);
		}
		
		Object annualInterestRateObject = JOptionPane.showInputDialog(null, "Select annual interest rate:", "JOptionPaneDemo", JOptionPane.QUESTION_MESSAGE, null, rateList, null);
		double annualInterestRate = ((Double)annualInterestRateObject).doubleValue();
		
		Object[] yearList = {new Integer(7), new Integer(15), new Integer(30)};
		
		Object numberOfYearsObject = JOptionPane.showInputDialog(null, "Select number of years:", "JOptionPane", JOptionPane.QUESTION_MESSAGE, null, yearList, null);
		int numberOfYears = ((Integer)numberOfYearsObject).intValue();
		
		String loanAmountString = JOptionPane.showInputDialog(null, "Enter loan amount.\nfor example, 150000 for $150000", "JOptionPaneDemo", JOptionPane.QUESTION_MESSAGE);
		double loanAmount = Double.parseDouble(loanAmountString);
		
		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
		double monthlyPayment = loan.getMonthlyPayment();
		double totalPayment = loan.getTotalPayment();
		
		String output = "Interest Rate: " + annualInterestRate + "% Number of Years: " + numberOfYears + " Loan Amount: $" + loanAmount;
		output += "\nMonthly Payment: " + "$" + (int)(monthlyPayment * 100) / 100.0;
		output += "\nTotal Payment: $ " + (int)(monthlyPayment * 12 * numberOfYears * 100) / 100.0 + "\n";
		
		double monthlyInterestRate = annualInterestRate / 1200;
		
		double balance = loanAmount;
		double interest;
		double principal;
		
		output += "\nPayment#\tInterest\tPrincipal\tBalance\n";
		
		for(i = 1; i <= numberOfYears; i++){
			interest = (int)(monthlyInterestRate * balance * 100) / 100.0;
			principal = (int)((monthlyPayment - interest) * 100) / 100.0;
			balance = (int)((balance - principal) * 100) / 100.0;
			output += i + "\t" + interest + "\t" + principal + "\t" + balance + "\n";
		}
		
		JScrollPane jsp = new JScrollPane(new JTextArea(output));
		jsp.setPreferredSize(new java.awt.Dimension(400, 200));
		JOptionPane.showMessageDialog(null, jsp, "JOptionPane", JOptionPane.INFORMATION_MESSAGE, null);
	}

}

class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	public Loan(){
		this(2.5, 1, 1000);
	}
	
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getNumberOfYears(){
		return numberOfYears;
	}
	
	public void setNumberOfYears(int numberOfYears){
		this.numberOfYears = numberOfYears;
	}
	
	public double getLoanAmount(){
		return loanAmount;
	}
	
	public void setLoanAmount(double loanAmount){
		this.loanAmount = loanAmount;
	}
	
	public double getMonthlyPayment(){
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
		return monthlyPayment;
	}
	
	public double getTotalPayment(){
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	public java.util.Date getLoanDate(){
		return loanDate;
	}

}
