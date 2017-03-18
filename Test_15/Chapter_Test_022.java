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

public class Chapter_Test_022 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_022 frame = new Chapter_Test_022();
		frame.setTitle("Chapter_Test_022");
		frame.setSize(200, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_022(){
		add(new NewPanel_022());
	}

}

class NewPanel_022 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);
		
		Polygon polygon = new Polygon();
		
		polygon.addPoint(xCenter + radius, yCenter);
		polygon.addPoint((int)(xCenter + radius * (Math.cos(2 * Math.PI / 6))), (int)(yCenter - radius * (Math.sin(2 * Math.PI / 6))));
		polygon.addPoint((int)(xCenter + radius * (Math.cos(2 * 2 * Math.PI / 6))), (int)(yCenter - radius * (Math.sin(2 * 2 * Math.PI / 6))));
		polygon.addPoint((int)(xCenter + radius * (Math.cos(3 * 2 * Math.PI / 6))), (int)(yCenter - radius * (Math.sin(3 * 2 * Math.PI / 6))));
		polygon.addPoint((int)(xCenter + radius * (Math.cos(4 * 2 * Math.PI / 6))), (int)(yCenter - radius * (Math.sin(4 * 2 * Math.PI / 6))));
		polygon.addPoint((int)(xCenter + radius * (Math.cos(5 * 2 * Math.PI / 6))), (int)(yCenter - radius * (Math.sin(5 * 2 * Math.PI / 6))));
		
		g.setColor(Color.RED);
		g.fillPolygon(polygon);
		
		FontMetrics fm = g.getFontMetrics();
		g.setFont(new Font("Californian FB", Font.BOLD, 30));
		
		int stringWidth = fm.stringWidth("STOP");
		int stringAscent = fm.getAscent();
		
		int xCoordinate = xCenter - stringWidth;
		int yCoordinate = yCenter + stringAscent;
		g.setColor(Color.WHITE);
		g.drawString("STOP", xCoordinate, yCoordinate);
	}
}
