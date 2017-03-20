/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_16;

/**
 * @author LiuYu
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chapter_Test_001 extends JFrame{
	public static void main(String[] args){
		FlowLayout_001 frame = new FlowLayout_001();
		frame.setTitle("Chapter_Test_001");
		frame.setSize(600, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class FlowLayout_001 extends JFrame{
	public FlowLayout_001(){
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JButton jbtButton1 = new JButton("Button1");
		JButton jbtButton2 = new JButton("Button2");
		JButton jbtButton3 = new JButton("Button3");
		JButton jbtButton4 = new JButton("Button4");
		JButton jbtButton5 = new JButton("Button5");
		JButton jbtButton6 = new JButton("Button6");
		
		class actionListener_001 implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == jbtButton1){
					System.out.println("jbtButton1");
				}else if(e.getSource() == jbtButton2){
					System.out.println("jbtButton2");
				}else if(e.getSource() == jbtButton3){
					System.out.println("jbtButton3");
				}else if(e.getSource() == jbtButton4){
					System.out.println("jbtButton4");
				}else if(e.getSource() == jbtButton5){
					System.out.println("jbtButton5");
				}else if(e.getSource() == jbtButton6){
					System.out.println("jbtButton6");
				}
			}
		}
		
		actionListener_001 listener = new actionListener_001();
		
		jbtButton1.addActionListener(listener);
		jbtButton2.addActionListener(listener);
		jbtButton3.addActionListener(listener);
		jbtButton4.addActionListener(listener);
		jbtButton5.addActionListener(listener);
		jbtButton6.addActionListener(listener);
		
		p1.add(jbtButton1);
		p1.add(jbtButton2);
		p1.add(jbtButton3);
		
		p2.add(jbtButton4);
		p2.add(jbtButton5);
		p2.add(jbtButton6);
		
		add(p1);
		add(p2);
	}
}
