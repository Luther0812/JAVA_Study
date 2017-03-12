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

public class Chapter_Test_010 {
	public static void main(String[] args){
		JFrame frame = new JFrame("Chapter_Test_010");
		frame.setLayout(new GridLayout(8, 8 ,0, 0));
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if(i % 2 == 0 && j % 2 == 0){
					JButton b1 = new JButton();
					b1.setBackground(Color.WHITE);
					frame.add(b1);
				}else if(i % 2 == 0 && j % 2 != 0){
					JButton b2 = new JButton();
					b2.setBackground(Color.BLACK);
					frame.add(b2);
				}else if(i % 2 != 0 && j % 2 == 0){
					JButton b2 = new JButton();
					b2.setBackground(Color.BLACK);
					frame.add(b2);
				}else{
					JButton b1 = new JButton();
					b1.setBackground(Color.WHITE);
					frame.add(b1);
				}
			}
		}
		frame.setTitle("Chapter_Test_010");
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
