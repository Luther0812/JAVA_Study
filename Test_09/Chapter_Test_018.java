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

public class Chapter_Test_018 {
	public static void main(String[] args) throws Exception{
		JFileChooser fileChooser = new JFileChooser();
		if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
			java.io.File file = fileChooser.getSelectedFile();
			Scanner input = new Scanner(file);
			int count = 0;
			double sum = 0;
			while(input.hasNext()){
				String temp = input.next();
				sum += Double.valueOf(temp);
				count++;
			}
			System.out.println("The total is " + sum);
			System.out.println("The average is " + sum / count);
		}else{
			System.out.println("No file selected");
		}
	}

}
