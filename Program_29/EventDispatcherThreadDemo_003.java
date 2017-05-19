/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_29;

/**
 * @author up
 *
 */
import javax.swing.*;

public class EventDispatcherThreadDemo_003 extends JApplet{
	public EventDispatcherThreadDemo_003(){
		add(new JLabel("Hi, it runs from an event dispatch thread"));
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new JFrame("EventDispatcherThreadDemo_003");
				frame.add(new EventDispatcherThreadDemo_003());
				frame.setSize(200,  200);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

}
