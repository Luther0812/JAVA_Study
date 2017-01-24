/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_02;

/**
 *
 *
 */
import java.util.Scanner;

public class Chapter_Test_019 {
	public static void main(String[] args){
		double random = System.currentTimeMillis();
		double remainFirst = random / 250000000;
		double remainSecond = remainFirst / 1000;
		int remain = (int)(remainSecond + 65);
		char ran = (char)(remain);
		
		System.out.print(ran);
	}

}
