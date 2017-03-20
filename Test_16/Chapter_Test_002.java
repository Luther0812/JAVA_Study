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

public class Chapter_Test_002 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_002 frame = new Chapter_Test_002();
		frame.setTitle("Chapter_Test_002");
		frame.setSize(200, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_002(){
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton button = new JButton("Button");
		actionListener_002 listener = new actionListener_002();
		p.add(button);
		add(p);
		button.addComponentListener(listener);
	}
	
	static class actionListener_002 implements ComponentListener{
		public void componentMoved(ComponentEvent e){
			System.out.println("componentMoved");
		}
		
		public void componentResized(ComponentEvent e){
			System.out.println("componentResized");
		}
		
		public void componentShown(ComponentEvent e){
			System.out.println("componentShown");
		}
		
		public void componentHidden(ComponentEvent e){
			System.out.println("componentHidden");
		}
	}

}
