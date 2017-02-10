/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_03;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_027 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		if((x <= 200) && (x >= 0) && (y <= (100 - 0.5 * x))){
			System.out.println("The point is in the triangle");
		}else{
			System.out.println("The point is not in the triangle");
		}
	}

}
