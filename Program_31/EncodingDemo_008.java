/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_31;

/**
 * @author up
 *
 */
import java.util.*;
import java.io.*;
import javax.swing.*;

public class EncodingDemo_008 {
	public static void main(String[] args) throws IOException, FileNotFoundException{
		PrintWriter output = new PrintWriter("temp.txt", "GB18030");
		output.print("\u6B22\u8FCE welcome \u03b1\u03b2\u03b3");
		output.close();
		
		Scanner input = new Scanner(new File("temp.txt"), "GB18030");
		JOptionPane.showMessageDialog(null, input.nextLine());
	}

}
