/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_10;

/**
 * @author LiuYu
 *
 */
public class Course_006 {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course_006(String courseName){
		this.courseName = courseName;
	}
	
	public void addStudent(String student){
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents(){
		return students;
	}
	
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public void dropStudent(String student){
		students[numberOfStudents] = null;
		numberOfStudents--;
	}
	
}
