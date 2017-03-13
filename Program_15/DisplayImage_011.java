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

public class DisplayImage_011 extends JFrame{
	public static void main(String[] args){
		JFrame frame = new DisplayImage_011();
		frame.setTitle("DisplayImage_011");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public DisplayImage_011(){
		add(new ImagePanel());
	}

}

class ImagePanel extends JPanel{
	private ImageIcon imageIcon = new ImageIcon("us.gif");
	private Image image = imageIcon.getImage();
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(image != null){
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		}
	}
}
