/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_07;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_003 {
	public static void main(String[] args){
		char[][] answers = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		};
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		int[][] temp = new int[8][2];
		for(int i = 0; i < answers.length; i++){
			int correctCount = 0;
			for(int j = 0; j < answers[i].length; j++){
				if(answers[i][j] == keys[j]){
					correctCount++;
				}
			}
			temp[i][0] = (i + 1);
			temp[i][1] = correctCount;
		}
		
		for(int i = 0; i < temp.length; i++){
			for(int j = i + 1; j < temp.length; j++){
				if(temp[i][1] > temp[j][1]){
					int[][] t = new int[1][2];
					t[0][0] = temp[i][0];
					t[0][1] = temp[i][1];
					temp[i][0] = temp[j][0];
					temp[i][1] = temp[j][1];
					temp[j][0] = t[0][0];
					temp[j][1] = t[0][1];
				}
			}
		}
		for(int i = 0; i < temp.length; i++){
			System.out.println("Student " + temp[i][0] + "'s correct count is " + temp[i][1]);
		}
	}

}
