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

public class Chapter_Test_013 extends JFrame{
	public static void main(String[] args){
		Chapter_Test_013 frame = new Chapter_Test_013();
		frame.setTitle("Chapter_Test_013");
		frame.setSize(1000, 1000);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_013(){
		setLayout(new GridLayout(3, 2));
		add(new Test_013_1());
		add(new Test_013_2());
		add(new Test_013_3());
		add(new Test_013_4());
		add(new Test_013_5());
		add(new Test_013_6());
		add(new Test_013_7());
	}

}

abstract class AbstractDrawFunction extends JPanel{
	private Polygon p = new Polygon();
	
	protected AbstractDrawFunction(){
		drawFunction();
	}
	
	abstract double f(double x);
	
	public void drawFunction(){
		for(int x = -100; x <= 100; x++){
			p.addPoint(x + 200, 200 - (int)f(x));
		}
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = (int)(getWidth() * 0.9);
		int height = (int)(getHeight() * 0.9);
		
		g.drawLine(200 - width / 2, 200, 200 + width / 2, 200);
		g.drawLine(200, 200 - height / 2, 200, 200 + height / 2);
		g.drawLine(200 + width / 2, 200, 190 + width / 2, 190);
		g.drawLine(200 + width / 2, 200, 190 + width / 2, 210);
		g.drawLine(200, 200 - height / 2, 190, 210 - height / 2);
		g.drawLine(200, 200 - height / 2, 210, 210 - height / 2);
		
		g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
		
	}
}

class Test_013_1 extends AbstractDrawFunction{
	public double f(double x){
		return 0.1 * x * x;
	}
}

class Test_013_2 extends AbstractDrawFunction{
	public double f(double x){
		return 50 * Math.sin((x / 100.0) * 2 * Math.PI);
	}
}

class Test_013_3 extends AbstractDrawFunction{
	public double f(double x){
		return 50 * Math.cos((x / 100.0) * 2 * Math.PI);
	}
}

class Test_013_4 extends AbstractDrawFunction{
	public double f(double x){
		return 50 * Math.tan((x / 100.0) * 2 * Math.PI);
	}
}

class Test_013_5 extends AbstractDrawFunction{
	public double f(double x){
		return 50 * Math.cos((x / 100.0) * 2 * Math.PI) + 250 * Math.sin((x / 100.0) * 2 * Math.PI);
	}
}

class Test_013_6 extends AbstractDrawFunction{
	public double f(double x){
		return 250 * Math.cos((x / 100.0) * 2 * Math.PI) + 50 * Math.sin((x / 100.0) * 2 * Math.PI);
	}
}

class Test_013_7 extends AbstractDrawFunction{
	public double f(double x){
		return 0.1 * x * x + 0.1 * Math.log(x);
	}
}
