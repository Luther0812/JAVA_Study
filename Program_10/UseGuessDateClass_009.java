/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_10;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class UseGuessDateClass_009 {
	public static void main(String[] args){
		int date = 0;
		int answer;
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++){
			System.out.println("Is your birthday in Set" + (i + 1) + "?");
			for(int j = 0; j < 4; j++){
				for(int k = 0; k < 4; k++){
					System.out.print(GuessDate_010.getValue(i, j, k) + "  ");
				}
				System.out.println();
			}
			
			System.out.print("\nEnter 0 for No and 1 for Yes: ");
			answer = input.nextInt();
			if(answer == 1){
				date += GuessDate_010.getValue(1, 0, 0);
			}
		}
		System.out.println("Your birthday is " + date);
	}

}
