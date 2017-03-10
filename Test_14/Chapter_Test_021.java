/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_14;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_021 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first complex number: ");
		double a1 = input.nextDouble();
		double b1 = input.nextDouble();
		System.out.print("Enter the second complex number: ");
		double a2 = input.nextDouble();
		double b2 = input.nextDouble();
		Complex num1 = new Complex(a1, b1);
		Complex num2 = new Complex(a2, b2);
		System.out.println(num1.toString() + " + " + num2.toString() + " = " + Complex.add(num1, num2));
		System.out.println(num1.toString() + " - " + num2.toString() + " = " + Complex.subtract(num1, num2));
		System.out.println(num1.toString() + " * " + num2.toString() + " = " + Complex.multiply(num1, num2));
		System.out.println(num1.toString() + " / " + num2.toString() + " = " + Complex.divide(num1, num2));
		System.out.println("| " + num1 + " | = " + num1.abs());
	}

}

class Complex{
	private double realPart;
	private double imaginaryPart;
	
	public Complex(){
		this.realPart = 0;
		this.imaginaryPart = 0;
	}
	
	public Complex(double a){
		this.realPart = a;
		this.imaginaryPart = 0;
	}
	
	public Complex(double a, double b){
		this.realPart = a;
		this.imaginaryPart = b;
	}
	
	public double getRealPart(){
		return realPart;
	}
	
	public double getImaginary(){
		return this.imaginaryPart;
	}
	
	public String toString(){
		return this.realPart + " + " + this.imaginaryPart + "i";
	}
	
	public double abs(){
		double t = Math.pow(this.realPart, 2) + Math.pow(this.imaginaryPart, 2);
		return Math.sqrt(t);
	}
	
	public static String add(Complex a, Complex b){
		return (a.realPart + b.realPart) + " + " + (a.imaginaryPart + b.imaginaryPart) + "i";
	}
	
	public static String subtract(Complex a, Complex b){
		return (a.realPart - b.realPart) + " + " + (a.imaginaryPart - b.imaginaryPart) + "i";
	}

	public static String multiply(Complex a, Complex b){
		return (a.realPart * b.realPart - a.imaginaryPart * b.imaginaryPart) + " + " + (a.realPart * b.imaginaryPart + a.imaginaryPart * b.realPart) + "i";
	}

	public static String divide(Complex a, Complex b){
		double t = Math.pow(b.realPart, 2) + Math.pow(b.imaginaryPart, 2);
		return (a.realPart * b.realPart + a.imaginaryPart * b.imaginaryPart) / (t) + " + " + (a.realPart * b.imaginaryPart - a.imaginaryPart * b.realPart) / (t) + "i";
	}
	
}
