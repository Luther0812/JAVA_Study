/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_18;

/**
 * @author up
 *
 */
import javax.swing.*;
import java.awt.Graphics;

public class DisplayMessage_005 extends JApplet{
	public void init(){
		String message = getParameter("MESSAGE");
		int x = Integer.parseInt(getParameter("X"));
		int y = Integer.parseInt(getParameter("Y"));
		
		MessagePanel messagePanel = new MessagePanel(message);
		messagePanel.setXCoordinate(x);
		messagePanel.setYCoordinate(y);
		
		add(messagePanel);
	}

}

class MessagePanel extends JPanel{
	String message;
	int x = 0;
	int y = 0;
	
	public MessagePanel(String message){
		this.message = message;
	}
	
	public int getXCoordinate(){
		return x;
	}
	
	public int getYCoordinate(){
		return y;
	}
	
	public void setXCoordinate(int x){
		this.x = x;
		repaint();
	}
	
	public void setYCoordinate(int y){
		this.y = y;
		repaint();
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawString(message, x, y);
	}
}
