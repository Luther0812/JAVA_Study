/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_33;

/**
 * @author up
 *
 */
import java.awt.*;

public class DiagonalLayout_004 implements LayoutManager, java.io.Serializable{
	private int gap = 10;
	private boolean majorDiagonal = true;
	private boolean lastFill = false;
	public DiagonalLayout_004(){
		
	}
	
	public void addLayoutComponent(String name, Component comp){
		
	}
	
	public void removeLayoutComponent(Component comp){
		
	}
	
	public Dimension preferredLayoutSize(Container parent){
		return minimumLayoutSize(parent);
	}
	
	public Dimension minimumLayoutSize(Container parent){
		return new Dimension(0, 0);
	}
	
	public void layoutContainer(Container parent){
		int numberOfComponents = parent.getComponentCount();
		
		Insets insets = parent.getInsets();
		int w = parent.getWidth() - insets.left - insets.right;
		int h = parent.getHeight() - insets.top - insets.bottom;
		
		if(majorDiagonal){
			int x = 10, y = 10;
			for(int j = 0; j < numberOfComponents; j++){
				Component c = parent.getComponent(j);
				Dimension d = c.getPreferredSize();
				
				if(c.isVisible()){
					if(lastFill && (j == numberOfComponents - 1)){
						c.setBounds(x, y, w - x, h - y);
					}else{
						c.setBounds(x,  y,  w - x,  h - y);
					}
					
					x += d.height + gap;
					y += d.height + gap;
				}
			}
		}else{
			int x = w - 10, y = 10;
			for(int j = 0; j < numberOfComponents; j++){
				Component c = parent.getComponent(j);
				Dimension d = c.getPreferredSize();
				
				if(c.isVisible()){
					if(lastFill && (j == numberOfComponents - 1)){
						c.setBounds(0,  y,  x,  h - y);
					}else{
						c.setBounds(x, d.width, y, d.height);
					}
				}
				
				x -= (d.height + gap);
				y += d.height + gap;
			}
		}
	}
	
	public int getGap(){
		return gap;
	}
	
	public void setGap(int gap){
		this.gap = gap;
	}
	
	public void setMajorDiagonal(boolean newMajorDiagonal){
		majorDiagonal = newMajorDiagonal;
	}
	
	public boolean isMajorDiagonal(){
		return majorDiagonal;
	}
	
	public void setLastFill(boolean newLastFill){
		lastFill = newLastFill;
	}
	
	public boolean isLastFill(){
		return lastFill;
	}

}
