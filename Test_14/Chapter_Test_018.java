/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_14;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_018 {
	public static void main(String[] args){
		double result = 0;
		for(int i = 1; i < 100; i++){
			Rational_018 t = new Rational_018(i, (1 + i));
			result += t.doubleValue(); 
		}
		
		System.out.println("The result is " + result);
	}

}

class Rational_018 extends Number implements Comparable{
	private double[] list;
	
	public Rational_018(){
		this(0, 1);
	}
	
	public Rational_018(double numerator, double denominator){
		double gcd = gcd(numerator, denominator);
		double a = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		double b = Math.abs(denominator) / gcd;
		double[] t = {a, b};
		this.list = t;
	}
	
	private static double gcd(double n, double d){
		double n1 = Math.abs(n);
		double n2 = Math.abs(d);
		int gcd = 1;
		
		for(int k = 1; k <= n1 && k <= n2; k++){
			if(n1 % k == 0 && n2 % k == 0){
				gcd = k;
			}
		}
		return gcd;
	}
	
	public double getNumerator(){
		return this.list[0];
	}
	
	public double getDenominator(){
		return this.list[1];
	}
	
	public Rational_018 add(Rational_018 secondRational){
		double n = this.list[0] * secondRational.getDenominator() + this.list[1] * secondRational.getNumerator();
		double d = this.list[1] * secondRational.getDenominator();
		return new Rational_018(n, d);
	}
	
	public Rational_018 subtract(Rational_018 secondRational){
		double n = this.list[0] * secondRational.getDenominator() - this.list[1] * secondRational.getNumerator();
		double d = this.list[1] * secondRational.getDenominator();
		return new Rational_018(n, d);
	}
	
	public Rational_018 multiply(Rational_018 secondRational){
		double n = this.list[0] * secondRational.getDenominator();
		double d = this.list[1] * secondRational.getDenominator();
		return new Rational_018(n, d);
	}
	
	public Rational_018 divide(Rational_018 secondRational){
		double n = this.list[0] * secondRational.getDenominator();
		double d = this.list[1] * secondRational.list[0];
		return new Rational_018(n, d);
	}
	
	public String toString(){
		if(this.list[1] == 1){
			return this.list[0] + "";
		}else{
			return this.list[0] + "/" + this.list[1];
		}
	}
	
	public boolean equals(Object parml){
		if((this.subtract((Rational_018)(parml))).getNumerator() == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public int intValue(){
		return (int)doubleValue();
	}
	
	public float floatValue(){
		return (float)doubleValue();
	}
	
	public double doubleValue(){
		return this.getNumerator() * 1.0 / this.getDenominator();
	}
	
	public long longValue(){
		return (long)doubleValue();
	}
	
	public int compareTo(Object o){
		if((this.subtract((Rational_018)o)).getNumerator() > 0){
			return 1;
		}else if((this.subtract((Rational_018)o)).getNumerator() < 0){
			return -1;
		}else{
			return 0;
		}
	}

}
