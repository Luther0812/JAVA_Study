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

public class Chapter_Test_020 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_020 frame = new Chapter_Test_020();
		frame.setTitle("Chapter_Test_020");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_020(){
		add(new NewPanel_020());
	}

}

class NewPanel_020 extends JPanel{
	private String message = "";
	private int x;
	private int y;
	
	public NewPanel_020(){
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseMoved(MouseEvent e){
				boolean flag = isContain(e.getX(), e.getY());
				if(flag){
					setMessage("Inter");
					setXNum(e.getX());
					setYNum(e.getY());
				}else{
					setMessage("Outer");
					setXNum(e.getX());
					setYNum(e.getY());
				}
				repaint();
			}
		});
	}
	
	public boolean isContain(int x, int y){
		double a = Math.abs(x - 100);
		double b = Math.abs(y - 60);
		if(a < 50 && b < 20){
			return true;
		}else{
			return false;
		}
	}
	
	public String getMessage(){
		return this.message;
	}
	
	public int getXNum(){
		return this.x;
	}
	
	public int getYNum(){
		return this.y;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public void setXNum(int x){
		this.x = x;
	}
	
	public void setYNum(int y){
		this.y = y;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawRect(50, 40, 100, 40);
		g.drawString(message, x, y);
	}
}
