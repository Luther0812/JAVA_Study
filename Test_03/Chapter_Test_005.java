/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_03;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_005 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		int num3 = (int)(Math.random() * 10);
		System.out.print(num1 + " + " + num2 + " + " +num3 +" is: ");
		
		int answer = input.nextInt();
		
		if(answer == num1 + num2 + num3){
			System.out.print("Answer is true");
		}else{
			System.out.print("Answer is false");
		}
		
	}

}
