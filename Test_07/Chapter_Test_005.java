/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_07;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_005 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter matrix1: ");
		double[][] matrix1 = new double[3][3];
		for(int i = 0; i < matrix1.length; i++){
			for(int j = 0; j < matrix1[i].length; j++){
				matrix1[i][j] = input.nextDouble();
			}
		}
		System.out.print("Enter matrix2: ");
		double[][] matrix2 = new double[3][3];
		for(int i = 0; i < matrix2.length; i++){
			for(int j = 0; j < matrix2[i].length; j++){
				matrix2[i][j] = input.nextDouble();
			}
		}
		
		double result[][] = addMatrix(matrix1, matrix2);
		for(int i = 0; i < matrix2.length; i++){
			if(i != 1){
				for(int j = 0; j < matrix2[i].length; j++){
					System.out.print(matrix1[i][j] + " ");
				}
				System.out.print("   ");
				for(int j = 0; j < matrix2[i].length; j++){
					System.out.print(matrix2[i][j] + " ");
				}
				System.out.print("   ");
				for(int j = 0; j < matrix2[i].length; j++){
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}else{
				for(int j = 0; j < matrix2[i].length; j++){
					System.out.print(matrix1[i][j] + " ");
				}
				System.out.print(" + ");
				for(int j = 0; j < matrix2[i].length; j++){
					System.out.print(matrix2[i][j] + " ");
				}
				System.out.print(" = ");
				for(int j = 0; j < matrix2[i].length; j++){
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] result = new double[3][3];
		for(int i = 0; i < result.length; i++){
			for(int j = 0; j < result[i].length; j++){
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;
	}

}
