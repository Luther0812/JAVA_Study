/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_29;

/**
 * @author up
 *
 */
import javax.swing.*;

import Program_29.SwingWorkerDemo_013.ComputePrime;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;

public class ProgressBarDemo_014 extends JApplet{
	private JProgressBar jpb = new JProgressBar();
	private JTextArea jtaResult = new JTextArea();
	private JTextField jtfPrimeCount = new JTextField(8);
	private JButton jbtDisplayPrime = new JButton("Display Prime");
	
	public ProgressBarDemo_014(){
		jpb.setStringPainted(true);
		jpb.setMaximum(100);
		
		jtaResult.setWrapStyleWord(true);
		jtaResult.setLineWrap(true);
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("Enter the prime number count"));
		panel.add(jtfPrimeCount);
		panel.add(jbtDisplayPrime);
		
		add(jpb, BorderLayout.NORTH);
		add(new JScrollPane(jtaResult), BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		
		jbtDisplayPrime.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ComputePrime task = new ComputePrime(Integer.parseInt(jtfPrimeCount.getText()), jtaResult);
				
				task.addPropertyChangeListener(new PropertyChangeListener(){
					public void propertyChange(PropertyChangeEvent e){
						if("progress".equals(e.getPropertyName())){
							jpb.setValue((Integer)e.getNewValue());
						}
					}
				});
				
				task.execute();
			}
		});
	}
	
	static class ComputePrime extends SwingWorker<Integer, Integer>{
		private int count;
		private JTextArea result;
		
		public ComputePrime(int count, JTextArea result){
			this.count = count;
			this.result = result;
		}
		
		protected Integer doInBackground(){
			publishPrimeNumbers(count);
			
			return 0;
		}
		
		protected void process(java.util.List<Integer> list){
			for(int i = 0; i < list.size(); i++){
				result.append(list.get(i) + " ");
			}
		}
		
		private void publishPrimeNumbers(int n){
			int count = 0;
			int number = 2;
			while(count <= n){
				if(isPrime(number)){
					count++;
					setProgress(100 * count / n);
					publish(number);
				}
				number++;
			}
		}
		
		private static boolean isPrime(int number){
			for(int divisor = 2; divisor <= number / 2; divisor++){
				if(number % divisor == 0){
					return false;
				}
			}
			return true;
		}
	}

}
