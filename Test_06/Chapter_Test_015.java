/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_015 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextInt();
		}
		int[] result = eliminateDuplicates(numbers);
		for(int u: result){
			if(u != 0){
				System.out.print(u + " ");
			}
		}
	}
	
	public static int[] eliminateDuplicates(int[] numbers){
		for(int i = 0; i < numbers.length; i++){
			for(int j = 1 + i; j < numbers.length; j++){
				int count = 0;
				if(numbers[j] == numbers[i]){
					count++;
					for(int t = j + 1; t < numbers.length; t++){
						numbers[t - 1] = numbers[t];
					}
					numbers[numbers.length - count] = 0;
				}
			}
		}
		return numbers;
	}

}
