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
import javax.swing.table.*;
import javax.swing.event.*;
import java.util.*;

public class TableEventDemo_011 extends JApplet{
	private String[] columnNames = {"Title", "Copies Needed", "Publisher", "Date Published", "In-stock", "Book Photo"};
	private ImageIcon intro1eImageIcon = new ImageIcon(getClass().getResource("image/intro1e.gif"));
	private ImageIcon intro2eImageIcon = new ImageIcon(getClass().getResource("image/intro2e.gif"));
	private ImageIcon intro3eImageIcon = new ImageIcon(getClass().getResource("image/intro3e.gif"));

	private Object[][] rowData = {
			{"Introduction to Java Programming", 120, "Que Eduction & Training", new GregorianCalendar(1998, 1-1, 6).getTime(), false, intro1eImageIcon},
			{"Introduction to Java Programming, 2E", 220, "Que Eduction & Training", new GregorianCalendar(1999, 1-1, 6).getTime(), false, intro2eImageIcon},
			{"Introduction to Java Programming, 3E", 220, "Prentice Hall", new GregorianCalendar(2000, 12-1, 6).getTime(), true, intro3eImageIcon}
	};
	
	private MyTableModel_007 tableModel = new MyTableModel_007(rowData, columnNames);
	private JTable jTable1 = new JTable(tableModel);
	
	private TableColumnModel tableColumnModel = jTable1.getColumnModel();
	
	private ListSelectionModel selectionModel = jTable1.getSelectionModel();
	
	private JTextArea jtaMessage = new JTextArea();
	
	private JButton jbtDeleteColumn = new JButton("Delete Selected Column");
	
	public TableEventDemo_011(){
		TableColumn bookCover = jTable1.getColumn("Book Photo");
		bookCover.setCellRenderer(new MyImageCellRenderer_009());
		
		JComboBox jcboPublishers = new JComboBox();
		jcboPublishers.addItem("Prentice Hall");
		jcboPublishers.addItem("Que Education & Training");
		jcboPublishers.addItem("McGraw-Hill");
		
		TableColumn publisherColumn = jTable1.getColumn("Publisher");
		publisherColumn.setCellEditor(new DefaultCellEditor(jcboPublishers));
		jTable1.setRowHeight(60);
		jTable1.setColumnSelectionAllowed(true);
		
		JSplitPane jSplitPane1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		jSplitPane1.add(new JScrollPane(jTable1), JSplitPane.LEFT);
		jSplitPane1.add(new JScrollPane(jtaMessage), JSplitPane.RIGHT);
		add(jbtDeleteColumn, BorderLayout.NORTH);
		add(jSplitPane1, BorderLayout.CENTER);
		tableModel.addTableModelListener(new TableModelListener(){
			public void tableChanged(TableModelEvent e){
				jtaMessage.append("Table changed at row " + e.getFirstRow() + " and column " + e.getColumn() + "\n");
			}
		});
		
		tableColumnModel.addColumnModelListener(new TableColumnModelListener(){
			public void columnRemoved(TableColumnModelEvent e){
				jtaMessage.append("Column indexed at " + e.getFromIndex() + " is deleted \n");
			}
			public void columnAdded(TableColumnModelEvent e){
				
			}
			
			public void columnMoved(TableColumnModelEvent e){
				
			}
			public void columnMarginChanged(ChangeEvent e){
	
			}
			public void columnSelectionChanged(ListSelectionEvent e){
	
			}
		});
		
		jbtDeleteColumn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(jTable1.getSelectedColumn() >= 0){
					TableColumnModel columnModel = jTable1.getColumnModel();
					TableColumn tableColumn = columnModel.getColumn(jTable1.getSelectedColumn());
					columnModel.removeColumn(tableColumn);
				}
			}
		});
		
		selectionModel.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent e){
				jtaMessage.append("Row " + jTable1.getSelectedRow() + " and column " + jTable1.getSelectedColumn() + " selected\n");
			}
		});
	}

}
