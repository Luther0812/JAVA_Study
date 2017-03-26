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
import java.awt.geom.Line2D;

public class Chapter_Test_021 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_021 frame = new Chapter_Test_021();
		frame.setTitle("Chapter_Test_021");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_021(){
		add(new NewPanel_021());
	}

}

class NewPanel_021 extends JPanel{
	private String message = "";
	private int x;
	private int y;
	private Polygon p = new Polygon();
	
	public NewPanel_021(){
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseMoved(MouseEvent e){
				boolean flag = isContain(e.getX(), e.getY());
				if(flag){
					setMessage("Inter");
					setXNum(e.getX());
					setYNum(e.getY());
				}else{
					setMessage("Outer");
					setXNum(e.getX());
					setYNum(e.getY());
				}
				repaint();
			}
		});
	}
	
	public String getMessage(){
		return this.message;
	}
	
	public int getXNum(){
		return this.x;
	}
	
	public int getYNum(){
		return this.y;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public void setXNum(int x){
		this.x = x;
	}
	
	public void setYNum(int y){
		this.y = y;
	}
	
	public boolean isContain(int x, int y){
		Line2D.Double l1 = new Line2D.Double(20, 20, x, y);
		Line2D.Double l2 = new Line2D.Double(100, 100, x, y);
		Line2D.Double l3 = new Line2D.Double(140, 40, x, y);
		
		Line2D.Double n1 = new Line2D.Double(100, 100, 20, 20);
		Line2D.Double n2 = new Line2D.Double(140, 40, 100, 100);
		Line2D.Double n3 = new Line2D.Double(20, 20, 140, 40);
		
		if(!l1.intersectsLine(n2) && !l2.intersectsLine(n3) && !l3.intersectsLine(n1)){
			return true;
		}else{
			return false;
		}
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		p.addPoint(20,  20);
		p.addPoint(100,  100);
		p.addPoint(140,  40);
		
		g.drawPolygon(p);
		g.drawString(message, x, y);
	}
}
