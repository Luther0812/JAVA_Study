/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author up
 *
 */
public class Chapter_Test_025 {
	public static void main(String[] args){
		for(int i = 10000; i <= 100000;){
			double pi = 0;
			for(int j = 1; j <= i; j++){
				pi = pi + (Math.pow(-1, (j + 1)) * 1.0 / (j * 2.0 - 1.0));
			}
			pi = pi * 4;
			System.out.println("The PI of " + i + " is " + pi);
			i = i + 10000;
		}
	}

}
