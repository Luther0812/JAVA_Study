/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_14;

/**
 * @author up
 *
 */
import java.math.*;

public class Chapter_Test_016 {
	public static void main(String[] args){
		for(int i = 100; i <= 1000;){
			BigDecimal X = new BigDecimal(1);
			BigDecimal E = new BigDecimal(0);
			BigDecimal tempE = new BigDecimal(0);
			for(int j = 1; j <= i; j++){
				BigDecimal temp = new BigDecimal(1);
				BigDecimal k = new BigDecimal(j);
				BigDecimal t = new BigDecimal(1);
				for(; t.compareTo(k) <= 0;){
					temp = temp.multiply(t);
					t = t.add(BigDecimal.ONE);
				}
				X = BigDecimal.ONE.divide(temp, 25, BigDecimal.ROUND_UP);
				tempE = tempE.add(X);
			}
			E = tempE.add(BigDecimal.ONE);
			System.out.println("The E is " + E);
			i = i + 100;
		}
	}

}
