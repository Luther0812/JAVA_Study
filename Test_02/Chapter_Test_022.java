/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_02;

/**
 *
 *
 */
import java.util.Scanner;

public class Chapter_Test_022 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		double area = (3 * Math.pow(3, 0.5)) / 2 * Math.pow(side, 2);
		
		System.out.println("The area of the hexagon is " + area);
	}

}
