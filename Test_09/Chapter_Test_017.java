/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author up
 *
 */
import javax.swing.JFileChooser;
import java.util.Scanner;

public class Chapter_Test_017 {
	public static void main(String[] args) throws Exception{
		JFileChooser fileChooser = new JFileChooser();
		if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
			java.io.File file = fileChooser.getSelectedFile();
			Scanner input = new Scanner(file);
			int numCharacter = 0;
			int numWords = 0;
			int numLines = 0;
			while(input.hasNext()){
				String temp = input.next();
				numWords++;
			}
			Scanner input1 = new Scanner(file);
			while(input1.hasNext()){
				String temp = input1.nextLine();
				numLines++;
			}
			Scanner input2 = new Scanner(file);
			while(input2.hasNext()){
				String temp = input2.next();
				numCharacter = numCharacter + temp.length();
			}
			System.out.println(numCharacter + " Characters");
			System.out.println(numWords + " Words");
			System.out.println(numLines + " Lines");
			input.close();
		}else{
			System.out.println("No file selected");
		}
	}

}
