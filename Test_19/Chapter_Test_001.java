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

public class Chapter_Test_001 {
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("test.txt");
		if(file.exists()){
			System.out.println("File already exists");
			System.exit(0);
		}
		PrintWriter output = new PrintWriter(file);
		for(int i = 0; i < 100; i++){
			int t = (int)(Math.random() * 100);
			output.append(t + " ");
		}
		output.close();
	}

}
