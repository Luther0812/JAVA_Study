/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author up
 *
 */
public class Chapter_Test_045 {
	public static void main(String[] args){
		int count = 0;
		for(int i = 1; i <= 7; i++){
			for(int j = 1; j <= 7; j++){
				System.out.println(i + " " + j);
				count++;
			}
		}
		System.out.println("\nThe count is " + count);
	}

}
