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

public class Chapter_Test_004 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_004 frame = new Chapter_Test_004();
		frame.setTitle("Chapter_Test_004");
		frame.setSize(300, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_004(){
		setLayout(new GridLayout(3, 2, 0, 0));
		add(new JPanel());
		add(new NewString_004());
		add(new JPanel());
		add(new NewListRow_004());
		add(new NewListColumn_004());
		add(new NewPanel_004());
	}

}

class NewString_004 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		FontMetrics fm = g.getFontMetrics();
		int xCoordinate = (int)(this.getWidth() * 0.1);
		int yCoordinate = (int)(this.getHeight() * 0.5);
		g.drawString("Multiplication Table", xCoordinate, yCoordinate);
	}
}

class NewListRow_004 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		FontMetrics fm = g.getFontMetrics();
		int xCoordinate = (int)(this.getWidth() * 0.1);
		int yCoordinate = (int)(this.getHeight() * 0.3);
		
		for(int i = 0; i < 9; i++){
			String t = (i + 1) + "";
			g.drawString(t, (int)(i * xCoordinate), yCoordinate);
		}
	}
}

class NewListColumn_004 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		FontMetrics fm = g.getFontMetrics();
		int xCoordinate = (int)(this.getWidth() * 0.9);
		int yCoordinate = (int)(this.getHeight() * 0.1);
		
		for(int i = 0; i < 9; i++){
			String t = (i + 1) + "";
			g.drawString(t, xCoordinate, (int)((i + 1) * yCoordinate));
		}
	}
}

class NewPanel_004 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawRect(0, 0, (int)(this.getWidth() * 1), (int)(this.getHeight() * 1));
		int width = (int)(this.getWidth() * 0.1);
		int height = (int)(this.getHeight() * 0.1);
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= 9; j++){
				String t = (i * j) + "";
				g.drawString(t, (int)(j * width), (int)(i * height));
			}
		}
	}
}
