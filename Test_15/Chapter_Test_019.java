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
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Chapter_Test_019 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_019 frame = new Chapter_Test_019();
		frame.setTitle("Chapter_Test_019");
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_019(){
		int hour = (int)(Math.random() * 12);
		int temp = (int)(Math.random() * 2);
		int minute;
		if(temp == 0){
			minute = 0;
		}else{
			minute = 30;
		}
		add(new StillClock_019(hour, minute, 0, true, true, false));
	}

}

class StillClock_019 extends JPanel{
	private int hour;
	private int minute;
	private int second;
	private boolean hourHandVisible;
	private boolean minuteHandVisible;
	private boolean secondHandVisible;
	
	public StillClock_019(){
		setCurrentTime();
	}
	
	public StillClock_019(int hour, int minute, int second, boolean hourHandVisible, boolean minuteHandVisible, boolean secondHandVisible){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.hourHandVisible = hourHandVisible;
		this.minuteHandVisible = minuteHandVisible;
		this.secondHandVisible = secondHandVisible;
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
	
	public boolean getHourHandVisible(){
		return hourHandVisible;
	}
	
	public boolean getMinuteHandVisible(){
		return minuteHandVisible;
	}
	
	public boolean getSecondHandVisible(){
		return secondHandVisible;
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
	
	public void setHourHandVisible(boolean hourHandVisible){
		this.hourHandVisible = hourHandVisible;
	}
	
	public void setMinuteHandVisible(boolean minuteHandVisible){
		this.minuteHandVisible = minuteHandVisible;
	}
	
	public void setSecondHandVisible(boolean secondHandVisible){
		this.secondHandVisible = secondHandVisible;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int clockRadius = (int)(Math.min(getWidth(), getHeight()) * 0.8 * 0.5);
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		
		g.setColor(Color.BLACK);
		g.drawOval(xCenter - clockRadius, yCenter - clockRadius, 2 * clockRadius, 2 * clockRadius);
		g.drawString("12", xCenter - 5, yCenter - clockRadius + 12);
		g.drawString("9", xCenter - clockRadius + 3, yCenter + 5);
		g.drawString("3", xCenter + clockRadius - 10, yCenter + 3);
		g.drawString("6", xCenter - 3, yCenter + clockRadius - 3);
		
		if(secondHandVisible){
			int sLength = (int)(clockRadius * 0.8);
			int xSecond = (int)(xCenter + sLength * Math.sin(second * (2 * Math.PI / 60)));
			int ySecond = (int)(yCenter - sLength * Math.cos(second * (2 * Math.PI / 60)));
			g.setColor(Color.red);
			g.drawLine(xCenter, yCenter, xSecond, ySecond);
		}
		
		if(minuteHandVisible){
			int mLength = (int)(clockRadius * 0.65);
			int xMinute = (int)(xCenter + mLength * Math.sin(minute * (2 * Math.PI / 60)));
			int yMinute = (int)(yCenter - mLength * Math.cos(minute * (2 * Math.PI / 60)));
			g.setColor(Color.blue);
			g.drawLine(xCenter, yCenter, xMinute, yMinute);
		}
		
		if(hourHandVisible){
			int hLength = (int)(clockRadius * 0.5);
			int xHour = (int)(xCenter + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
			int yHour = (int)(yCenter - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
			g.setColor(Color.green);
			g.drawLine(xCenter, yCenter, xHour, yHour);
		}
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
