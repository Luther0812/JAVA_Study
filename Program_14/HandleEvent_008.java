/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_14;

/**
 * @author LiuYu
 *
 */
import javax.swing.*;
import java.awt.event.*;

public class HandleEvent_008 extends JFrame{
	public HandleEvent_008(){
		JButton jbtOK = new JButton("OK");
		JButton jbtCancel = new JButton("Cancel");
		
		JPanel panel = new JPanel();
		panel.add(jbtOK);
		panel.add(jbtCancel);
		
		add(panel);
		
		OKListenerClass listener1 = new OKListenerClass();
		CancelListenerClass listener2 = new CancelListenerClass();
		jbtOK.addActionListener(listener1);
		jbtCancel.addActionListener(listener2);
	}
	
	public static void main(String[] args){
		JFrame frame = new HandleEvent_008();
		frame.setTitle("Handle Event");
		frame.setSize(200, 150);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class OKListenerClass implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("OK button clicked");
	}
}

class CancelListenerClass implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Cancel button clicked");
	}
}
