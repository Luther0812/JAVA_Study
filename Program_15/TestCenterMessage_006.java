/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_15;

/**
 * @author up
 *
 */
import javax.swing.*;
import java.awt.*;

public class TestCenterMessage_006 extends JFrame{
	public static void main(String[] args){
		TestCenterMessage_006 frame = new TestCenterMessage_006();
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public TestCenterMessage_006(){
		CenterMessage messagePanel = new CenterMessage();
		add(messagePanel);
		messagePanel.setBackground(Color.WHITE);
		messagePanel.setFont(new Font("Californian FB", Font.BOLD, 30));
	}

}

class CenterMessage extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		FontMetrics fm = g.getFontMetrics();
		
		int stringWidth = fm.stringWidth("Welcome to Java");
		int stringAscent = fm.getAscent();
		
		int xCoordinate = getWidth() / 2 - stringWidth / 2;
		int yCoordinate = getHeight() / 2 + stringAscent / 2;
		
		g.drawString("Welcome to Java", xCoordinate, yCoordinate);
	}
}
