/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_016 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		int temp = 2;
		while(number != temp){
			if(number % temp == 0){
				System.out.print(temp + " ");
				number = number / temp;
			}else{
				temp++;
			}
		}
		System.out.print(temp + " ");
	}

}
