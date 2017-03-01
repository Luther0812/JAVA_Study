/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_08;

/**
 * @author up
 *
 */
public class Chapter_Test_004 {
	public static void main(String[] args){
		java.util.Random r = new java.util.Random(1000);
		for(int i = 0; i < 50; i++){
			System.out.print(r.nextInt(100) + " ");
		}
	}

}
