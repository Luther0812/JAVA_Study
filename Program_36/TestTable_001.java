/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_36;

/**
 * @author up
 *
 */
import javax.swing.*;

public class TestTable_001 extends JApplet{
	private String[] columnNames = {"Country", "Capital", "Population in Millions", "Democracy"};
	
	private Object[][] data = {
			{"USA", "WashingTon DC", 280, true},
			{"Canada", "Ottawa", 32, true},
			{"Germany", "Berlin", 83, true},
			{"France", "Paris", 60, true},
			{"Norway", "Oslo", 4.5, true},
			{"India", "New Delhi", 1046, true}
	};
	
	private JTable jTable = new JTable(data, columnNames);
	
	public TestTable_001(){
		add(new JScrollPane(jTable));
	}

}
