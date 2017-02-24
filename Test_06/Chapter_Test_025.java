/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_025 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[] eqn = new double[3];
		System.out.print("Enter a: ");
		eqn[0] = input.nextDouble();
		System.out.print("Enter b: ");
		eqn[1] = input.nextDouble();
		System.out.print("Enter c: ");
		eqn[2] = input.nextDouble();
		
		double[] roots = new double[2];
		int num = solveQuadratic(eqn, roots);
		System.out.print("The numbers of answers: " + num);
	}
	
	public static int solveQuadratic(double[] eqn, double[] roots){
		double temp = Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];
		if(temp > 0){
			roots[0] = (- eqn[1] + Math.pow(temp, 0.5)) / (2 * eqn[0]);
			roots[1] = (- eqn[1] - Math.pow(temp, 0.5)) / (2 * eqn[0]);
			return 2;
		}else if(temp == 0){
			roots[0] = (- eqn[1])/ (2 * eqn[0]);
			return 1;			
		}else{
			return 0;
		}
	}

}
