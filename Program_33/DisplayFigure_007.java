/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_33;

/**
 * @author up
 *
 */
import java.awt.*;
import javax.swing.*;

public class DisplayFigure_007 extends JApplet{
	private JTabbedPane jtpFigures = new JTabbedPane();
	private FigurePanel squarePanel = new FigurePanel();
	private FigurePanel rectanglePanel = new FigurePanel();
	private FigurePanel circlePanel = new FigurePanel();
	private FigurePanel ovalPanel = new FigurePanel();
	
	public DisplayFigure_007(){
		squarePanel.setType(FigurePanel.LINE);
		rectanglePanel.setType(FigurePanel.RECTANGLE);
		circlePanel.setType(FigurePanel.ROUND_RECTANGLE);
		ovalPanel.setType(FigurePanel.OVAL);
		
		add(jtpFigures, BorderLayout.CENTER);
		jtpFigures.add(squarePanel, "Line");
		jtpFigures.add(rectanglePanel, "Rectangle");
		jtpFigures.add(circlePanel, "Round Rectangle");
		jtpFigures.add(ovalPanel, "Oval");
		
		jtpFigures.setToolTipTextAt(0, "Square");
		jtpFigures.setToolTipTextAt(1, "Rectangle");
		jtpFigures.setToolTipTextAt(2, "Circle");
		jtpFigures.setToolTipTextAt(3, "Oval");
	}

}

class FigurePanel extends JPanel{
	public static final int LINE = 1;
	public static final int RECTANGLE = 2;
	public static final int ROUND_RECTANGLE = 3;
	public static final int OVAL = 4;
	
	private int type = 1;
	private boolean filled = false;
	
	public FigurePanel(){
		
	}
	
	public FigurePanel(int type){
		this.type = type;
	}

	public FigurePanel(int type, boolean filled){
		this.type = type;
		this.filled = filled;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		switch(type){
		case LINE:
			g.setColor(Color.BLACK);
			g.drawLine(10, 10, width - 10, height - 10);
			g.drawLine(width - 10, 10, 10, height - 10);
			break;
		case RECTANGLE:
			g.setColor(Color.BLUE);
			if(filled){
				g.fillRect((int)(0.1 * width), (int)(0.1 * height), (int)(0.8 * width), (int)(0.8 * height));
			}else{
				g.drawRect((int)(0.1 * width), (int)(0.1 * height), (int)(0.8 * width), (int)(0.8 * height));
			}
			break;
		case ROUND_RECTANGLE:
			g.setColor(Color.RED);
			if(filled){
				g.fillRoundRect((int)(0.1 * width), (int)(0.1 * height), (int)(0.8 * width), (int)(0.8 * height), 20, 20);
			}else{
				g.drawRoundRect((int)(0.1 * width), (int)(0.1 * height), (int)(0.8 * width), (int)(0.8 * height), 20, 20);
			}
			break;
		case OVAL:
			g.setColor(Color.BLACK);
			if(filled){
				g.fillOval((int)(0.1 * width), (int)(0.1 * height), (int)(0.8 * width), (int)(0.8 * height));
			}else{
				g.drawOval((int)(0.1 * width), (int)(0.1 * height), (int)(0.8 * width), (int)(0.8 * height));
			}
		}
	}
	
	public void setType(int type){
		this.type = type;
		repaint();
	}
	
	public int getType(){
		return this.type;
	}
	
	public void setFilled(boolean filled){
		this.filled = filled;
		repaint();
	}
	
	public boolean getFilled(){
		return filled;
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(80, 80);
	}

}
