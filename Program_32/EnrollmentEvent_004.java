/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_32;

/**
 * @author up
 *
 */
public class EnrollmentEvent_004 extends java.util.EventObject{
	private String studentToEnroll;
	private int enrollmentCap;
	
	public EnrollmentEvent_004(Object source, String studentToEnroll, int enrollmentCap){
		super(source);
		this.studentToEnroll = studentToEnroll;
		this.enrollmentCap = enrollmentCap;
	}
	
	public String getStudentToEnroll(){
		return studentToEnroll;
	}
	
	public long getEnrollmentCap(){
		return enrollmentCap;
	}

}
