/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author up
 *
 */
import java.util.Scanner;
import javax.swing.JFileChooser;

public class Chapter_Test_016 {
	public static void main(String[] args) throws Exception{
		JFileChooser fileChooser = new JFileChooser();
		if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
			java.io.File file = fileChooser.getSelectedFile();
			Scanner input = new Scanner(file);
			java.io.PrintWriter output = new java.io.PrintWriter("out.java");
			while(input.hasNext()){
				String temp1 = input.nextLine();
				if(input.hasNext()){
					String temp2 = input.nextLine();
					if(temp2.lastIndexOf("{") == temp2.length() - 1){
						output.print(temp1);
						output.println(temp2);
					}else{
						output.println(temp1);
						output.println(temp2);
					}
				}else{
					output.println(temp1);
				}
			}
			
			input.close();
			output.close();
		}else{
			System.out.println("No file selected");
		}
	}

}
