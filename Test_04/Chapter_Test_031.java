/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_031 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the initial deposit amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter annual percentage yield: ");
		double yield = input.nextDouble();
		System.out.print("Enter maturity period (number of months): ");
		int number = input.nextInt();
		
		double total = amount;
		System.out.printf("%-12s%15s%-12s\n", "Month"," ","CD Value");
		for(int i = 1; i <= number; i++){
			total = total + amount * yield / 1200.0;
			System.out.printf("%-12d%15s%-12.2f\n", i," ",total);
		}
	}

}
