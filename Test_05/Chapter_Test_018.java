/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
public class Chapter_Test_018 {
	public static void main(String[] args){
		System.out.println("number       answer");
		int number = 20;
		for(int i = 0; i <= number;){
			double answer = Math.sqrt(i);
			System.out.println(i + "              " + answer);
			i = i + 2;
		}
	}

}
