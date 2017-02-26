/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_07;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_017 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		double limit = input.nextDouble();
		double[][] borrowers = {
				{25, 100.5, 0, 0, 320.5},
				{0, 125, 40, 85, 0},
				{125, 0, 175, 75, 0},
				{125, 0, 0, 75, 0},
				{0, 0, 125, 0, 181}
		};
		
		for(int i = 0; i < borrowers.length; i++){
			System.out.print(borrowers[i][i] + " ");
			int count = 0;
			for(int k = 0; k < borrowers[i].length; k++){
				if(borrowers[i][k] != 0 && k != i){
					count++;
				}
			}
			System.out.print(count + " ");
			for(int j = 0; j < borrowers[i].length; j++){
				if(borrowers[i][j] != 0 && j != i){
					System.out.print(j + " " + borrowers[i][j]);
				}
			}
			System.out.println();
		}
		int[] list = new int[5];
		for(int i = 0; i < borrowers.length; i++){
			double num = 0;
			for(int j = 0; j < borrowers.length; j++){
				if(borrowers[i][j] != 0){
					num += borrowers[i][j];
				}
			}
			if(num < limit){
				list[i] = 1;
			}
		}
		for(int i = 0; i < borrowers.length; i++){
			double num = 0;
			for(int j = 0; j < borrowers[i].length; j++){
				num += borrowers[i][j];
			}
			for(int k = 0; k < list.length; k++){
				if(list[k] == 1){
					num = num - borrowers[i][k];
				}
			}
			if(num < limit){
				list[i] = 1;
			}
		}
		for(int k = 0; k < list.length; k++){
			if(list[k] == 1){
				System.out.println("Unsafe banks is: " + k);
			}
		}
	}

}
