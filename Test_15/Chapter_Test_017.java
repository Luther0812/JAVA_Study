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

public class Chapter_Test_017 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_017 frame = new Chapter_Test_017();
		frame.setTitle("Chapter_Test_017");
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_017(){
		add(new NewPanel_017());
	}

}

class NewPanel_017 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		final double pi = Math.PI / 4;
		
		g.drawArc((int)(0.1 * width), (int)(0.8 * height), (int)(0.4 * width), (int)(0.2 * height), 0, 180);
		g.drawLine((int)(0.3 * width), (int)(0.8 * height), (int)(0.3 * width), (int)(0.2 * height));
		g.drawLine((int)(0.3 * width), (int)(0.2 * height), (int)(0.7 * width), (int)(0.2 * height));
		g.drawLine((int)(0.7 * width), (int)(0.2 * height), (int)(0.7 * width), (int)(0.3 * height));
		g.drawOval((int)(0.6 * width), (int)(0.3 * height), (int)(0.2 * width), (int)(0.2 * width));
		g.drawLine((int)(0.7 * width - 0.1 * width * Math.cos(pi)), (int)(0.3 * height + 0.1 * width + 0.1 * width * Math.sin(pi)), (int)(0.7 * width - 0.1 * width * Math.cos(pi) - 0.2 * width), (int)(0.3 * height + 0.1 * width + 0.1 * width * Math.sin(pi) + 0.2 * width));
		g.drawLine((int)(0.7 * width + 0.1 * width * Math.cos(pi)), (int)(0.3 * height + 0.1 * width + 0.1 * width * Math.sin(pi)), (int)(0.7 * width + 0.1 * width * Math.cos(pi) + 0.2 * width), (int)(0.3 * height + 0.1 * width + 0.1 * width * Math.sin(pi) + 0.2 * width));
		g.drawLine((int)(0.7 * width), (int)(0.3 * height + 0.2 * width), (int)(0.7 * width), (int)(0.5 * height + 0.2 * width));
		g.drawLine((int)(0.7 * width), (int)(0.5 * height + 0.2 * width), (int)(0.7 * width - 0.2 * width), (int)(0.5 * height + 0.2 * width + 0.2 * width));
		g.drawLine((int)(0.7 * width), (int)(0.5 * height + 0.2 * width), (int)(0.7 * width + 0.2 * width), (int)(0.5 * height + 0.2 * width + 0.2 * width));
	}
}
