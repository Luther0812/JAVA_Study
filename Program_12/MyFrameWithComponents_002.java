/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_12;

/**
 * @author LiuYu
 *
 */
import javax.swing.*;

public class MyFrameWithComponents_002 {
	public static void main(String[] args){
		JFrame frame = new JFrame("MyFrameWithComponents");
		JButton jbtOK = new JButton("Ok");
		frame.add(jbtOK);
		
		frame.setSize(400,  300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
