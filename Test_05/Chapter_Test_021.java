/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_021 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		double n4 = input.nextDouble();
		double n5 = input.nextDouble();
		double n6 = input.nextDouble();
		double n7 = input.nextDouble();
		double n8 = input.nextDouble();
		double n9 = input.nextDouble();
		double n10 = input.nextDouble();
		double means = means(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10);
		double deviation = deviation(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10);
		System.out.println("The mean is " + means);
		System.out.println("The standard deviation is " + deviation);
	}
	
	public static double means(double n1, double n2, double n3, double n4, double n5, double n6, double n7, double n8, double n9, double n10){
		double means = n1 + n2 +n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
		means = means / 10;
		return means;
	}
	
	public static double deviation(double n1, double n2, double n3, double n4, double n5, double n6, double n7, double n8, double n9, double n10){
		double means = means(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10);
		double sum1 = n1 + n2 +n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
		double sum2 = Math.pow(n1, 2) + Math.pow(n2, 2) + Math.pow(n3, 2) + Math.pow(n4, 2) +
				Math.pow(n5, 2) + Math.pow(n6, 2) + Math.pow(n7, 2) + Math.pow(n8, 2) + Math.pow(n9, 2) + Math.pow(n10, 2);
		
		double deviation = Math.pow(((sum2 - (Math.pow(sum1, 2) / 10)) / 9), 0.5);
		return deviation;
	}

}
