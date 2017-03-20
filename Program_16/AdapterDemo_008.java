/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_16;

/**
 * @author up
 *
 */
import java.awt.event.*;
import javax.swing.*;

public class AdapterDemo_008 extends JFrame{
	public static void main(String[] args){
		AdapterDemo_008 frame = new AdapterDemo_008();
		frame.setTitle("AdapterDemo_008");
		frame.setSize(220, 80);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public AdapterDemo_008(){
		addWindowListener(new WindowAdapter(){
			public void windowActivated(WindowEvent e){
				System.out.println("Window activated");
			}
		});
	}

}
