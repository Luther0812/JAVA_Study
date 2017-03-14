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

public class Chapter_Test_002 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_002 frame = new Chapter_Test_002();
		frame.setTitle("Chapter_Test_002");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_002(){
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		add(new NewJButton_002("OK"));
		add(new NewJButton_002("Cancel"));
	}

}

class NewJButton_002 extends JButton{
	private String string = null;
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		
		g.drawOval((int)(width * 0.1), (int)(0.1 * height), (int)(width * 0.8), (int)(0.8 * height));
		FontMetrics fm = g.getFontMetrics();
		int stringWidth = fm.stringWidth(string);
		int stringAscent = fm.getAscent();
		int xCoordinate = width / 2 - stringWidth / 2;
		int yCoordinate = height / 2 + stringAscent / 2;
		g.drawString(string, xCoordinate, yCoordinate);
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(80, 50);
	}
	
	public NewJButton_002(String string){
		this.string = string;
	}
	
}
