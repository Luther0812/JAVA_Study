/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_12;

/**
 * @author LiuYu
 *
 */
import javax.swing.*;
import java.awt.*;

public class Chapter_Test_007 {
	public static void main(String[] args){
		JFrame frame = new JFrame("Chapter_Test_007");
		frame.setLayout(new GridLayout(3, 3, 0, 0));
		ImageIcon X = new ImageIcon("x.gif");
		ImageIcon O = new ImageIcon("o.gif");
		for(int i = 1; i <= 9; i++){
			int num = (int)(Math.random() * 3);
			if(num == 0){
				frame.add(new JLabel());
			}else if(num == 1){
				frame.add(new JLabel("X"));
			}else{
				frame.add(new JLabel("O"));
			}
		}
		frame.setTitle("Chapter_Test_007");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
