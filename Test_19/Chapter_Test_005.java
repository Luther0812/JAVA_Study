/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_19;

/**
 * @author LiuYu
 *
 */
import java.io.*;

public class Chapter_Test_005 {
	public static void main(String[] args) throws ClassNotFoundException, IOException{
		File file = new File("test.dat");
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
		int[] intObject = {1, 2, 3, 4, 5};
		java.util.Date date = new java.util.Date();
		double doubleObject = 5.5;
		output.writeObject(intObject);
		output.writeObject(date);
		output.writeObject(doubleObject);
		output.close();
	}

}
