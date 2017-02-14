/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_043 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of seconds: ");
		int seconds = input.nextInt();
		
		for(; seconds >= 1; seconds--){
			if(seconds != 1){
				System.out.println(seconds + " seconds remaining");
			}else{
				System.out.println(seconds + " second remaining");
			}
		}
		System.out.println("Stopped");
	}

}
