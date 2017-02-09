/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_03;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;
public class Chapter_Test_006 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.print("Enter height in foots: ");
		double height_foots = input.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double height_inches = input.nextDouble();
		
		double height = height_foots * 12 + height_inches;
		
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		
		double bmi = weightInKilograms / (Math.pow(heightInMeters, 2));
		
		System.out.println("Your BMI is " + bmi);
		if(bmi < 16){
			System.out.println("Your are seriously underweight");
		}else if(bmi < 18){
			System.out.println("Your are underweight");
		}else if(bmi < 24){
			System.out.println("Your are normal weight");
		}else if(bmi < 29){
			System.out.println("Your are over weight");
		}else if(bmi < 35){
			System.out.println("Your are seriously overweight");
		}else{
			System.out.println("Your are gravely overweight");
		}
	}

}
