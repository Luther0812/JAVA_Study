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

public class Chapter_Test_009 {
	public static void main(String[] args){
		JFrame frame = new JFrame("Chapter_Test_009");
		
		String[] list = new String[54];
		for(int i = 0; i < list.length; i++){
			list[i] = (i + 1) + ".png";
		}
		
		int n1 = 0;
		int	n2 = 0;
		int n3 = 0;
		while(n1 == n2 && n2 == n3){
			n1 = (int)(Math.random() * 54);
			n2 = (int)(Math.random() * 54);
			n3 = (int)(Math.random() * 54);
		}
		
		ImageIcon image1 = new ImageIcon(list[n1]);
		ImageIcon image2 = new ImageIcon(list[n2]);
		ImageIcon image3 = new ImageIcon(list[n3]);
		
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		frame.add(new JLabel(image1));
		frame.add(new JLabel(image2));
		frame.add(new JLabel(image3));
		
		frame.setTitle("Chapter_Test_009");
		frame.setSize(200, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
