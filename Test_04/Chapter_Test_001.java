/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_001 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an int value, the program exits if the input is 0: ");
		
		int temp = -1;
		int numberPositive = 0;
		int numberNegative = 0;
		int sum = 0;
		while(temp != 0){
			temp = input.nextInt();
			if(temp > 0){
				numberPositive++;
			}else if(temp < 0){
				numberNegative++;
			}
			
			sum = sum + temp;
		}
		
		int average = sum / (numberPositive + numberNegative);
		System.out.println("The number of positives is " + numberPositive);
		System.out.println("The number of negatives is " + numberNegative);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + average);
	}

}
