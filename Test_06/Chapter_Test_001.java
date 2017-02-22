/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_001 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int number = input.nextInt();
		System.out.print("Enter " + number + " scores: ");
		int[] score = new int[number];
		for(int i = 0; i < number; i++){
			score[i] = input.nextInt();
		}
		
		int topScore = max(score);
		printLevel(score, topScore);
	}
	
	public static int max(int[] score){
		int num = score.length;
		int temp = score[0];
		for(int i = 1; i < num; i++){
			if(score[i] > temp){
				temp = score[i];
			}
		}
		
		return temp;
	}
	
	public static void printLevel(int[] score, int topScore){
		for(int i = 0; i < score.length; i++){
			if(score[i] >= topScore - 10){
				System.out.println("Student " + i + " score is " + score[i] + " and grade is A");
			}else if(score[i] >= topScore - 20){
				System.out.println("Student " + i + " score is " + score[i] + " and grade is B");
			}else if(score[i] >= topScore - 30){
				System.out.println("Student " + i + " score is " + score[i] + " and grade is C");
			}else if(score[i] >= topScore - 40){
				System.out.println("Student " + i + " score is " + score[i] + " and grade is E");
			}else{
				System.out.println("Student " + i + " score is " + score[i] + " and grade is F");
			}
		}
	}

}
