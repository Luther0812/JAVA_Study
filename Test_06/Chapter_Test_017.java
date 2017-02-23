/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_017 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		double[] numbers = new double[10];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextDouble();
		}
		
		for(int i = numbers.length - 1; i >= 0; i--){
			double currentMax = numbers[i];
			int currentMaxIndex = i;
			
			for(int j = i - 1; j >= 0; j--){
				if(currentMax < numbers[j]){
					currentMax = numbers[j];
					currentMaxIndex = j;
				}
			}
			
			if(currentMaxIndex != i){
				numbers[currentMaxIndex] = numbers[i];
				numbers[i] = currentMax;
			}
		}
		
		for(double u: numbers){
			System.out.print(u + " ");
		}
	}

}
