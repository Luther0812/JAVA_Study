/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_16;

/**
 * @author LiuYu
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Chapter_Test_024 extends JFrame{
	private NewPanel_024 clock = new NewPanel_024();
	private Timer timer = new Timer(1000, new TimerListener());;
	public static void main(String[] args){
		Chapter_Test_024 frame = new Chapter_Test_024();
		frame.setTitle("Chapter_Test_024");
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_024(){
		setLayout(new BorderLayout(5, 10));
		add(clock, BorderLayout.CENTER);
		add(new NewPanel_temp(), BorderLayout.SOUTH);
		timer.start();
	}
	
	public void start(){
		this.timer.start();
	}
	
	public void stop(){
		this.timer.stop();
	}
	
	private class TimerListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			clock.setCurrentTime();
			clock.repaint();
		}
	}
	
	class NewPanel_temp extends JPanel{
		private JButton b1 = new JButton("Start");
		private JButton b2 = new JButton("Stop");
		public NewPanel_temp(){
			setLayout(new FlowLayout(FlowLayout.CENTER));
			add(b1);
			add(b2);
			b1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					start();
				}
			});
			b2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					stop();
				}
			});
		}
	}

}

class NewPanel_024 extends JPanel{
	private int hour;
	private int minute;
	private int second;
	
	public NewPanel_024(){
		setCurrentTime();
	}
	
	public NewPanel_024(int hour, int minute, int second){
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
