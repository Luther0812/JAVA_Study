/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_12;

/**
 * @author LiuYu
 *
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class Chapter_Test_004 {
	public static void main(String[] args){
		JFrame frame = new JFrame("Chapter_Test_004");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 5 ,5));
		frame.add(new FlowLayout_004());
		frame.add(new FlowLayout_004());
		frame.setTitle("Chapter_Test_004");
		frame.setSize(600, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class FlowLayout_004 extends JPanel{
	public FlowLayout_004(){
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JButton jbtButton1 = new JButton("Button1");
		JButton jbtButton2 = new JButton("Button2");
		JButton jbtButton3 = new JButton("Button3");
		p1.add(jbtButton1);
		p1.add(jbtButton2);
		p1.add(jbtButton3);
		
		add(p1);
	}
}
