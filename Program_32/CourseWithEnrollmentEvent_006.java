/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_32;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * @author up
 *
 */
public class CourseWithEnrollmentEvent_006 {
	private String name = "defaule name";
	private ArrayList<String> students = new ArrayList<String>();
	private int enrollmentCap = 10;
	
	private ArrayList<EnrollmentListener_005> enrollmentListenerList;
	
	public CourseWithEnrollmentEvent_006(){
		
	}
	
	public CourseWithEnrollmentEvent_006(String name){
		this.name = name;
	}
	
	public void addStudent(String student){
		students.add(student);
		
		if(students.size() > enrollmentCap){
			processEvent(new EnrollmentEvent_004(this, student, getEnrollmentCap()));
		}
	}
	
	public String[] getStudents(){
		return (String[])students.toArray();
	}
	
	public int getNumberOfStudents(){
		return students.size();
	}
	
	public int getEnrollmentCap(){
		return enrollmentCap;
	}
	
	public void setEnrollemtCap(int enrollmentCap){
		this.enrollmentCap = enrollmentCap;
	}
	
	public synchronized void addEnrollmentListener(EnrollmentListener_005 listener){
		if(enrollmentListenerList == null){
			enrollmentListenerList = new ArrayList<EnrollmentListener_005>(2);
		}
		
		if(!enrollmentListenerList.contains(listener)){
			enrollmentListenerList.add(listener);
		}
	}
	
	public synchronized void removeActionListener(ActionListener listener){
		if(enrollmentListenerList != null && enrollmentListenerList.contains(listener)){
			enrollmentListenerList.remove(listener);
		}
	}
	
	private void processEvent(EnrollmentEvent_004 e){
		ArrayList list;
		
		synchronized(this){
			if(enrollmentListenerList == null){
				return;
			}
			list = (ArrayList)enrollmentListenerList.clone();
		}
		
		for(int i = 0; i < list.size(); i++){
			EnrollmentListener_005 listener = (EnrollmentListener_005)list.get(i);
			listener.enrollmentExceeded(e);
		}
	}

}
