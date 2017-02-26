/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_07;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_014 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size for the matrix: ");
		int size = input.nextInt();
		int[][] list = new int[size][size];
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				list[i][j] = (int)(Math.random() * 2);
			}
		}
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				System.out.print(list[i][j] + " ");
			}
			System.out.println();
		}
		for(int i = 0; i < size; i++){
			int count = 0;
			int num = 0;
			int t = list[i][0];
			for(int j = 1; j < size; j++){
				if(list[i][j] != t){
					count++;
					break;
				}else{
					num++;
				}
			}
			if(t == 0 && num == size - 1){
				System.out.println("All 0s on row " + i);
			}else if(t == 1 && num == size - 1){
				System.out.println("All 1s on row " + i);
			}
			if(count == size){
				System.out.println("No same numbers in a row");
			}
		}
		for(int i = 0; i < size; i++){
			int count = 0;
			int num = 0;
			int t = list[0][i];
			for(int j = 1; j < size; j++){
				if(list[j][i] != t){
					count++;
					break;
				}else{
					num++;
				}
			}
			if(t == 0 && num == size - 1){
				System.out.println("All 0s on column " + i);
			}else if(t == 1 && num == size - 1){
				System.out.println("All 1s on column " + i);
			}
			if(count == size){
				System.out.println("No same numbers in a column");
			}
		}
		int count = 0;
		for(int i = 0; i < list.length; i++){
			int t = list[0][0];
			for(int j = 1; j < list[0].length; j++){
				if(t == list[i][j] && i == j){
					count++;
				}
			}
		}
		if(list[0][0] == 0 && count == size){
			System.out.println("All 0s on major diagonal");
		}else if(list[0][0] == 1 && count == size){
			System.out.println("All 1s on major diagonal");
		}else{
			System.out.println("No same numbers on the major diagonal");
		}
		
		int num = 0;
		for(int i = 0; i < list.length; i++){
			int t = list[0][2];
			for(int j = size - 1; j >= 0; j--){
				if(t == list[i][j] && i + j == size - 1){
					count++;
				}
			}
		}
		if(list[0][2] == 0 && count == size){
			System.out.println("All 0s on sub-diagonal");
		}else if(list[0][2] == 1 && count == size){
			System.out.println("All 1s on sub-diagonal");
		}else{
			System.out.println("No same numbers on the sub-diagonal");
		}
		
	}

}
