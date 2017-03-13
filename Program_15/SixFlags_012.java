/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_15;

/**
 * @author LiuYu
 *
 */
import javax.swing.*;
import java.awt.*;

public class SixFlags_012 extends JFrame{
	public SixFlags_012(){
		Image image1 = new ImageIcon("us.gif").getImage();
		Image image2 = new ImageIcon("ca.gif").getImage();
		Image image3 = new ImageIcon("india.gif").getImage();
		Image image4 = new ImageIcon("uk.gif").getImage();
		Image image5 = new ImageIcon("china.gif").getImage();
		Image image6 = new ImageIcon("norway.gif").getImage();
		
		setLayout(new GridLayout(2, 0, 5, 5));
		add(new ImageViewer_013(image1));
		add(new ImageViewer_013(image2));
		add(new ImageViewer_013(image3));
		add(new ImageViewer_013(image4));
		add(new ImageViewer_013(image5));
		add(new ImageViewer_013(image6));
	}
	
	public static void main(String[] args){
		SixFlags_012 frame = new SixFlags_012();
		frame.setTitle("SixFlags_012");
		frame.setSize(400, 320);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
