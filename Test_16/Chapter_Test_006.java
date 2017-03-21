/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_16;

/**
 * @author up
 *
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Chapter_Test_006 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_006 frame = new Chapter_Test_006();
		frame.setTitle("Chapter_Test_006");
		frame.setSize(200, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_006(){
		NewPanel_006 panel = new NewPanel_006();
		add(panel);
		
		String s1 = "Java is fun";
		String s2 = "Java is powerful";
		
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				String s = panel.getMessage();
				if(s == "Java is fun"){
					panel.setMessage("Java is powerful");
					repaint();
				}else{
					panel.setMessage("Java is fun");
					repaint();
				}
			}
		});
	}

}

class NewPanel_006 extends JPanel{
	private String message = "Java is fun";
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawString(message, getWidth() / 2, getHeight() / 2);
	}
	
	public String getMessage(){
		return this.message;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	
}
