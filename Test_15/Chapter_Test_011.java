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

public class Chapter_Test_011 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_011 frame = new Chapter_Test_011();
		frame.setTitle("Chapter_Test_011");
		frame.setSize(200, 350);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_011(){
		add(new NewPanel_011());
	}

}

class NewPanel_011 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		int xCenter = width / 2;
		int yCenter = 300;
		final double pi = Math.PI;
		double scaleFactor = 0.1;
		
		g.drawLine(xCenter - 80, yCenter, xCenter + 80, yCenter);
		g.drawLine(xCenter, yCenter + 50, xCenter, yCenter - 250);
		g.drawLine(xCenter + 80, yCenter, xCenter + 80 - (int)(10 * Math.cos(pi / 4)), yCenter - (int)(10 * Math.sin(pi / 4)));
		g.drawLine(xCenter + 80, yCenter, xCenter + 80 - (int)(10 * Math.cos(pi / 4)), yCenter + (int)(10 * Math.sin(pi / 4)));
		g.drawLine(xCenter, yCenter - 250, xCenter - (int)(10 * Math.cos(pi / 4)), yCenter - 250 + (int)(10 * Math.sin(pi / 4)));
		g.drawLine(xCenter, yCenter - 250, xCenter + (int)(10 * Math.cos(pi / 4)), yCenter - 250 + (int)(10 * Math.sin(pi / 4)));
		
		g.drawString("X", xCenter + 80, yCenter - 10);
		g.drawString("Y", xCenter + 10, yCenter - 250);
		
		Polygon polygon = new Polygon();
		for(int x = -50; x <= 50; x++){
			polygon.addPoint(x + xCenter, yCenter - (int)(scaleFactor * x * x));
		}
		
		g.drawPolyline(polygon.xpoints, polygon.ypoints, polygon.npoints);
	}
}
