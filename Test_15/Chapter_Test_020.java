/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_15;

/**
 * @author LiuYu
 *
 */
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.*;

public class Chapter_Test_020 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_020 frame = new Chapter_Test_020();
		frame.setTitle("Chapter_Test_020");
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_020(){
		add(new StillClock_020());
	}

}

class StillClock_020 extends JPanel{
	private int hour;
	private int minute;
	private int second;
	
	public StillClock_020(){
		setCurrentTime();
	}
	
	public StillClock_020(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour(){
		return this.hour;
	}
	
	public int getMinute(){
		return this.minute;
	}
	
	public int getSecond(){
		return second;
	}
	
	public void setHour(int hour){
		this.hour = hour;
		repaint();
	}
	
	public void setMinute(int minute){
		this.minute = minute;
		repaint();
	}
	
	public void setSecond(int second){
		this.second = second;
		repaint();
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int clockRadius = (int)(Math.min(getWidth(), getHeight()) * 0.8 * 0.5);
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		final double pi = Math.PI;
		int radius = (int)(clockRadius * 0.8);
		
		g.setColor(Color.BLACK);
		g.drawOval(xCenter - clockRadius, yCenter - clockRadius, 2 * clockRadius, 2 * clockRadius);
		g.drawString("12", xCenter, (int)(yCenter - clockRadius * 0.8));
		g.drawString("1", xCenter + (int)(radius * Math.cos(pi / 3)), yCenter - (int)(radius * Math.sin(pi / 3)));
		g.drawString("2", xCenter + (int)(radius * Math.cos(pi / 6)), yCenter - (int)(radius * Math.sin(pi / 6)));
		g.drawString("3", (int)(xCenter + clockRadius * 0.8), yCenter);
		g.drawString("4", xCenter + (int)(radius * Math.cos(pi / 6)), yCenter + (int)(radius * Math.sin(pi / 6)));
		g.drawString("5", xCenter + (int)(radius * Math.cos(pi / 3)), yCenter + (int)(radius * Math.sin(pi / 3)));
		g.drawString("6", xCenter, (int)(yCenter + clockRadius * 0.8));
		g.drawString("7", xCenter - (int)(radius * Math.cos(pi / 3)), yCenter + (int)(radius * Math.sin(pi / 3)));
		g.drawString("8", xCenter - (int)(radius * Math.cos(pi / 6)), yCenter + (int)(radius * Math.sin(pi / 6)));
		g.drawString("9", (int)(xCenter - clockRadius * 0.8), yCenter);
		g.drawString("10", xCenter - (int)(radius * Math.cos(pi / 6)), yCenter - (int)(radius * Math.sin(pi / 6)));
		g.drawString("11", xCenter - (int)(radius * Math.cos(pi / 3)), yCenter - (int)(radius * Math.sin(pi / 3)));
		
		for(int i = 1; i <= 60; i++){
			final double p = Math.PI * 2 / 60;
			if(i % 5 == 0){
				int start = (int)(clockRadius * 0.9);
				int end = (int)(clockRadius);
				g.drawLine(xCenter + (int)(start * Math.sin(p * i)), yCenter - (int)(start * Math.cos(p * i)), xCenter + (int)(end * Math.sin(p * i)), yCenter - (int)(end * Math.cos(p * i)));
			}else{
				int start = (int)(clockRadius * 0.95);
				int end = (int)(clockRadius);
				g.drawLine(xCenter + (int)(start * Math.sin(p * i)), yCenter - (int)(start * Math.cos(p * i)), xCenter + (int)(end * Math.sin(p * i)), yCenter - (int)(end * Math.cos(p * i)));
			}
		}
		
		int sLength = (int)(clockRadius * 0.8);
		int xSecond = (int)(xCenter + sLength * Math.sin(second * (2 * Math.PI / 60)));
		int ySecond = (int)(yCenter - sLength * Math.cos(second * (2 * Math.PI / 60)));
		g.setColor(Color.red);
		g.drawLine(xCenter, yCenter, xSecond, ySecond);
		
		int mLength = (int)(clockRadius * 0.65);
		int xMinute = (int)(xCenter + mLength * Math.sin(minute * (2 * Math.PI / 60)));
		int yMinute = (int)(yCenter - mLength * Math.cos(minute * (2 * Math.PI / 60)));
		g.setColor(Color.blue);
		g.drawLine(xCenter, yCenter, xMinute, yMinute);
		
		int hLength = (int)(clockRadius * 0.5);
		int xHour = (int)(xCenter + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
		int yHour = (int)(yCenter - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
		g.setColor(Color.green);
		g.drawLine(xCenter, yCenter, xHour, yHour);
	}
	
	public void setCurrentTime(){
		Calendar calendar = new GregorianCalendar();
		
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(200, 200);
	}

}
