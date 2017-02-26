/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_07;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_023 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a11, a12, a13, a21, a22, a23, a31, a32, a33: ");
		double a11 = input.nextDouble();
		double a12 = input.nextDouble();
		double a13 = input.nextDouble();
		double a21 = input.nextDouble();
		double a22 = input.nextDouble();
		double a23 = input.nextDouble();
		double a31 = input.nextDouble();
		double a32 = input.nextDouble();
		double a33 = input.nextDouble();
		
		double[][] temp = {
				{a11, a12, a13},
				{a21, a22, a23},
				{a31, a32, a33}
		};
		
		double[][] answer = inverse(temp);
		if(answer != null){
			for(int i = 0; i < answer.length; i++){
				for(int j = 0; j < answer[i].length; j++){
					System.out.print(answer[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	public static double[][] inverse(double[][] temp){
		double t = temp[0][0] * temp[1][1] * temp[2][2] + temp[0][1] * temp[1][2] * temp[2][0] + temp[0][2] * temp[1][0] * temp[2][1]
				 - temp[0][2] * temp[1][1] * temp[2][0] - temp[0][0] * temp[1][2] * temp[2][1] - temp[0][1] * temp[1][0] * temp[2][2];
		if(t == 0){
			return null;
		}else{
			double[][] answer = new double[3][3];
			answer[0][0] = (temp[1][1] * temp[2][2] - temp[1][2] * temp[2][1]) / t;
			answer[0][1] = (temp[0][2] * temp[2][1] - temp[0][1] * temp[2][2]) / t;
			answer[0][2] = (temp[0][1] * temp[1][2] - temp[0][2] * temp[1][1]) / t;
			answer[1][0] = (temp[1][2] * temp[2][0] - temp[1][0] * temp[2][2]) / t;
			answer[1][1] = (temp[0][0] * temp[2][2] - temp[0][2] * temp[2][0]) / t;
			answer[1][2] = (temp[0][2] * temp[1][0] - temp[0][0] * temp[1][2]) / t;
			answer[2][0] = (temp[1][0] * temp[2][1] - temp[1][1] * temp[2][0]) / t;
			answer[2][1] = (temp[0][1] * temp[2][0] - temp[0][0] * temp[2][1]) / t;
			answer[2][2] = (temp[0][0] * temp[1][1] - temp[0][1] * temp[1][0]) / t;
			return answer;
		}
	}

}
