/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_07;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_020 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count = 0;
		char[][] grid = {
							{'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
							{'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
							{'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
							{'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
							{'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
							{'|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
							{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}
					};
		printGame(grid);
		int[][] list = new int[6][7];
		while(true){
			if(count % 2 == 0){
				System.out.print("Drop a red disk at column (0-6): ");
				int t = input.nextInt();
				int x = -1;
				for(int i = list.length - 1; i >= 0; i--){
					if(list[i][t] == 0){
						list[i][t] = 1;
						x = i;
						break;
					}
				}
				printGame(grid, x, t, 'R');
				if(isEnd(list)){
					System.out.println("The Red player won");
					break;
				}
				count++;
			}else{
				System.out.print("Drop a yellow disk at column (0-6): ");
				int t = input.nextInt();
				int x = -1;
				for(int i = list.length - 1; i >= 0; i--){
					if(list[i][t] == 0){
						list[i][t] = 2;
						x = i;
						break;
					}
				}
				printGame(grid, x, t, 'Y');
				if(isEnd(list)){
					System.out.println("The Yellow player won");
					break;
				}
				count++;
			}
		}
	}
	
	public static void printGame(char[][] grid){
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void printGame(char[][] grid, int a, int b, char c){
		for(int i = 0; i < grid.length - 1; i++){
			if(i != a){
				for(int j = 0; j < grid[i].length; j++){
					System.out.print(grid[i][j]);
				}
				System.out.println();
			}else{
				for(int j = 0; j < grid[i].length; j++){
					if(j % 2 == 0){
						System.out.print(grid[i][j]);
//						System.out.print("|");
					}else{
						if(j == 2 * b + 1){
							grid[i][j] = c;
							System.out.print(c);
						}else{
							System.out.print(grid[i][j]);
//							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("---------------");
	}
	
	public static boolean isEnd(int[][] list){
		for(int i = 0; i <= list.length - 4; i++){
			for(int j = 0; j < list[i].length; j++){
				int a = list[i][j];
				int b = list[i + 1][j];
				int c = list[i + 2][j];
				int d = list[i + 3][j];
				if(a == b && b == c & c == d && (a == 1 || a == 2)){
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
				if(a == b && b == c & c == d && (a == 1 || a == 2)){
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
				if(a == b && b == c & c == d && (a == 1 || a == 2)){
					return true;
				}
			}
		}
		return false;
	}

}
