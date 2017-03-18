/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_15;

/**
 * @author up
 *
 */
import javax.swing.*;
import java.awt.*;

public class Chapter_Test_014 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_014 frame = new Chapter_Test_014();
		frame.setTitle("Chapter_Test_014");
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_014(){
		add(new NewPanel_014());
	}

}

class NewPanel_014 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		g.drawLine((int)(0.04 * width), (int)(0.9 * height), (int)(0.96 * width), (int)(0.9 * height));
		g.setColor(Color.RED);
		g.fillRect((int)(0.04 * width), (int)(0.72 * height), (int)(0.2 * width), (int)(0.18 * height));
		g.drawString("Project -- 20%", (int)(0.04 * width), (int)(0.62 * height));
		g.setColor(Color.BLUE);
		g.fillRect((int)(0.28 * width), (int)(0.81 * height), (int)(0.2 * width), (int)(0.09 * height));
		g.drawString("Quizzes -- 10%", (int)(0.28 * width), (int)(0.71 * height));
		g.setColor(Color.GREEN);
		g.fillRect((int)(0.52 * width), (int)(0.63 * height), (int)(0.2 * width), (int)(0.27 * height));
		g.drawString("Midtems -- 30%", (int)(0.52 * width), (int)(0.53 * height));
		g.setColor(Color.ORANGE);
		g.fillRect((int)(0.76 * width), (int)(0.54 * height), (int)(0.2 * width), (int)(0.36 * height));
		g.drawString("Final -- 40%", (int)(0.76 * width), (int)(0.44 * height));
	}
}
