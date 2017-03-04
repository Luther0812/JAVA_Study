/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_032 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter nine numbers: ");
		String s = input.nextLine();
		int[] list = new int[9];
		if(s.length() != 9){
			System.out.println("The length of number is not nine");
			System.exit(0);
		}else{
			for(int i = 0; i < s.length(); i++){
				list[i] = Integer.valueOf(String.valueOf(s.charAt(i)));
			}
		}
		
		int d1 = list[0];
		int d2 = list[1];
		int d3 = list[2];
		int d4 = list[3];
		int d5 = list[4];
		int d6 = list[5];
		int d7 = list[6];
		int d8 = list[7];
		int d9 = list[8];
		
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 +
				d4 * 4 + d5 * 5 + d6 * 6 +
				d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		String t10 = "";
		
		if(d10 == 10){
			 t10 = "X";
		}else{
			t10 = String.valueOf(d10);
		}
		
		String t1 = String.valueOf(d1);
		String t2 = String.valueOf(d2);
		String t3 = String.valueOf(d3);
		String t4 = String.valueOf(d4);
		String t5 = String.valueOf(d5);
		String t6 = String.valueOf(d6);
		String t7 = String.valueOf(d7);
		String t8 = String.valueOf(d8);
		String t9 = String.valueOf(d9);
		
		String isbn = t1 + t2 + t3 + t4 + t5 + t6 + t7 + t8 + t9 + t10;
		
		System.out.print("The ISBN is " + isbn);
	}

}
