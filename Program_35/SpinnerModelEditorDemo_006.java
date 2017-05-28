/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_35;

/**
 * @author up
 *
 */
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.text.*;
import java.awt.*;

public class SpinnerModelEditorDemo_006 extends JApplet{
	private JSpinner jspDate = new JSpinner(new SpinnerDateModel());
	private JSpinner jspDay = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
	private String[] monthNames = new DateFormatSymbols().getMonths();
	private JSpinner jspMonth = new JSpinner(new SpinnerListModel(Arrays.asList(monthNames).subList(0, 12)));
	private JSpinner spinnerYear = new JSpinner(new SpinnerNumberModel(2004, 1, 3000, 1));
	
	public SpinnerModelEditorDemo_006(){
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(4, 1));
		panel1.add(new JLabel("Date"));
		panel1.add(new JLabel("Day"));
		panel1.add(new JLabel("Month"));
		panel1.add(new JLabel("Year"));
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(4, 1));
		panel2.add(jspDate);
		panel2.add(jspDay);
		panel2.add(jspMonth);
		panel2.add(spinnerYear);
		
		add(panel1, BorderLayout.WEST);
		add(panel2, BorderLayout.CENTER);
		
		JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(jspDate, "MM dd, yyyy");
		jspDate.setEditor(dateEditor);
		
		JSpinner.NumberEditor yearEditor = new JSpinner.NumberEditor(spinnerYear, "####");
		spinnerYear.setEditor(yearEditor);
		
		updateDate();
		
		jspDay.addChangeListener(new ChangeListener(){
			public void stateChanged(javax.swing.event.ChangeEvent e){
				updateDate();
			}
		});
		
		jspMonth.addChangeListener(new ChangeListener(){
			public void stateChanged(javax.swing.event.ChangeEvent e){
				updateDate();
			}
		});
		
		spinnerYear.addChangeListener(new ChangeListener(){
			public void stateChanged(javax.swing.event.ChangeEvent e){
				updateDate();
			}
		});
	}
	
	private void updateDate(){
		int month = ((SpinnerListModel)jspMonth.getModel()).getList().indexOf(jspMonth.getValue());
		int year = ((Integer)spinnerYear.getValue()).intValue();
		
		SpinnerNumberModel numberModel = (SpinnerNumberModel)jspDay.getModel();
		numberModel.setMaximum(new Integer(maxDaysInMonth(year, month)));
		
		if(((Integer)(numberModel.getValue())).intValue() > maxDaysInMonth(year, month)){
			numberModel.setValue(new Integer(maxDaysInMonth(year, month)));
		}
		
		int day = ((Integer)jspDay.getValue()).intValue();
		
		jspDate.setValue(new GregorianCalendar(year, month, day).getTime());
	}
	
	private int maxDaysInMonth(int year, int month){
		Calendar calendar = new GregorianCalendar(year, month, 1);
		return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

}
