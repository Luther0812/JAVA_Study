/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_019 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of the students: ");
		int number = input.nextInt();
		String[] name = new String[number];
		double[] score = new double[number];
		for(int i = 0; i < number; i++){
			System.out.println("Enter name of the student: ");
			name[i] = input.next();
			System.out.println("Enter score of the student: ");
			score[i] = input.nextDouble();
		}
		
		bubbleSort(name, score);
		for(String u: name){
			System.out.print(u + " ");
		}
	}
	
	public static void bubbleSort(String[] name, double[] score){
		int index;
		for(int i = 0; i < score.length - 1; i++){
			if(score[i] >= score[i + 1]){
				
			}else{
				double temp = score[i + 1];
				score[i + 1] = score[i];
				score[i] = temp;
				
				String tempName = name[i + 1];
				name[i + 1] = name[i];
				name[i] = tempName;
			}
		}
	}

}
