/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_014 {
	public static void main(String[] args){
		int number = 0;
		for(int i = 33; i <= 126; i++){
			char temp = (char)(i);
			System.out.print(temp + "  ");
			number++;
			if(number % 10 == 0){
				System.out.print("\n");
			}
		}
	}

}
