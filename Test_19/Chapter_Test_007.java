/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_19;

/**
 * @author LiuYu
 *
 */
import java.io.*;

public class Chapter_Test_007 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		File file = new File("test.dat");
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
		Loan_007 l1 = new Loan_007();
		Loan_007 l2 = new Loan_007();
		Loan_007 l3 = new Loan_007();
		Loan_007 l4 = new Loan_007();
		Loan_007 l5 = new Loan_007();
		
		output.writeObject(l1);
		output.writeObject(l2);
		output.writeObject(l3);
		output.writeObject(l4);
		output.writeObject(l5);
		
		output.close();
		try{
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
			while(true){
				Loan_007 t = (Loan_007)(input.readObject());
				System.out.println("Loan is " + t.getTotalPayment());
			}
		}catch(EOFException ex){
			System.out.println("All data have printed");
		}
	}

}

class Loan_007 implements Serializable {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	public Loan_007(){
		this(2.5, 1, 1000);
	}
	
	public Loan_007(double annualInterestRate, int numberOfYears, double loanAmount){
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
