/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_17;

/**
 * @author up
 *
 */
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class ButtonDemo_002 extends JFrame{
	protected MessagePanel_008 messagePanel = new MessagePanel_008("Welcome to Java");
	private JButton jbtLeft = new JButton("<=");
	private JButton jbtRight = new JButton("=>");
	
	public static void main(String[] args){
		ButtonDemo_002 frame = new ButtonDemo_002();
		frame.setTitle("ButtonDemo_002");
		frame.setSize(250, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public ButtonDemo_002(){
		messagePanel.setBackground(Color.white);
		
		JPanel jpButtons = new JPanel();
		jpButtons.add(jbtLeft);
		jpButtons.add(jbtRight);
		
		jbtLeft.setMnemonic('L');
		jbtRight.setMnemonic('R');
		
		jbtLeft.setToolTipText("Move Message to Left");
		jbtRight.setToolTipText("Move Message to Right");
		
		setLayout(new BorderLayout());
		add(messagePanel, BorderLayout.CENTER);
		add(jpButtons, BorderLayout.SOUTH);
		
		jbtLeft.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				messagePanel.moveLeft();
			}
		});
		
		jbtRight.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				messagePanel.moveRight();
			}
		});
	}

}

class MessagePanel_008 extends JPanel{
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
