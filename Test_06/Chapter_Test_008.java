/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
public class Chapter_Test_008 {
	public static void main(String[] args){
		int[] num1 = {1, 2, 3, 4, 5};
		double[] num2 = {1.2, 2.3, 3.4, 4.5, 5.6};
		System.out.println("The integer means is " + average(num1));
		System.out.println("The integer means is " + average(num2));
	}
	
	public static int average(int[] num){
		int length = num.length;
		int total = 0;
		for(int u: num){
			total = total + u;
		}
		int result = total / length;
		return result;
	}
	
	public static double average(double[] num){
		int length = num.length;
		double total = 0;
		for(double u: num){
			total = total + u;
		}
		double result = total / length;
		return result;
	}

}
