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

public class Chapter_Test_019 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_019 frame = new Chapter_Test_019();
		frame.setTitle("Chapter_Test_019");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_019(){
		NewPanel_019 p = new NewPanel_019();
		add(p);
		p.setFocusable(true);
	}

}

class NewPanel_019 extends JPanel{
	private int xCenter;
	private int yCenter;
	
	private String message = "";
	private int x;
	private int y;
	
	public NewPanel_019(){
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseMoved(MouseEvent e){
				double length = getLength(e.getX(), e.getY(), getXCenter(), getYCenter());
				if(length > 100){
					setMessage("Outer");
					setXNum(e.getX());
					setYNum(e.getY());
				}else{
					setMessage("Inter");
					setXNum(e.getX());
					setYNum(e.getY());
				}
				repaint();
			}
		});
	}
	
	public int getXCenter(){
		return this.xCenter;
	}
	
	public int getYCenter(){
		return this.yCenter;
	}
	
	public int getXNum(){
		return this.x;
	}
	
	public int getYNum(){
		return this.y;
	}
	
	public String getMessage(){
		return this.message;
	}
	
	public void setXCenter(int x){
		this.xCenter = x;
	}
	
	public void setYCenter(int y){
		this.yCenter = y;
	}
	
	public void setXNum(int x){
		this.x = x;
	}
	
	public void setYNum(int y){
		this.y = y;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public double getLength(int x1, int y1, int x2, int y2){
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		this.setXCenter(getWidth() / 2);
		this.setYCenter(getHeight() / 2);
		
		g.drawOval(xCenter - 100, yCenter - 100, 200, 200);
		
		g.drawString(getMessage(), getXNum(), getYNum());
	}
	
}
