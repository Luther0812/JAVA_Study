/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_046 {
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		String result = "";
		if(number > 0){
			int numberCount = 0;
			while(Math.abs(number) >= 2){
				int temp = number % 2;
				String t = String.valueOf(temp);
				result = t + result;
				number = number / 2;
				numberCount++;
			}
			result = String.valueOf(number) + result;
			for(int t = 1; t <= (15 - numberCount); t++){
				result = "0" + result;
			}
			System.out.println("The bits are " + result);
		}else{
			number = Math.abs(number);
			int numberCount = 0;
			while(Math.abs(number) >= 2){
				int temp = number % 2;
				String t = String.valueOf(temp);
				result = t + result;
				number = number / 2;
				numberCount++;
			}
			result = String.valueOf(number) + result;
			for(int t = 1; t <= (14 - numberCount); t++){
				result = "0" + result;
			}
			result = "1" + result;
			System.out.println("The bits are " + result);
		}
	}

}
