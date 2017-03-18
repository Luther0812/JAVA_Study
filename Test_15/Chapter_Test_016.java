/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_15;

/**
 * @author LiuYu
 *
 */
import javax.swing.*;
import java.awt.*;

public class Chapter_Test_016 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_016 frame = new Chapter_Test_016();
		frame.setTitle("Chapter_Test_016");
		frame.setSize(400, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_016(){
		NewPanel_016 p = new NewPanel_016();
		add(p);
	}

}

class NewPanel_016 extends JPanel{	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		g.setFont(new Font("TimesRoman", Font.BOLD, 20));
		g.drawString("Java is fun", (int)(width * 0.3), (int)(height * 0.4));
		FontMetrics fm = g.getFontMetrics();
		int a = fm.getAscent();
		int b = fm.getDescent();
		int c = fm.getLeading();
		int d = fm.stringWidth("Java is fun");
		String t = "Ascent: " + a + " Descent: " + b + " Leading: " + c + " string width: " + d;
		g.setFont(new Font("TimesRoman", Font.BOLD, 10));
		g.drawString(t, (int)(width * 0.1), (int)(height * 0.5));
	}

}
