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
		add(new NewPanel_012());
	}

}

class NewPanel_012 extends JPanel{
	private int t1 = 0;
	private int t2 = 90;
	private int t3 = 180;
	private int t4 = 270;
	
	public NewPanel_012(){
		Timer timer = new Timer(100, new TimerListener());
		timer.start();
	}
	
	public int getT1(){
		return t1;
	}
	
	public int getT2(){
		return t2;
	}
	
	public int getT3(){
		return t3;
	}
	
	public int getT4(){
		return t4;
	}
	
	public void setT1(int t1){
		this.t1 = t1;
	}
	
	public void setT2(int t2){
		this.t2 = t2;
	}
	
	public void setT3(int t3){
		this.t3 = t3;
	}
	
	public void setT4(int t4){
		this.t4 = t4;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);
		
		int x = xCenter - radius;
		int y = yCenter - radius;
		
		g.fillArc(x, y, 2 * radius, 2 * radius, this.getT1() % 360, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, this.getT2() % 360, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, this.getT3() % 360, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, this.getT4() % 360, 30);
	}
	
	class TimerListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			setT1(getT1() + 60);
			setT2(getT2() + 60);
			setT3(getT3() + 60);
			setT4(getT4() + 60);
			repaint();
		}
	}
}
