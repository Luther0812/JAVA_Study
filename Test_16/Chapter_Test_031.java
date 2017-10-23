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

public class Chapter_Test_031 extends JFrame{
	private JButton jbt1 = new JButton("+1");
	private JButton jbt2 = new JButton("-1");
	private int sides = 3;
	Polygon p = new Polygon();
	
	public static void main(String[] args){
		Chapter_Test_031 frame = new Chapter_Test_031();
		frame.setTitle("Chapter_Test_031");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_031(){
		p.addPoint(200, 50);
		p.addPoint(200 - (int)(Math.sqrt(3) * 50), 200);
		p.addPoint(200 + (int)(Math.sqrt(3) * 50), 200);
		NewPanel_031 panel = new NewPanel_031();
		panel.setLayout(new BorderLayout(5, 10));
		JPanel panelButtons = new JPanel();
		panelButtons.add(jbt1);
		panelButtons.add(jbt2);
		jbt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				p.reset();
				p.addPoint(200, 50);
				sides++;
				double angle = (2 * Math.PI) / sides;
				for(int i = 0; i < sides; i++){
					int X = (int)(200 - 100 * Math.sin(i * angle));
					int Y = (int)(150 - 100 * Math.cos(i * angle));
					p.addPoint(X, Y);
				}
				repaint();
			}
		});
		jbt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(sides > 3){
					p.reset();
					p.addPoint(200, 50);
					sides--;
					double angle = (2 * Math.PI) / sides;
					for(int i = 0; i < sides; i++){
						int X = (int)(200 - 100 * Math.sin(i * angle));
						int Y = (int)(150 - 100 * Math.cos(i * angle));
						p.addPoint(X, Y);
					}
					repaint();
				}else{
					System.out.println("The procedure has an error!");
					System.exit(0);
				}
			}
		});
		panel.add(panelButtons, BorderLayout.SOUTH);
		add(panel);
	}
	
	class NewPanel_031 extends JPanel{
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			g.drawPolygon(p);
		}
	}

}
