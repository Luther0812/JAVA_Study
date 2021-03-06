/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_16;

/**
 * @author LiuYu
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnonymousListenerDemo_003 extends JFrame{
	public AnonymousListenerDemo_003(){
		JButton jbtNew = new JButton("New");
		JButton jbtOpen = new JButton("Open");
		JButton jbtSave = new JButton("Save");
		JButton jbtPrint = new JButton("Print");
		
		JPanel panel = new JPanel();
		panel.add(jbtNew);
		panel.add(jbtOpen);
		panel.add(jbtSave);
		panel.add(jbtPrint);
		
		add(panel);
		
		jbtNew.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						System.out.println("Process New");
					}
				});
		
		jbtOpen.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						System.out.println("Process Open");
					}
				});
		
		jbtSave.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						System.out.println("Process Save");
					}
				});
		
		jbtPrint.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						System.out.println("Process Print");
					}
				});
	}
	
	public static void main(String[] args){
		JFrame frame = new AnonymousListenerDemo_003();
		frame.setTitle("AnonymousListenerDemo_003");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}

}
