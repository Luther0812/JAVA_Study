/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_026 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter list1: ");
		int[] list1 = new int[input.nextInt()];
		for(int i = 0; i < list1.length; i++){
			list1[i] = input.nextInt();
		}
		
		System.out.print("Enter list2: ");
		int[] list2 = new int[input.nextInt()];
		for(int i = 0; i < list2.length; i++){
			list2[i] = input.nextInt();
		}
		
		boolean isSame = isSame(list1, list2);
		if(isSame){
			System.out.println("Two lists are strictly identical");
		}else{
			System.out.println("Two lists are not strictly identical");
		}
	}
	
	public static boolean isSame(int[] list1, int[] list2){
		int list1Length = list1.length;
		int list2Length = list2.length;
		if(list1Length == list2Length){
			for(int i = 0; i < list1Length; i++){
				if(list1[i] != list2[i]){
					return false;
				}
			}
			return true;
		}else{
			return false;
		}
	}

}
