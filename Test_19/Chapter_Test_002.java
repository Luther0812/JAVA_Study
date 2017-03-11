/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_19;

/**
 * @author LiuYu
 *
 */
import java.io.*;

public class Chapter_Test_002 {
	public static void main(String[] args) throws IOException{
		File file = new File("test.dat");
		if(file.exists()){
			System.out.println("The file already exists");
			System.exit(0);
		}
		FileOutputStream output = new FileOutputStream(file);
		for(int i = 0; i < 100; i++){
			output.write(i);
		}
		output.close();
		
	}

}
