/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_16;

/**
 * @author up
 *
 */
import javax.swing.*;

import Test_16.Chapter_Test_033.TimerListener;

import java.awt.*;
import java.awt.event.*;

public class Chapter_Test_034 extends JFrame{
	private double angleStep = Math.PI / 180.0;
	private double angleStart = (Math.PI / 180.0) * (-30);
	private double angleEnd = (Math.PI / 180.0) * 30;
	
	private double angle = angleStart;
	
	private double angleArm = (Math.PI / 180.0) * (45);
	private double angleLeg = (Math.PI / 180.0) * (30);
	
	private int speed = 1;
	
	private int X0;
	private int Y0;
	private int L0 = 40;
	
	private int X1;
	private int Y1;
	private int L1 = 80;
	
	private int X2;
	private int Y2;
	private int L2 = 120;
	
	private int X3;
	private int Y3;
	private int L3 = 220;
	
	private int X4;
	private int Y4;
	private int L4 = 80;
	
	private int X5;
	private int Y5;
	private int L5 = 80;
	
	private int X6;
	private int Y6;
	private int L6 = 220;
	
	private int X7;
	private int Y7;
	private int L7 = 220;
	
	private int X8;
	private int Y8;
	private int L8 = 80;
	
	private int X9;
	private int Y9;
	private int L9 = 220;
	
	private int X10;
	private int Y10;
	private int L10 = 80;
	
	private boolean flag = true;
	
	public static void main(String[] args){
		Chapter_Test_034 frame = new Chapter_Test_034();
		frame.setTitle("Chapter_Test_034");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_034(){
		add(new NewPanel_034());
		X0 = (int)(250 + L0 * Math.sin(angleStart));
		Y0 = (int)(40 + L0 * Math.cos(angleStart));
		X1 = (int)(250 + L1 * Math.sin(angleStart)) - 40;
		Y1 = (int)(40 + L1 * Math.cos(angleStart)) - 40;
		X2 = (int)(250 + L2 * Math.sin(angleStart));
		Y2 = (int)(40 + L2 * Math.cos(angleStart));
		X3 = (int)(250 + L3 * Math.sin(angleStart));
		Y3 = (int)(40 + L3 * Math.cos(angleStart));
		X4 = (int)(250 + L4 * Math.sin(angleStart)) - (int)(Math.sin(angleArm + Math.abs(angleStart)) * 40);
		Y4 = (int)(40 + L4 * Math.cos(angleStart)) + (int)(Math.cos(angleArm + Math.abs(angleStart)) * 40);
		X5 = (int)(250 + L5 * Math.sin(angleStart)) - (int)(Math.sin(angleArm + Math.abs(angleStart)) * 120);
		Y5 = (int)(40 + L5 * Math.cos(angleStart)) + (int)(Math.cos(angleArm + Math.abs(angleStart)) * 120);
		X6 = (int)(250 + L6 * Math.sin(angleStart));
		Y6 = (int)(40 + L6 * Math.cos(angleStart));
		X7 = (int)(250 + L7 * Math.sin(angleStart)) - (int)(Math.sin(angleLeg + Math.abs(angleStart)) * 80);
		Y7 = (int)(40 + L7 * Math.cos(angleStart)) + (int)(Math.cos(angleLeg + Math.abs(angleStart)) * 80);
		X9 = (int)(250 + L9 * Math.sin(angleStart)) + (int)(Math.sin(angleLeg + (angleStart)) * 80);
		Y9 = (int)(40 + L9 * Math.cos(angleStart)) + (int)(Math.cos(angleLeg + (angleStart)) * 80);
		X8 = (int)(250 + L8 * Math.sin(angleStart)) + (int)(Math.sin(angleArm + Math.abs(angleStart)) * 40);
		Y8 = (int)(40 + L8 * Math.cos(angleStart)) + (int)(Math.cos(angleArm + Math.abs(angleStart)) * 40);
		X10 = (int)(250 + L10 * Math.sin(angleStart)) + (int)(Math.sin(angleArm + Math.abs(angleStart)) * 120);
		Y10 = (int)(40 + L10 * Math.cos(angleStart)) + (int)(Math.cos(angleArm + Math.abs(angleStart)) * 120);
		
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
				if(angle >= ((Math.PI / 180.0) * 30)){
					speed = speed * (-1);
					angle = ((Math.PI / 180.0) * 30);
				}else if(angle <= ((Math.PI / 180.0) * (-30))){
					speed = speed * (-1);
					angle = ((Math.PI / 180.0) * (-30));
				}
				angle += speed * angleStep;
				X0 = (int)(250 + L0 * Math.sin(angle));
				Y0 = (int)(40 + L0 * Math.cos(angle));
				X1 = (int)(250 + L1 * Math.sin(angle)) - 40;
				Y1 = (int)(40 + L1 * Math.cos(angle)) - 40;
				X2 = (int)(250 + L2 * Math.sin(angle));
				Y2 = (int)(40 + L2 * Math.cos(angle));
				X3 = (int)(250 + L3 * Math.sin(angle));
				Y3 = (int)(40 + L3 * Math.cos(angle));
				X4 = (int)(250 + L4 * Math.sin(angle)) - (int)(Math.sin(angleArm - (angle)) * 40);
				Y4 = (int)(40 + L4 * Math.cos(angle)) + (int)(Math.cos(angleArm - (angle)) * 40);
				X5 = (int)(250 + L5 * Math.sin(angle)) - (int)(Math.sin(angleArm - (angle)) * 120);
				Y5 = (int)(40 + L5 * Math.cos(angle)) + (int)(Math.cos(angleArm - (angle)) * 120);
				X6 = (int)(250 + L6 * Math.sin(angle));
				Y6 = (int)(40 + L6 * Math.cos(angle));
				X7 = (int)(250 + L7 * Math.sin(angle)) - (int)(Math.sin(angleLeg - (angle)) * 80);
				Y7 = (int)(40 + L7 * Math.cos(angle)) + (int)(Math.cos(angleLeg - (angle)) * 80);
				X9 = (int)(250 + L9 * Math.sin(angle)) + (int)(Math.sin(angleLeg + (angle)) * 80);
				Y9 = (int)(40 + L9 * Math.cos(angle)) + (int)(Math.cos(angleLeg + (angle)) * 80);
				X8 = (int)(250 + L8 * Math.sin(angle)) + (int)(Math.sin(angleArm + (angle)) * 40);
				Y8 = (int)(40 + L8 * Math.cos(angle)) + (int)(Math.cos(angleArm + (angle)) * 40);
				X10 = (int)(250 + L10 * Math.sin(angle)) + (int)(Math.sin(angleArm + (angle)) * 120);
				Y10 = (int)(40 + L10 * Math.cos(angle)) + (int)(Math.cos(angleArm + (angle)) * 120);
				repaint();
			}
		}
	}
	
	class NewPanel_034 extends JPanel{
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			int width = getWidth();
			int height = getHeight();
			final double pi = Math.PI / 4;
			
			g.drawArc(20, 320, 100, 80, 0, 180);
			g.drawLine(70, 320, 70, 40);
			g.drawLine(70, 40, 250, 40);
			
			g.drawLine(250, 40, X0, Y0);
			g.drawOval(X1, Y1, 80, 80);
			g.drawLine(X4, Y4, X5, Y5);
			g.drawLine(X8, Y8, X10, Y10);
			g.drawLine(X2, Y2, X3, Y3);
			g.drawLine(X6, Y6, X7, Y7);
			g.drawLine(X6, Y6, X9, Y9);
		}
	}

}
