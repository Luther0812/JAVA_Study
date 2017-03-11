/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_19;

/**
 * @author LiuYu
 *
 */
import java.io.*;

public class Chapter_Test_015 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		RandomAccessFile output = new RandomAccessFile("c.txt", "rw");
		RandomAccessFile input = new RandomAccessFile("t.txt", "r");
		double length = input.length();
		int count = 0;
		try{
			while(count < length){
				output.writeChar(input.readChar() - 5);
				count++;
			}
		}catch(EOFException ex){
			System.out.println("Encode end");
		}
	}

}
