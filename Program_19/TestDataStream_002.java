/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_19;

/**
 * @author LiuYu
 *
 */
import java.io.*;

public class TestDataStream_002 {
	public static void main(String[] args) throws IOException{
		DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
		output.writeUTF("John");
		output.writeDouble(85.5);
		output.writeUTF("Jim");
		output.writeDouble(185.5);
		output.writeUTF("George");
		output.writeDouble(105.25);
		
		output.close();
		
		DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
		
		System.out.println(input.readUTF() + " " + input.readDouble());
		System.out.println(input.readUTF() + " " + input.readDouble());
		System.out.println(input.readUTF() + " " + input.readDouble());
	}

}