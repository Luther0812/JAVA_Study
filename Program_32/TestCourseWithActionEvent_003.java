/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_32;

/**
 * @author up
 *
 */
import java.awt.event.*;

public class TestCourseWithActionEvent_003 {
	CourseWithActionEvent_002 course = new CourseWithActionEvent_002("Java Programming");
	
	public TestCourseWithActionEvent_003(){
		course.setEnrollemtCap(2);
		ActionListener listener = new Listener();
		course.addActionListener(listener);
		course.addStudent("John");
		course.addStudent("Jim");
		course.addStudent("Tim");
	}
	
	public static void main(String[] args){
		new TestCourseWithActionEvent_003();
	}
	
	private class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("Enrollment cap exceeded");
		}
	}

}
