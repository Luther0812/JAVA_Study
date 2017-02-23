/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
public class Chapter_Test_007 {
	public static void main(String[] args){
		int[] counts = new int[10];
		for(int i = 1; i <= 100; i++){
			int temp = (int)(Math.random() * 10);
			counts[temp]++;
		}
		
		for(int u: counts){
			System.out.print(u + " ");
		}
	}

}
