/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_36;

/**
 * @author up
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TablePropertiesDemo_002 extends JApplet{
	private String[] columnNames = {"Country", "Capital", "Population in Millions", "Democracy"};
	
	private Object[][] rowData = {
			{"USA", "WashingTon DC", 280, true},
			{"Canada", "Ottawa", 32, true},
			{"Germany", "Berlin", 83, true},
			{"France", "Paris", 60, true},
			{"Norway", "Oslo", 4.5, true},
			{"India", "New Delhi", 1046, true}
	};
	
	private JTable jTable = new JTable(rowData, columnNames);
	
	private JSpinner jspiRowHeight = new JSpinner(new SpinnerNumberModel(16, 1, 50, 1));
	private JSpinner jspiRowMargin = new JSpinner(new SpinnerNumberModel(1, 1, 50, 1));
	
	private JCheckBox jchkShowGrid = new JCheckBox("showGrid", true);
	
	private JComboBox jcboAutoResizeMode = new JComboBox(new String[]{
			"AUTO_RESIZE_OFF", "AUTO_RESIZE_LAST_COLUMN", "AUTO_RESIZE_SUBSEQUENT_COLUMNS", "AUTO_RESIZE_NEXT_COLUMN", "AUTO_RESIZE_ALL_COLUMNS"
	});
	
	public TablePropertiesDemo_002(){
		JPanel panel1 = new JPanel();
		panel1.add(new JLabel("rowHeight"));
		panel1.add(jspiRowHeight);
		panel1.add(new JLabel("rowMargin"));
		panel1.add(jspiRowMargin);
		panel1.add(jchkShowGrid);
		
		JPanel panel2 = new JPanel();
		panel2.add(new JLabel("autoResizeMode"));
		panel2.add(jcboAutoResizeMode);
		
		add(panel1, BorderLayout.SOUTH);
		add(panel2, BorderLayout.NORTH);
		add(new JScrollPane(jTable));
		
		jTable.setAutoResizeMode(jTable.AUTO_RESIZE_OFF);
		jTable.setGridColor(Color.blue);
		jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jTable.setSelectionBackground(Color.RED);
		jTable.setSelectionForeground(Color.WHITE);
		
		jspiRowHeight.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				jTable.setRowHeight(((Integer)(jspiRowHeight.getValue())).intValue());
			}
		});
		jspiRowMargin.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				jTable.setRowMargin(((Integer)(jspiRowMargin.getValue())).intValue());
			}
		});
		
		jchkShowGrid.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jTable.setShowGrid(jchkShowGrid.isSelected());
			}
		});
		
		jcboAutoResizeMode.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String selectedItem = (String)jcboAutoResizeMode.getSelectedItem();
				
				if(selectedItem.equals("AUTO_RESIZE_OFF")){
					jTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
				}else if(selectedItem.equals("AUTO_RESIZE_LAST_COLUMN")){
					jTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
				}else if(selectedItem.equals("AUTO_RESIZE_SUBSEQUENT_COLUMNS")){
					jTable.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
				}else if(selectedItem.equals("AUTO_RESIZE_NEXT_COLUMN")){
					jTable.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
				}else if(selectedItem.equals("AUTO_RESIZE_ALL_COLUMNS")){
					jTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				}
			}
		});
	}

}
