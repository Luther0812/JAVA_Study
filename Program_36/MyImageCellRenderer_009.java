/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_36;

/**
 * @author up
 *
 */
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class MyImageCellRenderer_009 extends DefaultTableCellRenderer{
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean isFocused, int row, int column){
		Image image = ((ImageIcon)value).getImage();
		ImageViewer imageViewer = new ImageViewer(image);
		
		return imageViewer;
	}

}

class ImageViewer extends JPanel{
	private java.awt.Image image;
	private boolean stretched = true;
	private int xCoordinate;
	private int yCoordinate;
	public ImageViewer(){
		
	}
	
	public ImageViewer(Image image){
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
