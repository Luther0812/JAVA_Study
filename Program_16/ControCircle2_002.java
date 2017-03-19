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
import java.awt.event.*;

public class ControCircle2_002 extends JFrame{
	private JButton jbtEnalrge = new JButton("Enlarge");
	private JButton jbtShrink = new JButton("Shrink");
	private CirclePanel_002 canvas = new CirclePanel_002();
	
	public ControCircle2_002(){
		JPanel panel = new JPanel();
		panel.add(jbtEnalrge);
		panel.add(jbtShrink);
		
		this.add(canvas, BorderLayout.CENTER);
		this.add(panel,  BorderLayout.SOUTH);
		
		jbtEnalrge.addActionListener(new EnlargeListener());
		jbtShrink.addActionListener(new ShrinkListener());
	}
	
	public static void main(String[] args){
		JFrame frame = new ControCircle2_002();
		frame.setTitle("ControlCircle2_002");
		frame.setSize(200,  200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	class EnlargeListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			canvas.enlarge();
		}
	}
	
	class ShrinkListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			canvas.shrink();
		}
	}

}

class CirclePanel_002 extends JPanel{
	private int radius = 5;
	
	public void enlarge(){
		radius++;
		repaint();
	}
	
	public void shrink(){
		radius--;
		repaint();
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
	}
}
