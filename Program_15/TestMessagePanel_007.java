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

public class TestMessagePanel_007 extends JFrame{
	public static void main(String[] args){
		TestMessagePanel_007 frame = new TestMessagePanel_007();
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public TestMessagePanel_007(){
		MessagePanel_008 messagePanel1 = new MessagePanel_008("Welcome to Java");
		MessagePanel_008 messagePanel2 = new MessagePanel_008("Java is fun");
		MessagePanel_008 messagePanel3 = new MessagePanel_008("Java is cool");
		MessagePanel_008 messagePanel4 = new MessagePanel_008("I love Java");
		messagePanel1.setFont(new Font("SansSerif", Font.ITALIC, 20));
		messagePanel2.setFont(new Font("Courier", Font.BOLD, 20));
		messagePanel3.setFont(new Font("Times", Font.ITALIC, 20));
		messagePanel4.setFont(new Font("Californian FB", Font.PLAIN, 20));
		messagePanel1.setBackground(Color.RED);
		messagePanel2.setBackground(Color.CYAN);
		messagePanel3.setBackground(Color.GREEN);
		messagePanel4.setBackground(Color.WHITE);
		messagePanel1.setCentered(true);
		
		setLayout(new GridLayout(2, 2));
		add(messagePanel1);
		add(messagePanel2);
		add(messagePanel3);
		add(messagePanel4);
	}

}
