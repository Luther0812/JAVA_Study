/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_14;

/**
 * @author up
 *
 */
import java.math.*;

public class Chapter_Test_011 {
	public static void main(String[] args){
		BigInteger[] list = test();
		for(int i = 0; i < 10; i++){
			System.out.println(list[i]);
		}
	}
	
	public static BigInteger[] test(){
		BigInteger t = new BigInteger("9223372036854775807");
		BigInteger five = new BigInteger("5");
		BigInteger six = new BigInteger("6");
		BigInteger zero = new BigInteger("0");
		BigInteger[] array = new BigInteger[10];
		int count = 0;
		while(count < 10){
			if(t.mod(five).equals(zero) || t.mod(six).equals(zero)){
				array[count] = t;
				count++;
				t = t.add(BigInteger.ONE);
			}else{
				t = t.add(BigInteger.ONE);
			}
		}
		return array;
	}

}
