/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_08;

/**
 * @author up
 *
 */
import javax.swing.JFrame;

public class TestFrame_005 {
	public static void main(String[] args){
		JFrame frame1 = new JFrame();
		frame1.setTitle("Windows 1");
		frame1.setSize(200, 150);
		frame1.setLocation(200, 100);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
		
		JFrame frame2 = new JFrame();
		frame2.setTitle("Windows 2");
		frame2.setSize(200, 150);
		frame2.setLocation(410, 100);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);
	}

}
