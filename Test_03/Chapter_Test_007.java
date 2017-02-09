/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_03;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_007 {
	public static void main(String[] args){
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Receive the amount
		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
		//Find the number of one dollars
		int numberOfDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		//Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		//Find the number of dimes in the remaining amount
		int numberOfDiems = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		//Find the number of nickels in the remaing amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;
		
		//Find the number of pennies in the remaing amount
		int numberOfPennies = remainingAmount;
		
		//Display result
		if(numberOfDollars == 0){
			
		}else if(numberOfDollars > 1){
			System.out.println(numberOfDollars + "dollars");
		}else{
			System.out.println(numberOfDollars + "dollar");
		}
		
		if(numberOfQuarters == 0){
			
		}else if(numberOfQuarters > 1){
			System.out.println(numberOfQuarters + "quarters");
		}else{
			System.out.println(numberOfQuarters + "quarter");
		}
		
		if(numberOfDiems == 0){
			
		}else if(numberOfDiems > 1){
			System.out.println(numberOfDiems + "dimes");
		}else{
			System.out.println(numberOfDiems + "dime");
		}
		
		if(numberOfNickels == 0){
			
		}else if(numberOfNickels > 1){
			System.out.println(numberOfNickels + "nickels");
		}else{
			System.out.println(numberOfNickels + "nickel");
		}
		
		if(numberOfPennies == 0){
			
		}else if(numberOfPennies > 1){
			System.out.println(numberOfPennies + "pennies");
		}else{
			System.out.println(numberOfPennies + "penny");
		}
	}

}
