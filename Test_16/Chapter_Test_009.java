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
import java.util.ArrayList;

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
		NewPanel_009 p = new NewPanel_009();
		add(p);
		p.setFocusable(true);
	}

}

class NewPanel_009 extends JPanel{	
	private ArrayList xPoints = new ArrayList();
	private ArrayList yPoints = new ArrayList();
	private int number = 0;
	
	public NewPanel_009(){
		this.xPoints.add("100");
		this.xPoints.add("100");
		this.yPoints.add("150");
		this.yPoints.add("150");
		number += 2;
		addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				switch(e.getKeyCode()){
				case KeyEvent.VK_UP:
					setUp();
					break;
				case KeyEvent.VK_DOWN:
					setDown();
					break;
				case KeyEvent.VK_LEFT:
					setLeft();
					break;
				case KeyEvent.VK_RIGHT:
					setRight();
					break;
				}
				
				repaint();
			}
		});
	}
	
	public void setUp(){
		this.xPoints.add(this.xPoints.get(number - 1));
		this.yPoints.add(Integer.parseInt(this.yPoints.get(number - 1).toString()) - 1 + "");
		number++;
	}
	
	public void setDown(){
		this.xPoints.add(this.xPoints.get(number - 1));
		this.yPoints.add(Integer.parseInt(this.yPoints.get(number - 1).toString()) + 1 + "");
		number++;
	}
	
	public void setLeft(){
		this.xPoints.add(Integer.parseInt(this.xPoints.get(number - 1).toString()) - 1 + "");
		this.yPoints.add(this.yPoints.get(number - 1));
		number++;
	}
	
	public void setRight(){
		this.xPoints.add(Integer.parseInt(this.xPoints.get(number - 1).toString()) + 1 + "");
		this.yPoints.add(this.yPoints.get(number - 1));
		number++;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		int[] x = new int[number];
		int[] y = new int[number];
		
		for(int i = 0; i < number; i++){
			x[i] = Integer.parseInt(xPoints.get(i).toString());
			y[i] = Integer.parseInt(yPoints.get(i).toString());
		}
		g.drawPolyline(x, y, number);
	}
}
