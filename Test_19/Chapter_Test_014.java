/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_19;

/**
 * @author LiuYu
 *
 */
import java.io.*;

public class Chapter_Test_014 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		File file = new File("test.txt");
		RandomAccessFile input = new RandomAccessFile(file, "r");
		RandomAccessFile output = new RandomAccessFile("t.txt", "rw");
		double length = input.length();
		int count = 0;
		try{
			while(count < length){
				output.writeChar(input.readChar() + 5);
				count++;
			}
		}catch(EOFException ex){
			System.out.println("The end");
		}
		input.close();
		output.close();
	}

}
