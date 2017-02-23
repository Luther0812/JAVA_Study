/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_011 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		double[] numbers = new double[10];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextDouble();
		}
		double mean = mean(numbers);
		double deviation = deviation(numbers);
		System.out.println("The mean is " + mean);
		System.out.println("The standard deviation is " + deviation);
	}
	
	public static double mean(double[] numbers){
		double result = 0;
		int length = numbers.length;
		double total = 0;
		for(double u: numbers){
			total = total + u;
		}
		result = total / length;
		return result;
	}
	
	public static double deviation(double[] numbers){
		int length = numbers.length;
		double tempTotal = 0;
		for(double u: numbers){
			tempTotal = tempTotal + Math.pow((u - mean(numbers)), 2);
		}
		double result = Math.pow((tempTotal / (length - 1)), 0.5);
		
		return result;
	}

}
