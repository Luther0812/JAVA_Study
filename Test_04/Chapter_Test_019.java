/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_019 {
	public static void main(String[] args){
		for(int i = 1; i <= 8; i++){
			for(int j1 = 1; j1 <= (7 - i); j1++){
				System.out.print("  ");
			}
			for(int j2 = 1; j2 <= i; j2++){
				System.out.print((int)Math.pow(2, j2 -1) + " ");
			}
			for(int j3 = 2; j3 <= i; j3++){
				System.out.print((int)Math.pow(2, j3 -2) + " ");
			}
			System.out.print("\n");
		}
	}

}
