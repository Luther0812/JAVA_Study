/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_03;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_028 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double r1X = input.nextDouble();
		double r1Y = input.nextDouble();
		
		double r1Width = input.nextDouble();
		double r1Height = input.nextDouble();
		
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double r2X = input.nextDouble();
		double r2Y = input.nextDouble();
		
		double r2Width = input.nextDouble();
		double r2Height = input.nextDouble();
		
		double xLength = Math.abs(r1X - r2X);
		double yLength = Math.abs(r1Y - r2Y);
		
		if((xLength <= (r1Width - r2Width) / 2.0) && (yLength <= (r1Height - r2Height) / 2.0)){
			System.out.print("r2 is inside r1");
		}else if((xLength <= (r1Width - r2Width) / 2.0) || (yLength <= (r1Height - r2Height) / 2.0)){
			System.out.print("r2 overlaps r1");
		}else{
			System.out.print("r2 dose not overlaps r1");
		}
		
	}

}
