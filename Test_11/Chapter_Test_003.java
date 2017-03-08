/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_11;

/**
 * @author up
 *
 */
public class Chapter_Test_003 {
	public static void main(String[] args){
		Account a1 = new SavingAccount(1, 100);
		Account a2 = new CheckingAccount(2, 100, 20);
		System.out.println(a1.toString());
		System.out.println(a2.toString());
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
	
	public String toString(){
		return "Account";
	}
}

class SavingAccount extends Account{
	public SavingAccount(){
		
	}
	
	public SavingAccount(int id, double balance){
		setId(id);
		setBalance(balance);
	}
	
	public void withDraw(double amount){
		if(amount > this.getBalance()){
			System.out.println("The SavingAccount can not overdraft");
		}else{
			setBalance(this.getBalance() - amount);
		}
	}
	
	public String toString(){
		return "SavingAccount";
	}
}

class CheckingAccount extends Account{
	private double overDraft;
	
	public CheckingAccount(){
		
	}
	
	public CheckingAccount(int id, double balance, double overDraft){
		setId(id);
		setBalance(balance);
		this.overDraft = overDraft;
	}
	
	public void withDraw(double amount){
		if(Math.abs(this.getBalance() - amount) > this.overDraft){
			setBalance(this.getBalance() - amount);
		}else{
			System.out.println("The SavingAccount can not overdraft");
		}
	}
	
	public String toString(){
		return "CheckingAccount";
	}
}
