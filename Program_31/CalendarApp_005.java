/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_31;

/**
 * @author up
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class CalendarApp_005 extends JApplet{
	private CalendarPanel_004 calendarPanel = new CalendarPanel_004();
	private JComboBox jcboLocale = new JComboBox();
	private Locale[] locales = Calendar.getAvailableLocales();
	private JButton jbtPrior = new JButton("Prior");
	private JButton jbtNext = new JButton("Next");
	
	public void init(){
		JPanel jpLocale = new JPanel(new FlowLayout());
		jpLocale.setBorder(new TitledBorder("Choose a locale"));
		jpLocale.add(jcboLocale);
		
		for(int i = 0; i < locales.length; i++){
			jcboLocale.addItem(locales[i].getDisplayName());
		}
		
		JPanel jpButtons = new JPanel(new FlowLayout());
		jpButtons.add(jbtPrior);
		jpButtons.add(jbtNext);
		
		JPanel jpCalendar = new JPanel(new BorderLayout());
		jpCalendar.add(calendarPanel, BorderLayout.CENTER);
		jpCalendar.add(jpButtons, BorderLayout.SOUTH);
		
		add(jpCalendar, BorderLayout.CENTER);
		add(jpLocale, BorderLayout.SOUTH);
		
		jcboLocale.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == jcboLocale){
					calendarPanel.changeLocale(locales[jcboLocale.getSelectedIndex()]);
				}
			}
		});
		
		jbtPrior.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int currentMonth = calendarPanel.getMonth();
				if(currentMonth == 0){
					calendarPanel.setYear(calendarPanel.getYear() - 1);
					calendarPanel.setMonth((currentMonth - 1) % 12);
				}
			}
		});
		
		jbtNext.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int currentMonth = calendarPanel.getMonth();
				if(currentMonth == 11){
					calendarPanel.setYear(calendarPanel.getYear() + 1);
				}
				calendarPanel.setMonth((currentMonth + 1) % 12);
			}
		});
		
		calendarPanel.changeLocale(locales[jcboLocale.getSelectedIndex()]);
	}

}
