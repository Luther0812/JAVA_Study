/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_018 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		double[] numbers = new double[10];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextDouble();
		}
		
		while(order(numbers)){
			bubbleSort(numbers);
		}
		for(double u: numbers){
			System.out.print(u + " ");
		}
	}
	
	public static boolean order(double[] numbers){
		for(int i = 0; i < numbers.length - 1; i++){
			if(numbers[i] <= numbers[i + 1]){
				
			}else{
				return true;
			}
		}
		return false;
	}
	
	public static void bubbleSort(double[] numbers){
		for(int i = 0; i < numbers.length - 1; i++){
			if(numbers[i] <= numbers[i + 1]){
				
			}else{
				double temp = numbers[i + 1];
				numbers[i + 1] = numbers[i];
				numbers[i] = temp;
			}
		}
	}

}
