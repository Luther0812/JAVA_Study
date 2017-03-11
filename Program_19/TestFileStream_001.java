/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_19;

/**
 * @author LiuYu
 *
 */
import java.io.*;

public class TestFileStream_001 {
	public static void main(String[] args) throws IOException{
		FileOutputStream output = new FileOutputStream("temp.dat");
		
		for(int i = 1; i <= 10; i++){
			output.write(i);
		}
		
		output.close();
		
		FileInputStream input = new FileInputStream("temp.dat");
		
		int value;
		while((value = input.read()) != -1){
			System.out.print(value + " ");
		}
		
		input.close();
	}

}
