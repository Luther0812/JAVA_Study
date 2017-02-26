/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_07;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_009 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count = 0;
		char[][] grid = {
							{'-','-','-','-','-','-','-','-','-','-','-','-','-'},
							{'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'},
							{'-','-','-','-','-','-','-','-','-','-','-','-','-'},
							{'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'},
							{'-','-','-','-','-','-','-','-','-','-','-','-','-'},
							{'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'},
							{'-','-','-','-','-','-','-','-','-','-','-','-','-'}
					};
		printGame(grid);
		int[][] place = new int[3][3];
		int c = 3;
		for(int i = 0; i < place.length; i++){
			for(int j = 0; j < place[i].length; j++){
				place[i][j] = c;
				c++;
			}
		}
		while(count < 9){
			if(count % 2 == 0){
				System.out.print("Enter a row (1,2, or 3) for player X: ");
				int X1 = input.nextInt();
				System.out.print("Enter a column (1,2, or 3) for player X: ");
				int X2 = input.nextInt();
				place[X1 - 1][X2 - 1] = 1;
				printGame(grid, X1, X2, 'X');
				if(isEnd(place)){
					System.out.println("X player won");
					break;
				}
			}else{
				System.out.print("Enter a row (1,2, or 3) for player O: ");
				int O1 = input.nextInt();
				System.out.print("Enter a column (1,2, or 3) for player O: ");
				int O2 = input.nextInt();
				place[O1 - 1][O2 - 1] = 2;
				printGame(grid, O1, O2, 'O');
				if(isEnd(place)){
					System.out.println("O player won");
					break;
				}
			}
			count++;
		}
		if(count == 9){
			System.out.println("The game has no winner");
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
		int temp = 0;
		switch(b){
		case 1:
			temp = 2;
			break;
		case 2:
			temp = 6;
			break;
		case 3:
			temp = 10;
			break;
		}
		if(c == 'X'){
			grid[a * 2 -1][temp] = 'X';
			for(int i = 0; i < grid.length; i++){
				for(int j = 0; j < grid[i].length; j++){
					System.out.print(grid[i][j]);
				}
				System.out.println();
			}
		}else{
			grid[a * 2 -1][temp] = 'O';
			for(int i = 0; i < grid.length; i++){
				for(int j = 0; j < grid[i].length; j++){
					System.out.print(grid[i][j]);
				}
				System.out.println();
			}
		}
	}
	
	public static boolean isEnd(int[][] place){
		for(int i = 0; i < place.length; i++){
			int t = place[i][0];
			if(place[i][1] == t && place[i][2] == t){
				return true;
			}
		}
		for(int j = 0; j < place.length; j++){
			int t = place[0][j];
			if(place[1][j] == t && place[2][j] == t){
				return true;
			}
		}
		int t1 = place[0][0];
		int t2 = place[0][2];
		if(t1 == place[1][1] && t1 == place[2][2]){
			return true;
		}
		if(t2 == place[1][1] && t2 == place[2][0]){
			return true;
		}
		return false;
	}

}
