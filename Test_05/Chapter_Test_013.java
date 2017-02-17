/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
public class Chapter_Test_013 {
	public static void main(String[] args){
		int count = 20;
		System.out.printf("%-4s%4s%-6s\n", "i", "", "m(i)");
		for(int i = 1; i <= count; i++){
			System.out.printf("%-4d%4s%-6.2f\n", i, "", m(i));
		}
	}
	
	public static double m(int number){
		double result = 0;
		for(int i = 1; i <= number; i++){
			result = result + (i) / (i + 1.0);
		}
		return result;
	}

}
