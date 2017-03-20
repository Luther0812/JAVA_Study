/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_16;

/**
 * @author up
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventDemo_010 extends JFrame{
	private KeyboardPanel keyboardPanel = new KeyboardPanel();
	
	public KeyEventDemo_010(){
		add(keyboardPanel);
		
		keyboardPanel.setFocusable(true);
	}
	
	public static void main(String[] args){
		KeyEventDemo_010 frame = new KeyEventDemo_010();
		frame.setTitle("KeyEventDemo_010");
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	static class KeyboardPanel extends JPanel{
		private int x = 100;
		private int y = 100;
		private char keyChar = 'A';
		
		public KeyboardPanel(){
			addKeyListener(new KeyAdapter(){
				public void keyPressed(KeyEvent e){
					switch(e.getKeyCode()){
					case KeyEvent.VK_DOWN: 
						y += 10;
						break;
					case KeyEvent.VK_UP: 
						y -= 10;
						break;
					case KeyEvent.VK_LEFT: 
						x -= 10;
						break;
					case KeyEvent.VK_RIGHT: 
						x += 10;
						break;
					default: 
						keyChar = e.getKeyChar();
						break;
					}
					
					repaint();
				}
			});
		}
		
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
			g.drawString(String.valueOf(keyChar), x, y);
		}
	}
}
