/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_003 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integers between 1 and 100: ");
		int[] num = new int[100];
		int in;
		while(true){
			in = input.nextInt();
			if(in == 0){
				break;
			}
			num[in - 1]++;
		}
		
		for(int i = 0; i < num.length; i++){
			if(num[i] != 0){
				if(num[i] == 1){
					System.out.println((i + 1) + " occurs " + num[i] + " time");
				}else{
					System.out.println((i + 1) + " occurs " + num[i] + " times");
				}
			}
		}
	}

}
