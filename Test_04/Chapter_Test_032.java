/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_032 {
	public static void main(String[] args){
		int lottery1 = (int)(Math.random() * 10);
		int lottery2;
		if(lottery1 == 0){
			while(lottery1 == 0){
				lottery1 = (int)(Math.random() * 10);
			}
			
			do{
				lottery2 = (int)(Math.random() * 10);
			}while(lottery1 == lottery2);
		}else{
			do{
				lottery2 = (int)(Math.random() * 10);
			}while(lottery1 == lottery2);
		}
		
		int lottery = 10 * lottery1 + lottery2;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		System.out.println("The lottery number is " + lottery);
		
		if(guess == lottery){
			System.out.println("Exact match: you win $10000");
		}else if(guessDigit2 == lotteryDigit1
				&& guessDigit1 == lotteryDigit2){
			System.out.println("Match all digits: you win $3000");
		}else if(guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2 
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2){
			System.out.println("Match one digit: you win $1000");
		}else{
			System.out.println("Sorry,no match");
		}
	}

}
