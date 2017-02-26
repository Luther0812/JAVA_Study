/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_07;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_010 {
	public static void main(String[] args){
		int[][] game = new int[3][3];
		for(int i = 0; i < game.length; i++){
			for(int j = 0; j < game[0].length; j++){
				game[i][j] = (int)(Math.random() * 2);
			}
		}
		
		for(int i = 0; i < game.length; i++){
			for(int j = 0; j < game[0].length; j++){
				System.out.print(game[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < game.length; i++){
			if(game[i][0] == game[i][1] && game[i][0] == game[i][2]){
				System.out.println("All is on row " + i);
			}
		}
		
		for(int i = 0; i < game.length; i++){
			if(game[0][i] == game[1][i] && game[0][i] == game[2][i]){
				System.out.println("All is on column " + i);
			}
		}
	}

}
