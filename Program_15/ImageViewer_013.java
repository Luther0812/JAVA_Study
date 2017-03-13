/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_15;

/**
 * @author LiuYu
 *
 */
import java.awt.*;
import javax.swing.*;

public class ImageViewer_013 extends JPanel{
	private java.awt.Image image;
	private boolean stretched = true;
	private int xCoordinate;
	private int yCoordinate;
	public ImageViewer_013(){
		
	}
	
	public ImageViewer_013(Image image){
		this.image = image;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(image != null){
			g.drawImage(image, xCoordinate, yCoordinate, getWidth(), getHeight(), this);
		}else{
			g.drawImage(image, xCoordinate, yCoordinate, this);
		}
	}
	
	public java.awt.Image getImage(){
		return image;
	}
	
	public void setImage(java.awt.Image image){
		this.image =image;
		repaint();
	}
	
	public boolean isStretched(){
		return stretched;
	}
	
	public void setStretched(boolean stretched){
		this.stretched = stretched;
		repaint();
	}
	
	public int getXCoordinate(){
		return this.xCoordinate;
	}
	
	public int getYCoordinate(){
		return this.yCoordinate;
	}
	
	public void setXCoordinate(int xCoordinate){
		this.xCoordinate = xCoordinate;
		repaint();
	}
	
	public void setYCoordinate(int yCoordinate){
		this.yCoordinate = yCoordinate;
		repaint();
	}

}
