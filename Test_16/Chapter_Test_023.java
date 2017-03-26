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
import java.util.ArrayList;

public class Chapter_Test_023 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_023 frame = new Chapter_Test_023();
		frame.setTitle("Chapter_Test_023");
		frame.setSize(200, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_023(){
		add(new NewPanel_023());
	}

}

class NewPanel_023 extends JPanel{
	private int x;
	private int y;
	
	private ArrayList p = new ArrayList();
	
	private boolean flag;
	private boolean temp;
	
	public NewPanel_023(){
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				setTemp(true);
				x = e.getX();
				y = e.getY();
				p.add(x);
				p.add(y);
				if(p.size() == 2){
					setFlag(true);
				}else{
					setFlag(false);
				}
				repaint();
			}
		});
	}
	
	public boolean getFlag(){
		return flag;
	}
	
	public void setFlag(boolean flag){
		this.flag = flag;
	}
	
	public boolean getTemp(){
		return temp;
	}
	
	public void setTemp(boolean temp){
		this.temp = temp;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		if(getTemp()){
			if(getFlag()){
				g.drawOval(Integer.valueOf(p.get(0).toString()), Integer.valueOf(p.get(1).toString()), 5, 5);
			}else{
				int count = p.size();
				g.fillOval(Integer.valueOf(p.get(count - 2).toString()), Integer.valueOf(p.get(count - 1).toString()), 5, 5);
				g.fillOval(Integer.valueOf(p.get(count - 4).toString()), Integer.valueOf(p.get(count - 3).toString()), 5, 5);
				for(int i = count - 5; i >= 1;){
					g.drawOval(Integer.valueOf(p.get(i - 1).toString()), Integer.valueOf(p.get(i).toString()), 5, 5);
					i = i - 2;
				}
			}
		}else{
			
		}		
	}
}
