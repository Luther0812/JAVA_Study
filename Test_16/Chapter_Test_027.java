/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_16;

/**
 * @author up
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chapter_Test_027 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_027 frame = new Chapter_Test_027();
		frame.setTitle("Chapter_Test_027");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_027(){
		add(new NewPanel_027());
	}

}

class NewPanel_027 extends JPanel{
	private int ballX;
	private int ballY;
	final int RADIUS = 20;
	private int colorX;
	private int colorY;
	private int colorZ;
	
	private int numClick = 0;
	
	private long timeStart;
	private long timeStop; 
	
	public NewPanel_027(){
		timeStart = System.currentTimeMillis();
		
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				double distanceX = Math.pow((e.getX() - (ballX + 20)), 2);
				double distanceY = Math.pow((e.getY() - (ballY + 20)), 2);
				
				double distance = Math.sqrt(distanceX + distanceY);
				if(distance <= 20){
					colorX = (int)(Math.random() * 256);
					colorY = (int)(Math.random() * 256);
					colorZ = (int)(Math.random() * 256);
				}
				repaint();
			}
		});
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(numClick == 3){
			timeStop = System.currentTimeMillis();
			g.drawString("Time spent " + (timeStop - timeStart) + " milliseconds", 80, 100);
		}else{
			ballX = (int)(Math.random() * 360);
			ballY = (int)(Math.random() * 360);
			
			g.setColor(new Color(colorX, colorY, colorZ));
			
			g.fillOval(ballX, ballY, RADIUS, RADIUS);
			
			numClick++;
		}
	}
}
