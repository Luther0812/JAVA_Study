/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_08;

/**
 * @author up
 *
 */
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Chapter_Test_010 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		QuadraticEquation q = new QuadraticEquation(a, b, c);
		if(q.getDiscriminant() < 0){
			System.out.println("The equation has no roots");
		}else if(q.getDiscriminant() == 0){
			double[] result = q.getRoots();
			for(double u: result){
				System.out.println("The root is " + u);
			}
		}else{
			double[] result = q.getRoots();
			for(double u: result){
				System.out.println("The root is " + u);
			}
		}
	}

}

class QuadraticEquation{
	private double a = 0;
	private double b = 0;
	private double c = 0;
	
	QuadraticEquation(double newA, double newB, double newC){
		a = newA;
		b = newB;
		c = newC;
	}
	
	public double getA(){
		return a;
	}
	
	public double getB(){
		return b;
	}
	
	public double getC(){
		return c;
	}
	
	public double getDiscriminant(){
		return b * b - 4 * a * c;
	}
	
	public double[] getRoots(){
		if(getDiscriminant() > 0){
			double[] roots = new double[2];
			roots[0] = (-b + Math.pow((b * b - 4 * a * c), 0.5)) / (2 * a);
			roots[1] = (-b - Math.pow((b * b - 4 * a * c), 0.5)) / (2 * a);
			return roots;
		}else if(getDiscriminant() == 0){
			double[] roots = new double[1];
			roots[0] = (-b + Math.pow((b * b - 4 * a * c), 0.5)) / (2 * a);
			return roots;
		}else{
			double[] roots = new double[1];
			roots[0] = 0;
			return roots;
		}
	}
}
