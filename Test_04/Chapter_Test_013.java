/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_013 {
	public static void main(String[] args){
		int number = 1;
		while( number * number * number <= 12000){
			number++;
		}
		System.out.print("The max number is " + (number - 1));
	}

}
