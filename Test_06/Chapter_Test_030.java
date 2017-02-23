/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_030 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		int[] numbers = new int[input.nextInt()];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextInt();
		}
		
		if(isConsecutiveFour(numbers)){
			System.out.print("The numbers is consecutive");
		}else{
			System.out.print("The numbers is not consecutive");
		}
	}
	
	public static boolean isConsecutiveFour(int[] numbers){
		for(int i = 0; i < numbers.length - 3; i++){
			if(numbers[i] == numbers[i + 1] && numbers[i] == numbers[i + 2] && numbers[i] == numbers[i + 3]){
				return true;
			}else{
				
			}
		}
		return false;
	}

}
