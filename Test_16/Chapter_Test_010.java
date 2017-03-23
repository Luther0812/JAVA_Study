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

public class Chapter_Test_010 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_010 frame = new Chapter_Test_010();
		frame.setTitle("Chapter_Test_010");
		frame.setSize(200, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_010(){
		NewPanel_010 p = new NewPanel_010();
		add(p);
		
		p.setFocusable(true);
	}

}

class NewPanel_010 extends JPanel{
	private String message = "";
	
	public NewPanel_010(){
		addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				int code = e.getKeyCode();
				char key = e.getKeyChar();
				repaint();
				if(code == 10){
					message = "";
				}else{
					message = message + String.valueOf(key);
				}
			}
		});
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawString(message, getWidth() / 2, getHeight() / 2);
	}
}
