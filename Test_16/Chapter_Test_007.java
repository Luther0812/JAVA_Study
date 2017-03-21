/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_16;

/**
 * @author up
 *
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

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
		NewPanel_007 p = new NewPanel_007();
		add(p);
		
		p.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				p.setBackground(Color.BLACK);
				repaint();
			}
			
			public void mouseReleased(MouseEvent e){
				p.setBackground(Color.WHITE);
				repaint();
			}
		});
	}

}

class NewPanel_007 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		this.setBackground(Color.CYAN);
	}
}
