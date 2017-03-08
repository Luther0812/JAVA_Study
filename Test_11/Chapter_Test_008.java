/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_11;

/**
 * @author up
 *
 */
public class Chapter_Test_008 {
	public static void main(String[] args){
		NewAccount a = new NewAccount(1122, 1.5, "George", 1000);
		a.deposit(30);
		a.deposit(40);
		a.deposit(50);
		a.withDraw(5);
		a.withDraw(4);
		a.withDraw(2);
		
		for(int i = 0; i < a.getTransaction().size() - 1; i++){
			Transaction t = (Transaction)a.getTransaction().get(i);
			System.out.println("The owner is " + t.getType());
			System.out.println("The owner is " + t.getAmount());
			System.out.println("The owner is " + t.getBalance());
			System.out.println("The owner is " + t.getDescription());
			System.out.println();
		}
	}

}

class NewAccount{
	private int id;
	private String name;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreatd;
	private java.util.ArrayList transactions = new java.util.ArrayList();;
	
	NewAccount(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreatd = new java.util.Date();
	}
	
	NewAccount(int newId, double rate, String name, double newBalance){
		id = newId;
		this.name = name;
		balance = newBalance;
		annualInterestRate = rate;
		annualInterestRate = 0;
		dateCreatd = new java.util.Date();
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int newId){
		id = newId;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
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
	
	public java.util.ArrayList getTransaction(){
		return transactions;
	}
	
	public void setTransaction(Object t){
		this.transactions.add(t);
	}
	
	public void withDraw(double amount){
		balance = balance - amount;
		Transaction t = new Transaction('W', amount, balance, "The transcation happened");
		transactions.add(t);
	}
	
	public void deposit(double amount){
		balance = balance + amount;
		Transaction t = new Transaction('D', amount, balance, "The transcation happened");
		transactions.add(t);
	}
}

class Transaction extends java.util.ArrayList{
	private java.util.Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public Transaction(){
		date = new java.util.Date();
	}
	
	public Transaction(char type, double amount, double balance, String description){
		date = new java.util.Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	
	public java.util.Date getDate(){
		return date;
	}
	
	public char getType(){
		return type;
	}
	
	public void setType(char type){
		this.type = type;
	}
	
	public double getAmount(){
		return amount;
	}
	
	public void setAmount(double amount){
		this.amount = amount;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
}

