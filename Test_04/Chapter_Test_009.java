/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

import java.util.Scanner;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_009 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int number = input.nextInt();
		int count = 1;
		String nameHigh = "";
		double scoerHigh = 0;
		String nameSecond = "";
		double scoerSecond = 0;
		while(count <= number){
			System.out.println("Enter the name of student: ");
			String name = input.next();
			System.out.println("Enter the scoer: ");
			double scoer = input.nextDouble();
			
			if(scoer > scoerHigh){
				nameSecond = nameHigh;
				scoerSecond = scoerHigh;
				
				nameHigh = name;
				scoerHigh = scoer;
			}else if(scoer > scoerSecond){
				nameSecond = name;
				scoerSecond = scoer;
			}
			
			count++;
		}
		
		System.out.println("The highest scoer is " + scoerHigh + ". and the name is " + nameHigh);
		System.out.println("The higher scoer is " + scoerSecond + ". and the name is " + nameSecond);
		
	}

}
