/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
public class Chapter_Test_001 {
	public static void main(String[] args){
		int count = 1;
		final int NUMBER = 100;
		while(count <= 100){
			int result = getPentagonalNumber(count);
			System.out.print(result + " ");
			if(count % 10 == 0){
				System.out.println();
			}
			count++;
		}
	}
	
	public static int getPentagonalNumber(int i){
		int result;
		result = i * (3 * i - 1) / 2;
		return result;
	}

}
