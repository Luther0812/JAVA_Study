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

public class Chapter_Test_015 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_015 frame = new Chapter_Test_015();
		frame.setTitle("Chapter_Test_015");
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_015(){
		add(new NewPanel_015());
	}

}

class NewPanel_015 extends JPanel{
	private int width;
	private int height;
	private int x;
	private int y;
	private Polygon p = new Polygon();
	
	public NewPanel_015(){
		Timer timer = new Timer(100, new TimerListener_015());
		timer.start();
	}
	
	protected void paintComponent(Graphics g){
		setWidth(this.getWidth());
		this.height = this.getHeight();
		this.x = getXNum();
		this.y = height - 30;
		p.reset();
		this.p.addPoint(x + 10, y + 10);
		this.p.addPoint(x + 40, y + 10);
		this.p.addPoint(x + 30, y);
		this.p.addPoint(x + 20, y);
		
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		g.fillOval(x + 10, y + 20, 10, 10);
		g.fillOval(x + 30, y + 20, 10, 10);
		
		g.setColor(Color.RED);
		g.fillRect(x, y + 10, 50, 10);
		
		g.setColor(Color.BLUE);
		g.fillPolygon(p);
	}
	
	public int getXNum(){
		return this.x;
	}
	
	public void setXNum(int x){
		this.x = x;
	}
	
	public int getWidthNum(){
		return this.width;
	}
	
	public void setWidth(int width){
		this.width = width;
	}
	
	class TimerListener_015 implements ActionListener{
		boolean flag = true;
		public void actionPerformed(ActionEvent e){
			if(flag){
				setXNum(getXNum() + 10);
				if((getXNum() + 50) >= getWidthNum()){
					flag = false;
				}
			}else{
				setXNum(getXNum() - 10);
				if(getXNum() == 0){
					flag = true;
				}
			}
			repaint();
		}
	}
}
