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

public class Chapter_Test_013 extends JFrame{	
	public static void main(String[] args){
		Chapter_Test_013 frame = new Chapter_Test_013();
		frame.setTitle("Chapter_Test_013");
		frame.setSize(900, 700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_013(){
		add(new NewPanel_013());
	}	

}

class NewPanel_013 extends JPanel{
	private ImageIcon[] list = new ImageIcon[5];
	private int num = 0;
	private Image image;
	
	public NewPanel_013(){
		for(int i = 0; i < 5; i++){
			String name = "slide" + i + ".jpg";
			list[i] = new ImageIcon(name);
		}
		
		image = list[0].getImage();
		
		Timer timer = new Timer(1000, new TimerListener());
		timer.start();
	}
	
	public ImageIcon getImage(int num){
		return this.list[num];
	}
	
	public int getCurrentImageIndex(){
		return num;
	}
	
	public void setCurrentImageIndex(int num){
		this.num = num;
	}
	
	protected void paintComponent(Graphics g){
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		
		int xRadius = image.getWidth(this) / 2;
		int yRadius = image.getHeight(this) / 2;
		super.paintComponent(g);
		
		g.drawImage(image, xCenter - xRadius, yCenter - yRadius, this);
	}
	
	class TimerListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(getCurrentImageIndex() == 4){
				image = list[0].getImage();
				repaint();
				setCurrentImageIndex(0);
			}else{
				image = list[getCurrentImageIndex() + 1].getImage();
				repaint();
				setCurrentImageIndex(getCurrentImageIndex() + 1);
			}
		}
	}
}
