/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_035 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		double area = (5 * Math.pow(num, 2)) / (4 * Math.tan((Math.PI / 5)));
		System.out.println("The area is " + area);
	}

}
