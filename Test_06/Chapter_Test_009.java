/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_009 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		double[] numbers = new double[10];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextDouble();
		}
		double minNumber = numbers[0];
		for(double u: numbers){
			if(u < minNumber){
				minNumber = u;
			}
		}
		
		System.out.print("The min number is " + minNumber);
	}

}
