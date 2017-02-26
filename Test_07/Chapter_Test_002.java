/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_07;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_002 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		int[][] matrix = new int[4][4];
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				matrix[i][j] = input.nextInt();
			}
		}
		double answer = sumMajorMatrix(matrix);
		System.out.println("Sum of the matrix is: " + answer);
	}
	
	public static double sumMajorMatrix(int[][] matrix){
		double answer = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				if(i == j){
					answer = answer + matrix[i][j];
				}
			}
		}
		return answer;
	}

}
