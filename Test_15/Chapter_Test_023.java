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

public class Chapter_Test_023 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_023 frame = new Chapter_Test_023();
		frame.setTitle("Chapter_Test_023");
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_023(){
		add(new NewPanel_023());
	}

}

class NewPanel_023 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		
		int xCenter = width / 2;
		int yCenter = height / 2;
		
		int a = (int)(width * 0.5);
		int b = (int)(height * 0.3);
		
		g.drawRect(xCenter - a / 2, yCenter - b / 2, a, b);
		g.drawRect(xCenter - a / 2 - 30, yCenter - b / 2 + 30, a, b);
		g.drawLine(xCenter - a / 2, yCenter - b / 2, xCenter - a / 2 - 30, yCenter - b / 2 + 30);
		g.drawLine(xCenter - a / 2, yCenter - b / 2 + b, xCenter - a / 2 - 30, yCenter - b / 2 + 30 + b);
		g.drawLine(xCenter - a / 2 + a, yCenter - b / 2, xCenter - a / 2 - 30 + a, yCenter - b / 2 + 30);
		g.drawLine(xCenter - a / 2 + a, yCenter - b / 2 + b, xCenter - a / 2 - 30 + a, yCenter - b / 2 + 30 + b);
	}
}
