/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_15;

/**
 * @author LiuYu
 *
 */
import java.awt.*;
import javax.swing.*;

public class DisplayClock_009 extends JFrame{
	public static void main(String[] args){
		DisplayClock_009 frame = new DisplayClock_009();
		frame.setTitle("DisplayClock");
		frame.setSize(300, 350);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public DisplayClock_009(){
		StillClock_010 clock = new StillClock_010();
		
		MessagePanel_008 messagePanel = new MessagePanel_008(clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond());
		messagePanel.setCentered(true);
		messagePanel.setForeground(Color.blue);
		messagePanel.setFont(new Font("Courier", Font.BOLD, 16));
		add(clock);
		add(messagePanel, BorderLayout.SOUTH);
	}

}
