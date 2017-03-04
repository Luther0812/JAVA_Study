/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_029 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two strings: ");
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		for(String u: split(s1, s2)){
			if(u == null){
				
			}else{
				System.out.print(u + " ");
			}
		}
	}
	
	public static String[] split(String s, String regex){
		int l1 = s.length();
		int l2 = regex.length();
		String[] temp = new String[l1];
		int num = 0;
		boolean flag = false;
		StringBuilder t = new StringBuilder();
		for(int i = 0; i < l1; i++){
			for(int j = 0; j < l2; j++){
				if(regex.charAt(j) == s.charAt(i)){
					temp[num] = t.toString();
					num++;
					temp[num] = String.valueOf(regex.charAt(j));
					num++;
					t.delete(0, i);
					flag = true;
					break;
				}
			}
			if(flag){
				flag = false;
			}else{
				t.append(s.charAt(i));
			}
		}
		temp[num] = t.toString();
		return temp;
	}

}
