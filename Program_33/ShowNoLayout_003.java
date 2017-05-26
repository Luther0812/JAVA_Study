/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_33;

/**
 * @author up
 *
 */
import java.awt.*;
import javax.swing.*;

public class ShowNoLayout_003 extends JApplet{
	private JButton jbtRed = new JButton("Red");
	private JButton jbtBlue = new JButton("Blue");
	private JButton jbtGreen = new JButton("Green");
	
	public ShowNoLayout_003(){
		jbtRed.setForeground(Color.RED);
		jbtBlue.setForeground(Color.BLUE);
		jbtGreen.setForeground(Color.GREEN);
		
		setLayout(null);
		
		add(jbtRed);
		add(jbtBlue);
		add(jbtGreen);
		
		jbtRed.setBounds(150, 50, 100, 50);
		jbtBlue.setBounds(100, 100, 100, 50);
		jbtGreen.setBounds(200, 100, 100, 50);
	}

}
