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

public class Chapter_Test_005 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_005 frame = new Chapter_Test_005();
		frame.setTitle("Chapter_Test_005");
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_005(){
		add(new NewPanel_005());
	}

}

class NewPanel_005 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		for(int i = 1; i < getHeight() / 30; i++){
			for(int j = 1; j <= i; j++){
				g.drawString(j + "", (getWidth() / (getHeight() / 30)) * j, i * 30);
			}
		}
	}
}
