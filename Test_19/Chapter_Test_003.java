/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_19;

/**
 * @author LiuYu
 *
 */
import java.io.*;

public class Chapter_Test_003 {
	public static void main(String[] args) throws IOException{
		File file = new File("test.dat");
		int num = 0;
		FileInputStream input = new FileInputStream(file);
		int value;
		while((value = input.read()) != -1){
			num += input.read();
		}
		input.close();
		System.out.println("The sum is " + num);
	}

}
