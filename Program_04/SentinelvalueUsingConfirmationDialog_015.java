/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_04;

/**
 * @author LiuYu
 *
 */
import javax.swing.JOptionPane;

public class SentinelvalueUsingConfirmationDialog_015 {
	public static void main(String[] args){
		int sum = 0;
		int option = javax.swing.JOptionPane.YES_OPTION;
		while(option == javax.swing.JOptionPane.YES_OPTION){
			String dataString = javax.swing.JOptionPane.showInputDialog("Enter an int value: ");
			int data = Integer.parseInt(dataString);
			sum += data;
			option = javax.swing.JOptionPane.showConfirmDialog(null, "Continue?");
		}
		javax.swing.JOptionPane.showMessageDialog(null, "The sum is " + sum);
	}

}
