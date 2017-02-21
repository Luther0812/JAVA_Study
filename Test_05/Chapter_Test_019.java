/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_019 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean test = true;
		while(test){
			System.out.println("The first line is: ");
			double num1 = input.nextDouble();
			System.out.println("The second line is: ");
			double num2 = input.nextDouble();
			System.out.println("The third line is: ");
			double num3 = input.nextDouble();
			if(isValid(num1, num2, num3)){
				test = false;
				double answer = area(num1, num2, num3);
				System.out.println("The area of the triangle is: " + answer);
				break;
			}else{
				System.out.println("The input is not valid!");
			}
		}
		
	}
	
	public static boolean isValid(double n1, double n2, double n3){
		if((n1 + n2) > n3 && (n1 + n3) > n2 && (n2 + n3) > n1){
			return true;
		}else{
			return false;
		}
	}
	
	public static double area(double n1, double n2, double n3){
		double s = (n1 + n2 + n3) / 2;
		double temp = s * (s - n1) * (s - n2) * (s - n3);
		double area = Math.pow(temp, 0.5);
		return area;
	}

}
