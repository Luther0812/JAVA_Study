/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_03;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_023 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		if((Math.abs(x) <= 5.0) && (Math.abs(y) <= 2.5)){
			System.out.print("Point (" + x + ", " + y + ") is in the rectangle");
		}else{
			System.out.print("Point (" + x + ", " + y + ") is not in the rectangle");
		}
	}

}
