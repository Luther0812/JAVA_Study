/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_012 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextInt();
		}
		int[] numbersReverse = reverse(numbers);
		for(int u: numbersReverse){
			System.out.print(u + " ");
		}
	}
	
	public static int[] reverse(int[] numbers){
		int length = numbers.length;
		int[] numbersReverse = new int[length];
		for(int i = 0; i < length; i++){
			numbersReverse[length - (i + 1)] = numbers[i];
		}
		return numbersReverse;
	}

}
