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

public class Chapter_Test_008 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		File file = new File("count.dat");
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
		int number = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = in.nextInt();
		output.writeObject(number);
		output.close();
		int value;
		try{
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
			while(true){
				System.out.println(input.readObject());
			}
		}catch(EOFException ex){
			System.out.println("The data have already printed");
		}
	}

}
