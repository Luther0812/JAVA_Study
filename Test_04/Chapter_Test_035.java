/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_035 {
	public static void main(String[] args){
		double result = 0;
		for(int i = 1; i <= 624; i++){
			result = result + (1.0 / (Math.pow(i, 0.5) + Math.pow((i + 1), 0.5)));
		}
		System.out.print("The result is: " + result);
	}

}
