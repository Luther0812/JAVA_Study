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

public class Chapter_Test_025 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_025 frame = new Chapter_Test_025();
		frame.setTitle("Chapter_Test_025");
		frame.setSize(600, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_025(){
		setLayout(new GridLayout(1, 6));
		add(new RegularPolygonPanel(5));
		add(new RegularPolygonPanel(6));
		add(new RegularPolygonPanel(7));
		add(new RegularPolygonPanel(8));
		add(new RegularPolygonPanel(9));
		add(new RegularPolygonPanel(10));
	}

}

class RegularPolygonPanel extends JPanel{
	private int numberOfSide;
	
	public RegularPolygonPanel(){
		
	}
	
	public RegularPolygonPanel(int num){
		this.numberOfSide = num;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		int xCenter = width / 2;
		int yCenter = height / 2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);
		
		Polygon polygon = new Polygon();
		
		switch (this.numberOfSide){
		case 5:
			polygon.addPoint(xCenter + radius, yCenter);
			polygon.addPoint((int)(xCenter + radius * (Math.cos(2 * Math.PI / 5))), (int)(yCenter - radius * (Math.sin(2 * Math.PI / 5))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(2 * 2 * Math.PI / 5))), (int)(yCenter - radius * (Math.sin(2 * 2 * Math.PI / 5))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(3 * 2 * Math.PI / 5))), (int)(yCenter - radius * (Math.sin(3 * 2 * Math.PI / 5))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(4 * 2 * Math.PI / 5))), (int)(yCenter - radius * (Math.sin(4 * 2 * Math.PI / 5))));
			g.drawPolygon(polygon);
			break;
		case 6:
			polygon.addPoint(xCenter + radius, yCenter);
			polygon.addPoint((int)(xCenter + radius * (Math.cos(2 * Math.PI / 6))), (int)(yCenter - radius * (Math.sin(2 * Math.PI / 6))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(2 * 2 * Math.PI / 6))), (int)(yCenter - radius * (Math.sin(2 * 2 * Math.PI / 6))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(3 * 2 * Math.PI / 6))), (int)(yCenter - radius * (Math.sin(3 * 2 * Math.PI / 6))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(4 * 2 * Math.PI / 6))), (int)(yCenter - radius * (Math.sin(4 * 2 * Math.PI / 6))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(5 * 2 * Math.PI / 6))), (int)(yCenter - radius * (Math.sin(5 * 2 * Math.PI / 6))));
			g.drawPolygon(polygon);
			break;
		case 7:
			polygon.addPoint(xCenter + radius, yCenter);
			polygon.addPoint((int)(xCenter + radius * (Math.cos(2 * Math.PI / 7))), (int)(yCenter - radius * (Math.sin(2 * Math.PI / 7))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(2 * 2 * Math.PI / 7))), (int)(yCenter - radius * (Math.sin(2 * 2 * Math.PI / 7))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(3 * 2 * Math.PI / 7))), (int)(yCenter - radius * (Math.sin(3 * 2 * Math.PI / 7))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(4 * 2 * Math.PI / 7))), (int)(yCenter - radius * (Math.sin(4 * 2 * Math.PI / 7))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(5 * 2 * Math.PI / 7))), (int)(yCenter - radius * (Math.sin(5 * 2 * Math.PI / 7))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(6 * 2 * Math.PI / 7))), (int)(yCenter - radius * (Math.sin(6 * 2 * Math.PI / 7))));
			g.drawPolygon(polygon);
			break;
		case 8:
			polygon.addPoint(xCenter + radius, yCenter);
			polygon.addPoint((int)(xCenter + radius * (Math.cos(2 * Math.PI / 8))), (int)(yCenter - radius * (Math.sin(2 * Math.PI / 8))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(2 * 2 * Math.PI / 8))), (int)(yCenter - radius * (Math.sin(2 * 2 * Math.PI / 8))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(3 * 2 * Math.PI / 8))), (int)(yCenter - radius * (Math.sin(3 * 2 * Math.PI / 8))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(4 * 2 * Math.PI / 8))), (int)(yCenter - radius * (Math.sin(4 * 2 * Math.PI / 8))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(5 * 2 * Math.PI / 8))), (int)(yCenter - radius * (Math.sin(5 * 2 * Math.PI / 8))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(6 * 2 * Math.PI / 8))), (int)(yCenter - radius * (Math.sin(6 * 2 * Math.PI / 8))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(7 * 2 * Math.PI / 8))), (int)(yCenter - radius * (Math.sin(7 * 2 * Math.PI / 8))));
			g.drawPolygon(polygon);
			break;
		case 9:
			polygon.addPoint(xCenter + radius, yCenter);
			polygon.addPoint((int)(xCenter + radius * (Math.cos(2 * Math.PI / 9))), (int)(yCenter - radius * (Math.sin(2 * Math.PI / 9))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(2 * 2 * Math.PI / 9))), (int)(yCenter - radius * (Math.sin(2 * 2 * Math.PI / 9))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(3 * 2 * Math.PI / 9))), (int)(yCenter - radius * (Math.sin(3 * 2 * Math.PI / 9))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(4 * 2 * Math.PI / 9))), (int)(yCenter - radius * (Math.sin(4 * 2 * Math.PI / 9))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(5 * 2 * Math.PI / 9))), (int)(yCenter - radius * (Math.sin(5 * 2 * Math.PI / 9))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(6 * 2 * Math.PI / 9))), (int)(yCenter - radius * (Math.sin(6 * 2 * Math.PI / 9))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(7 * 2 * Math.PI / 9))), (int)(yCenter - radius * (Math.sin(7 * 2 * Math.PI / 9))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(8 * 2 * Math.PI / 9))), (int)(yCenter - radius * (Math.sin(8 * 2 * Math.PI / 9))));
			g.drawPolygon(polygon);
			break;
		case 10:
			polygon.addPoint(xCenter + radius, yCenter);
			polygon.addPoint((int)(xCenter + radius * (Math.cos(2 * Math.PI / 10))), (int)(yCenter - radius * (Math.sin(2 * Math.PI / 10))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(2 * 2 * Math.PI / 10))), (int)(yCenter - radius * (Math.sin(2 * 2 * Math.PI / 10))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(3 * 2 * Math.PI / 10))), (int)(yCenter - radius * (Math.sin(3 * 2 * Math.PI / 10))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(4 * 2 * Math.PI / 10))), (int)(yCenter - radius * (Math.sin(4 * 2 * Math.PI / 10))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(5 * 2 * Math.PI / 10))), (int)(yCenter - radius * (Math.sin(5 * 2 * Math.PI / 10))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(6 * 2 * Math.PI / 10))), (int)(yCenter - radius * (Math.sin(6 * 2 * Math.PI / 10))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(7 * 2 * Math.PI / 10))), (int)(yCenter - radius * (Math.sin(7 * 2 * Math.PI / 10))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(8 * 2 * Math.PI / 10))), (int)(yCenter - radius * (Math.sin(8 * 2 * Math.PI / 10))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(9 * 2 * Math.PI / 10))), (int)(yCenter - radius * (Math.sin(9 * 2 * Math.PI / 10))));
			g.drawPolygon(polygon);
			break;
		}
	}
}
