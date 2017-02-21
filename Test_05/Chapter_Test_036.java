/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_036 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of lines: ");
		int num = input.nextInt();
		System.out.println("Enter the length of each line: ");
		double side = input.nextDouble();
		
		double area = area(num, side);
		System.out.print("The area is " + area);
	}
	
	public static double area(int n, double side){
		double area = (n * side * side) / (4 * Math.tan((Math.PI / n)));
		return area;
	}

}
