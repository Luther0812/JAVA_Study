/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_16;

/**
 * @author LiuYu
 *
 */
import javax.swing.*;
import java.awt.*;

public class ControlCircle1_001 extends JFrame{
	private JButton jbtEnalrge = new JButton("Enlarge");
	private JButton jbtShrink = new JButton("Shrink");
	private CirclePanel canvas = new CirclePanel();
	
	public ControlCircle1_001(){
		JPanel panel = new JPanel();
		panel.add(jbtEnalrge);
		panel.add(jbtShrink);
		
		this.add(canvas, BorderLayout.CENTER);
		this.add(panel, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args){
		JFrame frame = new ControlCircle1_001();
		frame.setTitle("ControlCircle1_001");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class CirclePanel extends JPanel{
	private int radius = 5;
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
	}
}
