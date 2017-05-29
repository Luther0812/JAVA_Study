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
import java.util.*;

public class MyTableModel_007 extends DefaultTableModel{
	public MyTableModel_007(){
		
	}
	
	public MyTableModel_007(Object[][] data, Object[] columnNames){
		super(data, columnNames);
	}
	
	public Class getColumnClass(int column){
		return getValueAt(0, column).getClass();
	}
	
	public boolean isCellEditable(int row, int column){
		Class columnClass = getColumnClass(column);
		return columnClass != ImageIcon.class && columnClass != Date.class;
	}

}
