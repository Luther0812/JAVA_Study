/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_034 {
	public static void main(String[] args){
		int countPeople = 0;
		int countComputer = 0;
		
		while(Math.abs(countPeople - countComputer) <= 3){
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
				countPeople++;
			}else if(number == computerNumber){
				
			}else{
				countComputer++;
			}
		}
		
		if(countPeople > countComputer){
			System.out.println("People won three times!");
		}else{
			System.out.println("Computer won three times!");
		}
		
	}

}
