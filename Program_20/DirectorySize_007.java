/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_20;

/**
 * @author up
 *
 */
import java.io.File;
import java.util.Scanner;

public class DirectorySize_007 {
	public static void main(String[] args){
		System.out.print("Enter a directory or a file: ");
		Scanner input = new Scanner(System.in);
		String directory = input.nextLine();
		System.out.println(getSize(new File(directory)) + " bytes");
	}
	
	public static long getSize(File file){
		long size = 0;
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for(int i = 0; i < files.length; i++){
				size += getSize(files[i]);
			}
		}else{
			size += file.length();
		}
		return size;
	}

}
