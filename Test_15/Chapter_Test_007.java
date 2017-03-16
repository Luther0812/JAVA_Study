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

public class Chapter_Test_007 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_007 frame = new Chapter_Test_007();
		frame.setTitle("Chapter_Test_007");
		frame.setSize(200, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_007(){
		setLayout(new GridLayout(3, 3));
		add(new NewPanel_007((int)(Math.random() * 2)));
		add(new NewPanel_007((int)(Math.random() * 2)));
		add(new NewPanel_007((int)(Math.random() * 2)));
		add(new NewPanel_007((int)(Math.random() * 2)));
		add(new NewPanel_007((int)(Math.random() * 2)));
		add(new NewPanel_007((int)(Math.random() * 2)));
		add(new NewPanel_007((int)(Math.random() * 2)));
		add(new NewPanel_007((int)(Math.random() * 2)));
		add(new NewPanel_007((int)(Math.random() * 2)));
	}

}

class NewPanel_007 extends JPanel{
	private int choose;
	
	public NewPanel_007(){
		
	}
	
	public NewPanel_007(int num){
		this.choose = num;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		
		int width = getWidth();
		int height = getHeight();
		
		switch(this.choose){
		case 0:
			g.drawLine((int)(xCenter - width / 2), (int)(yCenter - height / 2), (int)(xCenter + width / 2), (int)(yCenter + height / 2));
			g.drawLine((int)(xCenter + width / 2), (int)(yCenter - height / 2), (int)(xCenter - width / 2), (int)(yCenter + height / 2));
			break;
		case 1:
			g.drawOval(0, 0, width, height);
			break;
		}
	}
}
