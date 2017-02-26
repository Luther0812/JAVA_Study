/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_07;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_022 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c, d: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		
		double[][] temp = {
				{a, b},
				{c, d}
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
		double t = temp[0][0] * temp[1][1] - temp[0][1] * temp[1][0];
		if(t == 0){
			return null;
		}else{
			double[][] answer = new double[2][2];
			answer[0][0] = temp[1][1] / t;
			answer[0][1] = -temp[0][1] / t;
			answer[1][0] = -temp[1][0] / t;
			answer[1][1] = temp[0][0] / t;
			return answer;
		}
	}

}
