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

public class Chapter_Test_022 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_022 frame = new Chapter_Test_022();
		frame.setTitle("Chapter_Test_022");
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_022(){
		add(new NewPanel_022());
	}

}

class NewPanel_022 extends JPanel{
	private int[] x = new int[10];
	private int[] y = new int[10];
	private int width;
	private int height;
	private int xCenter;
	private int yCenter;
	private int xAdd[] = new int[10];
	private int yAdd[] = new int[10];
	
	public NewPanel_022(){
		Timer timer = new Timer(1000, new TimerListener_022());
		timer.start();
	}
	
	public int getW(){
		return this.width;
	}
	
	public int getH(){
		return this.height;
	}
	
	public void setW(int width){
		this.width = width;
	}
	
	public void setH(int height){
		this.height = height;
	}
	
	public int getX(int index){
		return this.x[index];
	}
	
	public int getY(int index){
		return this.y[index];
	}
	
	public void setX(int x, int index){
		this.x[index] = x;
	}
	
	public void setY(int y, int index){
		this.y[index] = y;
	}
	
	public int getXCenter(){
		return this.xCenter;
	}
	
	public int getYCenter(){
		return this.yCenter;
	}
	
	public void setXCenter(int x){
		this.xCenter = x;
	}
	
	public void setYCenter(int y){
		this.yCenter = y;
	}
	
	public int getXAdd(int index){
		return this.xAdd[index];
	}
	
	public int getYAdd(int index){
		return this.yAdd[index];
	}
	
	public void setXAdd(int x, int index){
		this.xAdd[index] = x;
	}
	
	public void setYAdd(int y, int index){
		this.yAdd[index] = y;
	}
	
	class TimerListener_022 implements ActionListener{		
		int count = 0;
		boolean flag1;
		boolean flag2;
		boolean flag3;
		boolean flag4;
		public void actionPerformed(ActionEvent e){
			flag1 = true;
			flag2 = true;
			flag3 = true;
			flag4 = true;
			for(int i = 1; i <= 8; i++){
				if(getY(count) + getYAdd(count) < (int)(0.6 * height)){
					if(isLeft()){
						if(flag1){
							int x = (int)(0.05 * width);
							int y = (int)(0.05 * height);
							setXAdd(getXAdd(count) - x, count);
							setYAdd(y + getYAdd(count), count);
							repaint();
							flag1 = false;
							flag2 = false;
						}						
					}else{
						if(flag2){
							int x = (int)(0.05 * width);
							int y = (int)(0.05 * height);
							setXAdd(x + getXAdd(count), count);
							setYAdd(y + getYAdd(count), count);
							repaint();
							flag2 = false;
							flag1 = false;
						}
					}
				}else{
					if(getY(count) + getYAdd(count) == (int)(0.6 * getH())){
						if(leftFull(getX(count) + getXAdd(count), count)){
							//left is full right is not full
							if(flag3){
								int x = (int)(0.05 * width);
								int y = (int)(0.05 * height);
								setXAdd(x + getXAdd(count), count);
								setYAdd(y + getYAdd(count), count);
								repaint();
								flag3 = false;
								flag4 = false;
							}
						}else if(rightFull(getX(count) + getXAdd(count), count)){
							//left is not full right is full
							if(flag3){
								int x = (int)(0.05 * width);
								int y = (int)(0.05 * height);
								setXAdd(getXAdd(count) - x, count);
								setYAdd(y + getYAdd(count), count);
								repaint();
								flag3 = false;
								flag4 = false;
							}
						}else{
							//left and right is not full
							if(isLeft()){
								if(flag1){
									int x = (int)(0.05 * width);
									int y = (int)(0.05 * height);
									setXAdd(getXAdd(count) - x, count);
									setYAdd(y + getYAdd(count), count);
									repaint();
									flag1 = false;
									flag2 = false;
									flag4 = false;
								}						
							}else{
								if(flag2){
									int x = (int)(0.05 * width);
									int y = (int)(0.05 * height);
									setXAdd(x + getXAdd(count), count);
									setYAdd(y + getYAdd(count), count);
									repaint();
									flag2 = false;
									flag1 = false;
									flag4 = false;
								}
							}
						}
					}else{
						int temp = isEnd(count, getX(count) + getXAdd(count)) - (getY(count) + getYAdd(count) - (int)(0.65 * getH()));
						if(temp == (int)(getH() * 0.70)){
							if(flag4){
								count++;
								flag4 = false;
							}
						}else if(temp == (int)(getH() * 0.75)){
							if(flag4){
								int y = (int)(0.05 * height);
								setYAdd(y + getYAdd(count), count);
								repaint();
								flag4 = false;
							}
						}else if(temp == (int)(getH() * 0.8)){
							if(flag4){
								int y = (int)(0.05 * height);
								setYAdd(y + getYAdd(count), count);
								repaint();
								flag4 = false;
							}
						}else{
							if(flag4){
								int y = (int)(0.05 * height);
								setYAdd(y + getYAdd(count), count);
								repaint();
								flag4 = false;
							}
						}
					}
				}
			}
		}
		
		public boolean leftFull(int x, int index){
			int length = 0;
			for(int i = 0; i < count; i++){
				if(getX(i) + getXAdd(i) == x - (int)(getH() * 0.025)){
					length += (int)(0.05 * getH());
				}
			}
			if(length == (int)(getH() * 0.2)){
				return true;
			}else{
				return false;
			}
		}
		
		public boolean rightFull(int x, int index){
			int length = 0;
			for(int i = 0; i < count; i++){
				if(getX(i) + getXAdd(i) == x + (int)(getH() * 0.05)){
					length += (int)(0.05 * getH());
				}
			}
			if(length == (int)(getH() * 0.2)){
				return true;
			}else{
				return false;
			}
		}
		
		public boolean isLeft(){
			int temp = (int)(Math.random() * 2);
			if(temp == 0){
				return true;
			}else{
				return false;
			}
		}
		
		public int isEnd(int count, int x){
			int xCurrent = x;
			int length = 0;
			for(int i = 0; i < count; i++){
				if(getX(i) + getXAdd(i) == xCurrent){
					length += (int)(0.05 * getH());
				}
			}
			
			return (int)(getH() * 0.85 - length);
		}
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		this.setW(width);
		this.setH(height);
		int xCenter = width / 2;
		int yCenter = height / 2;
		setXCenter(xCenter);
		setYCenter(yCenter);
		
		int t = (int)(0.05 * height);
		int start = (int)(0.3 * height);
		int radius = (int)(height * 0.01);
		int[] list = new int[7];
		
		for(int i = 0; i < 10; i++){
			int x = getXCenter() - (int)(radius  * 2.5);
			int y = getYCenter() - (int)(0.2 * height);
			setX(x, i);
			setY(y, i);
		}
		
		g.drawLine(xCenter - (int)(0.05 * width), (int)(0.2 * height), xCenter - (int)(0.05 * width), (int)(0.3 * height));
		g.drawLine(xCenter + (int)(0.05 * width), (int)(0.2 * height), xCenter + (int)(0.05 * width), (int)(0.3 * height));
		g.drawLine(xCenter - (int)(0.05 * width), (int)(0.3 * height), xCenter - (int)(0.4 * width), (int)(0.65 * height));
		g.drawLine(xCenter + (int)(0.05 * width), (int)(0.3 * height), xCenter + (int)(0.4 * width), (int)(0.65 * height));
		g.drawLine(xCenter - (int)(0.4 * width), (int)(0.65 * height), xCenter - (int)(0.4 * width), (int)(0.85 * height));
		g.drawLine(xCenter + (int)(0.4 * width), (int)(0.65 * height), xCenter + (int)(0.4 * width), (int)(0.85 * height));
		g.drawLine(xCenter - (int)(0.4 * width), (int)(0.85 * height), xCenter + (int)(0.4 * width), (int)(0.85 * height));
		
		g.drawLine(xCenter - (int)(0.3 * width), (int)(0.65 * height), xCenter - (int)(0.3 * width), (int)(0.85 * height));
		g.drawLine(xCenter - (int)(0.2 * width), (int)(0.65 * height), xCenter - (int)(0.2 * width), (int)(0.85 * height));
		g.drawLine(xCenter - (int)(0.1 * width), (int)(0.65 * height), xCenter - (int)(0.1 * width), (int)(0.85 * height));
		g.drawLine(xCenter, (int)(0.65 * height), xCenter, (int)(0.85 * height));
		g.drawLine(xCenter + (int)(0.1 * width), (int)(0.65 * height), xCenter + (int)(0.1 * width), (int)(0.85 * height));
		g.drawLine(xCenter + (int)(0.2 * width), (int)(0.65 * height), xCenter + (int)(0.2 * width), (int)(0.85 * height));
		g.drawLine(xCenter + (int)(0.3 * width), (int)(0.65 * height), xCenter + (int)(0.3 * width), (int)(0.85 * height));
		
		list[0] = (int)(xCenter);
		list[1] = (int)(xCenter - 0.05 * width);
		list[2] = (int)(xCenter - 0.1 * width);
		list[3] = (int)(xCenter - 0.15 * width);
		list[4] = (int)(xCenter - 0.2 * width);
		list[5] = (int)(xCenter - 0.25 * width);
		list[6] = (int)(xCenter - 0.3 * width);
		for(int i = 1; i <= 7; i++){
			start = start + t;
			for(int j = 0; j < i; j++){
				g.setColor(Color.BLACK);
				g.fillOval(list[i - 1] + (int)(j * 0.1 * width), start, radius, radius);
			}
		}
		
		g.fillOval(getX(0) + xAdd[0], getY(0) + yAdd[0], radius * 5, radius * 5);
		g.fillOval(getX(1) + xAdd[1], getY(1) + yAdd[1], radius * 5, radius * 5);
		g.fillOval(getX(2) + xAdd[2], getY(2) + yAdd[2], radius * 5, radius * 5);
		g.fillOval(getX(3) + xAdd[3], getY(3) + yAdd[3], radius * 5, radius * 5);
		g.fillOval(getX(4) + xAdd[4], getY(4) + yAdd[4], radius * 5, radius * 5);
		g.fillOval(getX(5) + xAdd[5], getY(5) + yAdd[5], radius * 5, radius * 5);
		g.fillOval(getX(6) + xAdd[6], getY(6) + yAdd[6], radius * 5, radius * 5);
		g.fillOval(getX(7) + xAdd[7], getY(7) + yAdd[7], radius * 5, radius * 5);
		g.fillOval(getX(8) + xAdd[8], getY(8) + yAdd[8], radius * 5, radius * 5);
		g.fillOval(getX(9) + xAdd[9], getY(9) + yAdd[9], radius * 5, radius * 5);
	}
}
