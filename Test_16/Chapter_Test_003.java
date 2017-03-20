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

public class Chapter_Test_003 extends JFrame{
	private JButton b1 = new JButton("Left");
	private JButton b2 = new JButton("Right");
	private JButton b3 = new JButton("Up");
	private JButton b4 = new JButton("Down");
	
	NewPanel_003 p1 = new NewPanel_003();
	
	public static void main(String[] args){
		Chapter_Test_003 frame = new Chapter_Test_003();
		frame.setTitle("Chapter_Test_003");
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_003(){
		JPanel p2 = new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		
		ActionListener_003 listener = new ActionListener_003();
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		b4.addActionListener(listener);
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
	}
	
	class ActionListener_003 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == b1){
				p1.left();
			}else if(e.getSource() == b2){
				p1.right();
			}else if(e.getSource() == b3){
				p1.up();
			}else if(e.getSource() == b4){
				p1.down();
			}
		}
	}
	
	class NewPanel_003 extends JPanel{
		private int x = 50;
		private int y = 100;
		private int radius = 10;
		
		public void left(){
			x--;
			repaint();
		}
		
		public void right(){
			x++;
			repaint();
		}
		
		public void up(){
			y--;
			repaint();
		}
		
		public void down(){
			y++;
			repaint();
		}
		
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			g.drawOval(x, y, 2 * radius, 2 * radius);
		}
	}

}
