/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
public class Chapter_Test_028 {
	public static void main(String[] args){
		System.out.printf("%2s%3s%7s\n", "p", "", "2P - 1");
		for(int i = 2; i <= 31; i++){
			if(mersennePrime(i)){
				System.out.printf("%2d%5s%3.0f\n", i, "", (Math.pow(2, i) - 1));
			}else{
				
			}
		}
	}
	
	public static boolean mersennePrime(int number){
		int num = (int)(Math.pow(2, number) - 1);
		if(isPrime(num)){
			return true;
		}else{
			return false;
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
