/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_15;

/**
 * @author up
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

public class Chapter_Test_001 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_001 frame = new Chapter_Test_001();
		frame.setTitle("Chapter_Test_001");
		frame.setLocationRelativeTo(null);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_001(){
		add(new NewPanel_001());
	}

}

class NewPanel_001 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		int width = getWidth() / 3;
		int height = getHeight() / 3;
		g.setColor(Color.RED);
		g.drawLine(width, 0, width, getHeight());
		g.drawLine(width * 2, 0, width * 2, getHeight());
		g.setColor(Color.BLUE);;
		g.drawLine(0, height, getWidth(), height);
		g.drawLine(0, 2 * height, getWidth(), 2 * height);
	}
}
