/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_14;

/**
 * @author up
 *
 */
import java.math.*;

public class Chapter_Test_013 {
	public static void main(String[] args){
		BigInteger[] list = test();
		for(int i = 0; i < 10; i++){
			System.out.println(list[i]);
		}
	}
	
	public static BigInteger[] test(){
		BigInteger t = new BigInteger("9223372036854775807");
		BigInteger[] array = new BigInteger[10];
		int count = 0;
		while(count < 1){
			long n = (long)Math.sqrt(t.longValue());
			BigInteger temp = new BigInteger(n + "");
			while(temp.compareTo(t) < 0){
				if(temp.multiply(temp).equals(t)){
					array[count] = t;
					count++;
					break;
				}
				System.out.println(temp.multiply(temp));
				temp = temp.add(BigInteger.ONE);
			}
			t = t.add(BigInteger.ONE);
		}
		return array;
	}

}
