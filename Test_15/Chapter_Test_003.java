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

public class Chapter_Test_003 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_003 frame = new Chapter_Test_003();
		frame.setTitle("Chapter_Test_003");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_003(){
		add(new NewPanel_003());
	}

}

class NewPanel_003 extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth() / 8;
		int height = getHeight() / 8;
		
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if(i % 2 == 0 && j % 2 == 0){
					g.setColor(Color.WHITE);
					g.fillRect((int)(j * width), (int)(i * height), width, height);
				}else if(i % 2 == 0 && j % 2 != 0){
					g.setColor(Color.BLACK);
					g.fillRect((int)(j * width), (int)(i * height), width, height);
				}else if(i % 2 != 0 && j % 2 == 0){
					g.setColor(Color.BLACK);
					g.fillRect((int)(j * width), (int)(i * height), width, height);
				}else{
					g.setColor(Color.WHITE);
					g.fillRect((int)(j * width), (int)(i * height), width, height);
				}
			}
		}
	}
}

