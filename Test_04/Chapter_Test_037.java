/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_037 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		String result = "";
		if(number > 0){
			while(Math.abs(number) >= 2){
				int temp = number % 2;
				String t = String.valueOf(temp);
				result = t + result;
				number = number / 2;
			}
			result = String.valueOf(number) + result;
		}else{
			while(Math.abs(number) >= 2){
				int temp = number % 2;
				String t = String.valueOf(temp);
				result = t + result;
				number = number / 2;
			}
			result = String.valueOf(number) + result;
			result = "-" + result;
		}
		System.out.print("The result is " + result);
	}

}
