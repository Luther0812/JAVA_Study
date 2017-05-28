/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_35;

/**
 * @author up
 *
 */
import java.awt.*;
import java.awt.event.*;

public class CircleView_002 extends javax.swing.JPanel implements ActionListener{
	private CircleModel_001 model;
	
	public void actionPerformed(ActionEvent actionEvent){
		repaint();
	}
	
	public void setModel(CircleModel_001 newModel){
		model = newModel;
		
		if(model != null){
			model.addActionListener(this);
		}
		repaint();
	}
	
	public CircleModel_001 getModel(){
		return model;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(model == null){
			return;
		}
		
		g.setColor(model.getColor());
		
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)model.getRadius();
		
		if(model.isFilled()){
			g.fillOval(xCenter - radius, yCenter - radius, radius * 2, radius * 2);
		}else{
			g.drawOval(xCenter - radius, yCenter - radius, radius * 2, radius * 2);
		}
	}

}
