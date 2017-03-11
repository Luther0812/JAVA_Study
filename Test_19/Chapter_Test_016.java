/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_19;

/**
 * @author LiuYu
 *
 */
import java.io.*;

public class Chapter_Test_016 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		File file = new File("test.txt");
		RandomAccessFile input = new RandomAccessFile(file, "r");
		RandomAccessFile output = new RandomAccessFile("t.txt", "rw");
		double length = input.length();
		int count = 0;
		int[] list = new int[128];
		try{
			while(count < length){
				byte t = input.readByte();
				list[(char)t]++;
			}
		}catch(EOFException ex){
			System.out.println("End");
		}
		for(int i = 0; i < list.length; i++){
			System.out.println((i + 1) + " : " + list[i]);
		}
		input.close();
		output.close();
	}

}
