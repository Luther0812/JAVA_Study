/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_16;

/**
 * @author up
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chapter_Test_008 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_008 frame = new Chapter_Test_008();
		frame.setTitle("Chapter_Test_008");
		frame.setSize(200,  300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_008(){
		NewPanel_008 p = new NewPanel_008();
		add(p);
		
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				p.setX(e.getX());
				p.setY(e.getY());
				repaint();
			}
			
			public void mouseReleased(MouseEvent e){
				p.setX(-1);
				p.setY(-1);
				repaint();
			}
		});
	}

}

class NewPanel_008 extends JPanel{
	private int X;
	private int Y;
	
	public void setX(int x){
		this.X = x;
	}
	
	public void setY(int y){
		this.Y = y;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawString("(" + X + ", " + Y + ")", X, Y);
	}
}
