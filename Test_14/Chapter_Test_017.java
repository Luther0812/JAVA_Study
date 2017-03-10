/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_14;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_017 {
	public static void main(String[] args){
		double result = 0;
		for(int i = 1; i < 100; i++){
			Rational_017 t = new Rational_017(i, (1 + i));
			result += t.doubleValue(); 
		}
		
		System.out.println("The result is " + result);
	}

}

class Rational_017 extends Number implements Comparable{
	private double numerator = 0;
	private double denominator = 1;
	
	public Rational_017(){
		this(0, 1);
	}
	
	public Rational_017(double numerator, double denominator){
		double gcd = gcd(numerator, denominator);
		this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		this.denominator = Math.abs(denominator) / gcd;
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
		return numerator;
	}
	
	public double getDenominator(){
		return denominator;
	}
	
	public Rational_017 add(Rational_017 secondRational){
		double n = numerator * secondRational.getDenominator() + denominator * secondRational.getNumerator();
		double d = denominator * secondRational.getDenominator();
		return new Rational_017(n, d);
	}
	
	public Rational_017 subtract(Rational_017 secondRational){
		double n = numerator * secondRational.getDenominator() - denominator * secondRational.getNumerator();
		double d = denominator * secondRational.getDenominator();
		return new Rational_017(n, d);
	}
	
	public Rational_017 multiply(Rational_017 secondRational){
		double n = numerator * secondRational.getDenominator();
		double d = denominator * secondRational.getDenominator();
		return new Rational_017(n, d);
	}
	
	public Rational_017 divide(Rational_017 secondRational){
		double n = numerator * secondRational.getDenominator();
		double d = denominator * secondRational.numerator;
		return new Rational_017(n, d);
	}
	
	public String toString(){
		if(denominator == 1){
			return numerator + "";
		}else{
			return numerator + "/" + denominator;
		}
	}
	
	public boolean equals(Object parml){
		if((this.subtract((Rational_017)(parml))).getNumerator() == 0){
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
		return numerator * 1.0 / denominator;
	}
	
	public long longValue(){
		return (long)doubleValue();
	}
	
	public int compareTo(Object o){
		if((this.subtract((Rational_017)o)).getNumerator() > 0){
			return 1;
		}else if((this.subtract((Rational_017)o)).getNumerator() < 0){
			return -1;
		}else{
			return 0;
		}
	}

}
