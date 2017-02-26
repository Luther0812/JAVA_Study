/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_07;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_011 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511: ");
		int number = input.nextInt();
		int[][] list = new int[3][3];
		int i1 = 2;
		int j1 = 2;
		while(number >= 2){
			int t = number % 2;
			list[i1][j1] = t;
			j1 = j1 -1;
			if(j1 == -1){
				j1 = 2;
				i1 = i1 - 1;
			}
			number = number / 2;
		}
		if(j1 == -1){
			j1 = 2;
			i1 = i1 - 1;
		}
		list[i1][j1] = 1;
		for(int i = 0; i < list.length; i++){
			for(int j = 0; j < list[0].length; j++){
				if(list[i][j] == 0){
					System.out.print("H ");
				}else{
					System.out.print("T ");
				}
			}
			System.out.println();
		}
	}

}
