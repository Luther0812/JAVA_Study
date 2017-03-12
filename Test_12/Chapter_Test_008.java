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

public class Chapter_Test_008 {
	public static void main(String[] args){
		Test frame = new Test();
		frame.setTitle("Chapter_Test_008");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class Test extends JFrame{
	public Test(){
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2, 3, 2, 2));
		Border b = new LineBorder(Color.YELLOW, 2);
		Font largeFont = new Font("TimesRoman", Font.BOLD, 20);
		JLabel jBlack = new JLabel("Black");
		JLabel jBlue = new JLabel("Blue");
		JLabel jCyan = new JLabel("Cyan");
		JLabel jGreen = new JLabel("Green");
		JLabel jMagenta = new JLabel("Magenta");
		JLabel jOrange = new JLabel("Orange");
		jBlack.setBackground(Color.WHITE);
		jBlack.setForeground(Color.BLACK);
		jBlue.setBackground(Color.WHITE);
		jBlue.setForeground(Color.BLUE);
		jCyan.setBackground(Color.WHITE);
		jCyan.setForeground(Color.CYAN);
		jGreen.setBackground(Color.WHITE);
		jGreen.setForeground(Color.GREEN);
		jMagenta.setBackground(Color.WHITE);
		jMagenta.setForeground(Color.MAGENTA);
		jOrange.setBackground(Color.WHITE);
		jOrange.setForeground(Color.ORANGE);
		jBlack.setToolTipText("Black");
		jBlue.setToolTipText("Blue");
		jCyan.setToolTipText("Cyan");
		jGreen.setToolTipText("Green");
		jMagenta.setToolTipText("Magenta");
		jOrange.setToolTipText("Orange");
		jBlack.setBorder(b);
		jBlue.setBorder(b);
		jCyan.setBorder(b);
		jGreen.setBorder(b);
		jMagenta.setBorder(b);
		jOrange.setBorder(b);
		p.add(jBlack);
		p.add(jBlue);
		p.add(jCyan);
		p.add(jGreen);
		p.add(jMagenta);
		p.add(jOrange);
		add(p);
	}
}
