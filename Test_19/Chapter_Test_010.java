/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_19;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;
import java.io.*;

public class Chapter_Test_010 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int pieces = in.nextInt();
		File file = new File("test.txt");
		if(!file.exists()){
			System.out.println("The file does not exists");
			System.exit(0);
		}
		
		RandomAccessFile input = new RandomAccessFile(file, "r");
		double length = input.length();
		double part = length / pieces;
		for(int i = 0; i < pieces; i++){
			String title = "SourceFile." + (i + 1) + ".txt";
			RandomAccessFile output = new RandomAccessFile(title, "rw");
			input.seek((long)(i * part));
			if(i < pieces - 1){
				int count = 0;
				while(count < part){
					output.writeChar(input.readChar());
					count++;
				}
			}else{
				try{
					int count = 0;
					while(count < length - (pieces - 1) * part){
						output.writeChar(input.readChar());
						count++;
					}
				}catch(EOFException ex){
					System.out.println("The end");
				}
			}
		}
	}

}
