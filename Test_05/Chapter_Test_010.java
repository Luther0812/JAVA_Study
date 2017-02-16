/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
public class Chapter_Test_010 {
	public static void main(String[] args){
		int count = 0;
		int number = 1;
		while(number <= 10000){
			if(isPrime(number)){
				count++;
			}
			number++;
		}
		System.out.print("The number is " + count);
	}
	
	public static boolean isPrime(int number){
		for(int divisor = 2; divisor <= number / 2; divisor++){
			if(number % divisor == 0){
				return false;
			}
		}
		return true;
	}

}
