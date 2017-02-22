/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_002 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int[] number = new int[10];
		for(int i = 0 ; i < number.length; i++){
			number[i] = input.nextInt();
		}
		for(int j = number.length - 1; j >= 0; j--){
			System.out.println(number[j]);
		}
	}

}
