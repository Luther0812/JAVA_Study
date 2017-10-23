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
import java.util.*;

public class Chapter_Test_032 extends JFrame{
	private ArrayList X = new ArrayList();
	private ArrayList Y = new ArrayList();
	final int RADIUS = 10;
	
	public static void main(String[] args){
		Chapter_Test_032 frame = new Chapter_Test_032();
		frame.setTitle("Chapter_Test_032");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_032(){
		add(new NewPanel_032());
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				if(e.getButton() == MouseEvent.BUTTON1){
					X.add(e.getX() - 13);
					Y.add(e.getY() - 35);
					repaint();
				}else if(e.getButton() == MouseEvent.BUTTON3){
					int x = e.getX() - 13;
					int y = e.getY() - 35;
					for(int i = 0; i < X.size(); i++){
						boolean xPosition = ((int)X.get(i) - 5) < x && x < ((int)X.get(i) + 5);
						boolean yPosition = ((int)Y.get(i) - 5) < y && y < ((int)Y.get(i) + 5);
						if(xPosition && yPosition){
							X.remove(i);
							Y.remove(i);
						}
					}
					repaint();
				}
			}
		});
	}
	
	class NewPanel_032 extends JPanel{
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			for(int i = 0; i < X.size(); i++){
				g.drawOval((int)X.get(i), (int)Y.get(i), RADIUS, RADIUS);
			}
		}
	}

}
