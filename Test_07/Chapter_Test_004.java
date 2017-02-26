/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_07;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_004 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		int[][] hours = new int[8][7];
		for(int i = 0; i < hours.length; i++){
			for(int j = 0; j < hours[i].length; j++){
				hours[i][j] = input.nextInt();
			}
		}
		int[][] temp = new int[8][2];
		for(int i = 0; i < temp.length; i++){
			int total = 0;
			for(int j = 0; j < hours[0].length; j++){
				total = total + hours[i][j];
			}
			temp[i][0] = (i);
			temp[i][1] = total;
		}
		
		for(int i = 0; i < temp.length; i++){
			for(int j = 1 + i; j < temp.length; j++){
				int[][] t = new int[1][2];
				if(temp[i][1] < temp[j][1]){
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
			System.out.println("Employee" + temp[i][0] + " 's work hours is " + temp[i][1]);
		}
	}

}
