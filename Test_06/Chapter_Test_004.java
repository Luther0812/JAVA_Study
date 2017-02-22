/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_004 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = 0;
		int[] list = new int[5];
		while(num >= 0){
			System.out.println("Enter the score: ");
			int temp = input.nextInt();
			if(temp == 0){
				break;
			}else{
				list[num] = temp;
				num++;
			}
		}
		if(list.length != 0){
			analysisScore(list);
		}
	}
	
	public static void analysisScore(int[] list){
		int length = list.length;
		int meanScore = 0;
		int totalScore = 0;
		for(int u: list){
			totalScore = totalScore + u;
		}
		meanScore = totalScore / length;
		int maxCount = 0;
		for(int u: list){
			if(u >= meanScore){
				maxCount++;
			}
		}
		
		System.out.println("The high score have " + maxCount);
		System.out.println("The low score have " + (length - maxCount));
	}

}
