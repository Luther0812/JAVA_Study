/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_005 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		int[] list = count(s);
		for(int i = 0; i < list.length; i++){
			if(list[i] == 0){
				
			}else{
				System.out.println(i + " appeans " + list[i]);
			}
		}
	}
	
	public static int[] count(String str){
		int[] num = new int[10];
		for(int i = 0; i < str.length(); i++){
			if(Character.isDigit(str.charAt(i))){
				num[str.charAt(i) - '0']++;
			}
		}
		return num;
	}

}
