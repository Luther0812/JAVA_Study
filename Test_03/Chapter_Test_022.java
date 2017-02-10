/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_03;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_022 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		if(Math.pow(x, 2) + Math.pow(y, 2) <= 100){
			System.out.print("Point (" + x + ", " + y + " is in the circle");
		}else{
			System.out.print("Point (" + x + ", " + y + ") is not in the circle");
		}
	}

}
