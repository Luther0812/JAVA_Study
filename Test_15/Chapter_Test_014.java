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

public class Chapter_Test_014 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_014 frame = new Chapter_Test_014();
		frame.setTitle("Chapter_Test_014");
		frame.setSize(200, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_014(){
		add(new NewPanel_014());
	}

}

class NewPanel_014 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		
	}
}
