/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_16;

/**
 * @author up
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chapter_Test_009 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_009 frame = new Chapter_Test_009();
		frame.setSize(200, 300);
		frame.setTitle("Chapter_Test_009");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_009(){
		add(new NewPanel_009());
	}

}

class NewPanel_009 extends JPanel{
	private int x = getWidth() / 2;
	private int y = getHeight() / 2;
	private int xAdd = 0;
	private int yAdd = 0;
	
	public NewPanel_009(){
		addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				switch(e.getKeyCode()){
				case KeyEvent.VK_UP:
					x = x + xAdd;
					y = y + yAdd;
					yAdd--;
					break;
				case KeyEvent.VK_DOWN:
					yAdd++;
					break;
				case KeyEvent.VK_LEFT:
					xAdd--;
					break;
				case KeyEvent.VK_RIGHT:
					xAdd++;
					break;
				}
				
				repaint();
			}
		});
	}
	
//	public int setXAdd(){
//		xAdd = xAdd + num;
//	}
//	
//	public int setYAdd(){
//		yAdd = yAdd + num;
//	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawLine(x, y, x + xAdd, y + yAdd);
	}
}
