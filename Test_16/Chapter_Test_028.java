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

public class Chapter_Test_028 extends JFrame{
	private NewPanel_028 randomPanel = new NewPanel_028();
	private JButton btn = new JButton("START");
	boolean Start = false;
	
	public Chapter_Test_028(){
		randomPanel.setLayout(new BorderLayout(5, 10));
		randomPanel.add(btn, BorderLayout.SOUTH);
		add(randomPanel);
		
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Start = true;
				repaint();
			}
		});
		
	}
	
	public static void main(String[] args){
		Chapter_Test_028 frame = new Chapter_Test_028();
		frame.setTitle("Chapter_Test_028");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Point_028 avoidRandomWalks(){
		Point_028 root = new Point_028(200, 180);
		while(!(root.getX(root.getSize() - 1) == 20 || root.getX(root.getSize() - 1) == 360 ||
				root.getY(root.getSize() - 1) == 20 || root.getY(root.getSize() - 1) == 340 ||
				(root.contains(root.getX(root.getSize() - 1) + 20, root.getY(root.getSize() - 1)) &&
				root.contains(root.getX(root.getSize() - 1) - 20, root.getY(root.getSize() - 1)) &&
				root.contains(root.getX(root.getSize() - 1), root.getY(root.getSize() - 1) + 20) &&
				root.contains(root.getX(root.getSize() - 1), root.getY(root.getSize() - 1) - 20)))){
			int xFlag = Math.random() > 0.5 ? 1 : 0;
			int yFlag = Math.random() > 0.5 ? 1 : 0;
			
			int t = root.getSize();
			
			if(xFlag == 1){
				if(yFlag == 1){
					if(root.contains(root.getX(t - 1), root.getY(t - 1) + 20)){
						
					}else{
						root.addX(root.getX(t - 1));
						root.addY(root.getY(t - 1) + 20);
					}
				}else{
					if(root.contains(root.getX(t - 1), root.getY(t - 1) - 20)){
						
					}else{
						root.addX(root.getX(t - 1));
						root.addY(root.getY(t - 1) - 20);
					}
				}
			}else{
				if(yFlag == 1){
					if(root.contains(root.getX(t - 1) + 20, root.getY(t - 1))){
						
					}else{
						root.addX(root.getX(t - 1) + 20);
						root.addY(root.getY(t - 1));
					}
				}else{
					if(root.contains(root.getX(t - 1) - 20, root.getY(t - 1))){
						
					}else{
						root.addX(root.getX(t - 1) - 20);
						root.addY(root.getY(t - 1));
					}
				}
			}
		}
		return root;
	}
	
	class NewPanel_028 extends JPanel{

		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			g.setColor(Color.BLACK);
			
			for(int i = 0; i < 17; i++){
				for(int j = 0; j < 17; j++){
					g.fillOval(35 + i * 20, 15 + j * 20, 5, 5);
				}
			}
			
			if(Start){
				Point_028 root = avoidRandomWalks();
				int size = root.getSize();
				
				g.setColor(Color.BLUE);
				
				for(int i = 0; i < size - 1; i++){
					g.drawLine(root.getX(i), root.getY(i), root.getX(i + 1), root.getY(i + 1));
				}
				Start = false;
			}
		}
	}

}

class Point_028{
	ArrayList listX = new ArrayList();
	ArrayList listY = new ArrayList();
	int size;
	
	public Point_028(int X, int Y){
		listX.add(X);
		listY.add(Y);
	}
	
	public void addX(int X){
		listX.add(X);
	}
	
	public void addY(int Y){
		listY.add(Y);
	}
	
	public int getX(int index){
		int X = (int)listX.get(index);
		return X;
	}
	
	public int getY(int index){
		int Y = (int)listY.get(index);
		return Y;
	}
	
	public int getSize(){
		if(listX.size() != listY.size()){
			System.out.println("The procedure has an error");
			System.exit(0);
		}else{
			size = listX.size();
		}
		
		return size;
	}
	
	public boolean contains(int X, int Y){
		int size = this.getSize();
		for(int i = 0; i < size; i++){
			if(X == this.getX(i) && Y == this.getY(i)){
				return true;
			}
		}
		
		return false;
	}
}
