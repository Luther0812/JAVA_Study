/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_14;

/**
 * @author LiuYu
 *
 */
import java.math.*;

public class Chapter_Test_019 {
	public static void main(String[] args){
		double result = 0;
		for(int i = 1; i < 100; i++){
			BigInteger a = new BigInteger(i + "");
			BigInteger b = new BigInteger((i + 1) + "");
			Rational_019 t = new Rational_019(a, b);
			result += t.doubleValue(); 
		}
		
		System.out.println("The result is " + result);
	}

}

class Rational_019 extends Number implements Comparable{
	private BigInteger numerator = new BigInteger("0");
	private BigInteger denominator = new BigInteger("1");
	
	public Rational_019(){
		this(new BigInteger("0"), new BigInteger("1"));
	}
	
	public Rational_019(BigInteger numerator, BigInteger denominator){
		BigInteger gcd = gcd(numerator, denominator);
		BigInteger t;
		if(denominator.compareTo(new BigInteger("0")) >= 0){
			t = new BigInteger("1");
		}else{
			t = new BigInteger("0");
		}
		this.numerator = t.multiply(numerator).divide(gcd);
		this.denominator = denominator.abs().divide(gcd);
	}
	
	private static BigInteger gcd(BigInteger n, BigInteger d){
		BigInteger n1 = n.abs();
		BigInteger n2 = d.abs();
		int gcd = 1;
		int n3 = n1.intValue();
		int n4 = n2.intValue();
		BigInteger r = new BigInteger("0");
		for(int k = 1; k <= n3 && k <= n4; k++){
			if(n3 % k == 0 && n4 % k == 0){
				r = new BigInteger(k + "");
			}
		}
		return r;
	}
	
	public BigInteger getNumerator(){
		return numerator;
	}
	
	public BigInteger getDenominator(){
		return denominator;
	}
	
	public Rational_019 add(Rational_019 secondRational){
		BigInteger a = new BigInteger(secondRational.getNumerator() + "");
		BigInteger b = new BigInteger(secondRational.getDenominator() + "");
		BigInteger n = numerator.multiply(b).add(denominator).multiply(a);
		BigInteger d = denominator.multiply(b);
		return new Rational_019(n, d);
	}
	
	public Rational_019 subtract(Rational_019 secondRational){
		BigInteger a = new BigInteger(secondRational.getNumerator() + "");
		BigInteger b = new BigInteger(secondRational.getDenominator() + "");
		BigInteger n = numerator.multiply(b).subtract(denominator).multiply(a);
		BigInteger d = denominator.multiply(b);
		return new Rational_019(n, d);
	}
	
	public Rational_019 multiply(Rational_019 secondRational){
		BigInteger a = new BigInteger(secondRational.getNumerator() + "");
		BigInteger b = new BigInteger(secondRational.getDenominator() + "");
		BigInteger n = numerator.multiply(a);
		BigInteger d = denominator.multiply(b);
		return new Rational_019(n, d);
	}
	
	public Rational_019 divide(Rational_019 secondRational){
		BigInteger a = new BigInteger(secondRational.getNumerator() + "");
		BigInteger b = new BigInteger(secondRational.getDenominator() + "");
		BigInteger n = numerator.multiply(b);
		BigInteger d = denominator.multiply(a);
		return new Rational_019(n, d);
	}
	
	public String toString(){
		if(denominator.equals(1)){
			return numerator + "";
		}else{
			return numerator + "/" + denominator;
		}
	}
	
	public boolean equals(Object parml){
		if((this.subtract((Rational_019)(parml))).getNumerator().equals(0)){
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
		return numerator.doubleValue() * 1.0 / denominator.doubleValue();
	}
	
	public long longValue(){
		return (long)doubleValue();
	}
	
	public int compareTo(Object o){
		BigInteger t = new BigInteger("0");
		if((this.subtract((Rational_019)o)).getNumerator().compareTo(t) > 0){
			return 1;
		}else if((this.subtract((Rational_019)o)).getNumerator().compareTo(t) < 0){
			return -1;
		}else{
			return 0;
		}
	}

}
