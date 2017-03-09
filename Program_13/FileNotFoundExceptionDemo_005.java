/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_13;

/**
 * @author up
 *
 */
import java.util.Scanner;
import java.io.*;

public class FileNotFoundExceptionDemo_005{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a file name: ");
		String filename = input.nextLine();
		
		try{
			Scanner inputFromFile = new Scanner(new File(filename));
			System.out.println("File " + filename + " exists ");
		}catch(FileNotFoundException ex){
			System.out.println("Exception: " + filename + " not found");
		}
	}

}
