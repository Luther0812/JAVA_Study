/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_14;

/**
 * @author LiuYu
 *
 */
import java.math.*;

public class LargeFactorial_011 {
	public static void main(String[] args){
		System.out.println("50! is \n" + Factorial(50));
	}
	
	public static BigInteger Factorial(long n){
		BigInteger result = BigInteger.ONE;
		for(int i = 1; i <= n; i++){
			result = result.multiply(new BigInteger(i + ""));
		}
		return result;
	}

}
