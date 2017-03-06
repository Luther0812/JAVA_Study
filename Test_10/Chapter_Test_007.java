/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_10;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_007 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Account[] list = new Account[10];
		for(int i = 0; i < list.length; i++){
			list[i] = new Account(i, 100);
		}
		
		while(true){
			System.out.print("Enter an id: ");
			int id = input.nextInt();
			if(id < 0 || id > 9){
				System.out.println("Please enter an right id");
				continue;
			}else{
				int temp = mainATM(list[id]);
				if(temp == 4){
					continue;
				}
			}
			
		}
	}
	
	public static int mainATM(Account list){
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Main menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		System.out.print("Enter a choice: ");
		int choice = input.nextInt();
		switch (choice){
		case 1:
			case1Method(list);
			mainATM(list);
			return 1;
		case 2:
			case2Method(list);
			mainATM(list);
			return 2;
		case 3:
			case3Method(list);
			mainATM(list);
			return 3;
		case 4:
			return 4;
		default:
			return 4;
		}
	}
	
	public static void case1Method(Account a){
		System.out.println(a.getBalance());
	}
	
	public static void case2Method(Account a){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an amount to withdraw: ");
		double amount = in.nextDouble();
		a.withDraw(amount);
	}

	public static void case3Method(Account a){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an amount to deposit: ");
		double amount = in.nextDouble();
		a.deposit(amount);
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
