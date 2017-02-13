/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author up
 *
 */
public class Chapter_Test_024 {
	public static void main(String[] args){
		double answer = 0;
		for(int i = 1; i <= 49; i++){
			answer = answer + (i * 2.0 - 1.0) / (i * 2.0 + 1.0);
		}
		System.out.print("The answer is " + answer);
	}

}
