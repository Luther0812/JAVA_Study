/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_012 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter start char: ");
		int startInt = input.nextInt();
		char start = (char)(startInt);
		System.out.print("Enter start char: ");
		int endInt = input.nextInt();
		char end = (char)(endInt);
		System.out.print("Enter the number of per line: ");
		int number = input.nextInt();
		
		printChars(start, end, number);
		
	}
	
	public static void printChars(char start, char end, int number){
		int count = 0;
		int num1 = (int)(start);
		int num2 = (int)(end);
		for(int i = num1; i <= num2; i++){
			System.out.print((char)(i) + " ");
			count++;
			if(count % number == 0){
				System.out.println();
			}
		}
	}

}
