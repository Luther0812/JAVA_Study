/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_15;

/**
 * @author LiuYu
 *
 */
import java.awt.*;
import javax.swing.*;

public class Chapter_Test_028 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_028 frame = new Chapter_Test_028();
		frame.setTitle("Chapter_Test_028");
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		System.out.println("The code need ActionListener");
	}
	
	public Chapter_Test_028(){
		add(new NewPanel_028());
	}

}

class NewPanel_028 extends JPanel{
//	private int x1;
//	private int y1;
//	private int x2;
//	private int y2;
//	
//	public NewPanel_028(int x1, int y1, int x2, int y2){
//		this.x1 = x1;
//		this.y1 = y1;
//		this.x2 = x2;
//		this.y2 = y2;
//	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		int x1 = (int)(Math.random() * 100);
		int y1 = (int)(Math.random() * 100);
		int x2 = (int)(Math.random() * 100);
		int y2 = (int)(Math.random() * 100);
		drawArrowLine(x1, y1, x2, y2, g);
	}
	
	public static void drawArrowLine(int x1, int y1, int x2, int y2, Graphics g){
		g.drawLine(x1, y1, x2, y2);
	}
}
