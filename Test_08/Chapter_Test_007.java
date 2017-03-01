/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_08;

/**
 * @author up
 *
 */
public class Chapter_Test_007 {
	public static void main(String[] args){
		Account a = new Account(1122, 20000);
		a.setAuualInterestRate(4.5);
		a.withDraw(2500);
		a.deposit(3000);
		System.out.println("The balance is " + a.getBalance());
		System.out.println("The interest is " + a.getBalance() * a.getMonthlyInterestRate() / 100);
		System.out.println("The Date is " + a.getDateCreated());
	}

}

class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreatd;
	
	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreatd = new java.util.Date();
	}
	
	Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
		annualInterestRate = 0;
		dateCreatd = new java.util.Date();
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int newId){
		id = newId;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public void setAuualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	
	public java.util.Date getDateCreated(){
		return dateCreatd;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	
	public void withDraw(double amount){
		balance = balance - amount;
	}
	
	public void deposit(double amount){
		balance = balance + amount;
	}
}
