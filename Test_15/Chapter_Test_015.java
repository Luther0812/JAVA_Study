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

public class Chapter_Test_015 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_015 frame = new Chapter_Test_015();
		frame.setTitle("Chapter_Test_015");
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_015(){
		add(new NewPanel_015());
	}

}

class NewPanel_015 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		
		int xCenter = width / 2;
		int yCenter = height / 2;
		int radius = (int)(Math.min(width, height) * 0.4);
		final double pi = Math.PI * 2;
		
		g.setColor(Color.RED);
		g.fillArc(xCenter - radius, yCenter - radius, 2 * radius, 2 * radius, 0, 72);
		g.setColor(Color.BLACK);
		g.drawString("Project -- 20%", xCenter + (int)(Math.cos(pi / 10) * radius * 1.2), yCenter - (int)(Math.sin(pi / 10) * radius * 1.2));
		g.setColor(Color.BLUE);
		g.fillArc(xCenter - radius, yCenter- radius, 2 * radius, 2 * radius, 72, 36);
		g.setColor(Color.BLACK);
		g.drawString("Quzzes -- 10%", xCenter + (int)(Math.cos(pi / 4) * radius * 1.2), yCenter - (int)(Math.sin(pi / 4) * radius * 1.2));
		g.setColor(Color.GREEN);
		g.fillArc(xCenter - radius, yCenter- radius, 2 * radius, 2 * radius, 108, 108);
		g.setColor(Color.BLACK);
		g.drawString("Midterms -- 30%", xCenter + (int)(Math.cos(pi / 2) * radius * 1.2), yCenter - (int)(Math.sin(pi / 2) * radius * 1.2));
		g.setColor(Color.ORANGE);
		g.fillArc(xCenter - radius, yCenter- radius, 2 * radius, 2 * radius, 216, 144);
		g.setColor(Color.BLACK);
		g.drawString("Final -- 40%", xCenter + (int)(Math.cos(pi * 4 / 5) * radius * 1.2), yCenter - (int)(Math.sin(pi * 4 / 5) * radius * 1.2));
	}
}
