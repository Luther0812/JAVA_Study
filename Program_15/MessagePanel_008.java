/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_15;

/**
 * @author LiuYu
 *
 */
import java.awt.FontMetrics;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MessagePanel_008 extends JPanel{
	private String message = "Welcome to Java";
	private int xCoordinate = 20;
	private int yCoordinate = 20;
	private boolean centered;
	private int interval = 10;
	public MessagePanel_008(){
		
	}
	
	public MessagePanel_008(String Message){
		this.message = message;
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
