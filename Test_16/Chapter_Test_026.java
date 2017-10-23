/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_16;

/**
 * @author up
 *
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Chapter_Test_026 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_026 frame = new Chapter_Test_026();
		frame.setTitle("Chapter_Test_026");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_026(){
		add(new NewPanel_026());
	}

}

class NewPanel_026 extends JPanel{	
	private int ballX = (int)(Math.random() * 380);
	private int ballY = (int)(Math.random() * 380);
	final int RADIUS = 10;
	
	public NewPanel_026(){
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e){
				double distanceX = Math.pow((e.getX() - (ballX + 10)), 2);
				double distanceY = Math.pow((e.getY() - (ballY + 10)), 2);
				
				double distance = Math.sqrt(distanceX + distanceY);

				if(distance <= 10){
					ballX = e.getX() - 10;
					ballY = e.getY() - 10;
				}
				repaint();
			}
		});
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawOval(ballX, ballY, RADIUS, RADIUS);
	}
	
}
