/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_03;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_017 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");
		
		int number = input.nextInt();
		
		String computerGuess = "";
		String guess = "";
		int computerNumber = (int)(Math.random() * 3);
		switch (computerNumber){
		case 0:
			computerGuess = "scissor";
			break;
		case 1:
			computerGuess = "rock";
			break;
		case 2:
			computerGuess = "paper";
		};
		
		switch (number){
		case 0:
			guess = "scissor";
			break;
		case 1:
			guess = "rock";
			break;
		case 2:
			guess = "paper";
		};
		
		if(((number > computerNumber) && (number != 2 && computerNumber != 0) ) || (number == 0 && computerNumber == 2)){
			System.out.println("The computer is " + computerGuess + ". You are " + guess + ". you won");
		}else if(number == computerNumber){
			System.out.println("The computer is " + computerGuess + ". You are " + guess + " too. It is a draw");
		}else{
			System.out.println("The computer is " + computerGuess + ". You are " + guess + ". you lost");
		}
	}

}
