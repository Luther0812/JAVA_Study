/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_17;

/**
 * @author up
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ScrollBarDemo_010 extends JFrame{
	private JScrollBar jscbHort = new JScrollBar(JScrollBar.HORIZONTAL);
	private JScrollBar jscbVert = new JScrollBar(JScrollBar.VERTICAL);
	
	private MessagePanel_010 messagePanel = new MessagePanel_010("Welcome to Java");
	
	public static void main(String[] args){
		ScrollBarDemo_010 frame = new ScrollBarDemo_010();
		frame.setTitle("ScrollBarDemo_010");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public ScrollBarDemo_010(){
		setLayout(new BorderLayout());
		add(messagePanel, BorderLayout.CENTER);
		add(jscbVert, BorderLayout.EAST);
		add(jscbHort, BorderLayout.SOUTH);
		
		jscbHort.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent e){
				double value = jscbHort.getValue();
				double maximumValue = jscbHort.getMaximum();
				double newX = (value * messagePanel.getWidth() / maximumValue);
				messagePanel.setXCoordinate((int)newX);
			}
		});
		
		jscbVert.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent e){
				double value = jscbVert.getValue();
				double maximumValue = jscbVert.getMaximum();
				double newY = (value * messagePanel.getHeight() / maximumValue);
				messagePanel.setYCoordinate((int)newY);
			}
		});
	}

}

class MessagePanel_010 extends JPanel{
	private String message = "Welcome to Java";
	private int xCoordinate = 20;
	private int yCoordinate = 20;
	private boolean centered;
	private int interval = 10;
	public MessagePanel_010(){
		
	}
	
	public MessagePanel_010(String Message){
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
