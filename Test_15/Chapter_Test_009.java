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

public class Chapter_Test_009 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_009 frame = new Chapter_Test_009();
		frame.setTitle("Chapter_Test_009");
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_009(){
		setLayout(new GridLayout(2, 2));
		add(new NewPanel_009());
		add(new NewPanel_009());
		add(new NewPanel_009());
		add(new NewPanel_009());
	}

}

class NewPanel_009 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)(getWidth() * 0.3);
		int x = xCenter - radius;
		int y = yCenter - radius;
		final double pi = Math.PI;
		
		g.fillArc(x, y, 2 * radius, 2 * radius, 0, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 90, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 180, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 270, 30);
		
		g.drawOval(x - 5, y - 5, (int)(radius * 2) + 10, (int)(radius * 2) + 10);
	}
}
