/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_005 {
	public static void main(String[] args){
		System.out.println("Ç§¿Ë                     °õ                                     °õ                             Ç§¿Ë");
		
		int number = 1;
		int numberTop = 200;
		int n = 20;
		while(number < numberTop){
			System.out.print(number + "       " + (float)(number * 2.2));
			System.out.print("                                    ");
			System.out.println(n + "       " + (float)(n / 2.2));
			number = number + 2;
			n = n + 5;
		}
	}

}
