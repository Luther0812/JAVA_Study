/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_03;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_002 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		if(num % 2 == 0){
			System.out.print("Is " + num + " an even number? true");
		}else{
			System.out.print("Is " + num + " an even number? false");
		}
	}

}
