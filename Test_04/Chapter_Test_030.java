/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_030 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount and rate and number of months: ");
		double amount = input.nextDouble();
		double rate = input.nextDouble();
		double numberOfMonth = input.nextDouble();
		
		double total = 0;
		for(int i = 1; i <= numberOfMonth; i++){
			total = (total + amount) * (1.0 + rate / 1200);
		}
		System.out.println("The total ampunt is " + total);
	}

}
