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

public class Chapter_Test_006 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_006 frame = new Chapter_Test_006();
		frame.setTitle("Chapter_Test_006");
		frame.setSize(200, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_006(){
		setLayout(new GridLayout(2, 2));
		add(new FigurePanel_006(1));
		add(new FigurePanel_006(2));
		add(new FigurePanel_006(3));
		add(new FigurePanel_006(4));
	}

}

class FigurePanel_006 extends JPanel{
	private int choose;
	
	public FigurePanel_006(){
		
	}
	
	public FigurePanel_006(int num){
		this.choose = num;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);
		int x = xCenter - radius;
		int y = yCenter - radius;
		final double PI = Math.PI;
		
		switch(choose){
		case 1:
			g.drawArc(x, y, 2 * radius, 2 * radius, 0, 30);
			g.drawArc(x, y, 2 * radius, 2 * radius, 90, 30);
			g.drawArc(x, y, 2 * radius, 2 * radius, 180, 30);
			g.drawArc(x, y, 2 * radius, 2 * radius, 270, 30);
			break;
		case 2:
			Polygon polygon = new Polygon();
			polygon.addPoint(xCenter + radius, yCenter);
			polygon.addPoint((int)((xCenter + radius * (Math.cos(PI / 3)))), (int)(yCenter + radius * (Math.sin(PI / 3))));
			polygon.addPoint((int)(xCenter - radius * (Math.cos(PI / 3))), (int)(yCenter + radius * (Math.sin(PI / 3))));
			polygon.addPoint(xCenter - radius, yCenter);
			polygon.addPoint((int)(xCenter - radius * (Math.cos(PI / 3))), (int)(yCenter - radius * (Math.sin(PI / 3))));
			polygon.addPoint((int)(xCenter + radius * (Math.cos(PI / 3))), (int)(yCenter - radius * (Math.sin(PI / 3))));
			
			g.drawPolygon(polygon);
			break;
		case 3:
			g.fillArc(x, y, 2 * radius, 2 * radius, 0, 30);
			g.fillArc(x, y, 2 * radius, 2 * radius, 90, 30);
			g.fillArc(x, y, 2 * radius, 2 * radius, 180, 30);
			g.fillArc(x, y, 2 * radius, 2 * radius, 270, 30);
			break;
		case 4:
			Polygon polygon1 = new Polygon();
			polygon1.addPoint(xCenter + radius, yCenter);
			polygon1.addPoint((int)((xCenter + radius * (Math.cos(PI / 3)))), (int)(yCenter + radius * (Math.sin(PI / 3))));
			polygon1.addPoint((int)(xCenter - radius * (Math.cos(PI / 3))), (int)(yCenter + radius * (Math.sin(PI / 3))));
			polygon1.addPoint(xCenter - radius, yCenter);
			polygon1.addPoint((int)(xCenter - radius * (Math.cos(PI / 3))), (int)(yCenter - radius * (Math.sin(PI / 3))));
			polygon1.addPoint((int)(xCenter + radius * (Math.cos(PI / 3))), (int)(yCenter - radius * (Math.sin(PI / 3))));
			
			g.fillPolygon(polygon1);
			break;
		}

	}
}
