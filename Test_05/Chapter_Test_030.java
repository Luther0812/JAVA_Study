/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_030 {
	public static void main(String[] args){
		for(int i = 1; i <= 1000; i++){
			if(isPrime(i) && isPrime(i + 2)){
				System.out.println("( " + i + " , " + (i + 2) + ")");
			}
		}
	}
	
	public static boolean isPrime(int number){
		for(int i = 2; i < number; i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}

}
