/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_12;

/**
 * @author LiuYu
 *
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class Chapter_Test_006 {
	public static void main(String[] args){
		JFrame frame = new JFrame("Chapter_Test_006");
		ImageIcon usIcon = new ImageIcon("us.png");
		ImageIcon myIcon = new ImageIcon("my.png");
		ImageIcon frIcon = new ImageIcon("fr.png");
		ImageIcon ukIcon = new ImageIcon("uk.png");
		frame.setLayout(new GridLayout(2, 2, 5, 5));
		Border b = new LineBorder(Color.BLUE, 2);
		JLabel j1 = new JLabel(usIcon);
		j1.setBorder(b);
		JLabel j2 = new JLabel(myIcon);
		j2.setBorder(b);
		JLabel j3 = new JLabel(frIcon);
		j3.setBorder(b);
		JLabel j4 = new JLabel(ukIcon);
		j4.setBorder(b);
		frame.add(j1);
		frame.add(j2);
		frame.add(j3);
		frame.add(j4);
	}

}
