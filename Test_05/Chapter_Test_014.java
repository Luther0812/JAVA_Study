/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
public class Chapter_Test_014 {
	public static void main(String[] args){
		int count = 100;
		System.out.printf("%-4s%4s%-6s\n", "i", "", "m(i)");
		for(int i = 10; i <= count;){
			System.out.printf("%-4d%4s%-6.2f\n", i, "", m(i));
			i = i + 10;
		}
	}
	
	public static double m(int number){
		double result = 0;
		for(int i = 1; i <= number;){
			result = result + 1 / (i * 2 - 1.0) - 1 / (2 * i + 1.0);
			i = i + 2;
		}
		result = 4 * result;
		return result;
	}

}
