/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_02;

/**
 *
 *
 */
import java.util.Scanner;

public class Chapter_Test_017 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit: ");
		double temperature = input.nextDouble();
		System.out.print("Enter the wind speed miles per hour: ");
		int speed = input.nextInt();
		
		double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 
				0.4275 * temperature * Math.pow(speed, 0.16);
		
		System.out.println("The wind chill index is " + windChill);
	}

}
