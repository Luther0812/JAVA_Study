/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_011 {
	public static void main(String[] args){
		int number = 0;
		for(int i = 100; i <= 200; i++){
			if((i % 5 == 0 || i % 6 == 0) && !(i % 5 == 0 && i % 6 == 0)){
				System.out.print(i + "  ");
				number++;
				if(number % 10 == 0){
					System.out.print("\n");
				}
			}
		}
	}

}
