/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_03;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_014 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 0 for front side and 1 for back side: ");
		int guess = input.nextInt();
		
		int side = (int)(Math.random() * 10) % 2;
		
		if(guess == side){
			System.out.println("Your guess is correct!");
		}else{
			System.out.println("Your guess is wrong!");
		}
	}

}
