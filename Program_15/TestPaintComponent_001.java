/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_15;

/**
 * @author up
 *
 */
import javax.swing.*;
import java.awt.Graphics;

public class TestPaintComponent_001 {
	public static void main(String[] args){
		TestPaintComponent frame = new TestPaintComponent();
		frame.setTitle("TestPaintComponent_001");
		frame.setSize(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class TestPaintComponent extends JFrame{
	public TestPaintComponent(){
		add(new NewPanel());
	}
}

class NewPanel extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawLine(0, 0, 50, 50);
		g.drawString("Banner", 0, 40);
		
	}
}
