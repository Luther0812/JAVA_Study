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

public class Chapter_Test_014 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_014 frame = new Chapter_Test_014();
		frame.setTitle("Chapter_Test_014");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_014(){
		add(new NewPanel_014());
	}

}

class NewPanel_014 extends JPanel{
	private ImageIcon imageIcon = new ImageIcon("flag.jpg");
	private Image image = imageIcon.getImage();
	private int x = this.getWidth() / 2 + imageIcon.getIconWidth() / 2;
	private int y = this.getHeight() / 2 + imageIcon.getIconHeight();
	
	public NewPanel_014(){
		Timer timer = new Timer(1000, new TimerListener_014());
		timer.start();
	}
	
	public void setY(int num){
		this.y = num;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawImage(image, x, y, this);
	}
	
	class TimerListener_014 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(y > 20){
				y = y - 20;
				setY(y);
			}else{
				System.exit(0);
			}
			repaint();
		}
	}
}
