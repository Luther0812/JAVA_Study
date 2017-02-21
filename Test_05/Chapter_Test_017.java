/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
public class Chapter_Test_017 {
	public static void main(String[] args){
		int number = 3;
		printMatrix(number);
	}
	
	public static void printMatrix(int n){
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				int number = (int)(Math.random() * 2);
				System.out.print(number + " ");
			}
			System.out.println();
		}
	}

}
