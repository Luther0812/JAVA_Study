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

public class Chapter_Test_008 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_008 frame = new Chapter_Test_008();
		frame.setTitle("Chapter_Test_008");
		frame.setSize(200, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_008(){
		add(new NewPanel_008());
	}

}

class NewPanel_008 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Polygon polygon = new Polygon();
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);
		final double PI = Math.PI;
		polygon.addPoint(xCenter + radius, yCenter);
		polygon.addPoint(xCenter + (int)(radius * Math.cos(PI / 4)), yCenter + (int)(radius * Math.sin(PI / 4)));
		polygon.addPoint(xCenter, yCenter + radius);
		polygon.addPoint(xCenter - (int)(radius * Math.cos(PI / 4)), yCenter + (int)(radius * Math.sin(PI / 4)));
		polygon.addPoint(xCenter - radius, yCenter);
		polygon.addPoint(xCenter - (int)(radius * Math.cos(PI / 4)), yCenter - (int)(radius * Math.sin(PI / 4)));
		polygon.addPoint(xCenter, yCenter - radius);
		polygon.addPoint(xCenter + (int)(radius * Math.cos(PI / 4)), yCenter - (int)(radius * Math.sin(PI / 4)));
		g.drawPolygon(polygon);
	}
}
