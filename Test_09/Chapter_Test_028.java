/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_028 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two strings: ");
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		System.out.println("The common prefix is " + prefix(s1, s2));
	}
	
	public static String prefix(String s1, String s2){
		int l1 = s1.length();
		int l2 = s2.length();
		int l;
		if(l1 < l2){
			l = l1;
		}else{
			l = l2;
		}
		StringBuilder temp = new StringBuilder();
		for(int i = 0; i < l; i++){
			if(s1.charAt(i) == s2.charAt(i)){
				temp.append(s1.charAt(i));
			}else{
				break;
			}
		}
		if(temp.length() == 0){
			return "";
		}else{
			return temp.toString();
		}
	}

}
