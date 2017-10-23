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

public class Chapter_Test_033 extends JFrame{
	private double angleStep = Math.PI / 180.0;
	private double angleStart = (Math.PI / 180.0) * (-45);
	private double angleEnd = (Math.PI / 180.0) * 45;
	
	private double angle = angleStart;
	
	private int speed = 1;
	
	private int xTop = 200;
	private int yTop = 50;
	
	private int xDown;
	private int yDown;
	
	private int length = 250;
	
	private boolean flag = true;
	
	public static void main(String[] args){
		Chapter_Test_033 frame = new Chapter_Test_033();
		frame.setTitle("Chapter_Test_033");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_033(){
		add(new NewPanel_033());
		xDown = (int)(xTop + length * Math.sin(angleStart));
		yDown = (int)(yTop + length * Math.cos(angleStart));
		
		addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				switch(e.getKeyCode()){
				case KeyEvent.VK_DOWN:
					if(Math.abs(speed) > 1){
						if(speed < 0){
							speed++;
						}else if(speed > 0){
							speed--;
						}
					}
					break;
				case KeyEvent.VK_UP:
					if(speed < 0){
						speed--;
					}else if(speed > 0){
						speed++;
					}
					break;
				case KeyEvent.VK_S:
					flag = false;
					break;
				case KeyEvent.VK_R:
					flag = true;
					break;
				}
			}
		});
		
		Timer timer = new Timer(100, new TimerListener());
		timer.start();
	}
	
	class TimerListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(flag){
				if(angle >= ((Math.PI / 180.0) * 45)){
					speed = speed * (-1);
					angle = ((Math.PI / 180.0) * 45);
				}else if(angle <= ((Math.PI / 180.0) * (-45))){
					speed = speed * (-1);
					angle = ((Math.PI / 180.0) * (-45));
				}
				angle += speed * angleStep;
				xDown = (int)(xTop + length * Math.sin(angle));
				yDown = (int)(yTop + length * Math.cos(angle));
				repaint();
			}
		}
	}
	
	class NewPanel_033 extends JPanel{
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			g.setColor(Color.GREEN);
			g.fillOval(xTop - 5, yTop - 5, 10, 10);
			
			g.setColor(Color.BLACK);
			g.drawLine(xTop, yTop, xDown, yDown);
			
			g.setColor(Color.BLUE);
			g.fillOval(xDown - 10, yDown - 10, 20, 20);
		}
	}

}
