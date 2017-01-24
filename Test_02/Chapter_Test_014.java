/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_02;

/**
 *
 *
 */
import java.util.Scanner;

public class Chapter_Test_014 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double pounds = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double inches = input.nextDouble();
		
		double kilograms = 0.45359237 * pounds;
		double meters = 0.0254 * inches;
		
		double bmi = kilograms / (Math.pow(meters, 2));
		
		System.out.println("BMI is " + bmi);
	}

}
