/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author up
 *
 */
public class Chapter_Test_023 {
	public static void main(String[] args){
		double answer1 = 0;
		double answer2 = 0;
		for(int i = 1; i <= 50000; i++){
			answer1 = answer1 + (1.0 / i);
		}
		
		for(int i = 50000; i >= 1; i--){
			answer2 = answer2 + (1.0 / i);
		}
		
		System.out.println("From left to right is " + answer1);
		System.out.println("From right to left is " + answer2);
	}

}
