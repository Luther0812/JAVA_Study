/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_005 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++){
			int temp = input.nextInt();
			if(isNumberInArray(numbers, temp)){
				
			}else{
				numbers[i] = temp;
			}
		}
		System.out.print("The distinct numbers are: ");
		for(int u: numbers){
			if(u == 0){
				
			}else{
				System.out.print(u + " ");
			}
		}
		
	}
	
	public static boolean isNumberInArray(int[] numbers, int temp){
		for(int u: numbers){
			if(temp == u){
				return true;
			}
		}
		return false;
	}

}
