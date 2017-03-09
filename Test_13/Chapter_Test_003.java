/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_13;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_003 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[] list = new double[100];
		for(int i = 0; i < list.length; i++){
			list[i] = Math.random();
		}
		System.out.print("Enter a index number: ");
		try{
			int index = input.nextInt();
			System.out.println("The list number is " + list[index]);
		}catch(Exception ex){
			System.out.println("ArrayIndexOutBoundException");
		}
	}

}
