/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_16;

import java.awt.Graphics;
/**
 * @author up
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoveMessageDemo_009 extends JFrame{
	public MoveMessageDemo_009(){
		MovableMessagePanel p = new MovableMessagePanel("Welcome to Java");
		
		setLayout(new BorderLayout());
		add(p);
	}
	
	public static void main(String[] args){
		MoveMessageDemo_009 frame = new MoveMessageDemo_009();
		frame.setTitle("MoveMessageDemo_009");
		frame.setSize(200, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	static class MovableMessagePanel extends JPanel{
		private String message = "Welcome to Java";
		private int x = 20;
		private int y = 20;
		
		public MovableMessagePanel(String s){
			this.message = s;
			addMouseMotionListener(new MouseMotionAdapter(){
				public void mouseDragged(MouseEvent e){
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}
		
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			g.drawString(message, x, y);
		}
		
	}

}
