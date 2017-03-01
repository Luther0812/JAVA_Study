/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_08;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_012 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		double f = 0;
		System.out.print("Enter the endpoints of the fitst line segment: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		a = (y2 - y1) / (x2 - x1);
		b = -1;
		e = -(y1 - x1 * (y2 - y1) / (x2 - x1));
		
		System.out.print("Enter the endpoints of the second line segment: ");
		double m1 = input.nextDouble();
		double n1 = input.nextDouble();
		double m2 = input.nextDouble();
		double n2 = input.nextDouble();
		c = (n2 - n1) / (m2 - m1);
		d = -1;
		f = -(n1 - m1 * (n2 - n1) / (m2 - m1));
		
		LinearEquation_012 t = new LinearEquation_012(a, b, c, d, e, f);
		if(t.isSolvable()){
			System.out.println("X is " + t.getX());
			System.out.println("Y is " + t.getY());
		}else{
			System.out.println("The equation has no solution");
		}
	}

}

class LinearEquation_012{
	private double a = 0;
	private double b = 0;
	private double c = 0;
	private double d = 0;
	private double e = 0;
	private double f = 0;
	
	LinearEquation_012(double newA, double newB, double newC, double newD, double newE, double newF){
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
