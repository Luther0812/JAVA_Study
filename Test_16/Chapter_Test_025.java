/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_16;


/**
 * @author LiuYu
 *
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter_Test_025 extends JFrame{
	private JPanel jPanel;
	
	public static void main(String[] args){
		JFrame frame = new Chapter_Test_025();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Chapter_Test_025");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setSize(400, 400);
		
	}
	
	public Chapter_Test_025(){
		jPanel = new JPanel_025(400, 400);
		jPanel.setLayout(new FlowLayout());
		add(jPanel);
		jPanel.setFocusable(true);
	}
	
	class JPanel_025 extends JPanel{
		private int height;
		private int width;
		private int gunLength = 100;
		private int gunWidth = 10;
		
		private int count = 1;
		private int num = 0;
		private boolean flag = false;
		private double distance;
		
		private int targetX;
		private int targetY;
		
		private double angleX;
		private double angleY;
		private int ballX = 0;
		private int ballY = 0;
		
		private int x1, x2, x3, x4, x5;
		private int y1, y2, y3, y4, y5;
		private int[] X = new int[5];
		private int[] Y = new int[5];
		
		private Polygon point;
		
		public JPanel_025(int a, int b){
			height = a;
			width = b;
			
			x1 = (width - gunWidth) / 2;
			x2 = (width - gunWidth) / 2;
			x3 = (width + gunWidth) / 2;
			x4 = (width + gunWidth) / 2;
			x5 = (width - gunWidth) / 2;
			y1 = height - gunLength;
			y2 = height;
			y3 = height;
			y4 = height - gunLength;
			y5 = height - gunLength;
			
			X[0] = x1;
			X[1] = x2;
			X[2] = x3;
			X[3] = x4;
			X[4] = x5;
			Y[0] = y1;
			Y[1] = y2;
			Y[2] = y3;
			Y[3] = y4;
			Y[4] = y5;
			point = new Polygon(X, Y, 5);
			
			targetX = (int)(Math.random() * (width - 120));
			targetY = (int)(Math.random() * (height - 200));
			
			addKeyListener(new KeyAdapter(){
				public void keyPressed(KeyEvent e){
					switch(e.getKeyCode()){
					case KeyEvent.VK_UP:
						ballX = X[0];
						ballY = Y[0];
						angleX = Math.sin(num * Math.PI / 36);
						angleY = Math.cos(num * Math.PI / 36);
						flag = true;
						break;
					case KeyEvent.VK_LEFT:
						num = num - 1;
						x1 = (width - gunWidth) / 2 + (int)(gunLength * Math.sin(Math.PI / 36 * num));
						X[0] = x1;
						x5 = (width - gunWidth) / 2 + (int)(gunLength * Math.sin(Math.PI / 36 * num));
						X[4] = x5;
						x4 = (width + gunWidth) / 2 + (int)(gunLength * Math.sin(Math.PI / 36 * num));
						X[3] =x4;
						y1 = height - gunLength + (int)(gunLength * (1 - Math.cos(Math.PI / 36 * num)));
						Y[0] = y1;
						y5 = height - gunLength + (int)(gunLength * (1 - Math.cos(Math.PI / 36 * num)));
						Y[4] = y5;
						y4 = height - gunLength + (int)(gunLength * (1 - Math.cos(Math.PI / 36 * num)));
						Y[3] = y4;
						point = new Polygon(X, Y, 5);
						break;
					case KeyEvent.VK_RIGHT:
						num = num + 1;
						x1 = (width - gunWidth) / 2 + (int)(gunLength * Math.sin(Math.PI / 36 * num));
						X[0] = x1;
						x5 = (width - gunWidth) / 2 + (int)(gunLength * Math.sin(Math.PI / 36 * num));
						X[4] = x5;
						x4 = (width + gunWidth) / 2 + (int)(gunLength * Math.sin(Math.PI / 36 * num));
						X[3] =x4;
						y1 = height - gunLength + (int)(gunLength * (1 - Math.cos(Math.PI / 36 * num)));
						Y[0] = y1;
						y5 = height - gunLength + (int)(gunLength * (1 - Math.cos(Math.PI / 36 * num)));
						Y[4] = y5;
						y4 = height - gunLength + (int)(gunLength * (1 - Math.cos(Math.PI / 36 * num)));
						Y[3] = y4;
						point = new Polygon(X, Y, 5);
						break;
					default:
						break;
					}
					repaint();
				}
				
			});
			
			Timer timer = new Timer(100, new TimerListener());
			timer.start();
		}
		
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			g.setColor(Color.CYAN);
			g.fillPolygon(point);
			
			if(count == 1){
				g.setColor(Color.BLACK);
				g.drawOval(targetX, targetY, 60, 60);
				distance = Math.sqrt(Math.pow(targetX - ballX + 60 * Math.sin(Math.PI / 4) - 10 * Math.sin(Math.PI / 4), 2) + Math.pow(targetY - ballY + 60 * Math.sin(Math.PI / 4) - 10 * Math.sin(Math.PI / 4), 2));
				if(distance < 30){
					count = 0;
					flag = false;
				}else{
					
				}
			}else{
				targetX = (int)(Math.random() * (width - 120));
				targetY = (int)(Math.random() * (height - 200));
				count = 1;
			}
			
			if(flag){
				if(ballX <= 0 || ballX >= width || ballY <= 0 || ballY >= height){
					flag = false;
					return;
				}else{
					ballX = ballX + (int)(5 * angleX);
					ballY = ballY - (int)(5 * angleY);
					
					g.fillOval(ballX, ballY, 10, 10);
				}
			}
		}
		
		class TimerListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				repaint();
			}
		}
	}

}
