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

public class Chapter_Test_012 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_012 frame = new Chapter_Test_012();
		frame.setTitle("Chapter_Test_012");
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_012(){
		add(new NewPanel_012());
	}

}

class NewPanel_012 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawLine(10, 100, 370, 100);
		g.drawLine(200, 200, 200, 20);
		g.drawLine(370, 100, 365, 95);
		g.drawLine(370, 100, 365, 105);
		g.drawLine(200, 20, 195, 25);
		g.drawLine(200, 20, 205, 25);
		g.drawString("X", 370, 90);
		g.drawString("Y", 210, 20);
		
		Polygon polygon = new Polygon();
		for(int x = -100; x <= 100; x++){
			polygon.addPoint(x + 200, 100 - (int)(50 * Math.sin((x / 100.0) * 2 * Math.PI)));
		}
		
		g.drawPolyline(polygon.xpoints, polygon.ypoints, polygon.npoints);
		g.drawString("-2\u03c0", 100, 110);
		g.drawString("\u03c0", 200, 110);
		g.drawString("2\u03c0", 300, 110);
	}
}
