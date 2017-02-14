/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author up
 *
 */
public class Chapter_Test_044 {
	public static void main(String[] args){
		double pointX = 0.0;
		double pointY = 0.0;
		int countOdd = 0;
		int countEven = 0;
		for(int i = 1; i <= 1000000; i++){
			pointX = (Math.random() * 2) - 1.0;
			pointY = (Math.random() * 2) - 1.0;
			
			if(pointX <= 0 && pointY <= 0){
				countOdd++;
			}else if(pointX >= 0 && ((1.0 - pointX) >= pointY) && pointY >= 0){
				countOdd++;
			}
		}
		System.out.println("The result is " + (countOdd / 1000000.0));
	}

}
