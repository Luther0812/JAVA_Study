/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_15;

/**
 * @author LiuYu
 *
 */
import java.awt.*;
import javax.swing.*;

public class Chapter_Test_026 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_026 frame = new Chapter_Test_026();
		frame.setTitle("Chapter_Test_026");
		frame.setSize(200, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_026(){
		setLayout(new GridLayout(3, 2));
		MessagePanel_026 m1 = new MessagePanel_026("HTML", true);
		MessagePanel_026 m2 = new MessagePanel_026("Java", true);
		MessagePanel_026 m3 = new MessagePanel_026("Tomcat", true);
		MessagePanel_026 m4 = new MessagePanel_026("PHP", true);
		m1.setBackground(Color.CYAN);
		m4.setBackground(Color.CYAN);
		add(new MessagePanel_026());
		add(m1);
		add(m2);
		add(m3);
		add(new MessagePanel_026());
		add(m4);
		
	}

}

class MessagePanel_026 extends JPanel{
	private String message = "";
	private int xCoordinate = 20;
	private int yCoordinate = 20;
	private boolean centered;
	private int interval = 10;
	public MessagePanel_026(){
		
	}
	
	public MessagePanel_026(String Message, boolean centered){
		this.message = Message;
		this.centered = centered;
	}
	
	public String getMessage(){
		return this.message;
	}
	
	public void setMessage(String message){
		this.message = message;
		repaint();
	}
	
	public int getXCoordinate(){
		return this.xCoordinate;
	}
	
	public void setXCoordinate(int xCoordinate){
		this.xCoordinate = xCoordinate;
		repaint();
	}
	
	public int getYCoordinate(){
		return this.yCoordinate;
	}
	
	public void setYCoordinate(int yCoordinate){
		this.yCoordinate = yCoordinate;
		repaint();
	}
	
	public boolean getCentered(){
		return this.centered;
	}
	
	public void setCentered(boolean centered){
		this.centered = centered;
		repaint();
	}
	
	public int getInterval(){
		return this.interval;
	}
	
	public void setInterval(int interval){
		this.interval = interval;
		repaint();
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(centered){
			FontMetrics fm = g.getFontMetrics();
			int stringWidth = fm.stringWidth(message);
			int stringAscent = fm.getAscent();
			xCoordinate = getWidth() / 2 - stringWidth / 2;
			yCoordinate = getHeight() / 2 + stringAscent / 2;
		}else{
			
		}
		
		g.drawString(message, xCoordinate, yCoordinate);
	}
	
	public void moveLeft(){
		xCoordinate -= interval;
		repaint();
	}
	
	public void moveRight(){
		xCoordinate += interval;
		repaint();
	}
	
	public void moveUp(){
		yCoordinate -= interval;
		repaint();
	}
	
	public void moveDown(){
		yCoordinate += interval;
		repaint();
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(200, 30);
	}

}
