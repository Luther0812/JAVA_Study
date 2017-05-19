/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_29;

/**
 * @author up
 *
 */
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.*;

public class ClockWithAudio_004 extends JApplet{
	protected AudioClip[] hourAudio = new AudioClip[12];
	protected AudioClip[] minuteAudio = new AudioClip[60];
	
	protected AudioClip amAudio = Applet.newAudioClip(this.getClass().getResource("audio/am.au"));
	protected AudioClip pmAudio = Applet.newAudioClip(this.getClass().getResource("audio/pm.au"));
	
	private StillClock clock = new StillClock();
	
	private Timer timer = new Timer(1000, new TimerListener());
	
	private JLabel jlblDigitTime = new JLabel("", JLabel.CENTER);
	
	public void init(){
		for(int i = 0; i < 12; i++){
			hourAudio[i] = Applet.newAudioClip(this.getClass().getResource("audio/hour" + i + ".au"));
		}
		
		for(int i = 0; i < 60; i++){
			minuteAudio[i] = Applet.newAudioClip(this.getClass().getResource("audio/minute" + i + ".au"));
		}
		
		add(clock, BorderLayout.CENTER);
		add(jlblDigitTime, BorderLayout.SOUTH);
	}
	
	public void start(){
		timer.start();
	}
	
	public void stop(){
		timer.stop();
	}
	
	private class TimerListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			clock.setCurrentTime();
			clock.repaint();
			jlblDigitTime.setText(clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond());
			if(clock.getSecond() == 0){
				announceTime(clock.getHour(), clock.getMinute());
			}
		}
	}
	
	public void announceTime(int hour, int minute){
		hourAudio[hour % 12].play();
		try{
			Thread.sleep(1500);
			minuteAudio[minute].play();
			Thread.sleep(1500);
		}catch(InterruptedException ex){
			
		}
		if(hour < 12){
			amAudio.play();
		}else{
			pmAudio.play();
		}
	}
}

class StillClock extends JPanel{
	private int hour;
	private int minute;
	private int second;
	
	public StillClock(){
		setCurrentTime();
	}
	
	public StillClock(int hour, int minute, int second){
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
		
		g.setColor(Color.BLACK);
		g.drawOval(xCenter - clockRadius, yCenter - clockRadius, 2 * clockRadius, 2 * clockRadius);
		g.drawString("12", xCenter - 5, yCenter - clockRadius + 12);
		g.drawString("9", xCenter - clockRadius + 3, yCenter + 5);
		g.drawString("3", xCenter + clockRadius - 10, yCenter + 3);
		g.drawString("6", xCenter - 3, yCenter + clockRadius - 3);
		
		int sLength = (int)(clockRadius * 0.8);
		int xSecond = (int)(xCenter + sLength * Math.sin(second * (2 * Math.PI / 60)));
		int ySecond = (int)(yCenter - sLength * Math.cos(second * (2 * Math.PI / 60)));
		g.setColor(Color.red);
		g.drawLine(xCenter, yCenter, xSecond, ySecond);
		
		int mLength = (int)(clockRadius * 0.65);
		int xMinute = (int)(xCenter + mLength * Math.sin(minute * (2 * Math.PI / 60)));
		int yMinute = (int)(yCenter + mLength * Math.cos(minute * (2 * Math.PI / 60)));
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
