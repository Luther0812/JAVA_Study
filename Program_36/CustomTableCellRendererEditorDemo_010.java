/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_36;

/**
 * @author up
 *
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;

public class CustomTableCellRendererEditorDemo_010 extends JApplet{
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
	
	public CustomTableCellRendererEditorDemo_010(){
		TableColumn bookCover = jTable1.getColumn("Book Photo");
		bookCover.setCellRenderer(new MyImageCellRenderer_009());
		
		JComboBox jcboPublishers = new JComboBox();
		jcboPublishers.addItem("Prentice Hall");
		jcboPublishers.addItem("Que Education & Training");
		jcboPublishers.addItem("McGraw-Hill");
		
		TableColumn publisherColumn = jTable1.getColumn("Publisher");
		publisherColumn.setCellEditor(new DefaultCellEditor(jcboPublishers));
		jTable1.setRowHeight(60);
		add(new JScrollPane(jTable1), BorderLayout.CENTER);
	}

}
