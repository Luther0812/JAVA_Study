/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_32;

/**
 * @author up
 *
 */
public class TestCourseWithEnrollmentEvent_007 {
	public CourseWithEnrollmentEvent_006 course = new CourseWithEnrollmentEvent_006("Java Programming");
	
	public TestCourseWithEnrollmentEvent_007(){
		course.setEnrollemtCap(2);
		EnrollmentListener_005 listener = new NewListener();
		course.addEnrollmentListener(listener);
		course.addStudent("John Smith");
		course.addStudent("Jim Peterson");
		course.addStudent("Tim Johnson");
	}
	
	public static void main(String[] args){
		new TestCourseWithEnrollmentEvent_007();
	}
	
	private class NewListener implements EnrollmentListener_005{
		public void enrollmentExceeded(EnrollmentEvent_004 e){
			System.out.println(e.getStudentToEnroll() + " attempted to enroll\n The enrollment cap is " + e.getEnrollmentCap());
		}
	}

}
