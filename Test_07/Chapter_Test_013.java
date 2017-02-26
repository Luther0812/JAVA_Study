/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_07;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_013 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		double[][] list = new double[rows][columns];
		System.out.print("Enter the array: ");
		for(int i = 0; i < list.length; i++){
			for(int j = 0; j < list[i].length; j++){
				list[i][j] = input.nextDouble();
			}
		}
		
		int x = 0;
		int y = 0;
		double minNumber = list[x][y];
		for(int i = 0; i < list.length; i++){
			for(int j = 0; j < list[i].length; j++){
				if(list[i][j] > minNumber){
					x = i;
					y = j;
					minNumber = list[i][j];
				}
			}
		}
		System.out.println("The location of the largest element is at (" + x + ", " + y + ")");
	}

}
