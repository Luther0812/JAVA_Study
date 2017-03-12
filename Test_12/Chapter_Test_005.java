/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_12;

/**
 * @author LiuYu
 *
 */
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.border.*;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class Chapter_Test_005 {
	public static void main(String[] args){
		JFrame frame = new JFrame("Chapter_Test_005");
		JTextField jf1 = new JTextField("Department of Computer Science");
		JTextField jf2 = new JTextField("School of Computing");
		JTextField jf3 = new JTextField("Armstrong Atlantic State University");
		JTextField jf4 = new JTextField("Tel:(912)921-6440");
		JPanel p = new JPanel(new GridLayout(4, 1, 1, 1));
		Border t = new LineBorder(Color.BLUE, 4);
		jf1.setBorder(t);
		jf2.setBorder(t);
		jf3.setBorder(t);
		jf4.setBorder(t);
		p.add(jf1);
		p.add(jf2);
		p.add(jf3);
		p.add(jf4);
		p.setBorder(new LineBorder(Color.YELLOW, 2));
		frame.add(p);
		frame.setTitle("Chapter_Test_005");
		frame.setSize(200, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
