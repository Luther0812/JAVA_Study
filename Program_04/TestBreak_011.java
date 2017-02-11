/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_04;

/**
 * @author LiuYu
 *
 */
public class TestBreak_011 {
	public static void main(String[] args){
		int sum = 0;
		int number = 0;
		while(number < 20){
			number++;
			sum += number;
			if(sum > 100){
				break;
			}
		}
		
		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);
	}

}
