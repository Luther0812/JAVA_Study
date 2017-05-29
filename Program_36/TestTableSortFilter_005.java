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
import java.awt.BorderLayout;

public class TestTableSortFilter_005 extends JApplet{
	private String[] columnNames = {"Country", "Capital", "Population in Millions", "Democracy"};
	
	private Object[][] data = {
			{"USA", "WashingTon DC", 280, true},
			{"Canada", "Ottawa", 32, true},
			{"Germany", "Berlin", 83, true},
			{"France", "Paris", 60, true},
			{"Norway", "Oslo", 4.5, true},
			{"India", "New Delhi", 1046, true}
	};
	
	private JTable jTable1 = new JTable(data, columnNames);
	
	private TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(jTable1.getModel());
	private JTextField jtfFilter = new JTextField();
	private JButton btFilter = new JButton("Filter");
	
	public TestTableSortFilter_005(){
		jTable1.setRowSorter(sorter);
		
		JPanel panel = new JPanel(new java.awt.BorderLayout());
		panel.add(new JLabel("Specify a word to match:"));
		panel.add(jtfFilter, BorderLayout.CENTER);
		panel.add(btFilter, BorderLayout.EAST);
		add(panel, BorderLayout.SOUTH);
		add(new JScrollPane(jTable1), BorderLayout.CENTER);
		
		btFilter.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e){
				String text = jtfFilter.getText();
				if(text.trim().length() == 0){
					sorter.setRowFilter(null);
				}else {
					sorter.setRowFilter(RowFilter.regexFilter(text));
				}
			}
		});
	}

}
