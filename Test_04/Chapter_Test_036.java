/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_036 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int result = 0;
		String temp = "";
		for(int i = 1; i <= 9; i++){
			System.out.print("Enter nine numbers: ");
			int number = input.nextInt();
			String t = String.valueOf(number);
			temp =temp + t;
			result = result + number * i;
		}
		
		int d10 = result % 11;
		
		String t10 = "";
		
		if(d10 == 10){
			 t10 = "X";
		}else{
			t10 = String.valueOf(d10);
		}
		
		String isbn = temp + t10;
		
		System.out.print("The ISBN is " + isbn);
	}

}
