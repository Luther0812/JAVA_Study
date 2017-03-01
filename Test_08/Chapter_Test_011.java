/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_08;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_011 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter six numbers: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation t = new LinearEquation(a, b, c, d, e, f);
		if(t.isSolvable()){
			System.out.println("X is " + t.getX());
			System.out.println("Y is " + t.getY());
		}else{
			System.out.println("The equation has no solution");
		}
	}

}

class LinearEquation{
	private double a = 0;
	private double b = 0;
	private double c = 0;
	private double d = 0;
	private double e = 0;
	private double f = 0;
	
	LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF){
		a = newA;
		b = newB;
		c = newC;
		d = newD;
		e = newE;
		f = newF;
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
	
	public double getD(){
		return d;
	}
	
	public double getE(){
		return e;
	}
	
	public double getF(){
		return f;
	}
	
	public boolean isSolvable(){
		if(a * d - b * c != 0){
			return true;
		}else{
			return false;
		}
	}
	
	public double getX(){
		return (e * d - b * f) / (a * d - b * c);
	}
	
	public double getY(){
		return (a * f - e * c) / (a * d - b * c);
	}
	
}
