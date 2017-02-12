/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_017 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 15: ");
		int number = input.nextInt();
		for (int i = 1; i <= number; i++){
			for(int j = 1; j <= (number - i); j++){
				System.out.print("  ");
			}
			System.out.print(i + " ");
			if(i == 1){
				System.out.print("\n");
			}else{
				int t = i;
				for(; t > 1; t--){
					System.out.print((t - 1) + " ");
				}
				for(int q = 2; q <= i; q++){
					System.out.print(q + " ");
				}
				System.out.print("\n");
			}
		}
	}

}
