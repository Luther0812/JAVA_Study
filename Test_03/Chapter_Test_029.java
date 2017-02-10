/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_03;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_029 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		
		double r1X = input.nextDouble();
		double r1Y = input.nextDouble();
		
		double r1 = input.nextDouble();
		
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		
		double r2X = input.nextDouble();
		double r2Y = input.nextDouble();
		
		double r2 = input.nextDouble();
		
		double length = Math.pow(Math.pow((r1X - r2X), 2) + Math.pow((r1Y - r2Y), 2), 0.5);
		
		if(length <= Math.abs(r1 - r2)){
			System.out.print("circle2 is inside circle1");
		}else if(length <= Math.abs(r1 + r2)){
			System.out.print("circle2 overlaps circle1");
		}else{
			System.out.print("circle2 dose not overlaps circle1");
		}
	}

}
