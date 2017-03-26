/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_16;

/**
 * @author LiuYu
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chapter_Test_016 extends JFrame{
	private JLabel label = new JLabel("Test");
	public static void main(String[] args){
		Chapter_Test_016 frame = new Chapter_Test_016();
		frame.setTitle("Chapter_Test_016");
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_016(){
		add(label);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		Timer timer = new Timer(500, new TimerListener_016());
		timer.start();
	}
	
	public JLabel getJLabel(){
		return this.label;
	}
	
	public void setJLabel(JLabel label){
		this.label = label;
	}
	
	class TimerListener_016 implements ActionListener{
		boolean flag = true;
		public void actionPerformed(ActionEvent e){
			if(flag){
				JLabel label = getJLabel();
				label.setVisible(true);
				setJLabel(label);
				flag = false;
			}else{
				JLabel label = getJLabel();
				label.setVisible(false);
				setJLabel(label);
				flag = true;
			}
		}
	}

}

//class NewPanel_016 extends JPanel{
//	private JLabel label = new JLabel("Test");
//	add(label);
//}
