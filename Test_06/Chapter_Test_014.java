/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_014 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbes: ");
		int[] numbers = new int[10];
		for(int i = 0; i < 10; i++){
			numbers[i] = input.nextInt();
		}
		
		int gcd = gcd(numbers);
		System.out.print("The gcd is " + gcd);
	}
	
	public static int gcd(int... numbers){
		int length = numbers.length;
		int maxNumber = 1;
		int max = max(numbers);
		for(int i = 1; i <= max; i++){
			if(gcdCommon(numbers, i)){
				maxNumber = i;
			}
		}
		return maxNumber;
	}
	
	public static int max(int[] numbers){
		int temp = numbers[0];
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] > temp){
				temp = numbers[i];
			}
		}
		return temp;
	}
	
	public static boolean gcdCommon(int[] numbers, int key){
		for(int i = 0 ; i < numbers.length; i++){
			if(numbers[i] % key != 0){
				return false;
			}
		}
		return true;
	}

}
