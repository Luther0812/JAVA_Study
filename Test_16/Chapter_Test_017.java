/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_16;

/**
 * @author LiuYu
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chapter_Test_017 extends JFrame{	
	public static void main(String[] args){
		Chapter_Test_017 frame = new Chapter_Test_017();
		
		frame.setTitle("Chapter_Test_017");
		frame.setSize(600, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_017(){
		add(new NewPanel_017());
	}

}

class NewPanel_017 extends JPanel{
	private JLabel label = new JLabel("Label");
	private int xCenter = getWidth() / 2;
	private int yCenter = getHeight() / 2;
	
	private int xAdd = 0;
	private int yAdd = 0;
	
	public NewPanel_017(){
		label.setLocation(xCenter + xAdd, yCenter + yAdd);
		add(label);
		Timer timer = new Timer(500, new TimerListener_017());
		timer.start();
		
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				timer.stop();
			}
			
			public void mouseReleased(MouseEvent e){
				timer.start();
			}
		});
	}
	
	public JLabel getLabel(){
		return this.label;
	}
	
	public void setLabel(JLabel label){
		this.label = label;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		this.xCenter = getWidth() / 2;
		this.yCenter = getHeight() / 2;
		label.setLocation(xCenter + xAdd, yCenter + yAdd);
	}
	
	class TimerListener_017 implements ActionListener{
		int count = 1;
		public void actionPerformed(ActionEvent e){
			xAdd = (int)(Math.cos(count * (Math.PI / 4)) * 50);
			yAdd = (int)(Math.sin(count * (Math.PI / 4)) * 50);
			repaint();
			count++;
		}
	}
}
