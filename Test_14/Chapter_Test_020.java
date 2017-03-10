/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_14;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_020 {
	public static void main(String[] args){
		if(args.length != 3){
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}
		Rational_020 result = new Rational_020();
		Rational_020 a = new Rational_020(Integer.parseInt(String.valueOf(args[0].charAt(0))), Integer.parseInt(String.valueOf(args[0].charAt(2))));
		Rational_020 b = new Rational_020(Integer.parseInt(String.valueOf(args[2].charAt(0))), Integer.parseInt(String.valueOf(args[2].charAt(2))));
		switch (args[1].charAt(0)){
		case '+': 
			result = a.add(b);
			break;
		case '-':
			result = a.subtract(b);
			break;
		case '*':
			result = a.multiply(b);
			break;
		case '/':
			result = a.divide(b);
			break;
		}
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
	}

}

class Rational_020 extends Number implements Comparable{
	private double numerator = 0;
	private double denominator = 1;
	
	public Rational_020(){
		this(0, 1);
	}
	
	public Rational_020(double numerator, double denominator){
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
	
	public Rational_020 add(Rational_020 secondRational){
		double n = numerator * secondRational.getDenominator() + denominator * secondRational.getNumerator();
		double d = denominator * secondRational.getDenominator();
		return new Rational_020(n, d);
	}
	
	public Rational_020 subtract(Rational_020 secondRational){
		double n = numerator * secondRational.getDenominator() - denominator * secondRational.getNumerator();
		double d = denominator * secondRational.getDenominator();
		return new Rational_020(n, d);
	}
	
	public Rational_020 multiply(Rational_020 secondRational){
		double n = numerator * secondRational.getDenominator();
		double d = denominator * secondRational.getDenominator();
		return new Rational_020(n, d);
	}
	
	public Rational_020 divide(Rational_020 secondRational){
		double n = numerator * secondRational.getDenominator();
		double d = denominator * secondRational.numerator;
		return new Rational_020(n, d);
	}
	
	public String toString(){
		if(denominator == 1){
			return numerator + "";
		}else{
			return numerator + "/" + denominator;
		}
	}
	
	public boolean equals(Object parml){
		if((this.subtract((Rational_020)(parml))).getNumerator() == 0){
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
		if((this.subtract((Rational_020)o)).getNumerator() > 0){
			return 1;
		}else if((this.subtract((Rational_020)o)).getNumerator() < 0){
			return -1;
		}else{
			return 0;
		}
	}

}
