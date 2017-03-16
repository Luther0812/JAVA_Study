/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_15;

/**
 * @author LiuYu
 *
 */
import javax.swing.*;
import java.awt.*;

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
		add(new NewPanel_010());
	}

}

class NewPanel_010 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		
		int xCenter = width / 2;
		int yCenter = height / 2;
		
		final int a = 80;
		final int b = 50;
		final int c = 30;
		
		g.drawOval(xCenter - a / 2, yCenter - b / 2 - c / 2, a, c);
		g.drawLine(xCenter - a / 2, yCenter - b / 2, xCenter - a / 2, yCenter + b / 2);
		g.drawLine(xCenter + a / 2, yCenter - b / 2, xCenter + a / 2, yCenter + b / 2);
		g.drawArc(xCenter - a / 2, yCenter + b / 2 - c / 2, a, c, 0, -180);
		g.drawArc(xCenter - a / 2, yCenter + b / 2 - c / 2, a, c, 0, 30);
		g.drawArc(xCenter - a / 2, yCenter + b / 2 - c / 2, a, c, 60, 30);
		g.drawArc(xCenter - a / 2, yCenter + b / 2 - c / 2, a, c, 120, 30);
	}
}
