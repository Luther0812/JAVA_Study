/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_19;

/**
 * @author LiuYu
 *
 */
import java.io.*;

public class Copy_004 {
	public static void main(String[] args) throws IOException{
		if(args.length != 2){
			System.out.println("Usage: java Copy sourceFile targetfile");
			System.exit(0);
		}
		
		File sourceFile = new File(args[0]);
		if(!sourceFile.exists()){
			System.out.println("Source file " + args[0] + " not exist");
			System.exit(0);
		}
		
		File targetFile = new File(args[1]);
		if(targetFile.exists()){
			System.out.println("Target file " + args[1] + " already exists");
			System.exit(0);
		}
		
		BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
		BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));
		
		int r;
		int numberOfBytesCopied = 0;
		while((r = input.read()) != -1){
			output.write((byte)r);
			numberOfBytesCopied++;
		}
		
		input.close();
		output.close();
		
		System.out.println(numberOfBytesCopied + " bytes copied");
	}

}
