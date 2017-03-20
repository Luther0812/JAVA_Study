/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_16;

/**
 * @author up
 *
 */
import javax.swing.*;
import java.awt.event.*;

public class testWindowEvent_007 extends JFrame{
	public static void main(String[] args){
		testWindowEvent_007 frame = new testWindowEvent_007();
		frame.setTitle("testWindowEvent_007");
		frame.setSize(220, 80);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public testWindowEvent_007(){
		addWindowListener(new WindowListener(){
					public void windowDeiconified(WindowEvent e){
						System.out.println("Window deiconified");
					}
					
					public void windowIconified(WindowEvent e){
						System.out.println("Window iconified");
					}
					
					public void windowActivated(WindowEvent e){
						System.out.println("Window activated");
					}
					
					public void windowDeactivated(WindowEvent e){
						System.out.println("Window deactivated");
					}
					
					public void windowOpened(WindowEvent e){
						System.out.println("Window opened");
					}
					
					public void windowClosing(WindowEvent e){
						System.out.println("Window closing");
					}
					
					public void windowClosed(WindowEvent e){
						System.out.println("Window closed");
					}
				});
	}

}
