/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_19;

/**
 * @author LiuYu
 *
 */
import java.io.*;

public class TestRandomAccessFile_008 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile inout = new RandomAccessFile("input.dat", "rw");
		inout.setLength(0);
		
		for(int i = 0; i < 200; i++){
			inout.writeInt(i);
		}
		System.out.println("Current file length is " + inout.length());
		
		inout.seek(0);
		System.out.println("The first numnber is " + inout.readInt());
		inout.seek(1 * 4);
		System.out.println("The second number is " + inout.readInt());
		inout.seek(9 * 4);
		System.out.println("The tenth number is " + inout.readInt());
		inout.writeInt(555);
		inout.seek(inout.length());
		inout.writeInt(999);
		System.out.println("The new length is " + inout.length());
		inout.seek(10 * 4);
		System.out.println("The eleventh number is " + inout.readInt());
		inout.close();
	}

}
