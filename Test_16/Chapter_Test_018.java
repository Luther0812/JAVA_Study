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

public class Chapter_Test_018 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_018 frame = new Chapter_Test_018();
		frame.setTitle("Chapter_Test_018");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_018(){
		NewPanel_018 p = new NewPanel_018();
		add(p);
		p.setFocusable(true);
	}

}

class NewPanel_018 extends JPanel{
	private int xCenter;
	private int yCenter;
	
	private int xAdd;
	private int yAdd;
	
	public NewPanel_018(){
		addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				switch(e.getKeyCode()){
				case KeyEvent.VK_DOWN:
					setYAdd(getYAdd() + 1);
					break;
				case KeyEvent.VK_UP:
					setYAdd(getYAdd() - 1);
					break;
				case KeyEvent.VK_LEFT:
					setXAdd(getXAdd() - 1);
					break;
				case KeyEvent.VK_RIGHT:
					setXAdd(getXAdd() + 1);
					break;
				}
				
				repaint();
			}
		});
	}
	
	public int getXAdd(){
		return this.xAdd;
	}
	
	public int getYAdd(){
		return this.yAdd;
	}
	
	public void setXAdd(int x){
		this.xAdd = x;
	}
	
	public void setYAdd(int y){
		this.yAdd = y;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		this.xCenter = getWidth() / 2 - 50;
		this.yCenter = getHeight() / 2 - 50;
		
		g.drawOval(xCenter + this.getXAdd(), yCenter + this.getYAdd(), 100, 100);
	}
}
