/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_32;

/**
 * @author up
 *
 */
import javax.swing.*;
import java.awt.event.*;

public class TestSourceListener_001 {
	public static void main(String[] args){
		JFrame frame = new JFrame("TestSourceListener_001");
		JButton jbt = new JButton("OK");
		frame.add(jbt);
		frame.setSize(200, 200);
		frame.setVisible(true);
		
		MyListener listener = new MyListener();
		jbt.addActionListener(listener);
	}

}

class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("I will process it!");
	}
}
