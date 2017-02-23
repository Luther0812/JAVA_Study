/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_028 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextInt();
		}
		
		printCollection(numbers);
	}
	
	public static void printCollection(int[] numbers){
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers.length; j++){
				System.out.println(numbers[i] + " " + numbers[j]);
			}
		}
	}

}
