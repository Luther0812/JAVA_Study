/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_006 {
	public static void main(String[] args){
		System.out.println("Ӣ��                     ǧ��                                     ǧ��                             Ӣ��");
		
		int number = 1;
		int numberTop = 11;
		int n = 20;
		while(number < numberTop){
			System.out.print(number + "       " + (float)(number * 1.609));
			System.out.print("                                    ");
			System.out.println(n + "       " + (float)(n / 1.609));
			number = number + 1;
			n = n + 5;
		}
	}

}
