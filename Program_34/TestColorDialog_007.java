/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_34;

/**
 * @author up
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestColorDialog_007 extends JApplet{
	private ColorDialog_006 colorDialog1 = new ColorDialog_006();
	private JButton jbtChangeColor = new JButton("Choose color");
	
	public TestColorDialog_007(){
		setLayout(new java.awt.FlowLayout());
		jbtChangeColor.setText("Change Button Text Color");
		jbtChangeColor.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				colorDialog1.setVisible(true);
				
				if(colorDialog1.getColor() != null){
					jbtChangeColor.setForeground(colorDialog1.getColor());
				}
			}
		});
		add(jbtChangeColor);
	}

}
