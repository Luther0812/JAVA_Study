/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_03;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_019 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three edges: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if((a + b > c) && (a + c > b) && (b + c > a)){
			System.out.println("Can edges " + a + ", " + b + ", and " + c + " form a triangle? true");
		}else{
			System.out.println("Can edges " + a + ", " + b + ", and " + c + " form a triangle? false");
		}
	}

}
