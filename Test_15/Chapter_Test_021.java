/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_15;

/**
 * @author LiuYu
 *
 */
import javax.swing.*;
import java.awt.*;

public class Chapter_Test_021 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_021 frame = new Chapter_Test_021();
		frame.setTitle("Chapter_Test_007");
		frame.setSize(200,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_021(){
		setLayout(new GridLayout(3, 3));
		add(new NewPanel_021((int)(Math.random() * 2)));
		add(new NewPanel_021((int)(Math.random() * 2)));
		add(new NewPanel_021((int)(Math.random() * 2)));
		add(new NewPanel_021((int)(Math.random() * 2)));
		add(new NewPanel_021((int)(Math.random() * 2)));
		add(new NewPanel_021((int)(Math.random() * 2)));
		add(new NewPanel_021((int)(Math.random() * 2)));
		add(new NewPanel_021((int)(Math.random() * 2)));
		add(new NewPanel_021((int)(Math.random() * 2)));
	}

}

class NewPanel_021 extends JPanel{
	private int choose;
	public NewPanel_021(){
		
	}
	
	public NewPanel_021(int num){
		this.choose = num;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		ImageIcon imageTotal = new ImageIcon("0.JPG");
		Image image_0 = imageTotal.getImage();
		
		ImageIcon imageT = new ImageIcon("1.JPG");
		Image image_1 = imageT.getImage();
		
		switch(choose){
		case 0:
			g.drawImage(image_0, 0, 0, getWidth(), getHeight(), this);
			break;
		case 1:
			g.drawImage(image_1, 0, 0, getWidth(), getHeight(), this);
			break;
		}
	}
}
