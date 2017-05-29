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

public class TestTableModel_003 extends JApplet{
	private String[] columnNames = {"Country", "Capital", "Population in Millions", "Democracy"};
	
	private Object[][] data ={
			{"USA", "Washington DC", 280, true},
			{"Canada", "Ottawa", 32, true}
	};
	
	private DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	
	private JTable jTable1 = new JTable(tableModel);
	
	public TestTableModel_003(){
		add(new JScrollPane(jTable1));
		
		tableModel.addRow(new Object[]{"France", "Paris", 60, true});
		tableModel.insertRow(0, new Object[]{"India", "New Delhi", 1046, true});
		tableModel.removeRow(1);
		tableModel.addColumn("Area");
		tableModel.setValueAt(10,  0,  4);
		tableModel.setValueAt(20,  1,  4);
		tableModel.setValueAt(30,  2,  4);
		
	}

}
