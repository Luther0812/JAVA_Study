/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_19;

/**
 * @author LiuYu
 *
 */
import java.io.*;
import java.util.Scanner;

public class Chapter_Test_004 {
	public static void main(String[] args) throws IOException{
		File sourceFile = new File("test.txt");
		File targetFile = new File("target.dat");
		Scanner input = new Scanner(sourceFile);
		DataOutputStream output = new DataOutputStream(new FileOutputStream(targetFile));
		while(input.hasNext()){
			output.writeUTF(input.next());
		}
		input.close();
		output.close();
	}

}
