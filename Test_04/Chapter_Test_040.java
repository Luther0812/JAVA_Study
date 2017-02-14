/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author up
 *
 */
public class Chapter_Test_040 {
	public static void main(String[] args){
		int numberFront = 0;
		int numberBack = 0;
		int test;
		for(int i = 1; i <= 1000000; i++){
			test = (int)(Math.random() * 2);
			if(test == 0){
				numberFront++;
			}else{
				numberBack++;
			}
		}
		System.out.println("The front number is " + numberFront);
		System.out.println("The back number is " + numberBack);
	}

}
