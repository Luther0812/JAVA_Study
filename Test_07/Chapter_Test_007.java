/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_07;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_007 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[][] list = new double[8][3];
		System.out.print("Enter points: ");
		for(int i = 0; i < list.length; i++){
			for(int j = 0; j < list[i].length; j++){
				list[i][j] = input.nextDouble();
			}
		}
		double temp = Math.pow((list[1][0] - list[0][0]), 2) + Math.pow((list[1][1] - list[0][1]), 2) + Math.pow((list[1][2] - list[0][2]), 2);
		double shortDistance = Math.pow(temp, 0.5);
		int index1 = 0;
		int index2 = 1;
		for(int i = 0; i < list.length; i++){
			for(int j = i + 1; j < list.length; j++){
				double t = Math.pow((list[j][0] - list[i][0]), 2) + Math.pow((list[j][1] - list[i][1]), 2) + Math.pow((list[j][2] - list[i][2]), 2);
				double shortDistanceT = Math.pow(t, 0.5);
				if(shortDistanceT < shortDistance){
					index1 = i;
					index2 = j;
					shortDistance = shortDistanceT;
				}
			}
		}
		System.out.println("The distance is " + shortDistance);
		System.out.println("The distance index1 is " + index1);
		System.out.println("The distance index2 is " + index2);
	}

}
