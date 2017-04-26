/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_17;

/**
 * @author up
 * 
 */
import javax.swing.*;

public class TestButtonIcons_001 extends JFrame{
	public static void main(String[] args){
		JFrame frame = new TestButtonIcons_001();
		frame.setTitle("ButtonIcons");
		frame.setSize(200, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public TestButtonIcons_001(){
		ImageIcon usIcon = new ImageIcon("image/usIcon.gif");
		ImageIcon caIcon = new ImageIcon("image/caIcon.gif");
		ImageIcon ukIcon = new ImageIcon("image/ukIcon.gif");
		
		JButton jbt = new JButton("Click it", usIcon);
		jbt.setPressedIcon(caIcon);
		jbt.setRolloverIcon(ukIcon);
		
		add(jbt);
	}

}
