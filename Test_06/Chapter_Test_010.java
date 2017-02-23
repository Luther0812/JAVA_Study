/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

import java.util.Scanner;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_010 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		double[] numbers = new double[10];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextDouble();
		}
		double minNumber = numbers[0];
		int minIndex = 0;
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] < minNumber){
				minNumber = numbers[i];
				minIndex = i;
			}
		}
		
		System.out.print("The min number is " + minIndex);
	}

}
