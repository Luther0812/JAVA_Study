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

public class Chapter_Test_012 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_012 frame = new Chapter_Test_012();
		frame.setTitle("Chapter_Test_012");
		frame.setSize(200, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_012(){
		NewPanel_012 p = new NewPanel_012();
		add(p);
		
		p.setFocusable(true);
	}

}

class NewPanel_012 extends JPanel{
	private int x;
	private int y;
	private String str = "";
	
	public NewPanel_012(){
		addMouseMotionListener(new MouseAdapter(){
			public void mouseMoved(MouseEvent e){
				setXNum(e.getX());
				setYNum(e.getY());
			}
		});
		addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				setStr(String.valueOf(e.getKeyChar()));
				repaint();
			}
		});
	}
	
	public int getXNum(){
		return x;
	}
	
	public int getYNum(){
		return y;
	}
	
	public String getStr(){
		return str;
	}
	
	public void setXNum(int x){
		this.x = x;
	}
	
	public void setYNum(int y){
		this.y = y;
	}
	
	public void setStr(String str){
		this.str = str;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawString(str, x, y);
	}
}
