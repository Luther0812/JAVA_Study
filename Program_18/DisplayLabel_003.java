/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_18;

/**
 * @author up
 *
 */
import javax.swing.*;

public class DisplayLabel_003 extends JApplet{
	public DisplayLabel_003(){
		add(new JLabel("Great!", JLabel.CENTER));
	}
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Applet is in the frame");
		
		DisplayLabel_003 applet = new DisplayLabel_003();
		frame.add(applet);
		frame.setSize(300, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
