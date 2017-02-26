/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_07;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_019 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the rows");
		int row = input.nextInt();
		System.out.print("Enter the columns");
		int column = input.nextInt();
		int[][] list = new int[row][column];
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				list[i][j] = input.nextInt();
			}
		}
		
		if(isConsecutiveFour(list)){
			System.out.println("The list has the four common numbers");
		}else{
			System.out.println("The list does not have the four common numbers");
		}
	}
	
	public static boolean isConsecutiveFour(int[][] list){
		for(int i = 0; i <= list.length - 4; i++){
			for(int j = 0; j < list[i].length; j++){
				int a = list[i][j];
				int b = list[i + 1][j];
				int c = list[i + 2][j];
				int d = list[i + 3][j];
				if(a == b && b == c & c == d){
					return true;
				}
			}
		}
		
		for(int i = 0; i < list.length; i++){
			for(int j = 0; j <= list[i].length - 4; j++){
				int a = list[i][j];
				int b = list[i][j + 1];
				int c = list[i][j + 2];
				int d = list[i][j + 3];
				if(a == b && b == c & c == d){
					return true;
				}
			}
		}
		
		for(int i = 0; i <= list.length - 4; i++){
			for(int j = 0; j <= list[i].length - 4; j++){
				int a = list[i][j];
				int b = list[i + 1][j + 1];
				int c = list[i + 2][j + 2];
				int d = list[i + 3][j + 3];
				if(a == b && b == c & c == d){
					return true;
				}
			}
		}
		return false;
	}

}
