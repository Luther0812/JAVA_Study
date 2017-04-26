/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_17;

/**
 * @author up
 *
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo_011 extends JFrame{
	private JSlider jsldHort = new JSlider(JSlider.HORIZONTAL);
	private JSlider jsldVert = new JSlider(JSlider.VERTICAL);
	
	private MessagePanel_011 messagePanel = new MessagePanel_011("Welcome to Java");
	
	public static void main(String[] args){
		SliderDemo_011 frame = new SliderDemo_011();
		frame.setTitle("SliderDemo_011");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public SliderDemo_011(){
		setLayout(new BorderLayout(5, 5));
		add(messagePanel, BorderLayout.CENTER);
		add(jsldVert, BorderLayout.EAST);
		add(jsldHort, BorderLayout.SOUTH);
		
		jsldHort.setMaximum(50);
		jsldHort.setPaintLabels(true);
		jsldHort.setPaintTicks(true);
		jsldHort.setMajorTickSpacing(10);
		jsldHort.setMinorTickSpacing(1);
		jsldHort.setPaintTrack(false);
		
		jsldVert.setInverted(true);
		jsldVert.setMaximum(10);
		jsldVert.setPaintLabels(true);
		jsldVert.setPaintTicks(true);
		jsldVert.setMajorTickSpacing(10);
		jsldVert.setMinorTickSpacing(1);
		jsldVert.setPaintTrack(false);
		
		jsldHort.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				double value = jsldHort.getValue();
				double maximumValue = jsldHort.getMaximum();
				double newX = (value * messagePanel.getWidth() / maximumValue);
				messagePanel.setXCoordinate((int)newX);
			}
		});
		
		jsldVert.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				double value = jsldVert.getValue();
				double maximumValue = jsldVert.getMaximum();
				double newY = (value * messagePanel.getHeight() / maximumValue);
				messagePanel.setYCoordinate((int)newY);
			}
		});
	}

}

class MessagePanel_011 extends JPanel{
	private String message = "Welcome to Java";
	private int xCoordinate = 20;
	private int yCoordinate = 20;
	private boolean centered;
	private int interval = 10;
	public MessagePanel_011(){
		
	}
	
	public MessagePanel_011(String Message){
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
