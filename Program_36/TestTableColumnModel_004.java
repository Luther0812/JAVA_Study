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

public class TestTableColumnModel_004 extends JApplet{
	private String[] columnNames = {"Country", "Capital", "Population in Millions", "Democracy"};
	
	private Object[][] data ={
			{"USA", "Washington DC", 280, true},
			{"Canada", "Ottawa", 32, true}
	};
	
	private JTable jTable1 = new JTable(data, columnNames);
	
	public TestTableColumnModel_004(){
		add(new JScrollPane(jTable1));
		
		TableColumnModel columnModel = jTable1.getColumnModel();
		columnModel.moveColumn(0, 1);
		columnModel.removeColumn(columnModel.getColumn(3));
	}

}
