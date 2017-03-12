/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_12;

/**
 * @author LiuYu
 *
 */
import javax.swing.*;
import java.awt.*;

public class TestImageIcon_008 {
	public static void main(String[] args){
		TestImageIcon frame = new TestImageIcon();
		frame.setTitle("TestImageIcon");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class TestImageIcon extends JFrame{
	private ImageIcon usIcon = new ImageIcon("us.jpg");
	private ImageIcon myIcon = new ImageIcon("my.jpg");
	private ImageIcon frIcon = new ImageIcon("fr.jpg");
	private ImageIcon ukIcon = new ImageIcon("uk.jpg");
	
	public TestImageIcon(){
		setLayout(new GridLayout(1, 4, 5, 5));
		add(new JLabel(usIcon));
		add(new JLabel(myIcon));
		add(new JLabel(frIcon));
		add(new JLabel(ukIcon));
	}
}
