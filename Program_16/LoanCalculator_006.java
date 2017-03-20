/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_16;

/**
 * @author up
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class LoanCalculator_006 extends JFrame{
	private JTextField jtfAnnualInterestRate = new JTextField();
	private JTextField jtfNumberOfYears = new JTextField();
	private JTextField jtfLoanAmount = new JTextField();
	private JTextField jtfMonthlyPayment = new JTextField();
	private JTextField jtfTotalPayment = new JTextField();
	
	private JButton jbtComputeLoan = new JButton("Compute Payment");
	
	public LoanCalculator_006(){
		JPanel panel = new JPanel(new GridLayout(5, 2));
		panel.add(new JLabel("Annual Interest Rate"));
		panel.add(jtfAnnualInterestRate);
		panel.add(new JLabel("Number of Years"));
		panel.add(jtfNumberOfYears);
		panel.add(new JLabel("Loan Amount"));
		panel.add(jtfLoanAmount);
		panel.add(new JLabel("Monthly Payment"));
		panel.add(jtfMonthlyPayment);
		panel.add(new JLabel("Total Payment"));
		panel.add(jtfTotalPayment);
		panel.setBorder(new TitledBorder("Enter loan amount, interest rate, and year"));
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(jbtComputeLoan);
		
		add(panel, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		jbtComputeLoan.addActionListener(new ButtonListener());
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double interest = Double.parseDouble(jtfAnnualInterestRate.getText());
			int year = Integer.parseInt(jtfNumberOfYears.getText());
			double loanAmount = Double.parseDouble(jtfLoanAmount.getText());
			
			Loan loan = new Loan(interest, year, loanAmount);
			
			jtfMonthlyPayment.setText(String.format("%.2f", loan.getMonthlyPayment()));
			jtfTotalPayment.setText(String.format("%.2f", loan.getTotalPayment()));
		}
	}
	
	public static void main(String[] args){
		LoanCalculator_006 frame = new LoanCalculator_006();
		frame.setTitle("LoanCalculator_006");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
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
