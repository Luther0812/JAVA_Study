/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_13;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_002 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		do{
			System.out.print("Enter two integers: ");
			try{
				int number1 = input.nextInt();
				int number2 = input.nextInt();
				System.out.println("The sum is " + (number1 + number2));
				flag = false;
			}catch(Exception ex){
				System.out.println("\nInput again");
				input.nextLine();
			}
		}while(flag);
	}

}
