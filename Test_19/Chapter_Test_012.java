/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_19;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;
import java.io.*;

public class Chapter_Test_012 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number need merge: ");
		int number = in.nextInt();
		RandomAccessFile output = new RandomAccessFile("output.txt", "rw");
		for(int i = 0; i < number; i++){
			String title = "SourceFile." + (i + 1) + ".txt";
			RandomAccessFile input = new RandomAccessFile(title, "r");
			output.seek(output.length());
			char value;
			double length = input.length();
			int count = 0;
			try{
				while(count < length){
					output.writeChar(input.readChar());
					count++;
				}
			}catch(EOFException ex){
				
			}
		}
	}

}
