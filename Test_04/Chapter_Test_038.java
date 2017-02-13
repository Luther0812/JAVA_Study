/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_038 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		String result = "";
		String t = "";
		if(number > 0){
			while(Math.abs(number) >= 16){
				int temp = number % 16;
				if(temp >= 10){
					switch (temp){
					case 10:
						t = "A";
						break;
					case 11:
						t = "B";
						break;
					case 12:
						t = "C";
						break;
					case 13:
						t = "D";
						break;
					case 14:
						t = "E";
						break;
					case 15:
						t = "F";
						break;
					}
				}else{
					t = String.valueOf(temp);
				}
				result = t + result;
				number = number / 16;
			}
			result = String.valueOf(number) + result;
		}else{
			while(Math.abs(number) >= 16){
				int temp = number % 16;
				if(temp >= 10){
					switch (temp){
					case 10:
						t = "A";
						break;
					case 11:
						t = "B";
						break;
					case 12:
						t = "C";
						break;
					case 13:
						t = "D";
						break;
					case 14:
						t = "E";
						break;
					case 15:
						t = "F";
						break;
					}
				}else{
					t = String.valueOf(temp);
				}
				result = t + result;
				number = number / 16;
			}
			result = String.valueOf(number) + result;
			result = "-" + result;
		}
		System.out.print("The result is " + result);
	}

}
