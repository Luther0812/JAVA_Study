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

public class Chapter_Test_024 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_024 frame = new Chapter_Test_024();
		frame.setTitle("Chapter_Test_024");
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_024(){
		add(new NewPanel_024());
	}

}

class NewPanel_024 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		int xCenter = width / 2;
		int yCenter = height / 2;
		
		g.drawLine(xCenter - (int)(0.05 * width), (int)(0.2 * height), xCenter - (int)(0.05 * width), (int)(0.3 * height));
		g.drawLine(xCenter + (int)(0.05 * width), (int)(0.2 * height), xCenter + (int)(0.05 * width), (int)(0.3 * height));
		g.drawLine(xCenter - (int)(0.05 * width), (int)(0.3 * height), xCenter - (int)(0.4 * width), (int)(0.65 * height));
		g.drawLine(xCenter + (int)(0.05 * width), (int)(0.3 * height), xCenter + (int)(0.4 * width), (int)(0.65 * height));
		g.drawLine(xCenter - (int)(0.4 * width), (int)(0.65 * height), xCenter - (int)(0.4 * width), (int)(0.85 * height));
		g.drawLine(xCenter + (int)(0.4 * width), (int)(0.65 * height), xCenter + (int)(0.4 * width), (int)(0.85 * height));
		g.drawLine(xCenter - (int)(0.4 * width), (int)(0.85 * height), xCenter + (int)(0.4 * width), (int)(0.85 * height));
		
		g.drawLine(xCenter - (int)(0.3 * width), (int)(0.65 * height), xCenter - (int)(0.3 * width), (int)(0.85 * height));
		g.drawLine(xCenter - (int)(0.2 * width), (int)(0.65 * height), xCenter - (int)(0.2 * width), (int)(0.85 * height));
		g.drawLine(xCenter - (int)(0.1 * width), (int)(0.65 * height), xCenter - (int)(0.1 * width), (int)(0.85 * height));
		g.drawLine(xCenter, (int)(0.65 * height), xCenter, (int)(0.85 * height));
		g.drawLine(xCenter + (int)(0.1 * width), (int)(0.65 * height), xCenter + (int)(0.1 * width), (int)(0.85 * height));
		g.drawLine(xCenter + (int)(0.2 * width), (int)(0.65 * height), xCenter + (int)(0.2 * width), (int)(0.85 * height));
		g.drawLine(xCenter + (int)(0.3 * width), (int)(0.65 * height), xCenter + (int)(0.3 * width), (int)(0.85 * height));
		
		int t = (int)(0.05 * height);
		int start = (int)(0.3 * height);
		int radius = (int)(height * 0.01);
		int[] list = new int[7];
		list[0] = (int)(xCenter);
		list[1] = (int)(xCenter - 0.05 * width);
		list[2] = (int)(xCenter - 0.1 * width);
		list[3] = (int)(xCenter - 0.15 * width);
		list[4] = (int)(xCenter - 0.2 * width);
		list[5] = (int)(xCenter - 0.25 * width);
		list[6] = (int)(xCenter - 0.3 * width);
		for(int i = 1; i <= 7; i++){
			start = start + t;
			for(int j = 0; j < i; j++){
				g.setColor(Color.BLACK);
				g.fillOval(list[i - 1] + (int)(j * 0.1 * width), start, radius, radius);
			}
		}
		
	}
}
