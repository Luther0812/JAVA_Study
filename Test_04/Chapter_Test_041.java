/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_041 {
	public static void main(String[] args){
		int maxNumber = 0;
		int count = 0;
		int number = 0;
		int numberNew;
		Scanner input = new Scanner(System.in);
		do{
			System.out.print("Enter numbers: ");
			numberNew = input.nextInt();
			if(numberNew > number){
				number = numberNew;
				count = 1;
			}else if(numberNew == number){
				count++;
			}
		}while(numberNew != 0);
		System.out.println("The lagest number is " + number);
		System.out.println("The occurrence count of the largest number is " + count);
	}

}
