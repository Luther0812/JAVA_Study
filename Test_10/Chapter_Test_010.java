/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_10;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

import Program_10.GuessDate_010;

public class Chapter_Test_010 {
	public static void main(String[] args){
		int date = 0;
		int answer;
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++){
			System.out.println("Is your birthday in Set" + (i + 1) + "?");
			for(int j = 0; j < 4; j++){
				for(int k = 0; k < 4; k++){
					System.out.print(GuessDate.getValue((i + 1), j, k) + "  ");
				}
				System.out.println();
			}
			
			System.out.print("\nEnter 0 for No and 1 for Yes: ");
			answer = input.nextInt();
			if(answer == 1){
				date += GuessDate.getValue((i + 1), 0, 0);
			}
		}
		System.out.println("Your birthday is " + date);
	}

}

class GuessDate{
	private static int[][] set1 = {
			{1,3,5,7},
			{9,11,13,15},
			{17,19,21,23},
			{25,27,29,31}
	};
	
	private static int[][] set2 = {
			{2,3,6,7},
			{10,11,14,15},
			{18,19,22,23},
			{26,27,30,31}
	};
	
	private static int[][] set3 = {
			{4,5,6,7},
			{12,13,14,15},
			{20,21,22,23},
			{28,29,30,31}
	};
	
	private static int[][] set4 = {
			{8,9,10,11},
			{12,13,14,15},
			{24,25,26,27},
			{28,29,30,31}
	};
	
	private static int[][] set5 = {
			{16,17,18,19},
			{20,21,22,23},
			{24,25,26,27},
			{28,29,30,31}
	};
	
	public static int[][] getSet1(){
		return set1;
	}
	
	public static int[][] getSet2(){
		return set2;
	}
	
	public static int[][] getSet3(){
		return set3;
	}
	
	public static int[][] getSet4(){
		return set4;
	}
	
	public static int[][] getSet5(){
		return set5;
	}
	
	private GuessDate(){
		
	}
	
	public static int getValue(int setNo, int k, int j){
		int[][] set;
		switch (setNo){
		case 1:
			set = getSet1();
			break;
		case 2:
			set = getSet1();
			break;
		case 3:
			set = getSet1();
			break;
		case 4:
			set = getSet1();
			break;
		case 5:
			set = getSet1();
			break;
		default:
			set = new int[4][4];
		}
		return set[k][j];
	}
}
