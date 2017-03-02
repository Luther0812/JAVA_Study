/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_020 {
	public static void main(String[] args) throws Exception{
		java.io.File file = new java.io.File("Data.txt");
		Scanner inputLine = new Scanner(file);
		int lines = 0;
		while(inputLine.hasNextLine()){
			String t = inputLine.nextLine();
			lines++;
		}
		inputLine.close();
		Scanner input = new Scanner(file);		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter oldString: ");
		String oldString = in.nextLine();
		System.out.print("Enter newString: ");
		String newString = in.nextLine();
		String[] s = new String[lines];
		int count = 0;
		while(input.hasNextLine()){
			String temp = input.nextLine();
			for(int i = 0; i <= temp.length() - oldString.length(); i++){
				if(temp.substring(i, i + oldString.length()).equals(oldString.substring(0, oldString.length()))){
					temp = temp.substring(i, i + oldString.length()).replace(oldString, newString);
				}
			}
			s[count] = temp;
			count++;
		}
		input.close();
		
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		for(int i = 0; i < s.length; i++){
			output.println(s[i]);
		}
		output.close();
		
		
	}

}
