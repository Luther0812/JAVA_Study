/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_15;

/**
 * @author up
 *
 */
import javax.swing.*;
import java.awt.*;

public class TestFigurePanel_002 {
	public static void main(String[] args){
		TestFigurePanel frame = new TestFigurePanel();
		frame.setTitle("TestFigurePanel_002");
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class TestFigurePanel extends JFrame{
	public TestFigurePanel(){
		setLayout(new GridLayout(2, 3, 5, 5));
		add(new FigurePanel_003(FigurePanel_003.LINE));
		add(new FigurePanel_003(FigurePanel_003.RECTANGLE));
		add(new FigurePanel_003(FigurePanel_003.ROUND_RECTANGLE));
		add(new FigurePanel_003(FigurePanel_003.OVAL));
		add(new FigurePanel_003(FigurePanel_003.RECTANGLE, true));
		add(new FigurePanel_003(FigurePanel_003.ROUND_RECTANGLE, true));
	}
}
