/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_19;

/**
 * @author LiuYu
 *
 */
import java.io.*;

public class Chapter_Test_006 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		File file = new File("test.dat");
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
		Loan l1 = new Loan();
		Loan l2 = new Loan();
		Loan l3 = new Loan();
		Loan l4 = new Loan();
		Loan l5 = new Loan();
		
		output.writeObject(l1);
		output.writeObject(l2);
		output.writeObject(l3);
		output.writeObject(l4);
		output.writeObject(l5);
		
		output.close();
		
		ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
		for(int i = 0; i < 5; i++){
			Loan t = (Loan)(input.readObject());
			System.out.println(t.toString());
		}
		input.close();
	}

}

class Loan implements Serializable {
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
